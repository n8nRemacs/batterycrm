package com.avito.android.advert.item.wallet_info;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WalletInfoPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/wallet_info/f;", "Lcom/avito/android/advert/item/wallet_info/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f80729b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f80730c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f80731d;

    @Inject
    public f(@k InterfaceC28373a interfaceC28373a, @k x xVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f80729b = xVar;
        this.f80730c = aVar;
        this.f80731d = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        WalletInfoItem walletInfoItem = (WalletInfoItem) aVar;
        String str = walletInfoItem.f80715b;
        DeepLink deepLinkB = str != null ? this.f80729b.b(str) : null;
        hVar.R5(walletInfoItem.f80717d);
        hVar.e(walletInfoItem.f80716c);
        hVar.a(new e(deepLinkB, this));
    }
}
