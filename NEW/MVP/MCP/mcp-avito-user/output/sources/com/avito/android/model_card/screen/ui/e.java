package com.avito.android.model_card.screen.ui;

import com.avito.android.model_card.screen.mvi.i;
import com.avito.android.model_card.screen.mvi.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: ModelCardViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f198149a;

    /* renamed from: b, reason: collision with root package name */
    public final j f198150b;

    public e(Provider provider, j jVar) {
        this.f198149a = provider;
        this.f198150b = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f198149a.get(), (i) this.f198150b.get());
    }
}
