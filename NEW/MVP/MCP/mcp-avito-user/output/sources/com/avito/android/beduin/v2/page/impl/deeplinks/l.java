package com.avito.android.beduin.v2.page.impl.deeplinks;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.v2.page.BeduinV2PageModalDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: BeduinV2PageModalDeepLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/deeplinks/l;", "LKu/a;", "Lcom/avito/android/beduin/v2/page/BeduinV2PageModalDeepLink;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l extends AbstractC14350a<BeduinV2PageModalDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new BeduinV2PageModalDeepLink(Ku.i.n(uri, "pagePath"), Ku.i.n(uri, "screenName"), uri.getBooleanQueryParameter("scrollOnKeyboardShown", false), uri.getBooleanQueryParameter("ignoreSafeArea", false), uri.getBooleanQueryParameter("showsBottomBar", false), uri.getQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_THEME), uri.getQueryParameter("scenarioParentId"), uri.getQueryParameter("scenarioId"), uri.getBooleanQueryParameter("enableComposeRenderer", false));
    }
}
