package B4;

import com.avito.android.advert.item.beduin.k;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;

/* compiled from: AdvertDetailsBeduinModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final c f867a;

    public b(c cVar) {
        this.f867a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f867a.get();
        a.f866a.getClass();
        InterfaceC40691b f73241k = kVar.getF73241K();
        t.d(f73241k);
        return f73241k;
    }
}
