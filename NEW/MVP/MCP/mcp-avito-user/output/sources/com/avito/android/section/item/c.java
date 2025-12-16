package com.avito.android.section.item;

import com.avito.android.serp.adapter.InterfaceC34748n0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ComplementaryAdvertItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34748n0> f264712a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f264713b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f264714c;

    /* renamed from: d, reason: collision with root package name */
    public final u f264715d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f264716e;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f264712a = provider;
        this.f264713b = provider2;
        this.f264714c = provider3;
        this.f264715d = uVar;
        this.f264716e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f264712a.get(), this.f264713b.get(), this.f264714c.get(), (s) this.f264715d.get(), this.f264716e.get());
    }
}
