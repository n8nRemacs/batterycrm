package defpackage;

/* loaded from: classes.dex */
public final class t9 implements nac {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ t9(nac nacVar, int i) {
        this.a = i;
        this.b = nacVar;
    }

    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        switch (this.a) {
            case 0:
                ((nac) this.b).a(new s9(hj0Var, 0), oacVar);
                break;
            case 1:
                ((nac) this.b).a(new s9(hj0Var, 2), oacVar);
                break;
            case 2:
                ((nac) this.b).a(new s9(hj0Var, 3), oacVar);
                break;
            default:
                if (((mk0) oacVar).a.h != null) {
                    if (!c(0, hj0Var, oacVar)) {
                        hj0Var.g(1, null);
                        break;
                    }
                } else {
                    hj0Var.g(1, null);
                    break;
                }
                break;
        }
    }

    public boolean c(int i, hj0 hj0Var, oac oacVar) {
        k8g[] k8gVarArr = (k8g[]) this.b;
        ynd yndVar = ((mk0) oacVar).a.h;
        while (true) {
            if (i >= k8gVarArr.length) {
                i = -1;
                break;
            }
            if (k8gVarArr[i].b(yndVar)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        k8gVarArr[i].a(new j8g(this, hj0Var, oacVar, i), oacVar);
        return true;
    }

    public t9(k8g[] k8gVarArr) {
        this.a = 3;
        k8g[] k8gVarArr2 = k8gVarArr;
        this.b = k8gVarArr2;
        l5j.d(0, k8gVarArr2.length);
    }
}
