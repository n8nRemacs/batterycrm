package FO0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.wallet.history.WalletHistoryActivity;
import com.avito.android.wallet.history.mvi.deeplink.WalletHistoryLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WalletHistoryLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LFO0/a;", "Lev/b;", "Lcom/avito/android/wallet/history/mvi/deeplink/WalletHistoryLink;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40162b<WalletHistoryLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.wallet.history.e f4694d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f4695e;

    @Inject
    public a(@k com.avito.android.wallet.history.e eVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f4694d = eVar;
        this.f4695e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        com.avito.android.wallet.history.e eVar = this.f4694d;
        eVar.getClass();
        Intent intent = new Intent(eVar.f327523a, (Class<?>) WalletHistoryActivity.class);
        intent.putExtra("key_page_from", ((WalletHistoryLink) deepLink).f327620b);
        this.f4695e.R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
