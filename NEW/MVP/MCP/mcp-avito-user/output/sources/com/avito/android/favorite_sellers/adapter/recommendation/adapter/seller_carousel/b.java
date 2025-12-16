package com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertWithOverlayView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/adapter/seller_carousel/b;", "", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f155594a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final View f155595b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final TextView f155596c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final TextView f155597d;

    public b(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f155594a = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.overlay_container);
        this.f155595b = viewFindViewById2;
        this.f155596c = viewFindViewById2 != null ? (TextView) viewFindViewById2.findViewById(R.id.overlay_title) : null;
        this.f155597d = viewFindViewById2 != null ? (TextView) viewFindViewById2.findViewById(R.id.overlay_subtitle) : null;
    }
}
