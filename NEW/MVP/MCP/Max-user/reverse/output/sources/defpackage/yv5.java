package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class yv5 extends sm implements j1g, tsb {
    public final long X;
    public final long Y;
    public final String Z;
    public final long d;
    public final String o;
    public final String s0;

    public yv5(long j, long j2, String str, long j3, long j4, String str2) {
        super(j);
        this.d = j2;
        this.o = str;
        this.X = j3;
        this.Y = j4;
        this.Z = str2;
        this.s0 = yv5.class.getName();
    }

    @Override // defpackage.tsb
    public final int c() throws Throwable {
        pb2 pb2VarM;
        si9 si9VarM = n().m(this.Y);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED || (pb2VarM = l().M(this.X)) == null) {
            return 3;
        }
        rf2 rf2Var = pb2VarM.b;
        if (rf2Var.a == 0) {
            tm tmVar = this.c;
            if (tmVar == null) {
                tmVar = null;
            }
            if (!rf2Var.e(((w4e) ((pb3) tmVar.f.getValue())).s())) {
                return 3;
            }
        }
        return rf2Var.c != of2.a ? 3 : 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        aw5 aw5Var = (aw5) l0gVar;
        String str = this.s0;
        wqi.c(str, "onSuccess %s", aw5Var);
        k().c(new cw5(this.a));
        si9 si9VarM = n().m(this.Y);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            return;
        }
        String str2 = this.Z;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = aw5Var.c;
        m2g m2gVar = new m2g(this.Y, str2, 0L, 0L, 0L, 0L, str3, true, false, this.d, this.o, 0, false, false, "FILE");
        wqi.c(str, "fileAttachDownloader.downloadAttach(%s)", m2gVar);
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ((dv5) tmVar.I.getValue()).a(m2gVar);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) throws Throwable {
        String str = this.s0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.Y;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onFail " + pzfVar, null);
            }
        }
        si9 si9VarM = n().m(this.Y);
        String str2 = this.Z;
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED || str2 == null) {
            f();
            k().c(new rj0(this.a, pzfVar));
            return;
        }
        boolean zEquals = "file.not.found".equals(pzfVar.b);
        n().r(si9VarM.a, str2, new j21(zEquals, 5));
        k().c(new itg(si9VarM.Z, this.Y, false));
        if (zEquals) {
            f();
            k().c(new rj0(this.a, pzfVar));
        }
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.FileDownloadCmd fileDownloadCmd = new Tasks.FileDownloadCmd();
        fileDownloadCmd.requestId = this.a;
        fileDownloadCmd.fileId = this.d;
        fileDownloadCmd.fileName = this.o;
        fileDownloadCmd.messageId = this.Y;
        fileDownloadCmd.chatId = this.X;
        String str = this.Z;
        if (str != null && str.length() != 0) {
            fileDownloadCmd.attachLocalId = str;
        }
        return fl9.toByteArray(fileDownloadCmd);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.F0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() throws Throwable {
        pb2 pb2VarM = l().M(this.X);
        si9 si9VarM = n().m(this.Y);
        if (pb2VarM == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long j = pb2VarM.b.a;
        if (si9VarM == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new fh2(this.d, j, si9VarM.b);
    }
}
