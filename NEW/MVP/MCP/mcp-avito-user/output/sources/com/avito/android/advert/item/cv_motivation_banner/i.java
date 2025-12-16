package com.avito.android.advert.item.cv_motivation_banner;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.cv.CvMotivationBanner;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: CvMotivationBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/cv_motivation_banner/i;", "Lcom/avito/android/advert/item/cv_motivation_banner/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f75018i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f75019b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f75020c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f75021d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f75022e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f75023f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Size f75024g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Size f75025h;

    public i(@k View view, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(view);
        this.f75019b = aVar;
        View viewFindViewById = view.findViewById(R.id.cv_motivation_banner_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f75020c = (Banner) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.cv_motivation_banner_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75021d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.cv_motivation_banner_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75022e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.cv_motivation_banner_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f75023f = (SimpleDraweeView) viewFindViewById4;
        this.f75024g = new Size(120, 122);
        this.f75025h = new Size(240, 244);
    }

    @Override // com.avito.android.advert.item.cv_motivation_banner.h
    public final void mz(@k CvMotivationBanner cvMotivationBanner) {
        this.f75020c.setOnClickListener(new com.avito.android.advert.closed.b(19, this, cvMotivationBanner));
        I5.a(this.f75021d, cvMotivationBanner.getTitle(), false);
        I5.a(this.f75022e, cvMotivationBanner.getSubtitle(), false);
        C35949t5.c(this.f75023f, com.avito.android.image_loader.b.b(new Image(P0.g(new Q(this.f75024g, cvMotivationBanner.getImage1x()), new Q(this.f75025h, cvMotivationBanner.getImage2x())))), null, null, null, 14);
    }
}
