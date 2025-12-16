package com.avito.android.recall_me.presentation;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;

/* compiled from: RecallMeDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.recall_me.presentation.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34235e implements dagger.internal.h<C34234d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f251924a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f251925b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f251926c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f251927d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.recall_me.domain.e f251928e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.recall_me.splitter.features.d f251929f;

    public C34235e(C30102l3 c30102l3, dv.b bVar, dv.b bVar2, dv.b bVar3, com.avito.android.recall_me.domain.e eVar, com.avito.android.recall_me.splitter.features.d dVar) {
        this.f251924a = c30102l3;
        this.f251925b = bVar;
        this.f251926c = bVar2;
        this.f251927d = bVar3;
        this.f251928e = eVar;
        this.f251929f = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34234d((Context) this.f251924a.get(), (a.b) this.f251925b.get(), (a.InterfaceC4053a) this.f251926c.get(), (a.i) this.f251927d.get(), (com.avito.android.recall_me.domain.c) this.f251928e.get(), (com.avito.android.recall_me.splitter.features.a) this.f251929f.get());
    }
}
