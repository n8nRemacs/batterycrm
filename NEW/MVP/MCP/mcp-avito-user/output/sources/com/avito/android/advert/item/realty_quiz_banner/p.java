package com.avito.android.advert.item.realty_quiz_banner;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyQuizBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/realty_quiz_banner/p;", "Lcom/avito/android/advert/item/realty_quiz_banner/o;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f78379f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Banner f78380b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f78381c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f78382d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f78383e;

    public p(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.realty_quiz_promo_block);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f78380b = (Banner) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.realty_quiz_promoblock_body);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78381c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.realty_quiz_positive_promoblock_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f78382d = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.realty_quiz_negative_promoblock_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f78383e = (Button) viewFindViewById4;
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.o
    public final void NQ(@Y61.l Y41.a<G0> aVar) {
        this.f78383e.setOnClickListener(new com.avito.android.advert.item.parking.h(7, aVar));
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.o
    public final void RB(@Y61.l Y41.a<G0> aVar) {
        this.f78382d.setOnClickListener(new com.avito.android.advert.item.parking.h(8, aVar));
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.o
    public final void Sg(@Y61.k CharSequence charSequence) {
        com.avito.android.lib.design.button.b.a(this.f78382d, charSequence, false);
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.o
    public final void gP(@Y61.k CharSequence charSequence) {
        this.f78381c.setText(charSequence);
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.o
    public final void nE(@Y61.k CharSequence charSequence) {
        this.f78380b.setTitle(charSequence);
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.o
    public final void r9(@Y61.l Y41.a<G0> aVar) {
        Banner banner = this.f78380b;
        banner.setCloseButtonVisible(true);
        banner.setCloseButtonListener(new com.avito.android.advert.item.parking.h(6, aVar));
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.o
    public final void yK(@Y61.k CharSequence charSequence) {
        com.avito.android.lib.design.button.b.a(this.f78383e, charSequence, false);
    }
}
