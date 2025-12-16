package W6;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrderRequestTooltipStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f17748a;

    public c(Provider<l> provider) {
        this.f17748a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f17748a.get());
    }
}
