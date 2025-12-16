package com.avito.android.component.advert_badge_bar.badge;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.component.advert_badge_bar.badge_item.ProfileBadgeView;
import com.avito.android.design.State;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import sK0.C48065c;

/* compiled from: ProfileBadgeItemView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/f;", "Lcom/avito/android/component/advert_badge_bar/badge/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ProfileBadgeView f124964b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f124965c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f124966d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public BadgeItem f124967e;

    public f(@k ProfileBadgeView profileBadgeView, boolean z12) {
        super(profileBadgeView);
        this.f124964b = profileBadgeView;
        this.f124965c = z12;
        this.f124966d = profileBadgeView.getContext();
    }

    @Override // com.avito.android.lib.util.groupable_item.e
    public final void Tz(boolean z12, boolean z13) {
        this.f124964b.Tz(z12, z13);
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.e
    public final void cQ(@k BadgeItem badgeItem) {
        if (badgeItem.equals(this.f124967e)) {
            return;
        }
        this.f124967e = badgeItem;
        String str = badgeItem.f124945d;
        ProfileBadgeView profileBadgeView = this.f124964b;
        profileBadgeView.setText(str);
        UniversalColor universalColor = badgeItem.f124949h;
        Context context = this.f124966d;
        profileBadgeView.setTextColor(C48065c.d(context, universalColor, R.attr.black));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C48065c.d(context, badgeItem.f124947f, R.attr.blue50));
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(C48065c.d(context, badgeItem.f124948g, R.attr.blue100));
        profileBadgeView.f124978e = colorStateListValueOf;
        profileBadgeView.f124979f = colorStateListValueOf2;
        UniversalImage universalImage = badgeItem.f124952k;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null;
        ImageLoadableView imageLoadableView = profileBadgeView.f124981h;
        if (imageDependsOnThemeOrDefault == null) {
            int i12 = ProfileBadgeView.f124974i;
            imageLoadableView.setState(State.f135880d);
            return;
        }
        Drawable drawable = profileBadgeView.f124975b;
        if (drawable != null) {
            imageLoadableView.setImage(drawable);
            imageLoadableView.setState(State.f135882f);
        }
        ImageLoadableView imageLoadableView2 = profileBadgeView.f124981h;
        s.a(imageLoadableView2, imageDependsOnThemeOrDefault, true, this.f124965c, new com.avito.android.component.advert_badge_bar.badge_item.c(imageLoadableView2), new com.avito.android.component.advert_badge_bar.badge_item.d(imageLoadableView2));
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.e
    public final void setOnClickListener(@l View.OnClickListener onClickListener) {
        this.f124964b.setOnClickListener(onClickListener);
    }
}
