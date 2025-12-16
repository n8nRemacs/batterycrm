package com.avito.android.mortgage.person_form.list.items.input.compact;

import com.avito.android.mortgage.person_form.list.items.input.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InputCompactBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f200710a;

    public b(f fVar) {
        this.f200710a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.mortgage.person_form.list.items.input.e) this.f200710a.get());
    }
}
