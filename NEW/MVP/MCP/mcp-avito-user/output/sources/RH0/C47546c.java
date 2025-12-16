package rH0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PortfolioEventTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: rH0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47546c implements h<C47545b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f429719a;

    public C47546c(u uVar) {
        this.f429719a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47545b((InterfaceC28373a) this.f429719a.get());
    }
}
