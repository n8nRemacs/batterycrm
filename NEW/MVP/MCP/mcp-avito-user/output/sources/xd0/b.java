package XD0;

import com.avito.android.tariff_lf_publication.save.deeplink.TariffLfPublicationSaveLink;
import com.avito.android.tariff_lf_publication.save.deeplink.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffLfPublicationSaveDeeplinkMappingsModule_ProvideSaveDeeplinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f18781a;

    public b(d dVar) {
        this.f18781a = dVar;
    }

    public static C43834a a(d dVar) {
        a.f18780a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffLfPublicationSaveLink.class, new com.avito.android.tariff_lf_publication.save.deeplink.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffLfPublicationSaveLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f18781a);
    }
}
