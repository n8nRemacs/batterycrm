package UK;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mL.InterfaceC43977a;

/* compiled from: IacFinishedFallbackScreenLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43977a> f16343a;

    public d(Provider<InterfaceC43977a> provider) {
        this.f16343a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f16343a.get());
    }
}
