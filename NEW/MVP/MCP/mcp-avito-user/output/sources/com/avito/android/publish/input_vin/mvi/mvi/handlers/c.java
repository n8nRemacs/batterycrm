package com.avito.android.publish.input_vin.mvi.mvi.handlers;

import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.input_vin.mvi.A;
import com.avito.android.publish.input_vin.mvi.mvi.p;
import com.avito.android.publish.input_vin.mvi.mvi.q;
import com.avito.android.publish.input_vin.mvi.z;
import com.avito.android.util.R0;
import com.avito.android.validation.l1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import me0.C44072a;
import me0.C44073b;

/* compiled from: PublishButtonClickHandler_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f236691a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l1> f236692b;

    /* renamed from: c, reason: collision with root package name */
    public final l f236693c;

    /* renamed from: d, reason: collision with root package name */
    public final q f236694d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f236695e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f236696f;

    /* renamed from: g, reason: collision with root package name */
    public final C44073b f236697g;

    /* renamed from: h, reason: collision with root package name */
    public final A f236698h;

    public c(Provider provider, Provider provider2, l lVar, q qVar, Provider provider3, Provider provider4, C44073b c44073b, A a12) {
        this.f236691a = provider;
        this.f236692b = provider2;
        this.f236693c = lVar;
        this.f236694d = qVar;
        this.f236695e = provider3;
        this.f236696f = provider4;
        this.f236697g = c44073b;
        this.f236698h = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f236691a.get(), this.f236692b.get(), ((Integer) this.f236693c.f393949a).intValue(), (p) this.f236694d.get(), this.f236695e.get(), this.f236696f.get(), (C44072a) this.f236697g.get(), (z) this.f236698h.get());
    }
}
