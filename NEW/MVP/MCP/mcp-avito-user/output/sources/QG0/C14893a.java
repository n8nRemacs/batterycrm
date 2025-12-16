package Qg0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserContactsLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating.f;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserContactsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LQg0/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/UserContactsLink;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14893a extends AbstractC40162b<UserContactsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f13977d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f13978e;

    @Inject
    public C14893a(@k a.InterfaceC4053a interfaceC4053a, @k f fVar) {
        this.f13977d = fVar;
        this.f13978e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f13978e.R(this.f13977d.a(((UserContactsLink) deepLink).f133837b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
