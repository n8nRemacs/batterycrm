package Il;

import Oi0.C14701e;
import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualRubricatorWidgetModule_ProvideSafeRecyclerAdapterFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<C14701e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f8519a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f8520b;

    public j(u uVar, Provider provider) {
        this.f8519a = uVar;
        this.f8520b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f8519a.get();
        C c12 = this.f8520b.get();
        C14123a.f8498a.getClass();
        return new C14701e(interfaceC14698b, c12);
    }
}
