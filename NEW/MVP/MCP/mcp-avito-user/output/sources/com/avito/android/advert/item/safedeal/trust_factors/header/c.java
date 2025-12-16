package com.avito.android.advert.item.safedeal.trust_factors.header;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: TrustFactorsHeaderPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class c implements w, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert.item.safedeal.trust_factors.d f79163b;

    public c(com.avito.android.advert.item.safedeal.trust_factors.d dVar) {
        this.f79163b = dVar;
    }

    public final boolean equals(@l Object obj) {
        if ((obj instanceof w) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new H(1, this.f79163b, com.avito.android.advert.item.safedeal.trust_factors.d.class, "followTrustFactorsDeepLink", "followTrustFactorsDeepLink(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@k DeepLink deepLink) {
        this.f79163b.j(deepLink);
    }
}
