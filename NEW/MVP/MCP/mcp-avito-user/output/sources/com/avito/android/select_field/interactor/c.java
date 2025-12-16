package com.avito.android.select_field.interactor;

import com.avito.android.remote.D0;
import com.avito.android.select_field.model.SelectFieldArguments;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectFieldInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f267166a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<D0> f267167b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f267168c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f267169d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f267170e;

    public c(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f267166a = lVar;
        this.f267167b = provider;
        this.f267168c = provider2;
        this.f267169d = provider3;
        this.f267170e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((SelectFieldArguments) this.f267166a.f393949a, g.a(w.a(this.f267167b)), g.a(w.a(this.f267168c)), this.f267169d.get(), this.f267170e.get());
    }
}
