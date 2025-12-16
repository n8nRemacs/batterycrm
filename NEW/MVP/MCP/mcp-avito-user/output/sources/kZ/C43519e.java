package kz;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmployeeOffLimitLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmployeeOffLimitLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkz/e;", "LKu/a;", "Lcom/avito/android/deep_linking/links/EmployeeOffLimitLink;", "<init>", "()V", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kz.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43519e extends AbstractC14350a<EmployeeOffLimitLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = i.p(uri, "title");
        String strP2 = i.p(uri, "subtitle");
        String queryParameter = uri.getQueryParameter("button");
        String queryParameter2 = uri.getQueryParameter("buttonUri");
        DeepLink deepLinkB = queryParameter2 != null ? xVar.b(queryParameter2) : null;
        String queryParameter3 = uri.getQueryParameter("closeUri");
        return new EmployeeOffLimitLink(strP, strP2, queryParameter, deepLinkB, queryParameter3 != null ? xVar.b(queryParameter3) : null);
    }
}
