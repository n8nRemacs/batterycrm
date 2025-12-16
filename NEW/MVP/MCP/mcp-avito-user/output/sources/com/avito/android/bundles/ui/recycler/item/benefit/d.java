package com.avito.android.bundles.ui.recycler.item.benefit;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BundleBenefitItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/benefit/d;", "Lcom/avito/android/bundles/ui/recycler/item/benefit/b;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<DeepLink> f108371b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f108372c;

    @Inject
    public d() {
        io.reactivex.rxjava3.subjects.e<DeepLink> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f108371b = eVar;
        this.f108372c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        h hVar = (h) aVar;
        fVar.Em(hVar.f108381c);
        fVar.fA(hVar.f108382d, hVar.f108383e);
        DeepLink deepLink = hVar.f108384f;
        if (deepLink == null || (deepLink instanceof NoMatchLink)) {
            fVar.t3();
        } else {
            fVar.a(new c(this, hVar));
        }
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f108372c;
    }
}
