package jl;

import com.avito.android.account.E;
import com.avito.android.cv_actualization_suggest.domain.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvActualizationSerpPresenter_Factory.java */
@e
@y
@x
/* renamed from: jl.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42395b implements h<C42394a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a.InterfaceC3933a> f405804a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f405805b;

    public C42395b(Provider<a.InterfaceC3933a> provider, Provider<E> provider2) {
        this.f405804a = provider;
        this.f405805b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42394a(this.f405804a.get(), this.f405805b.get());
    }
}
