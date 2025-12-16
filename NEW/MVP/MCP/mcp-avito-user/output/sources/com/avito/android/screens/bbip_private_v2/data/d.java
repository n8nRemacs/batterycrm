package com.avito.android.screens.bbip_private_v2.data;

import com.google.gson.Gson;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BbipPrivateV2MapperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f260883a;

    /* renamed from: b, reason: collision with root package name */
    public final l f260884b;

    /* renamed from: c, reason: collision with root package name */
    public final l f260885c;

    public d(l lVar, l lVar2, Provider provider) {
        this.f260883a = provider;
        this.f260884b = lVar;
        this.f260885c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f260883a.get(), (String) this.f260884b.f393949a, (String) this.f260885c.f393949a);
    }
}
