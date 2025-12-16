package com.avito.android.wallet.page.topup.form.items.shortcut_section;

import com.avito.android.wallet.page.topup.form.di.v;
import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShortcutSectionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f328333a;

    /* renamed from: b, reason: collision with root package name */
    public final v f328334b;

    public b(f fVar, v vVar) {
        this.f328333a = fVar;
        this.f328334b = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f328333a.get(), (j) this.f328334b.get());
    }
}
