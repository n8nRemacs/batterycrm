package com.avito.android.photo_list_view_groups.blueprint;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PhotoItemGroupsBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f218496a;

    /* renamed from: b, reason: collision with root package name */
    public final u f218497b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_list_view_groups.h> f218498c;

    /* renamed from: d, reason: collision with root package name */
    public final u f218499d;

    /* renamed from: e, reason: collision with root package name */
    public final u f218500e;

    public c(u uVar, u uVar2, u uVar3, u uVar4, Provider provider) {
        this.f218496a = uVar;
        this.f218497b = uVar2;
        this.f218498c = provider;
        this.f218499d = uVar3;
        this.f218500e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f218496a.get(), (R0) this.f218497b.get(), this.f218498c.get(), (g80.d) this.f218499d.get(), (l) this.f218500e.get());
    }
}
