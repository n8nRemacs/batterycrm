package com.avito.android.extended_profile_ui_components.search_input.suggest;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSuggestInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f153445a;

    /* renamed from: b, reason: collision with root package name */
    public final u f153446b;

    public d(u uVar, u uVar2) {
        this.f153445a = uVar;
        this.f153446b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((R0) this.f153446b.get(), dagger.internal.g.a(w.a(this.f153445a)));
    }
}
