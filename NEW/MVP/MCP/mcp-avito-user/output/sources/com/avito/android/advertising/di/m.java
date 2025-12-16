package com.avito.android.advertising.di;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.google.android.exoplayer2.source.H;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.cache.a;
import com.google.android.exoplayer2.upstream.v;
import java.io.File;

/* compiled from: AdvServiceModule_CommercialMediaSourceFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<y.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f87813a;

    public m(C30102l3 c30102l3) {
        this.f87813a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f87813a.get();
        k.f87812a.getClass();
        com.google.android.exoplayer2.upstream.cache.q qVar = new com.google.android.exoplayer2.upstream.cache.q(new File(context.getCacheDir(), "adv_media"), new com.google.android.exoplayer2.upstream.cache.m(31457280L), new com.google.android.exoplayer2.database.f(context));
        v.b bVar = new v.b();
        a.d dVar = new a.d();
        dVar.f347831a = qVar;
        dVar.f347835e = 2;
        dVar.f347834d = bVar;
        return new H.b(dVar);
    }
}
