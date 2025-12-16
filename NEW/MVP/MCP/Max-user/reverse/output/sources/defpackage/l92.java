package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class l92 extends hge implements tsb {
    public final long X;
    public final String Y;
    public v08 Z;
    public final long b;
    public final String c;
    public final long d;
    public final n10 o;

    public /* synthetic */ l92(long j, String str, long j2, n10 n10Var) {
        this(j, str, j2, n10Var, pbj.e(str));
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.tsb
    public final void f() {
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChangeProfileOrChatPhoto changeProfileOrChatPhoto = new Tasks.ChangeProfileOrChatPhoto();
        changeProfileOrChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeProfileOrChatPhoto.file = str;
        changeProfileOrChatPhoto.chatId = this.d;
        n10 n10Var = this.o;
        if (n10Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = n10Var.b;
            rect.top = n10Var.c;
            rect.right = n10Var.d;
            rect.bottom = n10Var.e;
            changeProfileOrChatPhoto.crop = rect;
        }
        changeProfileOrChatPhoto.lastModified = this.X;
        return fl9.toByteArray(changeProfileOrChatPhoto);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.N0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1;
    }

    @Override // defpackage.hge
    public final void t() {
        v08 v08Var = this.Z;
        if (v08Var != null) {
            ty4.a(v08Var);
        }
        this.Z = null;
    }

    @Override // defpackage.hge
    public final void u() {
        String str = this.c;
        bug bugVar = new bug(str == null ? "" : str, this.X, wvg.o, "");
        v08 v08Var = this.Z;
        if (v08Var != null) {
            ty4.a(v08Var);
        }
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        vqa vqaVarE = ((aug) igeVar.u.getValue()).e(bugVar);
        m0g m0gVarO = o();
        m0gVarO.getClass();
        ssa ssaVarL = vqaVarE.l(((n0g) m0gVarO).a());
        v08 v08Var2 = new v08(new ao6(9, this), new h08(9, this), pdf.d);
        ssaVarL.a(v08Var2);
        this.Z = v08Var2;
    }

    public l92(long j, String str, long j2, n10 n10Var, long j3) {
        this.b = j;
        this.c = str;
        this.d = j2;
        this.o = n10Var;
        this.X = j3;
        this.Y = l92.class.getName();
    }
}
