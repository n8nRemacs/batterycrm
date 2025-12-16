package lC0;

import com.avito.android.tariff_cpt.configure.creation.deeplink.TariffCptCreationLink;
import com.avito.android.tariff_cpt.configure.creation.deeplink.f;
import com.avito.android.tariff_cpt.configure.creation.deeplink.g;
import com.avito.android.tariff_cpt.configure.creation.deeplink.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCptCreationDeeplinkMappingsModule_ProvideCptCreationMappingFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f413586a;

    /* renamed from: b, reason: collision with root package name */
    public final i f413587b;

    public b(f fVar, i iVar) {
        this.f413586a = fVar;
        this.f413587b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f413587b.getClass();
        g gVar = new g();
        f fVar = this.f413586a;
        C43616a.f413585a.getClass();
        return new C43834a(TariffCptCreationLink.class, gVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCptCreationLink.class), fVar));
    }
}
