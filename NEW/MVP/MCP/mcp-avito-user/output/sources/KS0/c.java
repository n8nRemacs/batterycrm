package Ks0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingM2Api_Module_ProvideServiceBookingM2ApiFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<InterfaceC14347a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f9677a;

    public c(f fVar) {
        this.f9677a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f9677a.get();
        b.f9676a.getClass();
        InterfaceC14347a interfaceC14347a = (InterfaceC14347a) r02.create(InterfaceC14347a.class);
        t.d(interfaceC14347a);
        return interfaceC14347a;
    }
}
