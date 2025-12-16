package LX;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import l41.g;

/* compiled from: MallJSInterfaceImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g<b>> f9974a;

    public d(Provider<g<b>> provider) {
        this.f9974a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f9974a.get());
    }
}
