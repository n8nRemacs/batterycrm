package E6;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CartItemApi_Module_ProvideCartItemApiFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f3767a;

    public c(f fVar) {
        this.f3767a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f3767a.get();
        b.f3766a.getClass();
        a aVar = (a) r02.create(a.class);
        t.d(aVar);
        return aVar;
    }
}
