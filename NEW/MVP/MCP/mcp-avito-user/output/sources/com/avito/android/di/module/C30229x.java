package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34749o;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertItemModule_ProvideAdvertItemGridRedesignNoCardBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30229x implements dagger.internal.h<C34749o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.video_snippet.a> f144697a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144698b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f144699c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f144700d;

    public C30229x(Provider<com.avito.android.serp.adapter.video_snippet.a> provider, Provider<com.avito.android.server_time.h> provider2, Provider<Locale> provider3, Provider<com.avito.android.video_snippets.g> provider4) {
        this.f144697a = provider;
        this.f144698b = provider2;
        this.f144699c = provider3;
        this.f144700d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.video_snippet.a aVar = this.f144697a.get();
        com.avito.android.server_time.h hVar = this.f144698b.get();
        Locale locale = this.f144699c.get();
        com.avito.android.video_snippets.g gVar = this.f144700d.get();
        C30185t c30185t = C30185t.f144582a;
        return new C34749o(aVar, hVar, locale, gVar);
    }
}
