package com.avito.android.advert.item.fair_price;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FairPriceView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/fair_price/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/fair_price/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f75397e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f75398b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f75399c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f75400d;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.ad_fair_price);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75398b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ad_fair_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75399c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.ad_fair_price_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f75400d = (ViewGroup) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.fair_price.g
    @k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.android.advert.item.fair_price.g
    public final void h(@k String str) {
        this.f75399c.setText(str);
    }

    @Override // com.avito.android.advert.item.fair_price.g
    public final void my(@k AdvertFairPriceModel.Icon icon) {
        Drawable drawableM = C35835l0.m(this.itemView.getContext(), icon.f75412c, icon.f75411b);
        if (drawableM != null) {
            I5.d(this.f75398b, null, drawableM, 11);
        }
    }

    @Override // com.avito.android.advert.item.fair_price.g
    public final void n10(@k Y41.a<G0> aVar) {
        this.f75400d.setOnClickListener(new n(13, aVar));
    }

    @Override // com.avito.android.advert.item.fair_price.g
    public final void p(@k String str) {
        this.f75398b.setText(str);
    }
}
