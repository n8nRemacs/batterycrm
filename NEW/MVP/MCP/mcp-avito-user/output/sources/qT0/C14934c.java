package Qt0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingSettingApi_Module_ProvideServiceBookingSettingApiFactory.java */
@e
@y
@x
/* renamed from: Qt0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14934c implements h<InterfaceC14932a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f14025a;

    public C14934c(f fVar) {
        this.f14025a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f14025a.get();
        C14933b.f14024a.getClass();
        InterfaceC14932a interfaceC14932a = (InterfaceC14932a) r02.create(InterfaceC14932a.class);
        t.d(interfaceC14932a);
        return interfaceC14932a;
    }
}
