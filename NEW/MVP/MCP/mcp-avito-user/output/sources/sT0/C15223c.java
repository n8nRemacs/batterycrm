package St0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbWorkHoursActionsAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* renamed from: St0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15223c implements h<C15222b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f15178a;

    public C15223c(Provider<InterfaceC28373a> provider) {
        this.f15178a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15222b(this.f15178a.get());
    }
}
