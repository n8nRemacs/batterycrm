package rt0;

import com.avito.android.B2;
import com.avito.android.service_booking_common.n;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: rt0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47724f implements h<C47723e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47719a> f430285a;

    /* renamed from: b, reason: collision with root package name */
    public final u f430286b;

    /* renamed from: c, reason: collision with root package name */
    public final u f430287c;

    public C47724f(u uVar, u uVar2, Provider provider) {
        this.f430285a = provider;
        this.f430286b = uVar;
        this.f430287c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C47723e(this.f430285a.get(), (n) this.f430286b.get(), (B2) this.f430287c.get());
    }
}
