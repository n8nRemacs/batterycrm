package defpackage;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class tn9 {
    public final tdd a;
    public final MotionEvent b;

    public tn9(tdd tddVar, MotionEvent motionEvent) {
        this.a = tddVar;
        this.b = motionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn9)) {
            return false;
        }
        tn9 tn9Var = (tn9) obj;
        return this.a == tn9Var.a && fni.a(this.b, tn9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecordControlMotionEvent(type=" + this.a + ", motionEvent=" + this.b + ")";
    }
}
