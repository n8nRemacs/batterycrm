package lx;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsCatalogApi_Module_ProvideDevelopmentsCatalogApiFactory.java */
@e
@y
@x
/* renamed from: lx.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43846c implements h<InterfaceC43844a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f414253a;

    public C43846c(f fVar) {
        this.f414253a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414253a.get();
        C43845b.f414252a.getClass();
        InterfaceC43844a interfaceC43844a = (InterfaceC43844a) r02.create(InterfaceC43844a.class);
        t.d(interfaceC43844a);
        return interfaceC43844a;
    }
}
