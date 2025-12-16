package rt0;

import com.avito.android.B2;
import com.avito.android.server_time.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingDateBlockConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: rt0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47721c implements h<C47720b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f430277a;

    /* renamed from: b, reason: collision with root package name */
    public final u f430278b;

    /* renamed from: c, reason: collision with root package name */
    public final u f430279c;

    public C47721c(u uVar, u uVar2, u uVar3) {
        this.f430277a = uVar;
        this.f430278b = uVar2;
        this.f430279c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C47720b((com.avito.android.service_booking_common.g) this.f430277a.get(), (j) this.f430278b.get(), (B2) this.f430279c.get());
    }
}
