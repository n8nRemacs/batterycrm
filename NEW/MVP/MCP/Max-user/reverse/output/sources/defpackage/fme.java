package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class fme extends id0 {
    public static final fme f;
    public static final fme g;
    public static final fme h;
    public static final fme i;
    public static final fme j;
    public static final fme k;
    public static final fme l;
    public static final fme m;
    public static final hme n;
    public static final hme o;
    public static final hme p;
    public final s5g b;
    public final List c;
    public final f1e d;
    public final Bundle e;

    static {
        n5g n5gVar = new n5g(nbb.y);
        int i2 = mvd.O;
        f = new fme(n5gVar, ve3.j(new eme(kbb.n, new n5g(i2), false), new eme(kbb.o, new n5g(mvd.J0), false)), f1e.SETTINGS_PRIVACY_SAFE_MODE_ONLINE, null, 8);
        n5g n5gVar2 = new n5g(nbb.x);
        eme emeVar = new eme(kbb.p, new n5g(nbb.w), false);
        int i3 = mvd.p;
        g = new fme(n5gVar2, ve3.j(emeVar, new eme(kbb.q, new n5g(i3), false)), null, null, 12);
        n5g n5gVar3 = new n5g(nbb.t);
        int i4 = mvd.b;
        h = new fme(n5gVar3, ve3.j(new eme(kbb.h, new n5g(i4), false), new eme(kbb.i, new n5g(i2), false)), f1e.SETTINGS_PRIVACY_SAFE_MODE_CALLS, null, 8);
        i = new fme(new n5g(nbb.C), ve3.j(new eme(kbb.t, new n5g(i4), false), new eme(kbb.u, new n5g(i2), false)), f1e.SETTINGS_PRIVACY_SAFE_MODE_SEARCH_BY_PHONE, null, 8);
        j = new fme(new n5g(nbb.s), ve3.j(new eme(kbb.f, new n5g(i4), false), new eme(kbb.g, new n5g(i2), false)), f1e.SETTINGS_PRIVACY_SAFE_MODE_INVITE, null, 8);
        k = new fme(new n5g(nbb.v), ve3.j(new eme(kbb.m, new n5g(nbb.u), true), new eme(kbb.l, new n5g(i3), false)), null, null, 12);
        l = new fme(new n5g(nbb.B), ve3.j(new eme(kbb.s, new n5g(nbb.A), false), new eme(kbb.r, new n5g(nbb.z), false)), null, null, 12);
        m = new fme(new n5g(nbb.a), ve3.j(new eme(kbb.j, new n5g(nbb.h), false), new eme(kbb.k, new n5g(nbb.j), false)), f1e.SETTINGS_PRIVACY_SENSITIVE_CONTENT, null, 8);
        n = new hme(new n5g(nbb.J), Integer.valueOf(yud.O1));
        o = new hme(new n5g(nbb.I), Integer.valueOf(ivd.a1));
        p = new hme(new n5g(nbb.H), Integer.valueOf(ivd.p1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fme(s5g s5gVar, List list, f1e f1eVar, Bundle bundle, int i2) {
        super(17);
        f1eVar = (i2 & 4) != 0 ? null : f1eVar;
        bundle = (i2 & 8) != 0 ? null : bundle;
        this.b = s5gVar;
        this.c = list;
        this.d = f1eVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fme)) {
            return false;
        }
        fme fmeVar = (fme) obj;
        return fni.a(this.b, fmeVar.b) && fni.a(this.c, fmeVar.c) && this.d == fmeVar.d && fni.a(this.e, fmeVar.e);
    }

    public final int hashCode() {
        int iL = xrf.l(this.c, this.b.hashCode() * 31, 31);
        f1e f1eVar = this.d;
        int iHashCode = (iL + (f1eVar == null ? 0 : f1eVar.hashCode())) * 31;
        Bundle bundle = this.e;
        return iHashCode + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", statScreen=" + this.d + ", payload=" + this.e + ")";
    }
}
