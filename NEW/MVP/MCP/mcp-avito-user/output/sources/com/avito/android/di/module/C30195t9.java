package com.avito.android.di.module;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: ServerTimeModule_ProvideServerTimeSource$_common_server_time_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.t9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30195t9 implements dagger.internal.h<com.avito.android.server_time.f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f144595a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.d> f144596b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f144597c;

    public C30195t9(C30102l3 c30102l3, dagger.internal.u uVar, Provider provider) {
        this.f144595a = c30102l3;
        this.f144596b = provider;
        this.f144597c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f144595a.get();
        com.avito.android.server_time.d dVar = this.f144596b.get();
        com.avito.android.server_time.a aVar = (com.avito.android.server_time.a) this.f144597c.get();
        C30163q9.f144550a.getClass();
        return new com.avito.android.server_time.g(context, dVar, aVar);
    }
}
