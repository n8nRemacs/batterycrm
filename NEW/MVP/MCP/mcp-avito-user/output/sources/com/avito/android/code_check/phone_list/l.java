package com.avito.android.code_check.phone_list;

import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.code_check_public.screen.d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneListModule_ProvideInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<d.b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f118984a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PhoneList> f118985b;

    public l(i iVar, Provider<PhoneList> provider) {
        this.f118984a = iVar;
        this.f118985b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        PhoneList phoneList = this.f118985b.get();
        this.f118984a.getClass();
        d.b bVar = phoneList.f119305e;
        dagger.internal.t.d(bVar);
        return bVar;
    }
}
