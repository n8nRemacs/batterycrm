package com.avito.android.messenger;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.messenger.di.R1;
import com.avito.android.persistence.messenger.S0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: DbPurgeInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32521e implements dagger.internal.h<C31691c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w0> f196329a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f196330b;

    /* renamed from: c, reason: collision with root package name */
    public final R1 f196331c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32522f> f196332d;

    /* renamed from: e, reason: collision with root package name */
    public final C30713g1 f196333e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f196334f;

    public C32521e(Provider provider, Provider provider2, R1 r12, Provider provider3, C30713g1 c30713g1, dagger.internal.u uVar) {
        this.f196329a = provider;
        this.f196330b = provider2;
        this.f196331c = r12;
        this.f196332d = provider3;
        this.f196333e = c30713g1;
        this.f196334f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31691c(this.f196329a.get(), this.f196330b.get(), (S0) this.f196331c.get(), this.f196332d.get(), (C30277e1) this.f196333e.get(), (InterfaceC32528l) this.f196334f.get());
    }
}
