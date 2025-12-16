package Ju0;

import AK0.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceCalendarButtonTooltipStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f9175a;

    public g(Provider<l> provider) {
        this.f9175a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f9175a.get());
    }
}
