package Mm0;

import Hm0.InterfaceC14008b;
import Jm0.b;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.reputation.links.CriteriaDetailsLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CriteriaDetailsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"LMm0/a;", "Lev/b;", "Lcom/avito/android/reputation/links/CriteriaDetailsLink;", "LJm0/b;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mm0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14508a extends AbstractC40162b<CriteriaDetailsLink> implements Jm0.b<CriteriaDetailsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC14008b f11012d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f11013e;

    @Inject
    public C14508a(@k InterfaceC14008b interfaceC14008b, @k a.InterfaceC4053a interfaceC4053a) {
        this.f11012d = interfaceC14008b;
        this.f11013e = interfaceC4053a;
    }

    @Override // Jm0.b
    @k
    /* renamed from: a, reason: from getter */
    public final a.InterfaceC4053a getF11013e() {
        return this.f11013e;
    }

    @Override // Jm0.b
    @k
    /* renamed from: b, reason: from getter */
    public final InterfaceC14008b getF11012d() {
        return this.f11012d;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        return b.a.a(this, (CriteriaDetailsLink) deepLink);
    }
}
