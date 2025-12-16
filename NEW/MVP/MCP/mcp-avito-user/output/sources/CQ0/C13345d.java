package Cq0;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sI0.InterfaceC48055a;

/* compiled from: AllAdvicesInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: Cq0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13345d implements h<C13344c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48055a> f2718a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f2719b;

    public C13345d(Provider<InterfaceC48055a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f2718a = provider;
        this.f2719b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13344c(this.f2719b.get(), g.a(w.a(this.f2718a)));
    }
}
