package xj;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.beduin_snippet_response_manager.deeplink.BeduinSnippetJobResponseDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: BeduinSnippetJobResponseDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxj/e;", "LKu/a;", "Lcom/avito/android/beduin_snippet_response_manager/deeplink/BeduinSnippetJobResponseDeeplink;", "<init>", "()V", "_avito_job_beduin-snippet-response-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xj.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49956e extends AbstractC14350a<BeduinSnippetJobResponseDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new BeduinSnippetJobResponseDeeplink(i.p(uri, "itemId"), i.p(uri, "categoryId"), xVar.b(i.p(uri, "responseDeeplink")));
    }
}
