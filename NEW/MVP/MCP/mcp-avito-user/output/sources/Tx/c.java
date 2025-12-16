package Tx;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EarlyAccessAdvertApi_Module_ProvideEarlyAccessAdvertApiFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<InterfaceC15421a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f16028a;

    public c(f fVar) {
        this.f16028a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f16028a.get();
        b.f16027a.getClass();
        InterfaceC15421a interfaceC15421a = (InterfaceC15421a) r02.create(InterfaceC15421a.class);
        t.d(interfaceC15421a);
        return interfaceC15421a;
    }
}
