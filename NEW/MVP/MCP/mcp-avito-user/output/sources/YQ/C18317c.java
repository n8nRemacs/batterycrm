package Yq;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitorAnalyticsEventInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: Yq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18317c implements h<C18316b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f19698a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f19699b;

    public C18317c(l lVar, Provider provider) {
        this.f19698a = lVar;
        this.f19699b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C18316b(((Long) this.f19698a.f393949a).longValue(), this.f19699b.get());
    }
}
