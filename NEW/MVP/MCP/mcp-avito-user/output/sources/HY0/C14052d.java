package Hy0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCalendarNonFatalTracker_Factory.java */
@e
@y
@x
/* renamed from: Hy0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14052d implements h<C14050b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f7847a;

    public C14052d(Provider<InterfaceC28373a> provider) {
        this.f7847a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14050b(this.f7847a.get());
    }
}
