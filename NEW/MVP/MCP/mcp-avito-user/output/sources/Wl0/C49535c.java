package wL0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPerformanceApi_Module_ProvideVasPerformanceApiFactory.java */
@e
@y
@x
/* renamed from: wL0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49535c implements h<InterfaceC49533a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f441407a;

    public C49535c(f fVar) {
        this.f441407a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f441407a.get();
        C49534b.f441406a.getClass();
        InterfaceC49533a interfaceC49533a = (InterfaceC49533a) r02.create(InterfaceC49533a.class);
        t.d(interfaceC49533a);
        return interfaceC49533a;
    }
}
