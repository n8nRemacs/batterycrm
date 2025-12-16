package com.avito.android.serp.adapter.vertical_main.mini_search_widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetRecentSearches;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MiniSearchWidgetActionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/b;", "Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/a;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends com.avito.android.serp.c implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f273046b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f273047c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f273048d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f273049e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f273050f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f273051g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f273052h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public N f273053i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public N f273054j;

    public b(@Y61.k View view) {
        super(view);
        this.f273046b = (TextView) view.findViewById(R.id.mini_search_action_title);
        View viewFindViewById = view.findViewById(R.id.mini_search_action_button);
        this.f273047c = viewFindViewById;
        this.f273048d = (TextView) view.findViewById(R.id.mini_search_action_description);
        this.f273049e = (ImageView) view.findViewById(R.id.mini_search_action_filters_icon);
        this.f273050f = (ImageView) view.findViewById(R.id.mini_search_action_arrow_icon);
        this.f273051g = (ViewGroup) view.findViewById(R.id.recent_searches_scroll_container);
        this.f273052h = (ViewGroup) view.findViewById(R.id.recent_searches_container);
        viewFindViewById.setOnClickListener(new com.avito.android.review_gallery.g(this, 23));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void GM(boolean z12) {
        D6.G(this.f273049e, z12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void K50(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f273046b, attributedText, null);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void KU(int i12, int i13) {
        D6.b(this.f273048d, Integer.valueOf(y6.b(i12)), Integer.valueOf(y6.b(2)), Integer.valueOf(y6.b(i13)), Integer.valueOf(y6.b(13)));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void Qy(int i12, int i13, int i14) {
        D6.b(this.f273046b, Integer.valueOf(y6.b(i12)), Integer.valueOf(y6.b(i13)), Integer.valueOf(y6.b(8)), Integer.valueOf(y6.b(i14)));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void U(@Y61.k Y41.a<G0> aVar) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void hr(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        throw null;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f273053i = null;
        this.f273054j = null;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void mQ(@Y61.l List<MiniSearchWidgetRecentSearches.Item> list) {
        D6.G(this.f273051g, O2.a(list));
        if (list == null) {
            return;
        }
        int iD2 = com.avito.android.actions_sheet.a.d(this.itemView, R.dimen.content_horizontal_padding);
        int iD3 = com.avito.android.actions_sheet.a.d(this.itemView, R.dimen.mini_search_widget_recent_search_items_margin);
        ViewGroup viewGroup = this.f273052h;
        viewGroup.removeAllViews();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            MiniSearchWidgetRecentSearches.Item item = (MiniSearchWidgetRecentSearches.Item) obj;
            View viewInflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.mini_search_widget_recent_search_item_layout, (ViewGroup) null);
            com.avito.android.lib.design.button.b.a((Button) viewInflate.findViewById(R.id.recent_search_btn), item.f273044b, false);
            viewInflate.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(24, this, item));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(i12 == 0 ? iD2 : 0);
            layoutParams.setMarginEnd(i12 == list.size() + (-1) ? iD2 : iD3);
            viewGroup.addView(viewInflate, layoutParams);
            i12 = i13;
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void nL(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f273048d, attributedText, null);
    }
}
