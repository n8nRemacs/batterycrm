package com.avito.android.search.filter.adapter.action_with_placeholders;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: ActionWithPlaceholdersItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f261952a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f261953b;

    public c(u uVar, Provider provider) {
        this.f261952a = uVar;
        this.f261953b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f261952a.get(), this.f261953b.get());
    }
}
