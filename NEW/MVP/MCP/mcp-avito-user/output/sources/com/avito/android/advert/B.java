package com.avito.android.advert;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.AdvertNavBarStyle;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class B extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertNavBarStyle f68533l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28245z f68534m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(AdvertNavBarStyle advertNavBarStyle, C28245z c28245z) {
        super(0);
        this.f68533l = advertNavBarStyle;
        this.f68534m = c28245z;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink logoDeeplink;
        AdvertNavBarStyle advertNavBarStyle = this.f68533l;
        if (advertNavBarStyle != null && (logoDeeplink = advertNavBarStyle.getLogoDeeplink()) != null) {
            b.a.a(this.f68534m.f81097p, logoDeeplink, null, null, 6);
        }
        return G0.f406611a;
    }
}
