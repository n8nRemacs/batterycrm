package aY;

import com.avito.android.serp.i;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import fY.InterfaceC40372a;
import javax.inject.Provider;

/* compiled from: PinAdvertsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: aY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C19839c implements h<C19838b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f20913a;

    /* renamed from: b, reason: collision with root package name */
    public final u f20914b;

    public C19839c(u uVar, Provider provider) {
        this.f20913a = provider;
        this.f20914b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C19838b(this.f20913a.get(), (InterfaceC40372a) this.f20914b.get());
    }
}
