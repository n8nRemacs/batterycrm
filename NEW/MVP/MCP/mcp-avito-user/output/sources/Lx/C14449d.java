package Lx;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EarlyAccessAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Lx.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14449d implements h<C14448c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f10285a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f10286b;

    /* renamed from: c, reason: collision with root package name */
    public final l f10287c;

    public C14449d(l lVar, Provider provider, Provider provider2) {
        this.f10285a = provider;
        this.f10286b = provider2;
        this.f10287c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C14448c(this.f10285a.get(), this.f10286b.get(), (ReEarlyAccessData) this.f10287c.f393949a);
    }
}
