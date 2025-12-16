package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods;

import com.avito.android.account.E;
import com.avito.android.analytics.H;
import com.avito.android.iac_outgoing_call_ability.impl_module.can_call.g;
import com.avito.android.iac_outgoing_call_ability.impl_module.can_call.k;
import com.avito.android.permissions.w;
import com.avito.android.remote.InterfaceC34241a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;
import lD.C43619c;
import vN.C49237a;
import vN.C49239c;

/* compiled from: CallMethodsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34241a> f168500a;

    /* renamed from: b, reason: collision with root package name */
    public final u f168501b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168502c;

    /* renamed from: d, reason: collision with root package name */
    public final C49239c f168503d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f168504e;

    /* renamed from: f, reason: collision with root package name */
    public final w f168505f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<H> f168506g;

    /* renamed from: h, reason: collision with root package name */
    public final C43619c f168507h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<g> f168508i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<k> f168509j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.iac_outgoing_call_ability.impl_module.utils.a> f168510k;

    public e(Provider provider, u uVar, Provider provider2, C49239c c49239c, Provider provider3, w wVar, Provider provider4, C43619c c43619c, Provider provider5, Provider provider6, Provider provider7) {
        this.f168500a = provider;
        this.f168501b = uVar;
        this.f168502c = provider2;
        this.f168503d = c49239c;
        this.f168504e = provider3;
        this.f168505f = wVar;
        this.f168506g = provider4;
        this.f168507h = c43619c;
        this.f168508i = provider5;
        this.f168509j = provider6;
        this.f168510k = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f168500a), (XL.a) this.f168501b.get(), this.f168502c.get(), (C49237a) this.f168503d.get(), this.f168504e.get(), (com.avito.android.permissions.u) this.f168505f.get(), this.f168506g.get(), (C43617a) this.f168507h.get(), this.f168508i.get(), this.f168509j.get(), this.f168510k.get());
    }
}
