// Refundable.java
// An INTERFACE = a list of promises. It says WHAT, never HOW.
//
// Only SOME payments can be refunded inside the app. GCash and Maya can.
// Cash cannot - that is refunded at the counter. So Refundable is a
// "can-do" contract, not a family relationship.

public interface Refundable {

    // TODO 1
    String refund();

    // TODO 2
    default void printRefundNotice() {
        System.out.println(" " + refund());
    }
}
