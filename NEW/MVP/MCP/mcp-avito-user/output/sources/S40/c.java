package S40;

import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrderIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final O f14802a;

    /* renamed from: b, reason: collision with root package name */
    public final R40.c f14803b;

    public c(O o12, R40.c cVar) {
        this.f14802a = o12;
        this.f14803b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((L) this.f14802a.get(), (R40.a) this.f14803b.get());
    }
}
