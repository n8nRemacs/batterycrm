package uP0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35961v3;
import com.avito.android.wallet.webview.WalletWebViewActivity;
import com.avito.android.wallet.webview.WalletWebViewOpenParams;
import com.avito.android.wallet.webview.deeplink.WalletWebViewLink;
import com.avito.android.wallet.webview.n;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WalletWebViewLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LuP0/a;", "Lev/b;", "Lcom/avito/android/wallet/webview/deeplink/WalletWebViewLink;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48930a extends AbstractC40162b<WalletWebViewLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final n f439923d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f439924e;

    @Inject
    public C48930a(@k n nVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f439923d = nVar;
        this.f439924e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        WalletWebViewLink walletWebViewLink = (WalletWebViewLink) deepLink;
        n nVar = this.f439923d;
        nVar.getClass();
        Intent intent = new Intent(nVar.f329438a, (Class<?>) WalletWebViewActivity.class);
        Boolean bool = walletWebViewLink.f329387g;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = walletWebViewLink.f329388h;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Boolean bool3 = walletWebViewLink.f329389i;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
        C35961v3.b(intent, new WalletWebViewOpenParams(walletWebViewLink.f329382b, walletWebViewLink.f329383c, walletWebViewLink.f329384d, walletWebViewLink.f329385e, walletWebViewLink.f329386f, zBooleanValue, zBooleanValue2, zBooleanValue3, walletWebViewLink.f329390j, walletWebViewLink.f329391k));
        this.f439924e.R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
