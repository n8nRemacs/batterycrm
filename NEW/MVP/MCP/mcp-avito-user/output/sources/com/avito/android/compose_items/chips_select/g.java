package com.avito.android.compose_items.chips_select;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChipsSelectComposeItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f125394a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f125395b;

    /* renamed from: c, reason: collision with root package name */
    public final u f125396c;

    public g(u uVar, u uVar2, Provider provider) {
        this.f125394a = uVar;
        this.f125395b = provider;
        this.f125396c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.util.text.a) this.f125394a.get(), this.f125395b.get(), (Q1) this.f125396c.get());
    }
}
