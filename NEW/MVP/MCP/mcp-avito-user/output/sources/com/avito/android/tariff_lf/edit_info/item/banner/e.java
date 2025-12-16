package com.avito.android.tariff_lf.edit_info.item.banner;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import cD0.C27022p;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: TariffUpsellBannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/banner/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/banner/d;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f298893g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f298894b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f298895c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f298896d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f298897e;

    /* renamed from: f, reason: collision with root package name */
    public final float f298898f;

    public e(@k Banner banner, @k com.avito.android.util.text.a aVar) {
        super(banner);
        this.f298894b = banner;
        this.f298895c = aVar;
        View viewFindViewById = banner.findViewById(R.id.upsell_tariff_banner_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f298896d = (TextView) viewFindViewById;
        View viewFindViewById2 = banner.findViewById(R.id.upsell_tariff_banner_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f298897e = (SimpleDraweeView) viewFindViewById2;
        this.f298898f = y6.b(24);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.banner.d
    public final void Bs(@k C27022p c27022p, @k Y41.a<G0> aVar) {
        Banner banner = this.f298894b;
        D6.H(banner);
        banner.setBackgroundColor(C48063a.f437606a.a(banner.getContext(), c27022p.getColor()));
        v.a(banner, this.f298898f);
        j.a(this.f298896d, c27022p.getText(), this.f298895c);
        C35949t5.c(this.f298897e, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(c27022p.getImage(), com.avito.android.lib.util.darkTheme.c.b(banner.getContext()))), null, null, null, 14);
        banner.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(23, aVar));
    }
}
