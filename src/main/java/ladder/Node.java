package ladder;

import static ladder.Direction.*;

public class Node {

    private Direction direction;

    private Node(Direction direction) {
        this.direction = direction;
    }

    public static Node from(Direction direction) {
        return new Node(direction);
    }

    public void move(Position position) {
        if (isRight()) {
            position.next();
            return;
        }
        if (isLeft()) {
            position.prev();
            return;
        }
    }

    public int getNodeValue(){
        int get = 0;

        if(isRight()){
            get = 1;
        }
        if(isLeft()){
            get = -1;
        }

        return get;
    }

    public void setNodeString(StringBuilder sb){
        sb.append(getNodeValue()).append(" ");
    }


    public void setRightNode() {
        direction = RIGHT;
    }

    public void setLeftNode() {
        direction = LEFT;
    }

    public boolean isAlreadySetDirection() {
        return !isNone();
    }

    private boolean isRight() {
        return direction == RIGHT;
    }

    private boolean isLeft() {
        return direction == LEFT;
    }

    private boolean isNone() {
        return direction == NONE;
    }
}
