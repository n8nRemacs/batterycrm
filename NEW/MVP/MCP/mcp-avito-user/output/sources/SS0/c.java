package Ss0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingAdditionalSettingsApi_Module_ProvideServiceBookingAdditionalSettingsApiFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<InterfaceC15219a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f15174a;

    public c(f fVar) {
        this.f15174a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f15174a.get();
        b.f15173a.getClass();
        InterfaceC15219a interfaceC15219a = (InterfaceC15219a) r02.create(InterfaceC15219a.class);
        t.d(interfaceC15219a);
        return interfaceC15219a;
    }
}
