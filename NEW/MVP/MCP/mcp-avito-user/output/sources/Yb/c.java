package Yb;

import AK0.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30214v6;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationPermissionStateAnalyticInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f19528a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f19529b;

    /* renamed from: c, reason: collision with root package name */
    public final w f19530c;

    public c(C30214v6 c30214v6, dagger.internal.f fVar, w wVar) {
        this.f19528a = c30214v6;
        this.f19529b = fVar;
        this.f19530c = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((l) this.f19528a.get(), (InterfaceC28373a) this.f19529b.get(), (u) this.f19530c.get());
    }
}
