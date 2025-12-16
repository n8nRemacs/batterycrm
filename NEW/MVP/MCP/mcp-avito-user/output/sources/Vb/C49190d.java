package vB;

import com.avito.android.serp.adapter.C34741k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CarouselItemModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* renamed from: vB.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49190d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f440516a;

    public C49190d(u uVar) {
        this.f440516a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C34741k c34741k = (C34741k) this.f440516a.get();
        C49188b.f440514a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c34741k);
        return c10493a.a();
    }
}
