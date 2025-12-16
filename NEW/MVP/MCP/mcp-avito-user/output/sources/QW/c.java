package Qw;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsAgencySearchApi_Module_ProvideDevelopmentsAgencySearchApiFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<InterfaceC14939a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f14035a;

    public c(f fVar) {
        this.f14035a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f14035a.get();
        C14940b.f14034a.getClass();
        InterfaceC14939a interfaceC14939a = (InterfaceC14939a) r02.create(InterfaceC14939a.class);
        t.d(interfaceC14939a);
        return interfaceC14939a;
    }
}
