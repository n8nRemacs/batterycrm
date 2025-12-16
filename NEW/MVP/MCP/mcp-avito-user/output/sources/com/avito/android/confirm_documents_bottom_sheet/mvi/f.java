package com.avito.android.confirm_documents_bottom_sheet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmDocumentsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f125620a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.confirm_documents_bottom_sheet.domain.a> f125621b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f125622c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<SK0.b> f125623d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f125624e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f125625f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f125626g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f125627h;

    public f(Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f125620a = provider;
        this.f125621b = provider2;
        this.f125622c = provider3;
        this.f125623d = provider4;
        this.f125624e = lVar;
        this.f125625f = lVar2;
        this.f125626g = lVar3;
        this.f125627h = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f125620a.get(), this.f125621b.get(), this.f125622c.get(), this.f125623d.get(), (String) this.f125624e.f393949a, (String) this.f125625f.f393949a, (String) this.f125626g.f393949a, (String) this.f125627h.f393949a);
    }
}
