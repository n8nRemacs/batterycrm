package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class kg1 extends y0f {
    public final zfd X;
    public final r41 Y;
    public final ao6 o;

    public kg1(ao6 ao6Var, zfd zfdVar, r41 r41Var, ExecutorService executorService) {
        super(executorService);
        this.o = ao6Var;
        this.X = zfdVar;
        this.Y = r41Var;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        boolean z = d2fVar instanceof jg1;
        final ao6 ao6Var = this.o;
        if (z) {
            jg1 jg1Var = (jg1) d2fVar;
            View view = jg1Var.a;
            t98 t98Var = (t98) C(i);
            if (t98Var instanceof n01) {
                jg1Var.z(t98Var);
                roe roeVar = (roe) view;
                n01 n01Var = (n01) t98Var;
                boolean z2 = n01Var.s0;
                roeVar.setEnabled(z2);
                if (z2) {
                    final n01 n01Var2 = (n01) t98Var;
                    final int i2 = 2;
                    f8j.d(view, 300L, new View.OnClickListener() { // from class: gg1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i2) {
                                case 0:
                                    ao6Var.m(n01Var2.c);
                                    break;
                                case 1:
                                    ao6Var.m(n01Var2.c);
                                    break;
                                default:
                                    ao6Var.m(n01Var2.c);
                                    break;
                            }
                        }
                    });
                } else {
                    view.setOnClickListener(null);
                }
                CharSequence charSequence = jg1Var.E0.b;
                roeVar.setDescription(charSequence != null ? new r5g(charSequence) : n01Var.o);
                return;
            }
            return;
        }
        if (d2fVar instanceof hg1) {
            hg1 hg1Var = (hg1) d2fVar;
            View view2 = hg1Var.a;
            t98 t98Var2 = (t98) C(i);
            if (t98Var2 instanceof n01) {
                hg1Var.z(t98Var2);
                boolean z3 = ((n01) t98Var2).s0;
                ((roe) view2).setEnabled(z3);
                if (!z3) {
                    view2.setOnClickListener(null);
                    return;
                }
                final n01 n01Var3 = (n01) t98Var2;
                final int i3 = 0;
                f8j.d(view2, 300L, new View.OnClickListener() { // from class: gg1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i3) {
                            case 0:
                                ao6Var.m(n01Var3.c);
                                break;
                            case 1:
                                ao6Var.m(n01Var3.c);
                                break;
                            default:
                                ao6Var.m(n01Var3.c);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (!(d2fVar instanceof ig1)) {
            d2fVar.z((t98) C(i));
            return;
        }
        ig1 ig1Var = (ig1) d2fVar;
        View view3 = ig1Var.a;
        t98 t98Var3 = (t98) C(i);
        if (t98Var3 instanceof n01) {
            ig1Var.z(t98Var3);
            boolean z4 = ((n01) t98Var3).s0;
            ((roe) view3).setEnabled(z4);
            if (z4) {
                final n01 n01Var4 = (n01) t98Var3;
                final int i4 = 1;
                f8j.d(view3, 300L, new View.OnClickListener() { // from class: gg1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i4) {
                            case 0:
                                ao6Var.m(n01Var4.c);
                                break;
                            case 1:
                                ao6Var.m(n01Var4.c);
                                break;
                            default:
                                ao6Var.m(n01Var4.c);
                                break;
                        }
                    }
                });
            } else {
                view3.setOnClickListener(null);
            }
            int i5 = ig1Var.E0.b;
            ((roe) view3).setCounter(i5 > 0 ? new wne(i5) : null);
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: I */
    public final void y(d2f d2fVar) {
        d2fVar.E();
        jg1 jg1Var = d2fVar instanceof jg1 ? (jg1) d2fVar : null;
        if (jg1Var != null) {
            jg1Var.E0.a.remove(jg1Var);
        }
        ig1 ig1Var = d2fVar instanceof ig1 ? (ig1) d2fVar : null;
        if (ig1Var != null) {
            ig1Var.E0.a.g(ig1Var);
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == j0b.q0) {
            roe roeVar = new roe(viewGroup.getContext(), 0);
            hg1 hg1Var = new hg1(roeVar);
            roeVar.setThemeDepended(noe.b);
            return hg1Var;
        }
        if (i == j0b.o0) {
            return new jg1(viewGroup.getContext(), this.X);
        }
        if (i == j0b.n0) {
            return new ig1(viewGroup.getContext(), this.Y);
        }
        String name = kg1.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.X;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(i, "unknown item viewType: "), null);
            }
        }
        return new v01(new View(viewGroup.getContext()), 4);
    }
}
