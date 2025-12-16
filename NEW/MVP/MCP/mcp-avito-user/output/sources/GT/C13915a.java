package Gt;

import Bx0.InterfaceC13200a;
import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DraftPublicationLink;
import com.avito.android.deeplink.CvUploadedOpenDraftLink;
import com.avito.android.deeplink.RestartPublishLink;
import com.avito.android.deeplink_handler.handler.b;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvUploadedOpenDraftDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LGt/a;", "Lev/a;", "Lcom/avito/android/deeplink/CvUploadedOpenDraftLink;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13915a extends AbstractC40161a<CvUploadedOpenDraftLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f6761f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC13200a f6762g;

    @Inject
    public C13915a(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC13200a interfaceC13200a) {
        this.f6761f = aVar;
        this.f6762g = interfaceC13200a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String str2 = ((CvUploadedOpenDraftLink) deepLink).f134078b;
        this.f6762g.b(str2);
        boolean zF2 = L.f(str, "publish");
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f6761f;
        DeepLink deepLink2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i12 = 2;
        if (zF2) {
            b.a.a(aVar, new RestartPublishLink(new DraftPublicationLink(str2, deepLink2, i12, objArr3 == true ? 1 : 0)), null, null, 6);
        } else {
            b.a.a(aVar, new DraftPublicationLink(str2, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0), null, null, 6);
        }
        j(AbstractC14250d.c.f9171c);
    }
}
