package defpackage;

/* loaded from: classes2.dex */
public final class t70 extends l0g {
    public final us c;

    public t70(us usVar) {
        this.c = usVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t70) && this.c.equals(((t70) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return ho7.i("Response(tokenTypes='", l8g.g(this.c), "')");
    }
}
