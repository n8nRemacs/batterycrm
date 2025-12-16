package com.avito.android.credman;

import android.content.Context;
import androidx.credentials.InterfaceC22858k;
import com.avito.android.di.module.C30102l3;

/* compiled from: CredmanSaverImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final b f129111a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f129112b;

    public r(b bVar, C30102l3 c30102l3) {
        this.f129111a = bVar;
        this.f129112b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((InterfaceC22858k) this.f129111a.get(), (Context) this.f129112b.get());
    }
}
