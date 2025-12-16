package LB0;

import com.avito.android.tariff.cpx.limit.save.deeplink.TariffCpxLimitSaveLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxLimitSaveDeeplinkMappingsModule_ProvideTariffCpxLimitSaveMappingFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.limit.save.deeplink.e f9875a;

    public b(com.avito.android.tariff.cpx.limit.save.deeplink.e eVar) {
        this.f9875a = eVar;
    }

    public static C43834a a(com.avito.android.tariff.cpx.limit.save.deeplink.e eVar) {
        a.f9874a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxLimitSaveLink.class, new com.avito.android.tariff.cpx.limit.save.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpxLimitSaveLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f9875a);
    }
}
