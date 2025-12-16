package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class io9 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tcf b;
    public final /* synthetic */ no9 c;

    public /* synthetic */ io9(tcf tcfVar, no9 no9Var, int i) {
        this.a = i;
        this.b = tcfVar;
        this.c = no9Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) throws Throwable {
        switch (this.a) {
            case 0:
                this.b.d(new ho9(z26Var, this.c, 0), continuation);
                break;
            default:
                this.b.d(new ho9(z26Var, this.c, 1), continuation);
                break;
        }
        return g84.a;
    }
}
