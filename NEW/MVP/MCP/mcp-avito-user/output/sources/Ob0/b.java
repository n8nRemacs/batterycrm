package OB0;

import com.avito.android.tariff.deeplink.TariffCpxSaveLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxSaveDeeplinkMappingsModule_ProvideTariffCpxSaveMappingFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.save.deeplink.e f12075a;

    public b(com.avito.android.tariff.cpx.save.deeplink.e eVar) {
        this.f12075a = eVar;
    }

    public static C43834a a(com.avito.android.tariff.cpx.save.deeplink.e eVar) {
        a.f12074a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxSaveLink.class, new com.avito.android.tariff.cpx.save.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpxSaveLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f12075a);
    }
}
