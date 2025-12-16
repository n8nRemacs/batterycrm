package Ys0;

import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingCalendarApi_Module_ProvideServiceBookingCalendarApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<InterfaceC18323a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f19705a;

    public c(dagger.internal.f fVar) {
        this.f19705a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f19705a.get();
        b.f19704a.getClass();
        InterfaceC18323a interfaceC18323a = (InterfaceC18323a) r02.create(InterfaceC18323a.class);
        t.d(interfaceC18323a);
        return interfaceC18323a;
    }
}
