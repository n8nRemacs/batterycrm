package Dr0;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ResizableServiceWidgetBlockModule_ProvideSafeRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<C14700d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f3493a;

    /* renamed from: b, reason: collision with root package name */
    public final u f3494b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f3495c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f3493a = provider;
        this.f3494b = uVar;
        this.f3495c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = this.f3493a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f3494b.get();
        C c12 = this.f3495c.get();
        d.f3489a.getClass();
        return new C14700d(hVar, interfaceC14698b, c12);
    }
}
