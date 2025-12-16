package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34735h;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertItemModule_ProvideAdvertItemDoubleBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30196u implements dagger.internal.h<C34735h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.video_snippet.a> f144598a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144599b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f144600c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.serp.e> f144601d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f144602e;

    public C30196u(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider, Provider provider2) {
        this.f144598a = provider;
        this.f144599b = uVar;
        this.f144600c = uVar2;
        this.f144601d = provider2;
        this.f144602e = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.video_snippet.a aVar = this.f144598a.get();
        com.avito.android.server_time.h hVar = (com.avito.android.server_time.h) this.f144599b.get();
        Locale locale = (Locale) this.f144600c.get();
        com.avito.android.serp.e eVar = this.f144601d.get();
        com.avito.android.video_snippets.g gVar = (com.avito.android.video_snippets.g) this.f144602e.get();
        C30185t c30185t = C30185t.f144582a;
        return new C34735h(aVar, hVar, locale, eVar, gVar);
    }
}
