package Qm0;

import Hm0.InterfaceC14008b;
import Jm0.b;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.reputation.links.RestrictionLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RestrictionLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"LQm0/a;", "Lev/b;", "Lcom/avito/android/reputation/links/RestrictionLink;", "LJm0/b;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qm0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14909a extends AbstractC40162b<RestrictionLink> implements Jm0.b<RestrictionLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC14008b f13995d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f13996e;

    @Inject
    public C14909a(@k InterfaceC14008b interfaceC14008b, @k a.InterfaceC4053a interfaceC4053a) {
        this.f13995d = interfaceC14008b;
        this.f13996e = interfaceC4053a;
    }

    @Override // Jm0.b
    @k
    /* renamed from: a, reason: from getter */
    public final a.InterfaceC4053a getF13996e() {
        return this.f13996e;
    }

    @Override // Jm0.b
    @k
    /* renamed from: b, reason: from getter */
    public final InterfaceC14008b getF13995d() {
        return this.f13995d;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        return b.a.a(this, (RestrictionLink) deepLink);
    }
}
