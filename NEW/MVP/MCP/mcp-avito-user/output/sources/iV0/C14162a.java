package Iv0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.services_video_call.deeplink.ServicesVideoCallDeepLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ServicesVideoCallDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LIv0/a;", "LKu/a;", "Lcom/avito/android/services_video_call/deeplink/ServicesVideoCallDeepLink;", "<init>", "()V", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14162a extends AbstractC14350a<ServicesVideoCallDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new ServicesVideoCallDeepLink(xVar.b(i.p(uri, "callLink")), xVar.b(i.p(uri, "detailsSheetUri")));
    }
}
