package com.avito.android.code_check.phone_list.mvi;

import com.avito.android.code_check_public.screen.PhoneList;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.code_check.d> f118991a;

    /* renamed from: b, reason: collision with root package name */
    public final u f118992b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PhoneList> f118993c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f118991a = provider;
        this.f118992b = uVar;
        this.f118993c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f118991a.get(), (h) this.f118992b.get(), this.f118993c.get());
    }
}
