package com.avito.android.di.component;

import Kg.InterfaceC14312a;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: AvlEntryModule_ProvideShortVideosWidgetStateProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.component.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29901h implements dagger.internal.h<InterfaceC14312a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Kg.b> f139299a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f139300b;

    public C29901h(dagger.internal.l lVar, Provider provider) {
        this.f139299a = provider;
        this.f139300b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Kg.b bVar = this.f139299a.get();
        Kundle kundle = (Kundle) this.f139300b.f393949a;
        C29898e.f139289a.getClass();
        return bVar.a(kundle);
    }
}
