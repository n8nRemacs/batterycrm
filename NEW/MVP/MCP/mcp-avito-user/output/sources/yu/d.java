package Yu;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.ConditionChainLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConditionLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LYu/d;", "LKu/a;", "Lcom/avito/android/deep_linking/links/ConditionChainLink;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends AbstractC14350a<ConditionChainLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        DeepLink deepLinkB = xVar.b(Ku.i.p(uri, "condition"));
        DeepLink deepLinkB2 = xVar.b(Ku.i.p(uri, "successBranch"));
        String queryParameter = uri.getQueryParameter("failureBranch");
        DeepLink deepLinkB3 = queryParameter != null ? xVar.b(queryParameter) : null;
        if (deepLinkB instanceof NoMatchLink) {
            Ku.i.h(uri, "condition");
            throw null;
        }
        if (deepLinkB2 instanceof NoMatchLink) {
            Ku.i.h(uri, "successBranch");
            throw null;
        }
        if (!(deepLinkB3 instanceof NoMatchLink)) {
            return new ConditionChainLink(deepLinkB, deepLinkB2, deepLinkB3);
        }
        Ku.i.h(uri, "failureDeepLink");
        throw null;
    }
}
