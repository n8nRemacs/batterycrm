package com.avito.android.auto_evidence_request.files;

import com.avito.android.account.G;
import com.avito.android.photo_picker.b0;
import com.avito.android.remote.K;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoEvidenceRequestFilesInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f95168a;

    /* renamed from: b, reason: collision with root package name */
    public final l f95169b;

    /* renamed from: c, reason: collision with root package name */
    public final l f95170c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<b0> f95171d;

    /* renamed from: e, reason: collision with root package name */
    public final u f95172e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f95173f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<K> f95174g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f95175h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<G> f95176i;

    public k(l lVar, l lVar2, l lVar3, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f95168a = lVar;
        this.f95169b = lVar2;
        this.f95170c = lVar3;
        this.f95171d = provider;
        this.f95172e = uVar;
        this.f95173f = provider2;
        this.f95174g = provider3;
        this.f95175h = provider4;
        this.f95176i = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((String) this.f95168a.f393949a, (String) this.f95169b.f393949a, (String) this.f95170c.f393949a, this.f95171d.get(), (com.avito.android.photo_cache.j) this.f95172e.get(), this.f95173f.get(), this.f95174g.get(), this.f95175h.get(), this.f95176i.get());
    }
}
