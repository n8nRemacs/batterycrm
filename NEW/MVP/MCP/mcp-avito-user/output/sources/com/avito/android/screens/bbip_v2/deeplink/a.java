package com.avito.android.screens.bbip_v2.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.screens.bbip.deep_linking.BbipV2DeepLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: BbipV2DeepLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_v2/deeplink/a;", "LKu/a;", "Lcom/avito/android/screens/bbip/deep_linking/BbipV2DeepLink;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC14350a<BbipV2DeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new BbipV2DeepLink(i.p(uri, "itemId"), i.p(uri, "checkoutContext"));
    }
}
