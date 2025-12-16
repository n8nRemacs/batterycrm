package defpackage;

import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ora extends k3 {
    public final /* synthetic */ int b;
    public final tm6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ora(vqa vqaVar, tm6 tm6Var, int i) {
        super(vqaVar);
        this.b = i;
        this.c = tm6Var;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        int i = this.b;
        lta ltaVar = this.a;
        tm6 tm6Var = this.c;
        switch (i) {
            case 0:
                try {
                    HashSet hashSet = new HashSet();
                    aj5 aj5Var = bj5.a;
                    ltaVar.a(new nra(vtaVar, tm6Var, hashSet));
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    cd5.c(th, vtaVar);
                    return;
                }
            case 1:
                ltaVar.a(new csa(vtaVar, tm6Var));
                break;
            case 2:
                ltaVar.a(new fsa(vtaVar, tm6Var, 0));
                break;
            case 3:
                ltaVar.a(new fsa(vtaVar, tm6Var, 1));
                break;
            case 4:
                ltaVar.a(new gsa(vtaVar, tm6Var, 0));
                break;
            case 5:
                ltaVar.a(new zra(vtaVar, tm6Var, 1));
                break;
            case 6:
                ltaVar.a(new gsa(vtaVar, tm6Var, 1));
                break;
            default:
                bfe bfeVar = new bfe(new lqc());
                try {
                    Object objApply = tm6Var.apply(bfeVar);
                    Objects.requireNonNull(objApply, "The handler returned a null ObservableSource");
                    lta ltaVar2 = (lta) objApply;
                    fsa fsaVar = new fsa(vtaVar, bfeVar, ltaVar);
                    vtaVar.c(fsaVar);
                    ltaVar2.a((n66) fsaVar.X);
                    fsaVar.d();
                    break;
                } catch (Throwable th2) {
                    raj.c(th2);
                    cd5.c(th2, vtaVar);
                }
        }
    }
}
