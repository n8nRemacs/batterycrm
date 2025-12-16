package Sn0;

import com.avito.android.remote.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<C15207b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B> f15144a;

    public d(Provider<B> provider) {
        this.f15144a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15207b(g.a(w.a(this.f15144a)));
    }
}
