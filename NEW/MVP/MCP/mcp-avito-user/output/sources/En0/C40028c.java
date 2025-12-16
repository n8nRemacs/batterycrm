package eN0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoPickerModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: eN0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40028c implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f395163a;

    public C40028c(u uVar) {
        this.f395163a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f395163a.get();
        C40027b.f395162a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
