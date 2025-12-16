package com.avito.android.rating_form.item.multiLineInput;

import Kh0.C14315a;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiLineInputItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f248471a;

    /* renamed from: b, reason: collision with root package name */
    public final u f248472b;

    /* renamed from: c, reason: collision with root package name */
    public final l f248473c;

    public c(l lVar, u uVar, Provider provider) {
        this.f248471a = provider;
        this.f248472b = uVar;
        this.f248473c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f248471a.get(), (C14315a) this.f248472b.get(), ((Boolean) this.f248473c.f393949a).booleanValue());
    }
}
