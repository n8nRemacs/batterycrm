package com.avito.android.review_gallery.mvi;

import com.avito.android.W1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import dn0.InterfaceC39764a;
import javax.inject.Provider;

/* compiled from: ReviewGalleryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<W1> f255541a;

    /* renamed from: b, reason: collision with root package name */
    public final u f255542b;

    public h(u uVar, Provider provider) {
        this.f255541a = provider;
        this.f255542b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f255541a.get(), (InterfaceC39764a) this.f255542b.get());
    }
}
