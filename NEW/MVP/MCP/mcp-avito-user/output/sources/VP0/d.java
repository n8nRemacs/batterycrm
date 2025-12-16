package Vp0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionTitleWithActionPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.section.title.a> f17408a;

    /* renamed from: b, reason: collision with root package name */
    public final u f17409b;

    public d(u uVar, Provider provider) {
        this.f17408a = provider;
        this.f17409b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f17408a.get(), (com.avito.android.section.action.b) this.f17409b.get());
    }
}
