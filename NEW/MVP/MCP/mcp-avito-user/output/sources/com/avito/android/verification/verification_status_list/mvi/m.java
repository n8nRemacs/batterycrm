package com.avito.android.verification.verification_status_list.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StatusListReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_status_list.b f325821a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f325822b;

    public m(com.avito.android.verification.verification_status_list.b bVar, Provider provider) {
        this.f325821a = bVar;
        this.f325822b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.verification.verification_status_list.a) this.f325821a.get(), this.f325822b.get());
    }
}
