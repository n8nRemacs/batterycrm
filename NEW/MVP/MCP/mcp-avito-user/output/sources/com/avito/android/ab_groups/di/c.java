package com.avito.android.ab_groups.di;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.ab_groups.q;
import com.avito.android.ab_groups.v;
import com.avito.android.ab_groups.w;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AbExperimentsActivityModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final b f67655a;

    /* renamed from: b, reason: collision with root package name */
    public final l f67656b;

    /* renamed from: c, reason: collision with root package name */
    public final w f67657c;

    public c(b bVar, l lVar, w wVar) {
        this.f67655a = bVar;
        this.f67656b = lVar;
        this.f67657c = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f67656b.f393949a;
        v vVar = (v) this.f67657c.get();
        this.f67655a.getClass();
        return (q) new P0(t02, vVar).a(q.class);
    }
}
