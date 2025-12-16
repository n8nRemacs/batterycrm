package defpackage;

import android.content.ContextWrapper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ppd {
    public final phd a;
    public final em6 d;
    public final WeakReference e;
    public final l48 f;
    public boolean g;
    public ws7 h;
    public final rk j;
    public final String k;
    public int b = -1;
    public int c = 0;
    public final npd i = new npd(0, this);

    public ppd(phd phdVar, RecyclerView recyclerView, em6 em6Var) {
        j48 j48Var;
        this.a = phdVar;
        this.d = em6Var;
        this.e = new WeakReference(recyclerView);
        rk rkVar = new rk(7, this);
        this.j = rkVar;
        this.k = ppd.class.getName();
        recyclerView.addOnAttachStateChangeListener(rkVar);
        Object context = recyclerView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                j48Var = null;
                break;
            } else {
                if (context instanceof j48) {
                    j48Var = (j48) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (j48Var == null) {
            String str = this.k;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "registerLifecycleObserver findLifecycleOwner() is null", null);
                }
            }
        } else {
            l48 l48VarP = j48Var.p();
            this.f = l48VarP;
            if (l48VarP != null) {
                l48VarP.a(this.i);
            }
            this.g = !j48Var.p().d.a(l38.d);
        }
        this.j.onViewAttachedToWindow(recyclerView);
    }

    public final void a(RecyclerView recyclerView) {
        String str = this.k;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "attachAdapter", null);
            }
        }
        phd phdVar = this.a;
        if (recyclerView.getAdapter() != phdVar) {
            recyclerView.setAdapter(phdVar);
        }
        if (this.b != -1) {
            a layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.o1(this.b, this.c);
            }
        }
        ws7 ws7Var = this.h;
        if (ws7Var != null) {
            ws7Var.a(recyclerView);
        } else {
            em6 em6Var = this.d;
            this.h = em6Var != null ? (ws7) em6Var.invoke(recyclerView) : null;
        }
    }

    public final void b(RecyclerView recyclerView) {
        String str = this.k;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "detachAdapter", null);
            }
        }
        a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            this.b = linearLayoutManager.X0();
            View childAt = recyclerView.getChildAt(0);
            this.c = childAt != null ? childAt.getTop() : 0;
        }
        ws7 ws7Var = this.h;
        if (ws7Var != null) {
            ws7Var.b(recyclerView);
        }
        if (recyclerView.getAdapter() != null) {
            recyclerView.setAdapter(null);
        }
    }
}
