package com.avito.android.compose_items.chips_multiselect;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChipsMultiselectComposeItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f125365a;

    /* renamed from: b, reason: collision with root package name */
    public final u f125366b;

    public b(u uVar, Provider provider) {
        this.f125365a = provider;
        this.f125366b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f125365a.get(), (com.avito.android.util.text.a) this.f125366b.get());
    }
}
