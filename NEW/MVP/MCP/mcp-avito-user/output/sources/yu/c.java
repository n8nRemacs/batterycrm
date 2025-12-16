package Yu;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ClickStreamLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LYu/c;", "LKu/a;", "Lcom/avito/android/deep_linking/links/ClickStreamLink;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends AbstractC14350a<ClickStreamLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        Integer numY0;
        int iL2 = Ku.i.l(uri, "id");
        String queryParameter = uri.getQueryParameter("version");
        int iIntValue = (queryParameter == null || (numY0 = C43066x.y0(queryParameter)) == null) ? 1 : numY0.intValue();
        try {
            Type type = new b().getType();
            String queryParameter2 = uri.getQueryParameter("params");
            Map map = (Map) (queryParameter2 != null ? gson.e(queryParameter2, type) : null);
            String queryParameter3 = uri.getQueryParameter("redirect");
            return new ClickStreamLink(iL2, iIntValue, map, queryParameter3 != null ? xVar.b(queryParameter3) : null);
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "params", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
