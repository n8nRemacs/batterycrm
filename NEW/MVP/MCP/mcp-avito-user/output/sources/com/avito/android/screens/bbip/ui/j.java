package com.avito.android.screens.bbip.ui;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import ih.InterfaceC41399a;
import javax.inject.Provider;
import np0.C44463c;
import np0.InterfaceC44461a;

/* compiled from: BbipInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41399a> f260400a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f260401b;

    /* renamed from: c, reason: collision with root package name */
    public final C44463c f260402c;

    public j(Provider provider, Provider provider2, C44463c c44463c) {
        this.f260400a = provider;
        this.f260401b = provider2;
        this.f260402c = c44463c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(dagger.internal.g.a(w.a(this.f260400a)), this.f260401b.get(), (InterfaceC44461a) this.f260402c.get());
    }
}
