package org.webrtc;

/* loaded from: classes9.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: org.webrtc.Predicate.2
            @Override // org.webrtc.Predicate
            public boolean test(T t12) {
                return Predicate.this.test(t12) && predicate.test(t12);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: org.webrtc.Predicate.3
            @Override // org.webrtc.Predicate
            public boolean test(T t12) {
                return !Predicate.this.test(t12);
            }
        };
    }

    default Predicate<T> or(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: org.webrtc.Predicate.1
            @Override // org.webrtc.Predicate
            public boolean test(T t12) {
                return Predicate.this.test(t12) || predicate.test(t12);
            }
        };
    }

    boolean test(T t12);
}
