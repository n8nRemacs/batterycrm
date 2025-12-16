package defpackage;

import android.net.Uri;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.Collections;
import java.util.Map;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes.dex */
public abstract class x7j {
    public static ze4 a(ymd ymdVar, String str, r7d r7dVar, int i) {
        Map map = Collections.EMPTY_MAP;
        Uri uriE = moi.e(str, r7dVar.c);
        long j = r7dVar.a;
        long j2 = r7dVar.b;
        String strA = ymdVar.a();
        if (strA == null) {
            strA = moi.e(((kl0) ymdVar.b.get(0)).a, r7dVar.c).toString();
        }
        String str2 = strA;
        hsi.i(uriE, "The uri must be set.");
        return new ze4(uriE, 0L, 1, null, ekd.Y, j, j2, str2, i);
    }

    public static final int b(RecyclerView recyclerView, float f) {
        LinearLayoutManager linearLayoutManagerE = e(recyclerView);
        if (linearLayoutManagerE == null) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
        if (f == 1.0f) {
            return linearLayoutManagerE.Y0();
        }
        if (f == 0.0f) {
            return linearLayoutManagerE.Z0();
        }
        int iZ0 = linearLayoutManagerE.Z0();
        View viewS = linearLayoutManagerE.s(iZ0);
        return (viewS == null || ((float) (recyclerView.getMeasuredHeight() - viewS.getTop())) < ((float) viewS.getMeasuredHeight()) * f) ? linearLayoutManagerE.Y0() : iZ0;
    }

    public static ocg c(RecyclerView recyclerView) {
        new r8j(28);
        ocg ocgVar = new ocg();
        ocgVar.a(recyclerView);
        return ocgVar;
    }

    public static final GridLayoutManager d(RecyclerView recyclerView) {
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return (GridLayoutManager) layoutManager;
        }
        return null;
    }

    public static final LinearLayoutManager e(RecyclerView recyclerView) {
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public static final boolean f(RecyclerView recyclerView, int i) {
        View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        return childAt != null && RecyclerView.R(childAt) == i;
    }

    public static final void g(RecyclerView recyclerView, phd phdVar, boolean z, em6 em6Var) {
        ws7 ws7Var;
        if (recyclerView.getAdapter() == null || phdVar != recyclerView.getAdapter()) {
            if (!fni.a(Looper.myLooper(), Looper.getMainLooper())) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (z) {
                int i = jab.a;
                Object tag = recyclerView.getTag(i);
                ppd ppdVar = tag instanceof ppd ? (ppd) tag : null;
                recyclerView.setTag(i, null);
                if (ppdVar != null) {
                    String str = ppdVar.k;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, "clear", null);
                        }
                    }
                    RecyclerView recyclerView2 = (RecyclerView) ppdVar.e.get();
                    if (recyclerView2 != null && (ws7Var = ppdVar.h) != null) {
                        ws7Var.b(recyclerView2);
                    }
                    ppdVar.h = null;
                    RecyclerView recyclerView3 = (RecyclerView) ppdVar.e.get();
                    if (recyclerView3 != null) {
                        recyclerView3.removeOnAttachStateChangeListener(ppdVar.j);
                    }
                    l48 l48Var = ppdVar.f;
                    if (l48Var != null) {
                        l48Var.f(ppdVar.i);
                    }
                }
            }
            if (phdVar == null) {
                recyclerView.setAdapter(null);
            } else {
                recyclerView.setTag(jab.a, new ppd(phdVar, recyclerView, em6Var));
            }
        }
    }

    public static /* synthetic */ void h(EndlessRecyclerView2 endlessRecyclerView2, phd phdVar, gf1 gf1Var, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            gf1Var = null;
        }
        g(endlessRecyclerView2, phdVar, z, gf1Var);
    }
}
