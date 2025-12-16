package com.avito.android.bxcontent;

import com.avito.android.bxcontent.C28969d;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import gj.InterfaceC40691b;
import iT.C41343c;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: BxContentCombinationViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29241p implements dagger.internal.h<C29235n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f112808a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f112809b;

    /* renamed from: c, reason: collision with root package name */
    public final C31144q0 f112810c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f112811d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f112812e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f112813f;

    public C29241p(Provider provider, Provider provider2, C31144q0 c31144q0, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar) {
        this.f112808a = provider;
        this.f112809b = provider2;
        this.f112810c = c31144q0;
        this.f112811d = lVar;
        this.f112812e = lVar2;
        this.f112813f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C29235n(this.f112808a.get(), this.f112809b.get(), (aU0.b) this.f112810c.get(), (C41343c) this.f112811d.f393949a, (C28969d.a) this.f112812e.f393949a, (com.avito.android.advertising.loaders.beduin.H) this.f112813f.get());
    }
}
