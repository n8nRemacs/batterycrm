package com.avito.android.publish.slots.check_verification.item;

import JO.o;
import JO.p;
import JO.q;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.analytics.C33525k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VerificationItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/check_verification/item/f;", "Lcom/avito/android/publish/slots/check_verification/item/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C33525k f243188b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f243189c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f243190d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f243191e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f243192f;

    @Inject
    public f(@k C33525k c33525k) {
        this.f243188b = c33525k;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243189c = cVar;
        this.f243190d = cVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f243191e = cVar2;
        this.f243192f = cVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        o oVar = (o) aVar;
        if (oVar instanceof q) {
            this.f243189c.accept(G0.f406611a);
            return;
        }
        if (oVar instanceof p) {
            hVar.setVisible(true);
            p pVar = (p) oVar;
            hVar.setTitle(pVar.f8982d);
            hVar.h(pVar.f8983e);
            hVar.i(pVar.f8981c);
            hVar.Jn(new d(this), pVar.f8984f);
            JO.b bVar = pVar.f8985g;
            hVar.P(bVar.f8936a, new e(this, oVar));
        }
    }

    @Override // com.avito.android.publish.slots.check_verification.item.c
    @k
    /* renamed from: W2, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF243190d() {
        return this.f243190d;
    }

    @Override // com.avito.android.publish.slots.check_verification.item.c
    @k
    /* renamed from: a0, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF243192f() {
        return this.f243192f;
    }
}
