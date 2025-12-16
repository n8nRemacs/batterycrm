package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class b35 extends sm implements tsb, j1g {
    public final String X;
    public final long d;
    public final p3b o;

    public b35(long j, long j2, p3b p3bVar) {
        super(j);
        this.d = j2;
        this.o = p3bVar;
        this.X = b35.class.getName();
    }

    @Override // defpackage.tsb
    public final int c() {
        pb2 pb2VarM = l().M(this.d);
        String str = this.X;
        if (pb2VarM == null) {
            wqi.c(str, "onPreExecute: No chat. remove task", new Object[0]);
            return 3;
        }
        p3b p3bVar = this.o;
        if (p3bVar == null) {
            wqi.c(str, "onPreExecute: could not deserialize draft, remove task", new Object[0]);
            return 3;
        }
        if (d20.a(p3bVar.a())) {
            return 1;
        }
        wqi.c(str, "onPreExecute: Attaches not ready. skip task", new Object[0]);
        return 2;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        c35 c35Var = (c35) l0gVar;
        String str = this.X;
        wqi.c(str, "onSuccess: " + c35Var, new Object[0]);
        ve2 ve2VarL = l();
        long j = this.d;
        pb2 pb2VarM = ve2VarL.M(j);
        if (pb2VarM == null) {
            wqi.c(str, "onSuccess: No chat. return", new Object[0]);
            return;
        }
        rf2 rf2Var = pb2VarM.b;
        p3b p3bVar = rf2Var.c0;
        long j2 = rf2Var.d0;
        if (p3bVar == null && j2 > c35Var.c) {
            wqi.q(str, "onSuccess: draft was discarded", new Object[0]);
            return;
        }
        if (j2 > c35Var.c) {
            wqi.q(str, "local draft time more than response, ignore!", new Object[0]);
            return;
        }
        p3b p3bVar2 = this.o;
        if (p3bVar2 == null) {
            wqi.q(str, "could not deserialize draft", new Object[0]);
            l().z(j);
            return;
        }
        ve2 ve2VarL2 = l();
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        q3b q3bVar = (q3b) tmVar.S.getValue();
        Long lValueOf = Long.valueOf(c35Var.c);
        q3bVar.getClass();
        ve2VarL2.u(this.d, c35Var.c, !(p3bVar2 instanceof p3b) ? p3bVar2 : new p3b(p3bVar2.a, p3bVar2.b, p3bVar2.c, p3bVar2.d, lValueOf, p3bVar2.f, p3bVar2.g));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        wqi.e(this.X, "onMaxFailCount", null);
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.DraftSave draftSave = new Tasks.DraftSave();
        draftSave.requestId = this.a;
        draftSave.chatId = this.d;
        draftSave.draft = a35.b(this.o);
        return fl9.toByteArray(draftSave);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.V0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    @Override // defpackage.sm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n2 i() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b35.i():n2");
    }
}
