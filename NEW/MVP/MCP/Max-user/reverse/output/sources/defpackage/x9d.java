package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x9d {
    public final Context a;
    public w9d b;
    public final nif c;
    public final RecyclerView d;

    public x9d(Context context, Executor executor) {
        this.a = context;
        nif nifVar = new nif(executor, new o9d(context), new iqb(17, this), new ffb(22, this), 1);
        this.c = nifVar;
        u74 u74Var = new u74(vw4.d().getDisplayMetrics().density * 24.0f);
        Continuation continuation = null;
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(p0d.one_chat_react_panel_layout);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(8));
        recyclerView.j(new f96(kti.d((b9j.b(context) >= 360 ? 10 : 8) * vw4.d().getDisplayMetrics().density), new jl8(0, 2, x9d.class, this, "isExpanded", "isExpanded()Z")));
        recyclerView.setOutlineProvider(u74Var);
        recyclerView.setHasFixedSize(true);
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(nifVar);
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToOutline(false);
        float f = 8;
        float f2 = 12;
        recyclerView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density));
        tqi.c(new kga(this, continuation, 13), recyclerView);
        this.d = recyclerView;
    }

    public final void a(List list, Integer num) {
        if (list.size() > 8 && num != null) {
            int iIntValue = num.intValue();
            RecyclerView recyclerView = this.d;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int iD = kti.d(240 * vw4.d().getDisplayMetrics().density);
            if (iIntValue > 0) {
                iD = Math.min(iD, iIntValue);
            }
            layoutParams.height = iD;
            recyclerView.setLayoutParams(layoutParams);
        }
        this.c.F(list, new awa(16, this));
    }
}
