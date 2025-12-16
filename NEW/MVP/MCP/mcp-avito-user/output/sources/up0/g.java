package uP0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.wallet.webview.deeplink.WalletWebViewDialogData;
import com.avito.android.wallet.webview.deeplink.WalletWebViewLink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WalletWebViewLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LuP0/g;", "LKu/a;", "Lcom/avito/android/wallet/webview/deeplink/WalletWebViewLink;", "<init>", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends AbstractC14350a<WalletWebViewLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strO = i.o(uri, ContextActionHandler.Link.URL);
        String queryParameter = uri.getQueryParameter("pageFrom");
        String queryParameter2 = uri.getQueryParameter("walletFlowType");
        String queryParameter3 = uri.getQueryParameter("navigationTitle");
        String queryParameter4 = uri.getQueryParameter("loadingTitle");
        Boolean boolValueOf = Boolean.valueOf(Boolean.parseBoolean(uri.getQueryParameter("isPersistentStorage")));
        Boolean boolValueOf2 = Boolean.valueOf(Boolean.parseBoolean(uri.getQueryParameter("isNavigationVisible")));
        Boolean boolValueOf3 = Boolean.valueOf(Boolean.parseBoolean(uri.getQueryParameter("showOnCloseMessage")));
        try {
            Type type = new e().getType();
            String queryParameter5 = uri.getQueryParameter("dialogData");
            WalletWebViewDialogData walletWebViewDialogData = (WalletWebViewDialogData) (queryParameter5 != null ? gson.e(queryParameter5, type) : null);
            try {
                Type type2 = new f().getType();
                String queryParameter6 = uri.getQueryParameter("onCloseDeeplink");
                return new WalletWebViewLink(strO, queryParameter, queryParameter2, queryParameter3, queryParameter4, boolValueOf, boolValueOf2, boolValueOf3, walletWebViewDialogData, (DeepLink) (queryParameter6 != null ? gson.e(queryParameter6, type2) : null));
            } catch (JsonParseException e12) {
                throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "onCloseDeeplink", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
            }
        } catch (JsonParseException e13) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "dialogData", DeeplinkParsingError.FieldConstraint.Json.f133986b, e13);
        }
    }
}
