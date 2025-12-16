package sn0;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SerpVerticalRubricatorModule_ProvidesDestroyableViewHolderBuilderFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: sn0.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48387e implements h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f438850a;

    public C48387e(u uVar) {
        this.f438850a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f438850a.get();
        C48385c.f438848a.getClass();
        return new C14699c(aVar);
    }
}
