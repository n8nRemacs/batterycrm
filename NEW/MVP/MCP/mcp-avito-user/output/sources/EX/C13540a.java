package Ex;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.document_verification_status_screen.VerificationStatusDeeplink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationStatusDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LEx/a;", "Lev/b;", "Lcom/avito/android/document_verification_status_screen/VerificationStatusDeeplink;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ex.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C13540a extends AbstractC40162b<VerificationStatusDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.document_verification_status_screen.ui.b f4427d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f4428e;

    @Inject
    public C13540a(@k com.avito.android.document_verification_status_screen.ui.b bVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f4427d = bVar;
        this.f4428e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f4428e.R(this.f4427d.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
