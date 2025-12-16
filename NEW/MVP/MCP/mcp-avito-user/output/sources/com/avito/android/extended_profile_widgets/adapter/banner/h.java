package com.avito.android.extended_profile_widgets.adapter.banner;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/banner/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f154245c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f154246b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_banner_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        simpleDraweeView.getHierarchy().q(C35835l0.l(simpleDraweeView.getContext().getDrawable(R.drawable.ic_stub_grey), C35835l0.d(R.attr.gray12, simpleDraweeView.getContext())), (s.a) s.c.f340135g);
        this.f154246b = simpleDraweeView;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.banner.g
    public final void Ti(@k BannerItem bannerItem, @k Y41.a<G0> aVar) {
        TnsGalleryImage tnsGalleryImage = bannerItem.f154236d;
        Size originalSize = tnsGalleryImage.getOriginalSize();
        int width = originalSize != null ? originalSize.getWidth() : 2;
        Size originalSize2 = tnsGalleryImage.getOriginalSize();
        int height = originalSize2 != null ? originalSize2.getHeight() : 1;
        SimpleDraweeView simpleDraweeView = this.f154246b;
        D6.E(simpleDraweeView, width, height);
        C35949t5.c(this.f154246b, com.avito.android.image_loader.b.b(tnsGalleryImage.getImage()), null, null, null, 14);
        simpleDraweeView.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(23, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154246b.setOnClickListener(null);
    }
}
