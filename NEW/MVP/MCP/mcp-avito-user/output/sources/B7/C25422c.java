package b7;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertShortTermRentAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* renamed from: b7.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C25422c implements h<C25421b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f56937a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f56938b;

    public C25422c(l lVar, Provider provider) {
        this.f56937a = lVar;
        this.f56938b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C25421b(this.f56938b.get(), (String) this.f56937a.f393949a);
    }
}
