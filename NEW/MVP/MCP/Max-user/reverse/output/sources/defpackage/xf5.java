package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class xf5 extends rhd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public xf5(p3e p3eVar, RecyclerView recyclerView, phd phdVar) {
        this.a = 1;
        this.b = p3eVar;
        this.c = recyclerView;
        this.d = phdVar;
    }

    @Override // defpackage.rhd
    public void a() {
        switch (this.a) {
            case 0:
                h();
                break;
        }
    }

    @Override // defpackage.rhd
    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                lg8 lg8Var = lg8.d;
                String name = xf5.class.getName();
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.d;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, xc0.f("onItemRangeInserted start. isComputingLayout:", endlessRecyclerView2.Z()), null);
                }
                h();
                String name2 = xf5.class.getName();
                EndlessRecyclerView2 endlessRecyclerView22 = (EndlessRecyclerView2) this.d;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, name2, xc0.f("onItemRangeInserted end. isComputingLayout:", endlessRecyclerView22.Z()), null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rhd
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                h();
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    @Override // defpackage.rhd
    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                break;
            default:
                lg8 lg8Var = lg8.d;
                p3e p3eVar = (p3e) this.b;
                if (i2 == 1 && p3e.d(p3eVar, (RecyclerView) this.c, i)) {
                    String str = ((p3e) this.b).d;
                    RecyclerView recyclerView = (RecyclerView) this.c;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null && l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, xc0.f("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), null);
                    }
                    p3e.e((p3e) this.b, (phd) this.d);
                    String str2 = ((p3e) this.b).d;
                    RecyclerView recyclerView2 = (RecyclerView) this.c;
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                        l6bVar2.c(lg8Var, str2, xc0.f("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), null);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.rhd
    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                break;
            default:
                phd phdVar = (phd) this.d;
                RecyclerView recyclerView = (RecyclerView) this.c;
                p3e p3eVar = (p3e) this.b;
                if (!p3e.d(p3eVar, recyclerView, i)) {
                    if (p3e.d(p3eVar, recyclerView, i2)) {
                        p3e.e(p3eVar, phdVar);
                        break;
                    }
                } else {
                    p3e.e(p3eVar, phdVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rhd
    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                break;
            default:
                p3e p3eVar = (p3e) this.b;
                if (i2 == 1 && p3e.d(p3eVar, (RecyclerView) this.c, i)) {
                    p3e.e(p3eVar, (phd) this.d);
                    break;
                }
                break;
        }
    }

    public void h() {
        y7j.c(5, (EndlessRecyclerView2) this.d, (zn6) this.c, null);
    }

    public xf5(EndlessRecyclerView2 endlessRecyclerView2) {
        this.a = 0;
        this.d = endlessRecyclerView2;
        this.b = new AtomicBoolean(true);
        this.c = new zn6(this, 6, endlessRecyclerView2);
    }
}
