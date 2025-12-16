package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class mkf extends rhd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mkf(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.rhd
    public void a() {
        switch (this.a) {
            case 0:
                okf.i((okf) this.b);
                break;
        }
    }

    @Override // defpackage.rhd
    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                okf.i((okf) this.b);
                break;
        }
    }

    @Override // defpackage.rhd
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                okf.i((okf) this.b);
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
                lg8 lg8Var = lg8.d;
                String name = mkf.class.getName();
                RecyclerView recyclerView = (RecyclerView) this.c;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, xc0.f("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), null);
                }
                okf.i((okf) this.b);
                String name2 = mkf.class.getName();
                RecyclerView recyclerView2 = (RecyclerView) this.c;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, name2, xc0.f("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), null);
                    break;
                }
                break;
            default:
                NeuroAvatarsScreen neuroAvatarsScreen = (NeuroAvatarsScreen) this.b;
                if (i2 != 0 && neuroAvatarsScreen.G0.J(i) != null) {
                    neuroAvatarsScreen.C0().x();
                    ((phd) this.c).B(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rhd
    public void e(int i, int i2) {
        switch (this.a) {
            case 0:
                okf.i((okf) this.b);
                break;
        }
    }

    @Override // defpackage.rhd
    public void f(int i, int i2) {
        switch (this.a) {
            case 0:
                okf.i((okf) this.b);
                break;
        }
    }
}
