package ol;

import com.avito.android.util.C35838l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import nl.C44439b;
import nl.InterfaceC44438a;

/* compiled from: NavigationBarStyleModule_ProvideNavigationBarStylePresenterFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<InterfaceC44438a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f420164a;

    public b(l lVar) {
        this.f420164a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C35838l3 c35838l3 = (C35838l3) this.f420164a.f393949a;
        C44816a.f420163a.getClass();
        return new C44439b(c35838l3);
    }
}
