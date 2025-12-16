package com.avito.android.profile.user_profile.cards.silent_update;

import N90.q;
import Ua0.InterfaceC15503a;
import com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.o;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.silent_update.DownloadUpdateConfig;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SilentUpdatePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/silent_update/i;", "Lcom/avito/android/profile/user_profile/cards/silent_update/e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f225531b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15503a, G0> f225532c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f225533d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Y41.l<? super InterfaceC15503a, G0> lVar, @Y61.k o oVar) {
        this.f225531b = interfaceC28373a;
        this.f225532c = lVar;
        this.f225533d = oVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        CardItem.SilentUpdateItem silentUpdateItem = (CardItem.SilentUpdateItem) aVar;
        CardItem.PromoBlockItem promoBlockItem = silentUpdateItem.f224581c;
        CloseInternalBannerRotationDeepLink closeInternalBannerRotationDeepLink = new CloseInternalBannerRotationDeepLink(silentUpdateItem.f224291b, promoBlockItem.f224500d, promoBlockItem.f224510n);
        CardItem.SilentUpdateConfig silentUpdateConfig = silentUpdateItem.f224582d;
        CardItem.SilentUpdateSettings silentUpdateSettings = silentUpdateConfig.f224579e;
        DownloadUpdateConfig.OneTimeDownloadRequest oneTimeDownloadRequest = new DownloadUpdateConfig.OneTimeDownloadRequest(silentUpdateSettings.f224592k, silentUpdateSettings.f224590i, silentUpdateSettings.f224587f, silentUpdateSettings.f224588g, silentUpdateSettings.f224589h, silentUpdateSettings.f224586e, silentUpdateSettings.f224593l, null, silentUpdateSettings.f224584c, silentUpdateSettings.f224583b, 128, null);
        CardItem.SilentUpdateSettings silentUpdateSettings2 = silentUpdateConfig.f224580f;
        ShortTask.NetworkState networkState = silentUpdateSettings2.f224592k;
        Long l12 = silentUpdateSettings2.f224591j;
        long jLongValue = l12 != null ? l12.longValue() : 1000L;
        Long l13 = silentUpdateSettings2.f224585d;
        this.f225532c.invoke(new InterfaceC15503a.c(oneTimeDownloadRequest, new DownloadUpdateConfig.PeriodicDownloadRequest(networkState, silentUpdateSettings2.f224590i, silentUpdateSettings2.f224587f, silentUpdateSettings2.f224588g, silentUpdateSettings2.f224589h, jLongValue, l13 != null ? l13.longValue() : 1000L, silentUpdateSettings2.f224586e, silentUpdateSettings2.f224593l, null, silentUpdateSettings2.f224584c, silentUpdateSettings2.f224583b, 512, null), closeInternalBannerRotationDeepLink, this.f225533d.d()));
        kVar.rE(silentUpdateItem, new f(this, silentUpdateItem), new g(this, silentUpdateItem), new h(this, closeInternalBannerRotationDeepLink));
        this.f225531b.c(new q());
    }
}
