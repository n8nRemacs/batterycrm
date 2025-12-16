package com.avito.android.tariff_lf.edit_info.item.edit_package.regular;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: RegularEditPackageItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/f;", "Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/d;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f298980b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f298981c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f298980b = cVar;
        this.f298981c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.V(aVar2.f298962d);
        hVar.ud(aVar2.f298963e);
        hVar.j(aVar2.f298964f);
        hVar.re(aVar2.f298965g);
        hVar.F50(aVar2.f298966h);
        hVar.pr(aVar2.f298967i);
        hVar.X30(aVar2.f298968j);
        hVar.a(new e(this, aVar2));
        ArrayList arrayList = aVar2.f298961c;
        if (arrayList != null) {
            hVar.H5(arrayList);
        } else {
            hVar.H5(C42784z0.f406748b);
        }
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f298981c;
    }
}
