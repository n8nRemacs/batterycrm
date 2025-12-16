package qc;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SnippetScrollDepthAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: qc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47377c implements h<C47376b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f429324a;

    public C47377c(Provider<InterfaceC28373a> provider) {
        this.f429324a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47376b(this.f429324a.get());
    }
}
