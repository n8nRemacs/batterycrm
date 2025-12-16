package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class hx3 extends sm implements j1g {
    public final /* synthetic */ int d;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hx3(long j, Object obj, int i) {
        super(j);
        this.d = i;
        this.o = obj;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        List list;
        switch (this.d) {
            case 0:
                jx3 jx3Var = (jx3) l0gVar;
                tm tmVar = this.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                ((lx3) tmVar.P.getValue()).a(jx3Var, (long[]) this.o, this.a);
                return;
            default:
                rvf rvfVar = (rvf) l0gVar;
                tm tmVar2 = this.c;
                if (tmVar2 == null) {
                    tmVar2 = null;
                }
                tw0 tw0VarB = tmVar2.b();
                List list2 = rvfVar.c;
                if (list2 == null || !list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        try {
                            if (((gx3) obj) != ex3.z0) {
                                arrayList.add(obj);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    list = arrayList;
                } else {
                    list = Collections.EMPTY_LIST;
                }
                tw0VarB.c(new tvf(list, rvfVar.d, (HashMap) this.o));
                return;
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        switch (this.d) {
            case 0:
                tm tmVar = this.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                lx3 lx3Var = (lx3) tmVar.P.getValue();
                long[] jArr = (long[]) this.o;
                lx3Var.getClass();
                if ("not.found".equals(pzfVar.b)) {
                    ((qv3) lx3Var.b.getValue()).o(jArr[0]);
                }
                ((tw0) lx3Var.a.getValue()).c(new rj0(this.a, pzfVar));
                break;
            default:
                tm tmVar2 = this.c;
                if (tmVar2 == null) {
                    tmVar2 = null;
                }
                tmVar2.b().c(new rj0(this.a, pzfVar));
                break;
        }
    }

    @Override // defpackage.sm
    public final n2 i() {
        switch (this.d) {
            case 0:
                tm tmVar = this.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                ((lv4) tmVar.c.getValue()).e();
                return new fh2((long[]) this.o);
            default:
                HashMap map = (HashMap) this.o;
                zf8 zf8Var = new zf8(xhb.z0, 28);
                HashMap map2 = new HashMap();
                map.forEach(new ov3(5, map2));
                zf8Var.v("contactList", map2);
                return zf8Var;
        }
    }
}
