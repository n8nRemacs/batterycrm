package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.g;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitorsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/e;", "LTV0/d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/g;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.d<g, b> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        b bVar = (b) aVar;
        ShimmerLayout shimmerLayout = gVar.f220971c;
        boolean z12 = bVar.f220955g;
        D6.G(shimmerLayout, z12);
        D6.G(gVar.f220972d, !z12);
        String str = bVar.f220951c;
        boolean z13 = str != null;
        String str2 = bVar.f220950b;
        TextView textView = gVar.f220973e;
        textView.setText(str2);
        textView.setPadding(0, 0, z13 ? gVar.f220977i : 0, 0);
        j.a(gVar.f220974f, bVar.f220952d, gVar.f220970b);
        RecyclerView recyclerView = gVar.f220976h;
        Badge badge = gVar.f220975g;
        if (str == null) {
            D6.w(badge);
        } else {
            g.a aVar2 = com.avito.android.lib.design.badge.g.f178395r;
            Context context = recyclerView.getContext();
            int iJ2 = C35835l0.j(R.attr.badgeTextRedM, recyclerView.getContext());
            aVar2.getClass();
            badge.setStyle(g.a.b(iJ2, context));
            badge.setState(new com.avito.android.lib.design.badge.f(str, null, false, 6, null));
            D6.H(badge);
        }
        com.avito.konveyor.util.a.a(gVar.f220979k, bVar.f220953e);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        gVar.f220978j = (N) bVar.f220954f;
    }
}
