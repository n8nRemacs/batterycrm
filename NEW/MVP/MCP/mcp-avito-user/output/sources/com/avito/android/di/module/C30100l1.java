package com.avito.android.di.module;

import android.content.Context;
import com.avito.android.di.component.InterfaceC29905l;
import com.avito.android.util.InterfaceC35950u;

/* compiled from: AvitoAppBuildInfoModule_ProvideAvitoBuildInfoFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.l1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30100l1 implements dagger.internal.h<InterfaceC35950u> {

    /* renamed from: a, reason: collision with root package name */
    public final C30089k1 f144378a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144379b;

    /* renamed from: c, reason: collision with root package name */
    public final C30102l3 f144380c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f144381d;

    public C30100l1(C30089k1 c30089k1, dagger.internal.l lVar, C30102l3 c30102l3, dagger.internal.l lVar2) {
        this.f144378a = c30089k1;
        this.f144379b = lVar;
        this.f144380c = c30102l3;
        this.f144381d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144379b.f393949a;
        Context context = (Context) this.f144380c.get();
        com.avito.android.configuration.e eVar = (com.avito.android.configuration.e) this.f144381d.f393949a;
        this.f144378a.getClass();
        return interfaceC29905l.m(context, eVar);
    }
}
