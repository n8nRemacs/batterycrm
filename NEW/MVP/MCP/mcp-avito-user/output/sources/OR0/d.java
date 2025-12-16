package Or0;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoBlogItemModule_ProvidesDestroyableViewHolderBuilderFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f12630a;

    public d(Provider<com.avito.konveyor.a> provider) {
        this.f12630a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f12630a.get();
        b.f12628a.getClass();
        return new C14699c(aVar);
    }
}
