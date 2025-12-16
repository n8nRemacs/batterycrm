package Om0;

import Hm0.InterfaceC14008b;
import Jm0.b;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.reputation.links.GrayStateCriteriaLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GrayStateCriteriaLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"LOm0/a;", "Lev/b;", "Lcom/avito/android/reputation/links/GrayStateCriteriaLink;", "LJm0/b;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Om0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14710a extends AbstractC40162b<GrayStateCriteriaLink> implements Jm0.b<GrayStateCriteriaLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC14008b f12512d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f12513e;

    @Inject
    public C14710a(@k InterfaceC14008b interfaceC14008b, @k a.InterfaceC4053a interfaceC4053a) {
        this.f12512d = interfaceC14008b;
        this.f12513e = interfaceC4053a;
    }

    @Override // Jm0.b
    @k
    /* renamed from: a, reason: from getter */
    public final a.InterfaceC4053a getF12513e() {
        return this.f12513e;
    }

    @Override // Jm0.b
    @k
    /* renamed from: b, reason: from getter */
    public final InterfaceC14008b getF12512d() {
        return this.f12512d;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        return b.a.a(this, (GrayStateCriteriaLink) deepLink);
    }
}
