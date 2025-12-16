package b10;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImmutableInfoDescriptionAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: b10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C25388c implements h<C25387b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f56817a;

    public C25388c(Provider<InterfaceC28373a> provider) {
        this.f56817a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C25387b(this.f56817a.get());
    }
}
