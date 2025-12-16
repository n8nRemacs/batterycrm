package com.avito.android.seller_coach.hints_dialog.vm;

import Hq0.InterfaceC14019a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HintDialogViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f267607a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f267608b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f267609c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f267607a = uVar;
        this.f267608b = provider;
        this.f267609c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC14019a) this.f267607a.get(), this.f267608b.get(), this.f267609c.get());
    }
}
