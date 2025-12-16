package u7;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DomainToPresentationRecallMeBlockConverter_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<C48810a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f439803a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f439804b;

    public b(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.util.text.a> provider2) {
        this.f439803a = provider;
        this.f439804b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48810a(this.f439803a.get(), this.f439804b.get());
    }
}
