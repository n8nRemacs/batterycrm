package com.avito.android.advert.item.short_term_rent.payment_toggles.toggle;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsTravelPaymentToggleView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/toggle/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/toggle/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f80129i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f80130b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f80131c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f80132d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f80133e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Switcher f80134f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f80135g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f80136h;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80130b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.new_price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80131c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.old_price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80132d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.discount_percent);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80133e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.switcher);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        Switcher switcher = (Switcher) viewFindViewById5;
        this.f80134f = switcher;
        View viewFindViewById6 = view.findViewById(R.id.old_price_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f80135g = (LinearLayout) viewFindViewById6;
        switcher.setOnCheckedChangeListener(new h(this, 0));
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.g
    public final void Lm(@l AttributedText attributedText, @k Y41.a<G0> aVar) {
        TextView textView = this.f80130b;
        j.a(textView, attributedText, null);
        textView.setOnClickListener(new com.avito.android.advert.item.parking.h(20, aVar));
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.g
    public final void V4(@k Y41.l<? super Boolean, G0> lVar) {
        this.f80136h = lVar;
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.g
    public final void Xf(@l AttributedText attributedText, @l AttributedText attributedText2) {
        j.a(this.f80132d, attributedText, null);
        j.a(this.f80133e, attributedText2, null);
        this.f80135g.setVisibility((attributedText == null && attributedText2 == null) ? 8 : 0);
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.g
    public final void dd(@l AttributedText attributedText) {
        j.a(this.f80131c, attributedText, null);
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.g
    public final void setChecked(boolean z12) throws Resources.NotFoundException {
        this.f80134f.setChecked(z12);
    }
}
