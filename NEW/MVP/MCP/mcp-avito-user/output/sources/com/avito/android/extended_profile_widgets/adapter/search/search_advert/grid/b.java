package com.avito.android.extended_profile_widgets.adapter.search.search_advert.grid;

import com.avito.android.video_snippets.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: SearchAdvertGridItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f154697a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f154698b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f154699c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<g> f154700d;

    public b(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f154697a = uVar;
        this.f154698b = provider;
        this.f154699c = provider2;
        this.f154700d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f154697a.get(), this.f154698b.get(), this.f154699c.get(), this.f154700d.get());
    }
}
