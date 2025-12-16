package com.avito.android.profile.pro.impl.screen;

import D90.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.screen.item.geo_banner.ProfileProGeoBannerItem;
import com.avito.android.profile.pro.impl.screen.item.geo_banner.c;
import kotlin.Metadata;

/* compiled from: ProfileProFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/u;", "Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/c$a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment f223748a;

    public u(ProfileProFragment profileProFragment) {
        this.f223748a = profileProFragment;
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.geo_banner.c.a
    public final void a(@Y61.k ProfileProGeoBannerItem profileProGeoBannerItem) {
        D d12 = this.f223748a.f222885t0;
        if (d12 == null) {
            d12 = null;
        }
        d12.accept(new a.k(profileProGeoBannerItem));
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.geo_banner.c.a
    public final void b(@Y61.k DeepLink deepLink) {
        D d12 = this.f223748a.f222885t0;
        if (d12 == null) {
            d12 = null;
        }
        d12.accept(new a.h(deepLink));
    }
}
