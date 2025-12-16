package Xr0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MiniSearchWidgetAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f19102a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f19102a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f19102a.get());
    }
}
