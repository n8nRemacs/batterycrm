package com.avito.android.wallet.webview;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletWebViewActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WalletWebViewActivity f329380l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WalletWebViewActivity walletWebViewActivity) {
        super(0);
        this.f329380l = walletWebViewActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        WalletWebViewActivity walletWebViewActivity = this.f329380l;
        walletWebViewActivity.setResult(0);
        DeepLink deepLink = walletWebViewActivity.a2().f329378k;
        if (deepLink != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = walletWebViewActivity.f329357t;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, null, null, 6);
        }
        walletWebViewActivity.finish();
        return G0.f406611a;
    }
}
