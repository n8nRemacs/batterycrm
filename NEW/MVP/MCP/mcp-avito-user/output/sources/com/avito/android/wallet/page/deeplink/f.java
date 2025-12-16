package com.avito.android.wallet.page.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.wallet.page.deeplink.WalletLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: WalletPageLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/f;", "LKu/a;", "Lcom/avito/android/wallet/page/deeplink/WalletLink$WalletPageLink;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends AbstractC14350a<WalletLink.WalletPageLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new WalletLink.WalletPageLink(uri.getQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_THEME), uri.getQueryParameter("topupID"));
    }
}
