package defpackage;

/* loaded from: classes2.dex */
public final class n5a extends sm implements j1g {
    public final long d;

    public n5a(long j, long j2) {
        super(j);
        this.d = j2;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
    }

    @Override // defpackage.sm
    public final n2 i() {
        long j = this.d;
        if (j == 0) {
            return new zf8(0L, 11);
        }
        pb2 pb2VarM = l().M(j);
        if (pb2VarM != null) {
            rf2 rf2Var = pb2VarM.b;
            if (rf2Var.a != 0 || l().Y(pb2VarM)) {
                return new zf8(rf2Var.a, 11);
            }
        }
        wqi.e("n5a", "createRequest: No chat or serverId == 0. return null", null);
        return null;
    }
}
