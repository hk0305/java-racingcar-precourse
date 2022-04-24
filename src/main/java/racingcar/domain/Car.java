package racingcar.domain;

import racingcar.stategy.MovingStrategy;

public class Car {

    private final String name;
    private int position;

    public Car(final String name, final int position) {
        validate(name);
        this.name = name;
        this.position = position;
    }

    private void validate(final String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public void move(final MovingStrategy movingStrategy) {
        if (movingStrategy.movable()) {
            System.out.println("[" + name + "]" + " 전진!");
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
