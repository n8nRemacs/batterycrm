package com.avito.android.extended_profile_selection_create.select.adapter.advert;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: SelectionAdvertItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f152048a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f152049b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f152050c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f152048a = uVar;
        this.f152049b = provider;
        this.f152050c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f152048a.get(), this.f152049b.get(), this.f152050c.get());
    }
}
