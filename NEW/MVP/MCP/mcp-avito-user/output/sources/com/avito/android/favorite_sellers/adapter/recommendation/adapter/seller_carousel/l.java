package com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SellerCarouselItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/adapter/seller_carousel/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/adapter/seller_carousel/k;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f155610j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f155611b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f155612c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f155613d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f155614e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f155615f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f155616g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f155617h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final b[] f155618i;

    public l(@Y61.k View view) {
        super(view);
        this.f155611b = view;
        View viewFindViewById = view.findViewById(R.id.user_avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f155612c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.shop_avatar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f155613d = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.name);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f155614e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f155615f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.btn_subscribe);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f155616g = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.btn_settings);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f155617h = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.advert_image_container_1);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        b bVar = new b(viewFindViewById7);
        View viewFindViewById8 = view.findViewById(R.id.advert_image_container_2);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        b bVar2 = new b(viewFindViewById8);
        View viewFindViewById9 = view.findViewById(R.id.advert_image_container_3);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f155618i = new b[]{bVar, bVar2, new b(viewFindViewById9)};
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void Dd(@Y61.l com.avito.android.image_loader.a aVar) {
        D6.g(this.f155613d);
        D6.H(this.f155612c);
        C35949t5.c(this.f155612c, aVar, null, null, null, 14);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void Fp(@Y61.k Y41.a<G0> aVar) {
        this.f155617h.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(18, aVar));
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void G9(@Y61.l com.avito.android.image_loader.a aVar) {
        D6.g(this.f155612c);
        D6.H(this.f155613d);
        C35949t5.c(this.f155613d, aVar, null, null, null, 14);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void T(@Y61.l CharSequence charSequence) {
        I5.a(this.f155615f, charSequence, false);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void Wl(@Y61.k String str) {
        this.f155614e.setText(str);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void Yz(boolean z12) {
        Button button = this.f155616g;
        button.setLoading(z12);
        button.setEnabled(!z12);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f155611b.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(17, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f155611b.setOnClickListener(null);
        this.f155616g.setOnClickListener(null);
        this.f155617h.setOnClickListener(null);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void pY() {
        D6.w(this.f155616g);
        D6.H(this.f155617h);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void ri() {
        D6.H(this.f155616g);
        D6.w(this.f155617h);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void wg(@Y61.k ArrayList arrayList) {
        com.avito.android.image_loader.a aVar;
        b[] bVarArr = this.f155618i;
        int length = bVarArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            b bVar = bVarArr[i12];
            int i14 = i13 + 1;
            a aVar2 = (a) C42745f0.K(i13, arrayList);
            if (aVar2 != null) {
                bVar.getClass();
                aVar = aVar2.f155591a;
            } else {
                aVar = null;
            }
            C35949t5.c(bVar.f155594a, aVar, null, null, null, 14);
            String str = aVar2 != null ? aVar2.f155592b : null;
            D6.G(bVar.f155595b, !(str == null || C43066x.K(str)));
            TextView textView = bVar.f155596c;
            if (textView != null) {
                textView.setText(aVar2 != null ? aVar2.f155592b : null);
            }
            TextView textView2 = bVar.f155597d;
            if (textView2 != null) {
                textView2.setText(aVar2 != null ? aVar2.f155593c : null);
            }
            i12++;
            i13 = i14;
        }
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.k
    public final void yS(@Y61.k Y41.a<G0> aVar) {
        this.f155616g.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(16, aVar));
    }
}
