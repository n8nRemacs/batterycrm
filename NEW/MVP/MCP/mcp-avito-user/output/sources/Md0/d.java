package Md0;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PublicDeeplink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.publish.PublishInitialToast;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertPublicationLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMd0/d;", "LKu/a;", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink$Public;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends AbstractC14350a<AdvertPublicationLink.Public> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String description;
        try {
            Type type = new C14471a().getType();
            String queryParameter = uri.getQueryParameter("params");
            PublicDeeplink publicDeeplinkB = null;
            Map map = (Map) (queryParameter != null ? gson.e(queryParameter, type) : null);
            try {
                Type type2 = new C14472b().getType();
                String queryParameter2 = uri.getQueryParameter("navigation");
                Navigation navigation2 = (Navigation) (queryParameter2 != null ? gson.e(queryParameter2, type2) : null);
                try {
                    Type type3 = new C14473c().getType();
                    String queryParameter3 = uri.getQueryParameter("toast");
                    PublishInitialToast publishInitialToast = (PublishInitialToast) (queryParameter3 != null ? gson.e(queryParameter3, type3) : null);
                    PublishInitialToast publishInitialToast2 = (publishInitialToast == null || (description = publishInitialToast.getDescription()) == null || description.length() == 0) ? null : publishInitialToast;
                    String queryParameter4 = uri.getQueryParameter("startUpDeeplink");
                    if (queryParameter4 != null) {
                        PublicDeeplink publicDeeplinkD = xVar.d(queryParameter4);
                        publicDeeplinkB = publicDeeplinkD != null ? publicDeeplinkD : xVar.b(queryParameter4);
                    }
                    return new AdvertPublicationLink.Public(navigation2, publicDeeplinkB, true, publishInitialToast2, Boolean.parseBoolean(uri.getQueryParameter("skipDraft")), map, uri.getQueryParameter("targetStepType"), Boolean.valueOf(Boolean.parseBoolean(uri.getQueryParameter("needRootNavigation"))), Boolean.valueOf(Boolean.parseBoolean(uri.getQueryParameter("keepCurrentStack"))), uri.getQueryParameter("scenario"));
                } catch (JsonParseException e12) {
                    throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "toast", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
                }
            } catch (JsonParseException e13) {
                throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "navigation", DeeplinkParsingError.FieldConstraint.Json.f133986b, e13);
            }
        } catch (JsonParseException e14) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "params", DeeplinkParsingError.FieldConstraint.Json.f133986b, e14);
        }
    }
}
