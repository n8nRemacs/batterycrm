package com.avito.android.credman;

import android.content.Context;
import androidx.credentials.InterfaceC22858k;
import com.avito.android.di.module.C30102l3;

/* compiled from: CredmanLoaderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final b f129095a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f129096b;

    public h(b bVar, C30102l3 c30102l3) {
        this.f129095a = bVar;
        this.f129096b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC22858k) this.f129095a.get(), (Context) this.f129096b.get());
    }
}
