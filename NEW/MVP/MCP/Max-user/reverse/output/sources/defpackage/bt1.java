package defpackage;

/* loaded from: classes.dex */
public final class bt1 {
    public static final bt1 i = new bt1(224);
    public final zi1 a;
    public final zi1 b;
    public final zi1 c;
    public final boolean d;
    public final vfh e;
    public final boolean f;
    public final dxg g;
    public final long h;

    public bt1(zi1 zi1Var, zi1 zi1Var2, zi1 zi1Var3, boolean z, vfh vfhVar, boolean z2, dxg dxgVar, long j) {
        this.a = zi1Var;
        this.b = zi1Var2;
        this.c = zi1Var3;
        this.d = z;
        this.e = vfhVar;
        this.f = z2;
        this.g = dxgVar;
        this.h = j;
    }

    public static bt1 a(bt1 bt1Var, zi1 zi1Var, zi1 zi1Var2, zi1 zi1Var3, vfh vfhVar, dxg dxgVar, long j, int i2) {
        if ((i2 & 1) != 0) {
            zi1Var = bt1Var.a;
        }
        zi1 zi1Var4 = zi1Var;
        if ((i2 & 2) != 0) {
            zi1Var2 = bt1Var.b;
        }
        zi1 zi1Var5 = zi1Var2;
        if ((i2 & 4) != 0) {
            zi1Var3 = bt1Var.c;
        }
        zi1 zi1Var6 = zi1Var3;
        boolean z = (i2 & 8) != 0 ? bt1Var.d : false;
        vfh vfhVar2 = (i2 & 16) != 0 ? bt1Var.e : vfhVar;
        boolean z2 = (i2 & 32) != 0 ? bt1Var.f : true;
        dxg dxgVar2 = (i2 & 64) != 0 ? bt1Var.g : dxgVar;
        long j2 = (i2 & 128) != 0 ? bt1Var.h : j;
        bt1Var.getClass();
        return new bt1(zi1Var4, zi1Var5, zi1Var6, z, vfhVar2, z2, dxgVar2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt1)) {
            return false;
        }
        bt1 bt1Var = (bt1) obj;
        return fni.a(this.a, bt1Var.a) && fni.a(this.b, bt1Var.b) && fni.a(this.c, bt1Var.c) && this.d == bt1Var.d && this.e == bt1Var.e && this.f == bt1Var.f && this.g == bt1Var.g && this.h == bt1Var.h;
    }

    public final int hashCode() {
        zi1 zi1Var = this.a;
        int iHashCode = (zi1Var == null ? 0 : zi1Var.hashCode()) * 31;
        zi1 zi1Var2 = this.b;
        int iHashCode2 = (iHashCode + (zi1Var2 == null ? 0 : zi1Var2.hashCode())) * 31;
        zi1 zi1Var3 = this.c;
        return Long.hashCode(this.h) + ((this.g.hashCode() + a9h.b((this.e.hashCode() + a9h.b((iHashCode2 + (zi1Var3 != null ? zi1Var3.hashCode() : 0)) * 31, 31, this.d)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        return "CallUserState(pinnedOpponentId=" + this.a + ", pipOpponentIdState=" + this.b + ", selectedOpponentId=" + this.c + ", canShowInviteBanner=" + this.d + ", modeView=" + this.e + ", raiseHandOnce=" + this.f + ", vpnNotification=" + this.g + ", lastShowWaitingRoomNotificationTs=" + this.h + ")";
    }

    public /* synthetic */ bt1(int i2) {
        this(null, null, null, true, vfh.a, false, dxg.d, 0L);
    }
}
