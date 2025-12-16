package com.avito.android.publish.screen.objects.domain;

import com.avito.android.publish.screen.objects.domain.usecase.m;
import com.avito.android.publish.screen.objects.domain.usecase.n;
import com.avito.android.publish.screen.objects.domain.usecase.o;
import com.avito.android.publish.screen.objects.domain.usecase.p;
import com.avito.android.publish.screen.objects.domain.usecase.q;
import com.avito.android.publish.screen.objects.domain.usecase.r;
import com.avito.android.publish.screen.objects.domain.usecase.s;
import com.avito.android.publish.screen.objects.domain.usecase.t;
import com.avito.android.publish.screen.objects.domain.usecase.u;
import com.avito.android.publish.screen.objects.domain.usecase.v;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ObjectFillFormInteractorAsyncImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final n f239962a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.screen.objects.domain.usecase.b f239963b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.publish.screen.objects.domain.usecase.h f239964c;

    /* renamed from: d, reason: collision with root package name */
    public final p f239965d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.publish.screen.objects.domain.usecase.d f239966e;

    /* renamed from: f, reason: collision with root package name */
    public final v f239967f;

    /* renamed from: g, reason: collision with root package name */
    public final t f239968g;

    /* renamed from: h, reason: collision with root package name */
    public final r f239969h;

    public c(n nVar, com.avito.android.publish.screen.objects.domain.usecase.b bVar, com.avito.android.publish.screen.objects.domain.usecase.h hVar, p pVar, com.avito.android.publish.screen.objects.domain.usecase.d dVar, v vVar, t tVar, r rVar) {
        this.f239962a = nVar;
        this.f239963b = bVar;
        this.f239964c = hVar;
        this.f239965d = pVar;
        this.f239966e = dVar;
        this.f239967f = vVar;
        this.f239968g = tVar;
        this.f239969h = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((m) this.f239962a.get(), (com.avito.android.publish.screen.objects.domain.usecase.a) this.f239963b.get(), (com.avito.android.publish.screen.objects.domain.usecase.e) this.f239964c.get(), (o) this.f239965d.get(), (com.avito.android.publish.screen.objects.domain.usecase.c) this.f239966e.get(), (u) this.f239967f.get(), (s) this.f239968g.get(), (q) this.f239969h.get());
    }
}
