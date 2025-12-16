package defpackage;

/* loaded from: classes.dex */
public final class xkb extends u08 implements um6 {
    public final /* synthetic */ ykb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkb(ykb ykbVar) {
        super(3);
        this.a = ykbVar;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c54 c54Var = (c54) obj;
        h54 h54Var = (h54) obj2;
        i54 i54Var = (i54) obj3;
        ykb ykbVar = this.a;
        if (ykbVar.a != null) {
            ykb.a(ykbVar, c54Var, c54Var, h54Var, i54Var);
        }
        return qqg.a;
    }
}
