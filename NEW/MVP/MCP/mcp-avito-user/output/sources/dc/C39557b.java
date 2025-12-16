package dC;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetCarouselContainerItemModule_ProvideAdapterPresenterFactory.java */
@e
@y
@x
/* renamed from: dC.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C39557b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f393737a;

    public C39557b(u uVar) {
        this.f393737a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f393737a.get();
        int i12 = C39556a.f393736a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
