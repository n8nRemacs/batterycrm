package KB0;

import com.avito.android.tariff.cpx.limit.cancel.deeplink.TariffCpxLimitCancelLink;
import com.avito.android.tariff.cpx.limit.cancel.deeplink.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxLimitCancelDeeplinkMappingsModule_ProvideTariffCpxLimitCancelMappingFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f9359a;

    public b(d dVar) {
        this.f9359a = dVar;
    }

    public static C43834a a(d dVar) {
        a.f9358a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxLimitCancelLink.class, new com.avito.android.tariff.cpx.limit.cancel.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpxLimitCancelLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f9359a);
    }
}
