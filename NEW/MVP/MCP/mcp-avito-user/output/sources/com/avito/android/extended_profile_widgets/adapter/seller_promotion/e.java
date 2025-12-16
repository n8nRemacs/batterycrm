package com.avito.android.extended_profile_widgets.adapter.seller_promotion;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SellerPromotionView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/seller_promotion/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f154930b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f154931c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f154932d;

    public e(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f154930b = view;
        this.f154931c = aVar;
        View viewFindViewById = view.findViewById(R.id.promotion_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154932d = (TextView) viewFindViewById;
    }
}
