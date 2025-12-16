package sM;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.iac_util_deeplinks.public_module.run_once.RunOnceLink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RunOnceLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LsM/h;", "LKu/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/run_once/RunOnceLink;", "<init>", "()V", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends AbstractC14350a<RunOnceLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = Ku.i.n(uri, "key");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("clearKeyOnLogout", false);
        String queryParameter = uri.getQueryParameter("keyNotExistLink");
        DeepLink deepLinkB = queryParameter != null ? xVar.b(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("keyExistLink");
        return new RunOnceLink(strN, Boolean.valueOf(booleanQueryParameter), deepLinkB, queryParameter2 != null ? xVar.b(queryParameter2) : null);
    }
}
