package com.avito.android.serp.adapter.floating_promo_widget;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FloatingPromoWidgetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/floating_promo_widget/l;", "Lcom/avito/android/serp/adapter/floating_promo_widget/k;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f269986a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f269987b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f269988c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f269989d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f269990e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f269991f;

    public l(@Y61.k View view) {
        this.f269986a = view;
        View viewFindViewById = view.findViewById(R.id.floating_promo_widget);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f269987b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.floating_promo_background_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f269988c = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.floating_promo_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269989d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.floating_promo_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269990e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.floating_promo_image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f269991f = (SimpleDraweeView) viewFindViewById5;
    }
}
