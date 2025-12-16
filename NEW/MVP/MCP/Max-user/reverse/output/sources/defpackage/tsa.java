package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public final class tsa extends k3 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tsa(lta ltaVar, Object obj, int i) {
        super(ltaVar);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        int i = this.b;
        Object obj = this.c;
        lta ltaVar = this.a;
        switch (i) {
            case 0:
                u73 u73Var = new u73(vtaVar, (sr5) obj);
                vtaVar.c((n42) u73Var.o);
                ltaVar.a(u73Var);
                break;
            case 1:
                ltaVar.a(new xqa(vtaVar, (hfd) obj, 3));
                break;
            case 2:
                ltaVar.a(new xqa(vtaVar, (z2g) obj, 4));
                break;
            case 3:
                try {
                    Object obj2 = ((in6) obj).get();
                    aj5 aj5Var = bj5.a;
                    ltaVar.a(new tk3(vtaVar, 4, (Collection) obj2));
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    cd5.c(th, vtaVar);
                    return;
                }
            default:
                ltaVar.a(new uta(vtaVar, (rj5) obj));
                break;
        }
    }
}
