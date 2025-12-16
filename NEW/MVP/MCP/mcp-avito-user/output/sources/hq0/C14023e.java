package Hq0;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sI0.InterfaceC48055a;

/* compiled from: HintsDialogInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Hq0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14023e implements h<C14022d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48055a> f7759a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f7760b;

    public C14023e(Provider<InterfaceC48055a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f7759a = provider;
        this.f7760b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14022d(this.f7760b.get(), g.a(w.a(this.f7759a)));
    }
}
