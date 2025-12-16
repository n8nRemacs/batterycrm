package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class nif extends y0f {
    public final Object X;
    public final em6 Y;
    public final xm6 Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nif(Executor executor, Object obj, em6 em6Var, xm6 xm6Var, int i) {
        super(executor);
        this.o = i;
        this.X = obj;
        this.Y = em6Var;
        this.Z = xm6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y0f
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        switch (this.o) {
            case 0:
                super.r(d2fVar, i);
                if (d2fVar instanceof j8e) {
                    ((j8e) d2fVar).b((qif) this.X);
                }
                if (d2fVar instanceof zff) {
                    zff zffVar = (zff) d2fVar;
                    zffVar.H0.setOnTouchListener(new fi1(zffVar, 4, (qif) this.Z));
                    qif qifVar = (qif) this.Y;
                    View view = zffVar.a;
                    if (qifVar == null) {
                        view.setOnLongClickListener(null);
                        break;
                    } else {
                        view.setOnLongClickListener(new d72(zffVar, 8, qifVar));
                        break;
                    }
                }
                break;
            default:
                t98 t98Var = (t98) C(i);
                m9d m9dVar = t98Var instanceof m9d ? (m9d) t98Var : null;
                if (m9dVar != null) {
                    n9d n9dVar = d2fVar instanceof n9d ? (n9d) d2fVar : null;
                    if (n9dVar != null) {
                        iqb iqbVar = (iqb) this.Y;
                        n9dVar.z(m9dVar);
                        f8j.d(n9dVar.a, 300L, new kg6(iqbVar, 27, m9dVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public long k(int i) {
        switch (this.o) {
            case 1:
                return ((t98) C(i)).getItemId();
            default:
                return super.k(i);
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public int l(int i) {
        switch (this.o) {
            case 1:
                return ((t98) C(i)).getK0();
            default:
                return super.l(i);
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public final /* bridge */ /* synthetic */ void r(mid midVar, int i) {
        switch (this.o) {
            case 0:
                r((d2f) midVar, i);
                break;
            default:
                r((d2f) midVar, i);
                break;
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                if (i == udb.g) {
                    return new lif(new roe(viewGroup.getContext(), 0));
                }
                if (i != udb.m && i != udb.h) {
                    if (i == udb.s) {
                        TextView textView = new TextView(viewGroup.getContext());
                        float f = 16;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), textView.getPaddingBottom());
                        dpg.q.b(textView, t75.b);
                        tqi.c(new ipe(3, null, 9), textView);
                        return new v01(textView, 27);
                    }
                    if (i == udb.r) {
                        return new zff(viewGroup.getContext());
                    }
                    String name = nif.class.getName();
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.X;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, name, ho7.f(i, "unknown item viewType: "), null);
                        }
                    }
                    return new v01(new View(viewGroup.getContext()), 28);
                }
                return new mif(viewGroup.getContext());
            default:
                o9d o9dVar = (o9d) this.X;
                if (i != cvd.a) {
                    return new n9d(viewGroup.getContext(), o9dVar);
                }
                Context context = viewGroup.getContext();
                ffb ffbVar = new ffb(21, this);
                ImageView imageView = new ImageView(context);
                int iD = kti.d(o9dVar.a() * vw4.d().getDisplayMetrics().density);
                imageView.setLayoutParams(new xhd(iD, iD));
                f8j.d(imageView, 300L, new pcc(3, ffbVar));
                tqi.c(new mn7(iD, null, 1), imageView);
                return new v01(imageView, 14);
        }
    }
}
