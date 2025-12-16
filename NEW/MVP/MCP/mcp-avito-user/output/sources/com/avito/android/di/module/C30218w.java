package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34745m;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertItemModule_ProvideAdvertItemGridRedesignBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30218w implements dagger.internal.h<C34745m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.video_snippet.a> f144685a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144686b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f144687c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f144688d;

    public C30218w(Provider<com.avito.android.serp.adapter.video_snippet.a> provider, Provider<com.avito.android.server_time.h> provider2, Provider<Locale> provider3, Provider<com.avito.android.video_snippets.g> provider4) {
        this.f144685a = provider;
        this.f144686b = provider2;
        this.f144687c = provider3;
        this.f144688d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.video_snippet.a aVar = this.f144685a.get();
        com.avito.android.server_time.h hVar = this.f144686b.get();
        Locale locale = this.f144687c.get();
        com.avito.android.video_snippets.g gVar = this.f144688d.get();
        C30185t c30185t = C30185t.f144582a;
        return new C34745m(aVar, hVar, locale, gVar);
    }
}
