package Mr0;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TopSellersSerpWidgetModule_ProvidesViewHolderBuilderFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f11040a;

    public d(u uVar) {
        this.f11040a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f11040a.get();
        b.f11038a.getClass();
        return new C14699c(aVar);
    }
}
