package ok;

import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BrandspaceIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<C44787b> {

    /* renamed from: a, reason: collision with root package name */
    public final O f420000a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.navigation.c f420001b;

    public d(O o12, com.avito.android.navigation.c cVar) {
        this.f420000a = o12;
        this.f420001b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44787b((L) this.f420000a.get(), (com.avito.android.navigation.a) this.f420001b.get());
    }
}
