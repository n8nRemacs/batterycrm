package Ul;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarViewTypeProviderImpl_Factory.java */
@e
@y
@x
/* renamed from: Ul.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15534c implements h<C15533b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f16582a;

    public C15534c(u uVar) {
        this.f16582a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C15533b((com.avito.konveyor.a) this.f16582a.get());
    }
}
