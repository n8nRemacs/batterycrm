package xj;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import com.avito.android.beduin_snippet_response_manager.deeplink.BeduinSnippetJobResponseDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import wj.InterfaceC49636a;

/* compiled from: BeduinSnippetJobResponseDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxj/a;", "Lev/a;", "Lcom/avito/android/beduin_snippet_response_manager/deeplink/BeduinSnippetJobResponseDeeplink;", "_avito_job_beduin-snippet-response-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49952a extends AbstractC40161a<BeduinSnippetJobResponseDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC49636a f442611f;

    @Inject
    public C49952a(@k InterfaceC49636a interfaceC49636a) {
        this.f442611f = interfaceC49636a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        BeduinSnippetJobResponseDeeplink beduinSnippetJobResponseDeeplink = (BeduinSnippetJobResponseDeeplink) deepLink;
        this.f442611f.a(new InterfaceC49636a.C12828a(beduinSnippetJobResponseDeeplink.f105339b, beduinSnippetJobResponseDeeplink.f105340c, beduinSnippetJobResponseDeeplink.f105341d));
        j(AbstractC14250d.c.f9171c);
    }
}
