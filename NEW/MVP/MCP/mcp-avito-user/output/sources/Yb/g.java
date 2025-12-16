package Yb;

import AK0.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30214v6;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MicroPermissionStateAnalyticInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f19536a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f19537b;

    /* renamed from: c, reason: collision with root package name */
    public final w f19538c;

    public g(C30214v6 c30214v6, dagger.internal.f fVar, w wVar) {
        this.f19536a = c30214v6;
        this.f19537b = fVar;
        this.f19538c = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((l) this.f19536a.get(), (InterfaceC28373a) this.f19537b.get(), (u) this.f19538c.get());
    }
}
