package com.avito.android.advert_core.short_term_rent;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertStrBlockInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f84353a;

    /* renamed from: b, reason: collision with root package name */
    public final u f84354b;

    /* renamed from: c, reason: collision with root package name */
    public final u f84355c;

    /* renamed from: d, reason: collision with root package name */
    public final u f84356d;

    public k(dagger.internal.h hVar, u uVar, u uVar2, u uVar3) {
        this.f84353a = hVar;
        this.f84354b = uVar;
        this.f84355c = uVar2;
        this.f84356d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f84353a.get();
        h31.e eVarA = dagger.internal.g.a(w.a(this.f84354b));
        return new j((com.avito.android.remote.error.f) this.f84356d.get(), (InterfaceC35745a5) this.f84355c.get(), eVarA, str);
    }
}
