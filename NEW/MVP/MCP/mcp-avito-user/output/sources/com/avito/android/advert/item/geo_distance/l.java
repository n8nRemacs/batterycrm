package com.avito.android.advert.item.geo_distance;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.skeleton.Skeleton;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.render.android_view.M;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAddressGeoDistanceItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/geo_distance/k;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f75711g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f75712b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f75713c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f75714d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ShimmerLayout f75715e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Skeleton f75716f;

    public l(@Y61.k View view) {
        super(view);
        this.f75712b = view;
        View viewFindViewById = view.findViewById(R.id.geo_distance_info);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75713c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.geo_distance_hint);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f75714d = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.geo_distance_info_shimmer);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f75715e = (ShimmerLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.geo_distance_info_skeleton);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.Skeleton");
        }
        Skeleton skeleton = (Skeleton) viewFindViewById4;
        this.f75716f = skeleton;
        skeleton.setCardBackgroundColor(C35835l0.d(R.attr.warmGray8, view.getContext()));
    }

    @Override // com.avito.android.advert.item.geo_distance.k
    public final void LD() {
        this.f75714d.setVisibility(8);
    }

    @Override // com.avito.android.advert.item.geo_distance.k
    public final void WN() {
        ShimmerLayout shimmerLayout = this.f75715e;
        M.a(shimmerLayout, true);
        M.a(this.f75716f, true);
        shimmerLayout.c();
    }

    @Override // com.avito.android.advert.item.geo_distance.k
    public final void Wz() {
        this.f75713c.setVisibility(8);
    }

    @Override // com.avito.android.advert.item.geo_distance.k
    public final void bn() {
        ShimmerLayout shimmerLayout = this.f75715e;
        shimmerLayout.d();
        shimmerLayout.setVisibility(8);
        this.f75716f.setVisibility(8);
    }

    @Override // com.avito.android.advert.item.geo_distance.k
    public final void di(@Y61.k AttributedText attributedText) {
        TextView textView = this.f75713c;
        M.a(textView, true);
        com.avito.android.util.text.j.c(textView, attributedText, null);
    }

    @Override // com.avito.android.advert.item.geo_distance.k
    public final void fK(@Y61.k Y41.a<G0> aVar) {
        View view = this.f75714d;
        M.a(view, true);
        view.setOnClickListener(new com.avito.android.active_orders_common.items.order.n(18, aVar));
    }

    @Override // com.avito.android.advert.item.geo_distance.k
    public final void tG() {
        this.f75712b.setVisibility(8);
    }

    @Override // com.avito.android.advert.item.geo_distance.k
    public final void zN() {
        M.a(this.f75712b, true);
    }
}
