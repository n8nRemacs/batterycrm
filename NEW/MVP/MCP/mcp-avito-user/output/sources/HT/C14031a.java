package Ht;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink.RestartPublishLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.PublishIntentFactory;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RestartPublishDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LHt/a;", "Lev/b;", "Lcom/avito/android/deeplink/RestartPublishLink;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ht.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14031a extends AbstractC40162b<RestartPublishLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PublishIntentFactory f7800d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f7801e;

    @Inject
    public C14031a(@k PublishIntentFactory publishIntentFactory, @k a.InterfaceC4053a interfaceC4053a) {
        this.f7800d = publishIntentFactory;
        this.f7801e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f7801e.R(this.f7800d.b(((RestartPublishLink) deepLink).f134094b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
