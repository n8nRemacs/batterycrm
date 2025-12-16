package vq0;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sI0.InterfaceC48055a;

/* compiled from: ShortAdvicesInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: vq0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49370c implements h<C49369b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48055a> f441000a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f441001b;

    public C49370c(Provider<InterfaceC48055a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f441000a = provider;
        this.f441001b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49369b(this.f441001b.get(), g.a(w.a(this.f441000a)));
    }
}
