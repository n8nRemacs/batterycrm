package com.avito.android.publish.slots.information_with_user_id.item;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InformationWithUserIdBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f244337a;

    /* renamed from: b, reason: collision with root package name */
    public final u f244338b;

    public b(e eVar, u uVar) {
        this.f244337a = eVar;
        this.f244338b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f244337a.getClass();
        return new a(new d(), (com.avito.android.util.text.a) this.f244338b.get());
    }
}
