package com.back;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RqTest {

    @Test
    @DisplayName("Rq.getActionName(\"수정?id=1\")")
    void t1() {
        Rq rq = new Rq("수정?id=1");

        String actionName = rq.getActionName();

        Assertions.assertEquals("수정", actionName);
    }

    @Test
    @DisplayName("Rq.getActionName(\"삭제?id=1\")")
    void t2() {
        Rq rq = new Rq("삭제?id=1");

        String actionName = rq.getActionName();

        Assertions.assertEquals("삭제", actionName);
    }
}
