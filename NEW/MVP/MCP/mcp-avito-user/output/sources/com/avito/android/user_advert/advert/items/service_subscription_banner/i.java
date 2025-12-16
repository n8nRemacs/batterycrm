package com.avito.android.user_advert.advert.items.service_subscription_banner;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: SubscriptionBannerView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_subscription_banner/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/service_subscription_banner/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f310209h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f310210b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f310211c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f310212d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f310213e;

    /* renamed from: f, reason: collision with root package name */
    public final View f310214f;

    /* renamed from: g, reason: collision with root package name */
    public final SimpleDraweeView f310215g;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f310210b = view;
        this.f310211c = aVar;
        this.f310212d = (TextView) view.findViewById(R.id.banner_title);
        this.f310213e = (TextView) view.findViewById(R.id.banner_subtitle);
        this.f310214f = view.findViewById(R.id.banner_background);
        this.f310215g = (SimpleDraweeView) view.findViewById(R.id.banner_image);
    }

    @Override // com.avito.android.user_advert.advert.items.service_subscription_banner.h
    public final void TA(@k Y41.a<G0> aVar) {
        this.f310210b.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(1, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.service_subscription_banner.h
    public final void e(@k AttributedText attributedText) {
        I5.a(this.f310212d, this.f310211c.c(this.f310210b.getContext(), attributedText), false);
    }

    @Override // com.avito.android.user_advert.advert.items.service_subscription_banner.h
    public final void i(@l UniversalImage universalImage) {
        SimpleDraweeView simpleDraweeView = this.f310215g;
        if (universalImage == null) {
            D6.w(simpleDraweeView);
            return;
        }
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f310210b.getContext())));
        D6.H(simpleDraweeView);
        C35949t5.c(simpleDraweeView, aVarB, null, null, null, 14);
    }

    @Override // com.avito.android.user_advert.advert.items.service_subscription_banner.h
    public final void k(@k AttributedText attributedText) {
        I5.a(this.f310213e, this.f310211c.c(this.f310210b.getContext(), attributedText), false);
    }

    @Override // com.avito.android.user_advert.advert.items.service_subscription_banner.h
    public final void v(@k UniversalColor universalColor) {
        Context context = this.f310210b.getContext();
        C48063a.f437606a.getClass();
        this.f310214f.setBackgroundTintList(C48063a.e(context, universalColor));
    }
}
