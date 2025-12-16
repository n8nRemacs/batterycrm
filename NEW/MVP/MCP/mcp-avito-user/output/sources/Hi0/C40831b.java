package hI0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: MyAdvertActivationLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LhI0/b;", "LKu/a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Activate;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hI0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40831b extends AbstractC14350a<MyAdvertLink.Activate> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = i.n(uri, "itemId");
        String queryParameter = uri.getQueryParameter("skipCpt");
        String queryParameter2 = uri.getQueryParameter("shouldOpenApp");
        return new MyAdvertLink.Activate(strN, queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : true, queryParameter);
    }
}
