package com.avito.android.di.module;

import com.avito.android.C36135w2;
import com.avito.android.serp.adapter.C34688b0;
import com.avito.android.serp.adapter.InterfaceC34680a0;

/* compiled from: SerpItemConverterModule_ProvideFiltersTabsConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.p8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30151p8 implements dagger.internal.h<InterfaceC34680a0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144529a;

    public C30151p8(dagger.internal.u uVar) {
        this.f144529a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C36135w2 c36135w2 = (C36135w2) this.f144529a.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new C34688b0(c36135w2);
    }
}
