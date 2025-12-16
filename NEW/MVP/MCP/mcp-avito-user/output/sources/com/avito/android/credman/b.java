package com.avito.android.credman;

import android.content.Context;
import androidx.credentials.C22873w;
import androidx.credentials.InterfaceC22858k;
import com.avito.android.di.module.C30102l3;

/* compiled from: CredmanBindingModule_ProvideCredentialsManagerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<InterfaceC22858k> {

    /* renamed from: a, reason: collision with root package name */
    public final a f129080a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f129081b;

    public b(a aVar, C30102l3 c30102l3) {
        this.f129080a = aVar;
        this.f129081b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f129081b.get();
        this.f129080a.getClass();
        InterfaceC22858k.f45223a.getClass();
        return new C22873w(context);
    }
}
