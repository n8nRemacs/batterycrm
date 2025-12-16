package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34741k;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertItemModule_ProvideAdvertItemGridBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30207v implements dagger.internal.h<C34741k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144623a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144624b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f144625c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f144626d;

    public C30207v(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f144623a = uVar;
        this.f144624b = provider;
        this.f144625c = provider2;
        this.f144626d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.video_snippet.a aVar = (com.avito.android.serp.adapter.video_snippet.a) this.f144623a.get();
        com.avito.android.server_time.h hVar = this.f144624b.get();
        Locale locale = this.f144625c.get();
        com.avito.android.video_snippets.g gVar = this.f144626d.get();
        C30185t c30185t = C30185t.f144582a;
        return new C34741k(aVar, hVar, locale, gVar);
    }
}
