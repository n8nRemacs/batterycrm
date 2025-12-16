package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class y03 extends y0f {
    public final Object X;
    public Object Y;
    public final /* synthetic */ int o = 1;

    public y03(usd usdVar, ExecutorService executorService) {
        super(executorService);
        this.X = usdVar;
    }

    @Override // defpackage.y0f
    /* renamed from: H */
    public /* bridge */ /* synthetic */ void r(d2f d2fVar, int i) {
        switch (this.o) {
            case 0:
                J((b03) d2fVar, i);
                break;
            default:
                super.r(d2fVar, i);
                break;
        }
    }

    public void J(b03 b03Var, int i) {
        hs2 hs2Var = (hs2) this.d.f.get(i);
        usd usdVar = (usd) this.X;
        w03 w03Var = new w03(usdVar);
        x03 x03Var = new x03(usdVar);
        b03Var.z(hs2Var);
        uc2 uc2Var = (uc2) b03Var.a;
        f8j.d(uc2Var, 300L, new ub(w03Var, 17, hs2Var));
        uc2Var.setOnLongClickListener(new yi2(x03Var, b03Var, hs2Var, 3));
    }

    @Override // defpackage.y0f, defpackage.phd
    public /* bridge */ /* synthetic */ void r(mid midVar, int i) {
        switch (this.o) {
            case 0:
                J((b03) midVar, i);
                break;
            default:
                super.r(midVar, i);
                break;
        }
    }

    @Override // defpackage.phd
    public final void s(mid midVar, int i, List list) {
        switch (this.o) {
            case 0:
                b03 b03Var = (b03) midVar;
                d92 d92Var = (d92) this.Y;
                iv ivVar = this.d;
                if (d92Var != null) {
                    d92Var.invoke(Long.valueOf(((hs2) ivVar.f.get(i)).a));
                }
                if (list.isEmpty()) {
                    J(b03Var, i);
                    return;
                }
                fs2 fs2Var = new fs2(9);
                for (Object obj : list) {
                    fs2 fs2Var2 = obj instanceof fs2 ? (fs2) obj : null;
                    if (fs2Var2 != null) {
                        fs2Var.c0(fs2Var2);
                    }
                }
                b03Var.A((hs2) ivVar.f.get(i), fs2Var);
                return;
            case 1:
                fc5 fc5Var = (fc5) midVar;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof cgf) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (obj2 instanceof d62) {
                                    arrayList.add(obj2);
                                }
                            }
                            d62 d62Var = (d62) ue3.Q(arrayList);
                            if (d62Var != null) {
                                fc5Var.F(d62Var.a);
                                return;
                            } else {
                                r(fc5Var, i);
                                return;
                            }
                        }
                    }
                }
                r(fc5Var, i);
                return;
            default:
                ogf ogfVar = (ogf) midVar;
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() instanceof cgf) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                if (obj3 instanceof cgf) {
                                    arrayList2.add(obj3);
                                }
                            }
                            cgf cgfVar = (cgf) ue3.I(arrayList2);
                            if (cgfVar == null) {
                                r(ogfVar, i);
                                return;
                            } else if (cgfVar instanceof agf) {
                                ogfVar.G(((agf) cgfVar).a);
                                return;
                            } else {
                                if (!(cgfVar instanceof bgf)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ogfVar.F(((bgf) cgfVar).a);
                                return;
                            }
                        }
                    }
                }
                r(ogfVar, i);
                return;
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                return new b03(new uc2(viewGroup.getContext()));
            case 1:
                return new fc5(viewGroup.getContext(), (ShapeDrawable) this.Y, (wu7) this.X);
            default:
                return new ogf(viewGroup.getContext(), (ShapeDrawable) this.Y, (wu7) this.X);
        }
    }

    @Override // defpackage.phd
    public /* bridge */ /* synthetic */ boolean v(mid midVar) {
        switch (this.o) {
            case 0:
                return true;
            default:
                return super.v(midVar);
        }
    }

    public y03(ExecutorService executorService, wu7 wu7Var, byte b) {
        super(executorService);
        this.X = wu7Var;
        this.Y = new ShapeDrawable(new OvalShape());
    }

    public y03(ExecutorService executorService, wu7 wu7Var) {
        super(executorService);
        this.X = wu7Var;
        this.Y = new ShapeDrawable(new OvalShape());
    }
}
