package rk;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: B2bBusinessTripAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: rk.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47671c implements h<C47670b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f430157a;

    public C47671c(u uVar) {
        this.f430157a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47670b((InterfaceC28373a) this.f430157a.get());
    }
}
