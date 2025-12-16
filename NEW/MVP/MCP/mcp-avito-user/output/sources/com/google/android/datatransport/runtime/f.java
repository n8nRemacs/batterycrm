package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.l;
import com.google.android.datatransport.runtime.w;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes10.dex */
final class f extends w {

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Executor> f343140b = com.google.android.datatransport.runtime.dagger.internal.f.a(l.a.f343167a);

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.dagger.internal.j f343141c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f343142d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.w f343143e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<String> f343144f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.s> f343145g;

    /* renamed from: h, reason: collision with root package name */
    public final FX0.i f343146h;

    /* renamed from: i, reason: collision with root package name */
    public final FX0.d f343147i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.j f343148j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.l f343149k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<v> f343150l;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    public static final class b implements w.a {
        public b() {
        }
    }

    public f(Context context, a aVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        com.google.android.datatransport.runtime.dagger.internal.j jVar = new com.google.android.datatransport.runtime.dagger.internal.j(context);
        this.f343141c = jVar;
        this.f343142d = com.google.android.datatransport.runtime.dagger.internal.f.a(new com.google.android.datatransport.runtime.backends.l(this.f343141c, new com.google.android.datatransport.runtime.backends.j(jVar, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a())));
        this.f343143e = new com.google.android.datatransport.runtime.scheduling.persistence.w(this.f343141c, com.google.android.datatransport.runtime.scheduling.persistence.g.a(), com.google.android.datatransport.runtime.scheduling.persistence.i.a());
        this.f343144f = com.google.android.datatransport.runtime.dagger.internal.f.a(new com.google.android.datatransport.runtime.scheduling.persistence.h(this.f343141c));
        this.f343145g = com.google.android.datatransport.runtime.dagger.internal.f.a(new com.google.android.datatransport.runtime.scheduling.persistence.t(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), com.google.android.datatransport.runtime.scheduling.persistence.j.a(), this.f343143e, this.f343144f));
        FX0.i iVar = new FX0.i(this.f343141c, this.f343145g, new FX0.g(com.google.android.datatransport.runtime.time.e.a()), com.google.android.datatransport.runtime.time.f.a());
        this.f343146h = iVar;
        Provider<Executor> provider = this.f343140b;
        Provider provider2 = this.f343142d;
        Provider<com.google.android.datatransport.runtime.scheduling.persistence.s> provider3 = this.f343145g;
        this.f343147i = new FX0.d(provider, provider2, iVar, provider3, provider3);
        com.google.android.datatransport.runtime.dagger.internal.j jVar2 = this.f343141c;
        com.google.android.datatransport.runtime.time.e eVarA = com.google.android.datatransport.runtime.time.e.a();
        com.google.android.datatransport.runtime.time.f fVarA = com.google.android.datatransport.runtime.time.f.a();
        Provider<com.google.android.datatransport.runtime.scheduling.persistence.s> provider4 = this.f343145g;
        this.f343148j = new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(jVar2, provider2, provider3, iVar, provider, provider3, eVarA, fVarA, provider4);
        this.f343149k = new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(this.f343140b, provider4, this.f343146h, provider4);
        this.f343150l = com.google.android.datatransport.runtime.dagger.internal.f.a(new x(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.f343147i, this.f343148j, this.f343149k));
    }

    @Override // com.google.android.datatransport.runtime.w
    public final com.google.android.datatransport.runtime.scheduling.persistence.d a() {
        return this.f343145g.get();
    }
}
