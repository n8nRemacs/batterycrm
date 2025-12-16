package cs0;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TopSellersWidgetModule_ProvidesViewHolderBuilderFactory.java */
@e
@y
@x
/* renamed from: cs0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39409d implements h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f392981a;

    public C39409d(u uVar) {
        this.f392981a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f392981a.get();
        C39407b.f392979a.getClass();
        return new C14699c(aVar);
    }
}
