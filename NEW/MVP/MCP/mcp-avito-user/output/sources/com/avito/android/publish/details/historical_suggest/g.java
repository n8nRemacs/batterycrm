package com.avito.android.publish.details.historical_suggest;

import androidx.view.InterfaceC23487e;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.C33774n1;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.S0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nF.C44245a;

/* compiled from: HistoricalSuggestViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f234667a;

    /* renamed from: b, reason: collision with root package name */
    public final u f234668b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<S0> f234669c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f234670d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<i> f234671e;

    /* renamed from: f, reason: collision with root package name */
    public final u f234672f;

    /* renamed from: g, reason: collision with root package name */
    public final C33774n1 f234673g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<b> f234674h;

    /* renamed from: i, reason: collision with root package name */
    public final u f234675i;

    /* renamed from: j, reason: collision with root package name */
    public final u f234676j;

    public g(Provider provider, u uVar, Provider provider2, Provider provider3, Provider provider4, u uVar2, C33774n1 c33774n1, Provider provider5, u uVar3, u uVar4) {
        this.f234667a = provider;
        this.f234668b = uVar;
        this.f234669c = provider2;
        this.f234670d = provider3;
        this.f234671e = provider4;
        this.f234672f = uVar2;
        this.f234673g = c33774n1;
        this.f234674h = provider5;
        this.f234675i = uVar3;
        this.f234676j = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f234667a.get(), (C0) this.f234668b.get(), this.f234669c.get(), this.f234670d.get(), this.f234671e.get(), (InterfaceC33535v) this.f234672f.get(), (C33771m1) this.f234673g.get(), this.f234674h.get(), (InterfaceC35745a5) this.f234675i.get(), (C44245a) this.f234676j.get());
    }
}
