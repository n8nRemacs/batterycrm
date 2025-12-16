package jY;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceLink;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewDialogData;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewPresentationMode;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FinanceMarketplaceLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LjY/h;", "LKu/a;", "Lcom/avito/android/marketplace/deeplink/FinanceMarketplaceLink;", "<init>", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends AbstractC14350a<FinanceMarketplaceLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strO = i.o(uri, ContextActionHandler.Link.URL);
        String queryParameter = uri.getQueryParameter("externalUserId");
        String queryParameter2 = uri.getQueryParameter("fromPage");
        String queryParameter3 = uri.getQueryParameter("resource");
        String queryParameter4 = uri.getQueryParameter("navigationTitle");
        try {
            Type type = new C42323e().getType();
            String queryParameter5 = uri.getQueryParameter("presentationMode");
            FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationMode = (FinanceMarketplaceWebViewPresentationMode) (queryParameter5 != null ? gson.e(queryParameter5, type) : null);
            Boolean boolValueOf = Boolean.valueOf(Boolean.parseBoolean(uri.getQueryParameter("isPersistentStorage")));
            Boolean boolValueOf2 = Boolean.valueOf(Boolean.parseBoolean(uri.getQueryParameter("isNavigationVisible")));
            Boolean boolValueOf3 = Boolean.valueOf(Boolean.parseBoolean(uri.getQueryParameter("isNavigationVisible")));
            Boolean boolValueOf4 = Boolean.valueOf(Boolean.parseBoolean(uri.getQueryParameter("showOnCloseMessage")));
            try {
                Type type2 = new C42324f().getType();
                String queryParameter6 = uri.getQueryParameter("dialogData");
                FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData = (FinanceMarketplaceWebViewDialogData) (queryParameter6 != null ? gson.e(queryParameter6, type2) : null);
                try {
                    Type type3 = new C42325g().getType();
                    String queryParameter7 = uri.getQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS);
                    return new FinanceMarketplaceLink(strO, queryParameter, queryParameter2, queryParameter3, queryParameter4, financeMarketplaceWebViewPresentationMode, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, financeMarketplaceWebViewDialogData, (List) (queryParameter7 != null ? gson.e(queryParameter7, type3) : null));
                } catch (JsonParseException e12) {
                    throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS, DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
                }
            } catch (JsonParseException e13) {
                throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "dialogData", DeeplinkParsingError.FieldConstraint.Json.f133986b, e13);
            }
        } catch (JsonParseException e14) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "presentationMode", DeeplinkParsingError.FieldConstraint.Json.f133986b, e14);
        }
    }
}
