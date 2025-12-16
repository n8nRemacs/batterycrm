package com.avito.android.tariff_cpt.info.ui.items.level_banner;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptInfoLevelBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/level_banner/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/info/ui/items/level_banner/h;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f298389h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f298390b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f298391c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Banner f298392d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f298393e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f298394f;

    /* renamed from: g, reason: collision with root package name */
    public final float f298395g;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f298390b = view;
        this.f298391c = aVar;
        Banner banner = (Banner) view;
        this.f298392d = banner;
        this.f298393e = (TextView) banner.findViewById(R.id.cpt_info_level_banner_content_title);
        this.f298394f = (SimpleDraweeView) banner.findViewById(R.id.cpt_info_level_banner_content_image);
        this.f298395g = y6.b(24);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.level_banner.h
    public final void I50(@l iC0.e eVar) {
        Integer numA = eVar != null ? eVar.a(this.f298390b.getContext()) : null;
        Banner banner = this.f298392d;
        if (numA != null) {
            banner.setBackgroundColor(numA.intValue());
        }
        v.a(banner, this.f298395g);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.level_banner.h
    public final void Q4(@k iC0.f fVar) {
        Image imageA = fVar.a(this.f298390b.getContext());
        SimpleDraweeView simpleDraweeView = this.f298394f;
        if (simpleDraweeView != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageA), null, null, null, 14);
        }
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.level_banner.h
    public final void e(@k AttributedText attributedText) {
        j.c(this.f298393e, attributedText, this.f298391c);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.level_banner.h
    public final void setListener(@k Y41.a<G0> aVar) {
        this.f298392d.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(20, aVar));
    }
}
