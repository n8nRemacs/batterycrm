package com.avito.android.blueprints.publish.multiselect.inline;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishInlineMultiselectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f106368a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106369b;

    public b(u uVar, Provider provider) {
        this.f106368a = provider;
        this.f106369b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106368a.get(), (l) this.f106369b.get());
    }
}
