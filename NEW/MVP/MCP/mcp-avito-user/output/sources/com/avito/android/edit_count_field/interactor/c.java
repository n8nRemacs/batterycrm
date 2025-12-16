package com.avito.android.edit_count_field.interactor;

import com.avito.android.edit_count_field.model.EditCountFieldArguments;
import com.avito.android.remote.D0;
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

/* compiled from: EditCountFieldInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f146612a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<D0> f146613b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f146614c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f146615d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f146616e;

    public c(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f146612a = lVar;
        this.f146613b = provider;
        this.f146614c = provider2;
        this.f146615d = provider3;
        this.f146616e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((EditCountFieldArguments) this.f146612a.f393949a, g.a(w.a(this.f146613b)), g.a(w.a(this.f146614c)), this.f146615d.get(), this.f146616e.get());
    }
}
