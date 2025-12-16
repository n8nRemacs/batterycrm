package com.avito.android.publish.items.atributed_text;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishAttributedTextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f236774a;

    /* renamed from: b, reason: collision with root package name */
    public final u f236775b;

    public b(u uVar, Provider provider) {
        this.f236774a = provider;
        this.f236775b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f236774a.get(), (com.avito.android.util.text.a) this.f236775b.get());
    }
}
