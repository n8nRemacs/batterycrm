package com.avito.android.bundles.ui.recycler.item.bundle;

import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasBundleItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/bundle/f;", "Lcom/avito/android/bundles/ui/recycler/item/bundle/d;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<DeepLink> f108412b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e f108413c;

    @Inject
    public f() {
        io.reactivex.rxjava3.subjects.e<DeepLink> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f108412b = eVar;
        this.f108413c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.bG(cVar.f108400c);
        hVar.U1(cVar.f108402e);
        hVar.qL(cVar.f108401d);
        hVar.Ux(cVar.f108403f);
        hVar.L(cVar.f108404g);
        hVar.Z0(cVar.f108405h);
        hVar.LI(cVar.f108406i);
        e eVar2 = new e(this, cVar);
        if (cVar.f108409l) {
            hVar.rz(eVar2);
            hVar.aB(null, null);
        } else {
            hVar.rz(null);
            hVar.aB(cVar.f108407j, eVar2);
        }
    }

    @Override // com.avito.android.deep_linking.K
    @Y61.k
    public final z<DeepLink> k() {
        return this.f108413c;
    }
}
