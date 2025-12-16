package com.avito.android.checkout.ui.items.service;

import Y41.l;
import com.avito.android.checkout.di.u;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckoutServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/ui/items/service/g;", "Lcom/avito/android/checkout/ui/items/service/e;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<DeepLink, G0> f118502b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k @u l<? super DeepLink, G0> lVar) {
        this.f118502b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        iVar.A5(bVar.f118487c);
        iVar.Ok(bVar.f118488d, bVar.f118489e);
        iVar.mD(bVar.f118490f, bVar.f118491g, new f(bVar, this));
        iVar.y5(bVar.f118492h);
        iVar.g(bVar.f118493i);
    }
}
