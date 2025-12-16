package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class abc extends sm implements j1g, tsb {
    public final String X;
    public final long Y;
    public final n10 Z;
    public final String d;
    public final String o;
    public final String s0;
    public final String t0;
    public final int u0;

    public abc(long j, String str, String str2, String str3, long j2, n10 n10Var, String str4, String str5, int i) {
        super(j);
        this.d = str;
        this.o = str2;
        this.X = str3;
        this.Y = j2;
        this.Z = n10Var;
        this.s0 = str4;
        this.t0 = str5;
        this.u0 = i;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        edc edcVar = (edc) l0gVar;
        pe8 pe8Var = p().a;
        pe8Var.v.O(pe8Var, w4e.m0[11], null);
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ((klc) tmVar.V.getValue()).b(edcVar.c);
        tw0 tw0VarK = k();
        gx3 gx3Var = edcVar.c.a;
        long j = this.a;
        tw0VarK.c(new lhc(j, gx3Var));
        gx3 gx3Var2 = edcVar.c.a;
        Long lValueOf = gx3Var2 != null ? Long.valueOf(gx3Var2.X) : null;
        if (this.Y == 0 || lValueOf == null) {
            return;
        }
        k().c(new dbc(j, lValueOf.longValue()));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (!qaj.c(pzfVar.b)) {
            f();
        }
        k().c(new hhc(pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.Profile profile = new Tasks.Profile();
        profile.requestId = this.a;
        profile.photoId = this.Y;
        String str = this.d;
        if (str != null && str.length() != 0) {
            profile.firstName = str;
        }
        String str2 = this.o;
        if (str2 != null && str2.length() != 0) {
            profile.lastName = str2;
        }
        String str3 = this.X;
        if (str3 != null && str3.length() != 0) {
            profile.photoToken = str3;
        }
        String str4 = this.s0;
        if (str4 != null && str4.length() != 0) {
            profile.description = str4;
        }
        String str5 = this.t0;
        if (str5 != null && str5.length() != 0) {
            profile.link = str5;
        }
        int i = this.u0;
        if (xc0.c(i).length() != 0) {
            profile.avatarType = xc0.c(i);
        }
        n10 n10Var = this.Z;
        if (n10Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = n10Var.b;
            rect.top = n10Var.c;
            rect.right = n10Var.d;
            rect.bottom = n10Var.e;
            profile.crop = rect;
        }
        return fl9.toByteArray(profile);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.d;
    }

    @Override // defpackage.sm
    public final n2 i() {
        zf8 zf8Var = new zf8((xhb) null, 18);
        String str = this.d;
        if (str != null) {
            zf8Var.x("firstName", str);
        }
        String str2 = this.o;
        if (str2 != null) {
            zf8Var.x("lastName", str2);
        }
        String str3 = this.X;
        if (str3 != null) {
            zf8Var.x("photoToken", str3);
        }
        long j = this.Y;
        if (j != 0) {
            zf8Var.t(j, "photoId");
        }
        n10 n10Var = this.Z;
        if (n10Var != null) {
            zf8Var.v("crop", n10Var.a());
        }
        String str4 = this.s0;
        if (!l8g.c(str4)) {
            if (str4.equals("$REMOVE$")) {
                str4 = "";
            }
            zf8Var.x("description", str4);
        }
        String str5 = this.t0;
        if (!l8g.c(str5)) {
            zf8Var.x("link", str5.equals("$REMOVE$") ? "" : str5);
        }
        zf8Var.x("avatarType", xc0.c(this.u0));
        return zf8Var;
    }
}
