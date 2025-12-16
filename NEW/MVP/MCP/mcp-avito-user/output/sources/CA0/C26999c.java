package cA0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessApi_Module_ProvideSuccessApiFactory.java */
@e
@y
@x
/* renamed from: cA0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C26999c implements h<InterfaceC26997a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f57780a;

    public C26999c(f fVar) {
        this.f57780a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57780a.get();
        C26998b.f57779a.getClass();
        InterfaceC26997a interfaceC26997a = (InterfaceC26997a) r02.create(InterfaceC26997a.class);
        t.d(interfaceC26997a);
        return interfaceC26997a;
    }
}
