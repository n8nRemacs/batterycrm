package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* loaded from: classes.dex */
public final class aq1 {
    public final ShareData a;
    public final vp1 b;
    public final zp1 c;

    public aq1(ShareData shareData, vp1 vp1Var, zp1 zp1Var) {
        this.a = shareData;
        this.b = vp1Var;
        this.c = zp1Var;
    }

    public static aq1 a(aq1 aq1Var, ShareData shareData, vp1 vp1Var, zp1 zp1Var, int i) {
        if ((i & 1) != 0) {
            shareData = aq1Var.a;
        }
        if ((i & 2) != 0) {
            vp1Var = aq1Var.b;
        }
        if ((i & 4) != 0) {
            zp1Var = aq1Var.c;
        }
        aq1Var.getClass();
        return new aq1(shareData, vp1Var, zp1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq1)) {
            return false;
        }
        aq1 aq1Var = (aq1) obj;
        return fni.a(this.a, aq1Var.a) && fni.a(this.b, aq1Var.b) && fni.a(this.c, aq1Var.c);
    }

    public final int hashCode() {
        ShareData shareData = this.a;
        int iHashCode = (shareData == null ? 0 : shareData.hashCode()) * 31;
        vp1 vp1Var = this.b;
        return this.c.hashCode() + ((iHashCode + (vp1Var != null ? vp1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "QuoteDataUIState(shareData=" + this.a + ", data=" + this.b + ", state=" + this.c + ")";
    }
}
