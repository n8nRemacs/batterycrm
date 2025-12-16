package com.avito.android.publish.realty_address_submission;

import androidx.view.InterfaceC23487e;
import com.avito.android.Q1;
import com.avito.android.publish.C0;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.C33774n1;
import com.avito.android.publish.details.S0;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RealtyAddressSubmissionViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f239068a;

    /* renamed from: b, reason: collision with root package name */
    public final u f239069b;

    /* renamed from: c, reason: collision with root package name */
    public final u f239070c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<S0> f239071d;

    /* renamed from: e, reason: collision with root package name */
    public final C33774n1 f239072e;

    /* renamed from: f, reason: collision with root package name */
    public final u f239073f;

    /* renamed from: g, reason: collision with root package name */
    public final u f239074g;

    public k(Provider provider, u uVar, u uVar2, Provider provider2, C33774n1 c33774n1, u uVar3, u uVar4) {
        this.f239068a = provider;
        this.f239069b = uVar;
        this.f239070c = uVar2;
        this.f239071d = provider2;
        this.f239072e = c33774n1;
        this.f239073f = uVar3;
        this.f239074g = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f239068a.get(), (H0) this.f239069b.get(), (C0) this.f239070c.get(), this.f239071d.get(), (C33771m1) this.f239072e.get(), (Q1) this.f239073f.get(), (InterfaceC35745a5) this.f239074g.get());
    }
}
