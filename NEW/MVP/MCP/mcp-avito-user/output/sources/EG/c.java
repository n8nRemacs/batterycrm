package eG;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentListApi_Module_ProvidePaymentListApiFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<InterfaceC40001a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f395082a;

    public c(f fVar) {
        this.f395082a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f395082a.get();
        b.f395081a.getClass();
        InterfaceC40001a interfaceC40001a = (InterfaceC40001a) r02.create(InterfaceC40001a.class);
        t.d(interfaceC40001a);
        return interfaceC40001a;
    }
}
