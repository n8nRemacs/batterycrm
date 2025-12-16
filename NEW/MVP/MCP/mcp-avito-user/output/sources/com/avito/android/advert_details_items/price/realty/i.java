package com.avito.android.advert_details_items.price.realty;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/price/realty/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/price/realty/h;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f85248b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f85249c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f85250d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f85251e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f85252f;

    /* renamed from: g, reason: collision with root package name */
    public final int f85253g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.a<G0> f85254h;

    /* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f85255l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f85255l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f85255l.invoke();
            return G0.f406611a;
        }
    }

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f85248b = aVar;
        this.f85249c = (TextView) view.findViewById(R.id.current_price);
        this.f85250d = (TextView) view.findViewById(R.id.normalized_price);
        this.f85251e = (TextView) view.findViewById(R.id.divider);
        this.f85252f = (TextView) view.findViewById(R.id.price_history);
        this.f85253g = C35835l0.d(R.attr.gray48, view.getContext());
    }

    @Override // com.avito.android.advert_details_items.price.realty.h
    public final void Mn(@k AttributedText attributedText, @k Y41.a<G0> aVar) {
        com.avito.android.util.text.a aVar2 = this.f85248b;
        TextView textView = this.f85252f;
        com.avito.android.util.text.j.a(textView, attributedText, aVar2);
        I5.c(textView, new a(aVar));
    }

    @Override // com.avito.android.advert_details_items.price.realty.h
    public final void N2(@l String str) {
        TextView textView = this.f85249c;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.advert_details_items.price.realty.h
    public final void ax(@l String str) {
        TextView textView = this.f85250d;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.advert_details_items.price.realty.h
    public final void d(@k Y41.a<G0> aVar) {
        this.f85254h = aVar;
    }

    @Override // com.avito.android.advert_details_items.price.realty.h
    public final void hU() {
        int i12 = this.f85253g;
        TextView textView = this.f85249c;
        if (textView != null) {
            textView.setTextColor(i12);
        }
        TextView textView2 = this.f85250d;
        if (textView2 != null) {
            textView2.setTextColor(i12);
        }
        TextView textView3 = this.f85251e;
        if (textView3 != null) {
            textView3.setTextColor(i12);
        }
        TextView textView4 = this.f85252f;
        if (textView4 != null) {
            textView4.setTextColor(i12);
        }
    }

    @Override // com.avito.android.advert_details_items.price.realty.h
    public final void iJ() {
        D6.H(this.f85251e);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        D6.w(this.f85251e);
        Y41.a<G0> aVar = this.f85254h;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f85254h = null;
    }
}
