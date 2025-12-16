package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class ijb implements Comparator {
    public static ijb a(Comparator comparator) {
        return comparator instanceof ijb ? (ijb) comparator : new yi3(comparator);
    }

    public ijb b() {
        return new dqd(this);
    }
}
