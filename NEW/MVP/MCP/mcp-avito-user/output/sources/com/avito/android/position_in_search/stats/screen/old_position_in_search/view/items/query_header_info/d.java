package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header_info;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: QueriesHeaderInfoItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_header_info/d;", "LTV0/d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_header_info/e;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_header_info/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.d<e, a> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        a aVar2 = (a) aVar;
        PrintableText printableText = aVar2.f221122c;
        Context context = eVar2.f221127b;
        String strK0 = printableText != null ? printableText.k0(context) : null;
        PrintableText printableText2 = aVar2.f221123d;
        String strK02 = printableText2 != null ? printableText2.k0(context) : null;
        TextView textView = eVar2.f221129d;
        TextView textView2 = eVar2.f221128c;
        if ((strK0 == null || strK0.length() == 0) && (strK02 == null || strK02.length() == 0)) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
        } else {
            textView2.setVisibility(strK0 == null || strK0.length() == 0 ? 4 : 0);
            textView2.setText(strK0);
            textView.setVisibility((strK02 == null || strK02.length() == 0) ? 4 : 0);
            textView.setText(strK02);
        }
    }
}
