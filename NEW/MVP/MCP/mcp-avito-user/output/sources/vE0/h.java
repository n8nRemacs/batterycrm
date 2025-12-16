package Ve0;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupContactStringsProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f17349a;

    public h(Provider<Resources> provider) {
        this.f17349a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f17349a.get());
    }
}
