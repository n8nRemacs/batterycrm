package uC0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptApi_Module_ProvideTariffCptApiFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<InterfaceC48882a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f439864a;

    public c(f fVar) {
        this.f439864a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439864a.get();
        b.f439863a.getClass();
        InterfaceC48882a interfaceC48882a = (InterfaceC48882a) r02.create(InterfaceC48882a.class);
        t.d(interfaceC48882a);
        return interfaceC48882a;
    }
}
