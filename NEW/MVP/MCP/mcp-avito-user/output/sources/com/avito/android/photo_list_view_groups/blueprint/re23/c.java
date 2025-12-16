package com.avito.android.photo_list_view_groups.blueprint.re23;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PhotoItemGroupsRe23BlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f218522a;

    /* renamed from: b, reason: collision with root package name */
    public final u f218523b;

    /* renamed from: c, reason: collision with root package name */
    public final u f218524c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.photo_list_view_groups.h> f218525d;

    /* renamed from: e, reason: collision with root package name */
    public final u f218526e;

    /* renamed from: f, reason: collision with root package name */
    public final u f218527f;

    public c(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, Provider provider) {
        this.f218522a = uVar;
        this.f218523b = uVar2;
        this.f218524c = uVar3;
        this.f218525d = provider;
        this.f218526e = uVar4;
        this.f218527f = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f218522a.get(), (com.avito.android.util.text.a) this.f218523b.get(), (R0) this.f218524c.get(), this.f218525d.get(), (g80.d) this.f218526e.get(), (l) this.f218527f.get());
    }
}
