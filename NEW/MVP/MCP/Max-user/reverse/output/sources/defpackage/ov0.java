package defpackage;

/* loaded from: classes.dex */
public final class ov0 extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ pv0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(pv0 pv0Var, q44 q44Var) {
        super(q44Var);
        this.o = pv0Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        Object objC = this.o.C(null, 0, 0L, this);
        return objC == g84.a ? objC : new na2(objC);
    }
}
