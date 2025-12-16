package cs;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoApi_Module_ProvideCpxPromoApiFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<InterfaceC39404a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f392978a;

    public c(f fVar) {
        this.f392978a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f392978a.get();
        C39405b.f392977a.getClass();
        InterfaceC39404a interfaceC39404a = (InterfaceC39404a) r02.create(InterfaceC39404a.class);
        t.d(interfaceC39404a);
        return interfaceC39404a;
    }
}
