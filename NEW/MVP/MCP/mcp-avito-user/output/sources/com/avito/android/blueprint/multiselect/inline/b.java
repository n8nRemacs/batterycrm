package com.avito.android.blueprint.multiselect.inline;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishInlineMultiselectBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f105605a;

    /* renamed from: b, reason: collision with root package name */
    public final u f105606b;

    /* renamed from: c, reason: collision with root package name */
    public final u f105607c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f105605a = provider;
        this.f105606b = uVar;
        this.f105607c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f105605a.get(), (com.avito.android.util.text.a) this.f105606b.get(), (l) this.f105607c.get());
    }
}
