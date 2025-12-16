package Md0;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertEditLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMd0/h;", "LKu/a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends AbstractC14350a<MyAdvertLink.Edit> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = Ku.i.n(uri, "itemId");
        String queryParameter = uri.getQueryParameter("postAction");
        return new MyAdvertLink.Edit(queryParameter != null ? xVar.b(queryParameter) : null, strN, uri.getQueryParameter("focusId"), uri.getQueryParameter("fromSource"), uri.getQueryParameter("scenario"), uri.getBooleanQueryParameter("forceErrorChecking", false));
    }
}
