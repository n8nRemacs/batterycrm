package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class z72 extends hge implements tsb {
    public final long X;
    public final String Y = z72.class.getName();
    public zl3 Z;
    public final long b;
    public final String c;
    public final long d;
    public final n10 o;

    public z72(long j, String str, long j2, n10 n10Var, long j3) {
        this.b = j;
        this.c = str;
        this.d = j2;
        this.o = n10Var;
        this.X = j3;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.tsb
    public final void f() {
        q().d(this.b);
        v();
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChangeChatPhoto changeChatPhoto = new Tasks.ChangeChatPhoto();
        changeChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeChatPhoto.file = str;
        changeChatPhoto.chatId = this.d;
        n10 n10Var = this.o;
        if (n10Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = n10Var.b;
            rect.top = n10Var.c;
            rect.right = n10Var.d;
            rect.bottom = n10Var.e;
            changeChatPhoto.crop = rect;
        }
        changeChatPhoto.lastModified = this.X;
        return fl9.toByteArray(changeChatPhoto);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.a1;
    }

    @Override // defpackage.hge
    public final void t() {
        v();
    }

    @Override // defpackage.hge
    public final void u() {
        String str = this.c;
        bug bugVar = new bug(str == null ? "" : str, this.X, wvg.o, "");
        v();
        this.Z = new zl3();
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        vqa vqaVarE = ((aug) igeVar.u.getValue()).e(bugVar);
        m0g m0gVarO = o();
        m0gVarO.getClass();
        ssa ssaVarL = vqaVarE.l(((n0g) m0gVarO).a());
        v08 v08Var = new v08(new r5j(9, this), new usd(9, this), pdf.d);
        ssaVarL.a(v08Var);
        zl3 zl3Var = this.Z;
        if (zl3Var != null) {
            zl3Var.a(v08Var);
        }
    }

    public final void v() {
        zl3 zl3Var = this.Z;
        if (zl3Var != null) {
            zl3Var.dispose();
        }
        this.Z = null;
    }

    public final void w() {
        ve2 ve2VarB = b();
        long j = this.d;
        pb2 pb2VarM = ve2VarB.M(j);
        if (pb2VarM != null) {
            b().g0(j, bf2.b);
            a().f(pb2VarM.b.a);
        }
    }
}
