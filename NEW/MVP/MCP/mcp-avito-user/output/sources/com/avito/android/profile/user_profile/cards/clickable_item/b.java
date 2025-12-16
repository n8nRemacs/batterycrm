package com.avito.android.profile.user_profile.cards.clickable_item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClickableItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f224872a;

    public b(e eVar) {
        this.f224872a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f224872a.get());
    }
}
