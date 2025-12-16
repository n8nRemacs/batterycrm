package defpackage;

/* loaded from: classes.dex */
public final class sib extends o1j {
    public final Throwable b;

    public sib(Throwable th) {
        this.b = th;
    }

    public final String toString() {
        return "FAILURE (" + this.b.getMessage() + ")";
    }
}
