package defpackage;

/* loaded from: classes.dex */
public final class la2 extends ma2 {
    public final Throwable a;

    public la2(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof la2) {
            return fni.a(this.a, ((la2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ma2
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
