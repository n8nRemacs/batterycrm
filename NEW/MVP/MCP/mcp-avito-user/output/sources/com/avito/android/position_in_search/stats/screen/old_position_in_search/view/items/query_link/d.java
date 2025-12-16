package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: QueryLinkItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_link/d;", "LTV0/d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_link/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_link/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.d<f, a> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        AttributedText attributedText = aVar2.f221132d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(fVar.f221141d);
        }
        j.a(fVar.f221140c, attributedText, fVar.f221139b);
        fVar.f221142e = aVar2;
    }
}
