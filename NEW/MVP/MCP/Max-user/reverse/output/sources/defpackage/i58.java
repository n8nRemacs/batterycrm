package defpackage;

/* loaded from: classes2.dex */
public final class i58 extends sm implements j1g {
    public final String X;
    public final /* synthetic */ int d = 0;
    public final String o;

    public i58(long j, String str) {
        super(j);
        this.o = str;
        this.X = i58.class.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    @Override // defpackage.j1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.l0g r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i58.d(l0g):void");
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        switch (this.d) {
            case 0:
                k().c(new rj0(this.a, pzfVar));
                break;
            default:
                k().c(new rj0(this.a, pzfVar));
                break;
        }
    }

    @Override // defpackage.sm
    public final n2 i() {
        switch (this.d) {
            case 0:
                return new j58(this.o, false);
            default:
                s44 s44Var = new s44(2, null, hd5.a, this.o, null, null, null, null, null, null, true, 4, null, null, false, false);
                vjb vjbVar = new vjb();
                vjbVar.a = System.currentTimeMillis();
                sz szVar = new sz(1);
                szVar.add(s44Var);
                vjbVar.c = szVar;
                return new zf8(0L, 0L, vjbVar.a(), null, 0L);
        }
    }

    public i58(long j, String str, String str2) {
        super(j);
        this.o = str;
        this.X = str2;
    }
}
