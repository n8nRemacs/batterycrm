package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class yxe extends cda {
    public final ArrayList b;

    public yxe(ArrayList arrayList) {
        super(qqg.a);
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxe) && this.b.equals(((yxe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowDirections(directionsIntents=" + this.b + ")";
    }
}
