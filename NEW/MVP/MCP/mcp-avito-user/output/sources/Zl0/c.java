package zL0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasApi_Module_ProvideVasApiFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<InterfaceC50482a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f444025a;

    public c(f fVar) {
        this.f444025a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f444025a.get();
        C50483b.f444024a.getClass();
        InterfaceC50482a interfaceC50482a = (InterfaceC50482a) r02.create(InterfaceC50482a.class);
        t.d(interfaceC50482a);
        return interfaceC50482a;
    }
}
