package uI0;

import com.avito.android.account.E;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nE.C44240b;

/* compiled from: AppRaterViewModelImpl_Factory.java */
@e
@y
@x
/* renamed from: uI0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48907c implements h<C48906b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f439899a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C44240b> f439900b;

    public C48907c(Provider<E> provider, Provider<C44240b> provider2) {
        this.f439899a = provider;
        this.f439900b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48906b(this.f439899a.get(), this.f439900b.get());
    }
}
