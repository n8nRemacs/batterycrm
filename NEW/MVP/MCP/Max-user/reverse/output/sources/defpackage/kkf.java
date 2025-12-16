package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;

/* loaded from: classes2.dex */
public final class kkf extends rhd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kkf(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.rhd
    public void a() {
        switch (this.a) {
            case 0:
                w86.a((w86) this.b);
                break;
        }
    }

    @Override // defpackage.rhd
    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                lg8 lg8Var = lg8.d;
                String name = kkf.class.getName();
                RecyclerView recyclerView = (RecyclerView) this.c;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, xc0.f("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), null);
                }
                w86.a((w86) this.b);
                String name2 = kkf.class.getName();
                RecyclerView recyclerView2 = (RecyclerView) this.c;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, name2, xc0.f("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rhd
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                w86.a((w86) this.b);
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
                w86.a((w86) this.b);
                break;
            case 1:
                NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = (NeuroAvatarPickerBottomSheet) this.b;
                if (i2 != 0 && neuroAvatarPickerBottomSheet.G0.J(i) != null) {
                    neuroAvatarPickerBottomSheet.P0().x();
                    ((phd) this.c).B(this);
                    break;
                }
                break;
            default:
                if (i == 0) {
                    ocg.d((ocg) this.b, (RecyclerView) this.c);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rhd
    public void e(int i, int i2) {
        switch (this.a) {
            case 0:
                w86.a((w86) this.b);
                break;
            case 2:
                if (i == 0 || i2 == 0) {
                    ocg.d((ocg) this.b, (RecyclerView) this.c);
                    break;
                }
        }
    }

    @Override // defpackage.rhd
    public void f(int i, int i2) {
        switch (this.a) {
            case 0:
                w86.a((w86) this.b);
                break;
            case 2:
                if (i == 0) {
                    ocg.d((ocg) this.b, (RecyclerView) this.c);
                    break;
                }
                break;
        }
    }
}
