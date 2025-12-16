package Hm;

import com.avito.android.C28727b1;
import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.Z0;
import com.avito.android.beduin.v2.page.o;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CartBeduinV2IntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.beduin.v2.page.impl.x f7684a;

    /* renamed from: b, reason: collision with root package name */
    public final C28727b1 f7685b;

    /* renamed from: c, reason: collision with root package name */
    public final O f7686c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.navigation.c f7687d;

    public f(com.avito.android.beduin.v2.page.impl.x xVar, C28727b1 c28727b1, O o12, com.avito.android.navigation.c cVar) {
        this.f7684a = xVar;
        this.f7685b = c28727b1;
        this.f7686c = o12;
        this.f7687d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((o) this.f7684a.get(), (Z0) this.f7685b.get(), (L) this.f7686c.get(), (com.avito.android.navigation.a) this.f7687d.get());
    }
}
