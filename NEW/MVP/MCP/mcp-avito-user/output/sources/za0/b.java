package ZA0;

import com.avito.android.tariff.cpa.close.deeplink.c;
import com.avito.android.tariff.cpa.close.deeplink.d;
import com.avito.android.tariff.deeplink.TariffCpaCloseLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpaCloseMappingsModule_ProvideCpaCloseMappingFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f19956a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpa.close.deeplink.e f19957b;

    public b(c cVar, com.avito.android.tariff.cpa.close.deeplink.e eVar) {
        this.f19956a = cVar;
        this.f19957b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f19957b.getClass();
        d dVar = new d();
        c cVar = this.f19956a;
        a.f19955a.getClass();
        return new C43834a(TariffCpaCloseLink.class, dVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpaCloseLink.class), cVar));
    }
}
