package WK0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.Navigation;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: UxFeedbackStartCampaignLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LWK0/f;", "LKu/a;", "Lcom/avito/android/ux/feedback/link/UxFeedbackStartCampaignLink;", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends AbstractC14350a<UxFeedbackStartCampaignLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = i.n(uri, "eventName");
        String queryParameter = uri.getQueryParameter("skipIfStartedBefore");
        boolean z12 = queryParameter != null ? Boolean.parseBoolean(queryParameter) : true;
        try {
            Type type = new d().getType();
            String queryParameter2 = uri.getQueryParameter("extraProperties");
            Map mapC = (Map) (queryParameter2 != null ? gson.e(queryParameter2, type) : null);
            if (mapC == null) {
                mapC = P0.c();
            }
            try {
                Type type2 = new e().getType();
                String queryParameter3 = uri.getQueryParameter(Navigation.ATTRIBUTES);
                return new UxFeedbackStartCampaignLink(strN, z12, mapC, (Map) (queryParameter3 != null ? gson.e(queryParameter3, type2) : null));
            } catch (JsonParseException e12) {
                throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), Navigation.ATTRIBUTES, DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
            }
        } catch (JsonParseException e13) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "extraProperties", DeeplinkParsingError.FieldConstraint.Json.f133986b, e13);
        }
    }
}
