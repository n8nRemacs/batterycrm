package UL;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mM.InterfaceC43981a;

/* compiled from: IacDisablerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43981a> f16350a;

    /* renamed from: b, reason: collision with root package name */
    public final f f16351b;

    public b(f fVar, Provider provider) {
        this.f16350a = provider;
        this.f16351b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f16350a.get(), (InterfaceC28373a) this.f16351b.get());
    }
}
