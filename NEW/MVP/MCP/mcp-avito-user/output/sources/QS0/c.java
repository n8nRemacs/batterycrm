package Qs0;

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
public final class c implements h<InterfaceC14930a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f14023a;

    public c(f fVar) {
        this.f14023a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f14023a.get();
        b.f14022a.getClass();
        InterfaceC14930a interfaceC14930a = (InterfaceC14930a) r02.create(InterfaceC14930a.class);
        t.d(interfaceC14930a);
        return interfaceC14930a;
    }
}
