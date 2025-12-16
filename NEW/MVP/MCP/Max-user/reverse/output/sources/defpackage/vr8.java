package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class vr8 extends vqa {
    public final /* synthetic */ int a;
    public final tm6 b;
    public final Object c;

    public /* synthetic */ vr8(Object obj, tm6 tm6Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = tm6Var;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        m3f m3fVar;
        switch (this.a) {
            case 0:
                ur8 ur8Var = new ur8(vtaVar, this.b, 0);
                vtaVar.c(ur8Var);
                ((or8) this.c).e(ur8Var);
                break;
            case 1:
                lta ltaVar = (vqa) this.c;
                boolean z = ltaVar instanceof drf;
                tm6 tm6Var = this.b;
                if (!z) {
                    ltaVar.a(new hra(vtaVar, tm6Var));
                    break;
                } else {
                    try {
                        Object obj = ((drf) ltaVar).get();
                        if (obj != null) {
                            Object objApply = tm6Var.apply(obj);
                            Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                            m3fVar = (m3f) objApply;
                        } else {
                            m3fVar = null;
                        }
                        if (m3fVar != null) {
                            ((e2f) m3fVar).k(new is8(vtaVar, 1));
                            break;
                        } else {
                            cd5.a(vtaVar);
                            break;
                        }
                    } catch (Throwable th) {
                        raj.c(th);
                        cd5.c(th, vtaVar);
                        return;
                    }
                }
            case 2:
                try {
                    Object objApply2 = this.b.apply(this.c);
                    Objects.requireNonNull(objApply2, "The mapper returned a null ObservableSource");
                    lta ltaVar2 = (lta) objApply2;
                    if (!(ltaVar2 instanceof drf)) {
                        ltaVar2.a(vtaVar);
                        break;
                    } else {
                        try {
                            Object obj2 = ((drf) ltaVar2).get();
                            if (obj2 != null) {
                                kta ktaVar = new kta(vtaVar, obj2);
                                vtaVar.c(ktaVar);
                                ktaVar.run();
                                break;
                            } else {
                                cd5.a(vtaVar);
                                break;
                            }
                        } catch (Throwable th2) {
                            raj.c(th2);
                            cd5.c(th2, vtaVar);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    raj.c(th3);
                    cd5.c(th3, vtaVar);
                    return;
                }
            default:
                ur8 ur8Var2 = new ur8(vtaVar, this.b, 1);
                vtaVar.c(ur8Var2);
                ((e2f) this.c).k(ur8Var2);
                break;
        }
    }
}
