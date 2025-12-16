package com.avito.android.advert.item;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.util.p6;
import com.avito.android.video_snippets.g;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/X1;", "Landroidx/recyclerview/widget/RecyclerView$o;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X1 implements RecyclerView.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f72284b;

    public X1(I1 i12) {
        this.f72284b = i12;
    }

    public final void a(@Y61.l View view, boolean z12) {
        com.avito.android.advertising.ui.buzzoola.j jVar;
        g.c f88619u;
        I1 i12 = this.f72284b;
        if (view == null || (i12.f71750x0.W(view) instanceof com.avito.android.advertising.ui.buzzoola.j)) {
            HashMap map = new HashMap();
            p6 p6Var = new p6(i12.f71750x0);
            while (p6Var.hasNext()) {
                View view2 = (View) p6Var.next();
                if (!z12 || !view2.equals(view)) {
                    Object objW = i12.f71750x0.W(view2);
                    if ((objW instanceof com.avito.android.advertising.ui.buzzoola.j) && (f88619u = (jVar = (com.avito.android.advertising.ui.buzzoola.j) objW).getF88619u()) != null) {
                        map.put(jVar.getF88618t(), f88619u);
                    }
                }
            }
            ScreenIdField screenIdField = ScreenIdField.f90251c;
            i12.f71700d0.e(map, "item", i12.f71693b.getRootView());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(@Y61.k View view) {
        a(view, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j(@Y61.k View view) {
        a(view, false);
    }
}
