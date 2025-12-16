package com.avito.android.profile.pro.impl.screen.item.geo_banner;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile.pro.impl.screen.item.geo_banner.ProfileProGeoBannerItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileProGeoBannerItemView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/c;", "LTV0/d;", "Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/g;", "Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/ProfileProGeoBannerItem;", "<init>", "()V", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class c implements TV0.d<g, ProfileProGeoBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public a f223275b;

    /* compiled from: ProfileProGeoBannerItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/c$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@k ProfileProGeoBannerItem profileProGeoBannerItem);

        void b(@k DeepLink deepLink);
    }

    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        PrintableText printableText;
        g gVar = (g) eVar;
        ProfileProGeoBannerItem profileProGeoBannerItem = (ProfileProGeoBannerItem) aVar;
        d dVar = new d(this);
        e eVar2 = new e(this, profileProGeoBannerItem);
        Context context = gVar.f223288i;
        UniversalImage universalImage = profileProGeoBannerItem.f223267h;
        String strK0 = null;
        Image imageDependsOnTheme = universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null;
        gVar.f223282c.setVisibility(imageDependsOnTheme == null ? 4 : 0);
        C35949t5.c(gVar.f223282c, com.avito.android.image_loader.b.b(imageDependsOnTheme), null, null, null, 14);
        gVar.f223283d.setText(profileProGeoBannerItem.f223262c.k0(context));
        gVar.f223284e.setText(profileProGeoBannerItem.f223263d.k0(context));
        j.a(gVar.f223285f, profileProGeoBannerItem.f223264e, gVar.f223281b);
        ProfileProGeoBannerItem.Action action = profileProGeoBannerItem.f223265f;
        int i13 = action != null ? 0 : 8;
        Button button = gVar.f223286g;
        button.setVisibility(i13);
        if (action != null && (printableText = action.f223269c) != null) {
            strK0 = printableText.k0(context);
        }
        com.avito.android.lib.design.button.b.a(button, strK0, false);
        button.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(profileProGeoBannerItem, dVar, 25));
        int i14 = profileProGeoBannerItem.f223266g ? 0 : 8;
        View view = gVar.f223287h;
        view.setVisibility(i14);
        view.setOnClickListener(new com.avito.android.profile.edit.adapter.c(4, eVar2));
    }
}
