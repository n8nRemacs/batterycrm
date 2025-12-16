package com.avito.android.profile_settings_extended.adapter.carousel.adapter;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Group;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCarouselItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/adapter/g;", "Lcom/avito/android/profile_settings_extended/adapter/carousel/adapter/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f229311b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f229312c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Group f229313d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42156l
    public final int f229314e;

    /* renamed from: f, reason: collision with root package name */
    public final float f229315f;

    /* renamed from: g, reason: collision with root package name */
    public final float f229316g;

    public g(@k View view) {
        super(view);
        Context context = view.getContext();
        Resources resources = view.getResources();
        View viewFindViewById = view.findViewById(R.id.extended_settings_advert_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229311b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_settings_advert_item_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f229312c = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_settings_advert_item_error_group);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f229313d = (Group) viewFindViewById3;
        this.f229314e = C35835l0.d(R.attr.red600, context);
        this.f229315f = resources.getDimensionPixelSize(R.dimen.extended_profile_settings_advert_item_error_state_border_width);
        this.f229316g = resources.getDimensionPixelSize(R.dimen.extended_profile_settings_advert_item_corner_radius);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.adapter.f
    public final void j4(boolean z12) {
        float f12 = this.f229316g;
        SimpleDraweeView simpleDraweeView = this.f229312c;
        Group group = this.f229313d;
        if (!z12) {
            D6.w(group);
            GW0.b bVar = new GW0.b(simpleDraweeView.getResources());
            RoundingParams roundingParamsB = RoundingParams.b(f12);
            roundingParamsB.c(0.0f);
            G0 g02 = G0.f406611a;
            bVar.f6552q = roundingParamsB;
            simpleDraweeView.setHierarchy(bVar.a());
            return;
        }
        D6.H(group);
        GW0.b bVar2 = new GW0.b(simpleDraweeView.getResources());
        RoundingParams roundingParamsB2 = RoundingParams.b(f12);
        roundingParamsB2.f340156f = this.f229314e;
        roundingParamsB2.c(this.f229315f);
        G0 g03 = G0.f406611a;
        bVar2.f6552q = roundingParamsB2;
        bVar2.f6548m = new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f}));
        simpleDraweeView.setHierarchy(bVar2.a());
    }

    @Override // com.avito.android.profile_settings_extended.adapter.carousel.adapter.f
    public final void wo(@k AdvertCarouselItem advertCarouselItem, int i12) {
        I5.a(this.f229311b, String.valueOf(i12), false);
        C35949t5.c(this.f229312c, com.avito.android.image_loader.b.b(advertCarouselItem.f229305c.f230270e), null, null, null, 14);
    }
}
