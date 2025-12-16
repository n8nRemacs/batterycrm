package com.avito.android.loyalty.ui.items.title_text;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TitleTextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final e f183762a;

    /* renamed from: b, reason: collision with root package name */
    public final h f183763b;

    public c(e eVar, h hVar) {
        this.f183762a = eVar;
        this.f183763b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f183762a.getClass();
        return new b(new d(), ((Integer) this.f183763b.get()).intValue());
    }
}
