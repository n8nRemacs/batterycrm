package com.avito.android.profile.pro.impl.screen.item.delivery_restriction;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile.pro.impl.screen.item.delivery_restriction.ProfileProDeliveryRestrictionBannerItem;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileProDeliveryRestrictionBannerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/delivery_restriction/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/delivery_restriction/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final Context f223199b;

    /* renamed from: c, reason: collision with root package name */
    public final View f223200c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f223201d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f223202e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f223203f;

    public e(@k View view) {
        super(view);
        this.f223199b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.item_profile_pro_delivery_restriction_banner_root);
        this.f223200c = viewFindViewById;
        this.f223201d = (SimpleDraweeView) viewFindViewById.findViewById(R.id.banner_image);
        this.f223202e = (TextView) viewFindViewById.findViewById(R.id.banner_title);
        this.f223203f = (Button) viewFindViewById.findViewById(R.id.banner_button);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.delivery_restriction.c
    public final void g10(@k ProfileProDeliveryRestrictionBannerItem profileProDeliveryRestrictionBannerItem, @k l<? super D90.a, G0> lVar) {
        ImageRequest.a aVarA = C35949t5.a(this.f223201d);
        aVarA.d(com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(profileProDeliveryRestrictionBannerItem.f223190e, com.avito.android.lib.util.darkTheme.c.b(this.f223199b))));
        aVarA.f169500r = false;
        aVarA.c();
        j.a(this.f223202e, profileProDeliveryRestrictionBannerItem.f223188c, null);
        ProfileProDeliveryRestrictionBannerItem.DeliveryRestrictionAction deliveryRestrictionAction = profileProDeliveryRestrictionBannerItem.f223189d;
        this.f223203f.setState(new UU.a(deliveryRestrictionAction.f223191b, null, false, false, false, new d(lVar, deliveryRestrictionAction), null, null, null, false, 990, null));
    }
}
