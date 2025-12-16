package Cy0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerCalendarAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f2816a;

    /* renamed from: b, reason: collision with root package name */
    public final u f2817b;

    public d(u uVar, u uVar2) {
        this.f2816a = uVar;
        this.f2817b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC28373a) this.f2816a.get(), (com.avito.android.analytics.provider.a) this.f2817b.get());
    }
}
