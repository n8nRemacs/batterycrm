package com.avito.android.extended_profile_widgets.adapter.premium_banner.adapter.banner;

import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: PremiumBannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/premium_banner/adapter/banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/premium_banner/adapter/banner/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f154587c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f154588b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_premium_banner_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        simpleDraweeView.getHierarchy().q(C35835l0.l(simpleDraweeView.getContext().getDrawable(R.drawable.ic_stub_grey), C35835l0.d(R.attr.gray12, simpleDraweeView.getContext())), (s.a) s.c.f340135g);
        this.f154588b = simpleDraweeView;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.premium_banner.adapter.banner.g
    public final void T40(@k PremiumBannerItem premiumBannerItem, @k Y41.a<G0> aVar) {
        SimpleDraweeView simpleDraweeView = this.f154588b;
        Context context = simpleDraweeView.getContext();
        TnsGalleryImage tnsGalleryImage = premiumBannerItem.f154577c;
        Q<Integer, Integer> qA2 = i.a(context, tnsGalleryImage.getOriginalSize());
        int iIntValue = qA2.f406619b.intValue();
        int iIntValue2 = qA2.f406620c.intValue();
        simpleDraweeView.getLayoutParams().width = iIntValue;
        simpleDraweeView.getLayoutParams().height = iIntValue2;
        C35949t5.c(this.f154588b, com.avito.android.image_loader.b.b(tnsGalleryImage.getImage()), null, null, null, 14);
        simpleDraweeView.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(9, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154588b.setOnClickListener(null);
    }
}
