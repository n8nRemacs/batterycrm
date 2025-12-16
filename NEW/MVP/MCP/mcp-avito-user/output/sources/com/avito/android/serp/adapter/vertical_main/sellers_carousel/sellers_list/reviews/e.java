package com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: SellerWithReviewsView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/reviews/e;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f273191b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f273192c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f273193d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f273194e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f273195f;

    /* renamed from: g, reason: collision with root package name */
    public final View f273196g;

    public e(@k View view) {
        super(view);
        this.f273191b = view;
        this.f273192c = (TextView) view.findViewById(R.id.title);
        this.f273193d = (TextView) view.findViewById(R.id.seller_review_rating);
        this.f273194e = (TextView) view.findViewById(R.id.seller_review_count);
        this.f273195f = (SimpleDraweeView) view.findViewById(R.id.icon);
        this.f273196g = view.findViewById(R.id.sellers_carousel_reviews);
    }
}
