package cv0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesPortfolioApi_Module_ProvideServicesPortfolioApiFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<InterfaceC39418a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f393051a;

    public c(f fVar) {
        this.f393051a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f393051a.get();
        C39419b.f393050a.getClass();
        InterfaceC39418a interfaceC39418a = (InterfaceC39418a) r02.create(InterfaceC39418a.class);
        t.d(interfaceC39418a);
        return interfaceC39418a;
    }
}
