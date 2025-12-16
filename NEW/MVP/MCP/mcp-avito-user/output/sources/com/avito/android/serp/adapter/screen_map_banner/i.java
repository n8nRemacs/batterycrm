package com.avito.android.serp.adapter.screen_map_banner;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScreenMapBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/screen_map_banner/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/screen_map_banner/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f271575d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f271576b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f271577c;

    public i(@k View view) {
        super(view);
        this.f271576b = view;
        View viewFindViewById = view.findViewById(R.id.map_banner_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f271577c = (SimpleDraweeView) viewFindViewById;
    }

    @Override // com.avito.android.serp.adapter.screen_map_banner.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f271576b.setOnClickListener(new o(24, aVar));
    }

    @Override // com.avito.android.serp.adapter.screen_map_banner.h
    public final void i(@l UniversalImage universalImage) {
        Image imageQ;
        if (universalImage == null || (imageQ = com.avito.android.actions_sheet.a.q(this.f271576b, universalImage)) == null) {
            return;
        }
        C35949t5.c(this.f271577c, com.avito.android.image_loader.b.b(imageQ), null, null, null, 14);
    }
}
