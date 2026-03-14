class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> numbers = new ArrayList<>();
         int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1 ;

        while (startRow <= endRow && startColumn <= endColumn){
            //top
            for (int j = startColumn ; j <= endColumn; j++) {
                // System.out.print(matrix[startRow][j]+" ");
                numbers.add(matrix[startRow][j]);
            }

            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                // System.out.print(matrix[i][endColumn]+" ");
                         numbers.add(matrix[i][endColumn]);
                
            }

            //bottom
            
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
            }
            // System.out.print(matrix[endRow][j]+" ");
                        numbers.add(matrix[endRow][j]);
            
        }
        
        //left
        
        for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) {
                    break;
            }
                // System.out.print(matrix[i][startColumn]+" ");
                        numbers.add(matrix[i][startColumn]);
                
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        // System.out.println();
        return numbers;
    
    }
}
