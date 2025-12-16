package Ht;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink.RestartPublishLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.Gson;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RestartPublishDeepLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LHt/e;", "LKu/a;", "Lcom/avito/android/deeplink/RestartPublishLink;", "<init>", "()V", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends AbstractC14350a<RestartPublishLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter(ContextActionHandler.Link.DEEPLINK);
        DeepLink deepLinkB = queryParameter != null ? xVar.b(queryParameter) : null;
        if (deepLinkB != null) {
            return new RestartPublishLink(deepLinkB);
        }
        G0.f406611a.getClass();
        throw new IllegalArgumentException("kotlin.Unit");
    }
}
