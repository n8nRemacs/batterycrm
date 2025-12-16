package b70;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeatureApi_Module_ProvideFeatureApiFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<InterfaceC25423a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f56940a;

    public c(f fVar) {
        this.f56940a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f56940a.get();
        b.f56939a.getClass();
        InterfaceC25423a interfaceC25423a = (InterfaceC25423a) r02.create(InterfaceC25423a.class);
        t.d(interfaceC25423a);
        return interfaceC25423a;
    }
}
