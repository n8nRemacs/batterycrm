package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.item;

import TV0.e;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: CompetitorItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/item/d;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f220987i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f220988b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f220989c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f220990d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f220991e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f220992f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f220993g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f220994h;

    public d(@k View view) {
        super(view);
        this.f220988b = (SimpleDraweeView) view.findViewById(R.id.position_in_search_competitor_item_image);
        this.f220989c = (TextView) view.findViewById(R.id.position_in_search_competitor_item_price);
        this.f220990d = (TextView) view.findViewById(R.id.position_in_search_competitor_item_title);
        this.f220991e = (TextView) view.findViewById(R.id.position_in_search_competitor_item_location);
        this.f220992f = (TextView) view.findViewById(R.id.position_in_search_competitor_item_icon);
        this.f220993g = (TextView) view.findViewById(R.id.position_in_search_competitor_item_current_count);
        this.f220994h = (TextView) view.findViewById(R.id.position_in_search_competitor_item_delta_count);
        new Throwable();
    }
}
