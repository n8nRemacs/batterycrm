package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34753q;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertItemModule_ProvideAdvertItemGridRedesignRoundedImageBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30240y implements dagger.internal.h<C34753q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.video_snippet.a> f144709a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144710b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f144711c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f144712d;

    public C30240y(Provider<com.avito.android.serp.adapter.video_snippet.a> provider, Provider<com.avito.android.server_time.h> provider2, Provider<Locale> provider3, Provider<com.avito.android.video_snippets.g> provider4) {
        this.f144709a = provider;
        this.f144710b = provider2;
        this.f144711c = provider3;
        this.f144712d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.video_snippet.a aVar = this.f144709a.get();
        com.avito.android.server_time.h hVar = this.f144710b.get();
        Locale locale = this.f144711c.get();
        com.avito.android.video_snippets.g gVar = this.f144712d.get();
        C30185t c30185t = C30185t.f144582a;
        return new C34753q(aVar, hVar, locale, gVar);
    }
}
