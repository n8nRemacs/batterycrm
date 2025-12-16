package Pq;

import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComparisonAnalyticInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: Pq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14828c implements h<C14827b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f13332a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f13333b;

    public C14828c(Provider<InterfaceC28373a> provider, Provider<C29640d> provider2) {
        this.f13332a = provider;
        this.f13333b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14827b(this.f13332a.get(), this.f13333b.get());
    }
}
