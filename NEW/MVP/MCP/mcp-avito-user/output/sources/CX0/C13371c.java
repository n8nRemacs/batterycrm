package Cx0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StoriesAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Cx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13371c implements dagger.internal.h<C13370b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f2809a;

    public C13371c(Provider<InterfaceC28373a> provider) {
        this.f2809a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13370b(this.f2809a.get());
    }
}
