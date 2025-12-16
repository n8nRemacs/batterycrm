package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class sj0 implements Serializable {
    public final long a;

    public sj0() {
        this(Long.MIN_VALUE);
    }

    public String toString() {
        return utb.l(new StringBuilder("BaseEvent{requestId="), this.a, '}');
    }

    public sj0(long j) {
        this.a = j;
    }
}
