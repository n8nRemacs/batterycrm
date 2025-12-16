package com.avito.android.component.advert_badge_bar.badge;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import com.avito.android.R;
import com.avito.android.component.advert_badge_bar.badge_item.AdvertBadgeView;
import com.avito.android.image_loader.j;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.google.android.material.shape.q;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import sK0.C48065c;
import wK0.AbstractC49528c;

/* compiled from: BadgeItemView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/b;", "Lcom/avito/android/component/advert_badge_bar/badge/a;", "Lcom/avito/konveyor/adapter/b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AdvertBadgeView f124957b;

    public b(@k AdvertBadgeView advertBadgeView) {
        super(advertBadgeView);
        this.f124957b = advertBadgeView;
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void da(@l UniversalColor universalColor) {
        AdvertBadgeView advertBadgeView = this.f124957b;
        advertBadgeView.setTextColor(C48065c.d(advertBadgeView.getContext(), universalColor, R.attr.black));
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void dx(@l UniversalColor universalColor, @l UniversalColor universalColor2) {
        AdvertBadgeView advertBadgeView = this.f124957b;
        int iD2 = C48065c.d(advertBadgeView.getContext(), universalColor, R.attr.white);
        int iD3 = C48065c.d(advertBadgeView.getContext(), universalColor2, R.attr.white);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD2);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(iD3);
        q qVar = advertBadgeView.f124968b;
        if (qVar != null) {
            advertBadgeView.setBackground(AbstractC49528c.a.b(AbstractC49528c.f441377b, qVar, 0, 0, 0, 0, colorStateListValueOf, colorStateListValueOf2, null, null, 414));
        }
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void g7(int i12) {
        this.f124957b.setTitleMaxLines(i12);
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void h(@k String str) {
        this.f124957b.setSubtitle(str);
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void i(@l UniversalImage universalImage) {
        AdvertBadgeView advertBadgeView = this.f124957b;
        advertBadgeView.setPicture(com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(advertBadgeView.getContext())) : null));
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void k50(int i12) {
        this.f124957b.setSubtitleMaxLines(i12);
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void setOnClickListener(@l View.OnClickListener onClickListener) {
        this.f124957b.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void setTitle(@k String str) {
        this.f124957b.setTitle(str);
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void u40(boolean z12) {
        this.f124957b.setArrowIconVisible(z12);
    }

    @Override // com.avito.android.component.advert_badge_bar.badge.a
    public final void vN() {
        this.f124957b.setPicture(new j());
    }
}
