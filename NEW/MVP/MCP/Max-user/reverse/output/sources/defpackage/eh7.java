package defpackage;

/* loaded from: classes2.dex */
public final class eh7 extends a2 implements lyg {
    public static final eh7 a = new eh7();

    @Override // defpackage.lyg
    public final String a() {
        return "null";
    }

    @Override // defpackage.lyg
    public final int d() {
        return 1;
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lyg)) {
            return false;
        }
        int iD = ((a2) ((lyg) obj)).d();
        if (iD != 0) {
            return iD == 1;
        }
        throw null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "null";
    }
}
