package Nh0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReAgentLandingApi_Module_ProvideReAgentLandingApiFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<InterfaceC14577a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f11713a;

    public c(f fVar) {
        this.f11713a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11713a.get();
        b.f11712a.getClass();
        InterfaceC14577a interfaceC14577a = (InterfaceC14577a) r02.create(InterfaceC14577a.class);
        t.d(interfaceC14577a);
        return interfaceC14577a;
    }
}
