package defpackage;

/* loaded from: classes.dex */
public final class hs8 extends e2f {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ hs8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        switch (this.a) {
            case 0:
                ((or8) this.b).e(new gs8(v2fVar, (e2f) this.c, 0));
                break;
            case 1:
                ((wr8) this.b).e(new tk3(v2fVar, 3, (pcd) this.c));
                break;
            case 2:
                ((hk3) this.b).f(new gs8(v2fVar, (e2f) this.c, 1));
                break;
            case 3:
                ((u2f) this.b).k(new tk3(v2fVar, 6, (sm8) this.c));
                break;
            case 4:
                ((k2f) this.b).k(new qu1(v2fVar, (gk0) this.c));
                break;
            case 5:
                ((u2f) this.b).k(new vhb(this, 9, v2fVar));
                break;
            case 6:
                ((u2f) this.b).k(new vd(v2fVar, 10, (enb) this.c));
                break;
            default:
                m3f[] m3fVarArr = (m3f[]) this.b;
                int length = m3fVarArr.length;
                if (length == 1) {
                    ((e2f) m3fVarArr[0]).k(new aqc(v2fVar, new zid(this), false, 6));
                    break;
                } else {
                    y3f y3fVar = new y3f(v2fVar, length, (ukd) this.c);
                    v2fVar.c(y3fVar);
                    for (int i = 0; i < length && !y3fVar.e(); i++) {
                        m3f m3fVar = m3fVarArr[i];
                        if (m3fVar == null) {
                            y3fVar.a(i, new NullPointerException("One of the sources is null"));
                            break;
                        } else {
                            ((e2f) m3fVar).k(y3fVar.c[i]);
                        }
                    }
                }
        }
    }

    public hs8(e2f e2fVar, hk3 hk3Var) {
        this.a = 2;
        this.c = e2fVar;
        this.b = hk3Var;
    }
}
