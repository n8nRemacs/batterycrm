package T40;

import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RedesignedOrderIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final O f15349a;

    /* renamed from: b, reason: collision with root package name */
    public final R40.c f15350b;

    public c(O o12, R40.c cVar) {
        this.f15349a = o12;
        this.f15350b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((L) this.f15349a.get(), (R40.a) this.f15350b.get());
    }
}
