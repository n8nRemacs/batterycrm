package Bo;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CjmProApi_Module_ProvideCjmProApiFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<InterfaceC13170a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f1695a;

    public c(f fVar) {
        this.f1695a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f1695a.get();
        C13171b.f1694a.getClass();
        InterfaceC13170a interfaceC13170a = (InterfaceC13170a) r02.create(InterfaceC13170a.class);
        t.d(interfaceC13170a);
        return interfaceC13170a;
    }
}
