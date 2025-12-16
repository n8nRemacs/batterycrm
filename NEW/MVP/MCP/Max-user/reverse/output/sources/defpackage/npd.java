package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class npd implements b48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ npd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) {
        switch (this.a) {
            case 0:
                ppd ppdVar = (ppd) this.b;
                WeakReference weakReference = ppdVar.e;
                int i = opd.$EnumSwitchMapping$0[k38Var.ordinal()];
                if (i == 1) {
                    ppdVar.g = true;
                    RecyclerView recyclerView = (RecyclerView) weakReference.get();
                    if (recyclerView != null) {
                        recyclerView = recyclerView.getAdapter() != null ? recyclerView : null;
                        if (recyclerView != null) {
                            ppdVar.b(recyclerView);
                            break;
                        }
                    }
                } else if (i == 2) {
                    ppdVar.g = false;
                    RecyclerView recyclerView2 = (RecyclerView) weakReference.get();
                    if (recyclerView2 != null) {
                        if (recyclerView2.getAdapter() == null && recyclerView2.F0) {
                            recyclerView = recyclerView2;
                        }
                        if (recyclerView != null) {
                            ppdVar.a(recyclerView);
                            break;
                        }
                    }
                }
                break;
            default:
                pn pnVar = (pn) this.b;
                if (k38Var != k38.ON_START) {
                    if (k38Var == k38.ON_STOP) {
                        pnVar.e = false;
                        break;
                    }
                } else {
                    pnVar.e = true;
                    break;
                }
                break;
        }
    }
}
