package com.avito.android.beduin.di;

import android.app.Application;
import com.google.android.exoplayer2.source.C36548k;
import com.google.android.exoplayer2.upstream.cache.a;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;
import java.io.File;

/* compiled from: BeduinVideoModule_ProvideDefaultMediaSourceFactory$_avito_beduin_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class W implements dagger.internal.h<C36548k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f103916a;

    public W(dagger.internal.l lVar) {
        this.f103916a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f103916a.f393949a;
        V.f103915a.getClass();
        v.b bVar = new v.b();
        bVar.f348015e = true;
        t.a aVar = new t.a(application, bVar);
        com.google.android.exoplayer2.upstream.cache.q qVar = new com.google.android.exoplayer2.upstream.cache.q(new File(application.getCacheDir(), "exo_cache"), new com.google.android.exoplayer2.upstream.cache.m(94371840L), new com.google.android.exoplayer2.database.f(application));
        a.d dVar = new a.d();
        dVar.f347831a = qVar;
        dVar.f347834d = aVar;
        dVar.f347835e = 2;
        return new C36548k(dVar, new com.google.android.exoplayer2.extractor.g());
    }
}
