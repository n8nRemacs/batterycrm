package com.avito.android.publish.details.auto_description;

import androidx.view.InterfaceC23487e;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.V0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.android.validation.InterfaceC36026p;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: AutoDescriptionViewModelDelegateFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f233542a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<V0> f233543b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<S0> f233544c;

    /* renamed from: d, reason: collision with root package name */
    public final u f233545d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f233546e;

    /* renamed from: f, reason: collision with root package name */
    public final u f233547f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC36026p> f233548g;

    /* renamed from: h, reason: collision with root package name */
    public final u f233549h;

    /* renamed from: i, reason: collision with root package name */
    public final u f233550i;

    public i(u uVar, u uVar2, u uVar3, u uVar4, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f233542a = provider;
        this.f233543b = provider2;
        this.f233544c = provider3;
        this.f233545d = uVar;
        this.f233546e = provider4;
        this.f233547f = uVar2;
        this.f233548g = provider5;
        this.f233549h = uVar3;
        this.f233550i = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f233542a.get(), this.f233543b.get(), this.f233544c.get(), (InterfaceC33535v) this.f233545d.get(), this.f233546e.get(), (InterfaceC35745a5) this.f233547f.get(), this.f233548g.get(), (C50213a) this.f233549h.get(), (R0) this.f233550i.get());
    }
}
