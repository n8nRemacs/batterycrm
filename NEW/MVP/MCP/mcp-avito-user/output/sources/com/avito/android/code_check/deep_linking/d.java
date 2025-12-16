package com.avito.android.code_check.deep_linking;

import Lo.InterfaceC14420a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CodeCheckLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f118819a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f118820b;

    /* renamed from: c, reason: collision with root package name */
    public final Lo.d f118821c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f118822d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f118823e;

    /* renamed from: f, reason: collision with root package name */
    public final f f118824f;

    public d(dv.b bVar, dv.b bVar2, Lo.d dVar, dv.b bVar3, dv.b bVar4, f fVar) {
        this.f118819a = bVar;
        this.f118820b = bVar2;
        this.f118821c = dVar;
        this.f118822d = bVar3;
        this.f118823e = bVar4;
        this.f118824f = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f118819a.get(), (a.InterfaceC4053a) this.f118820b.get(), (InterfaceC14420a) this.f118821c.get(), (a.i) this.f118822d.get(), (a.g) this.f118823e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f118824f.get());
    }
}
