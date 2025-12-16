package Kt0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingRepetitionApi_Module_ProvideServiceBookingRepetitionApiFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<InterfaceC14349a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f9679a;

    public c(f fVar) {
        this.f9679a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f9679a.get();
        b.f9678a.getClass();
        InterfaceC14349a interfaceC14349a = (InterfaceC14349a) r02.create(InterfaceC14349a.class);
        t.d(interfaceC14349a);
        return interfaceC14349a;
    }
}
