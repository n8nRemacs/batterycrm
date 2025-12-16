package com.avito.android.profile_phones.confirm_phone.di;

import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.profile_phones.confirm_phone.l;
import com.avito.android.profile_phones.confirm_phone.m;
import com.avito.android.profile_phones.confirm_phone.n;
import com.avito.android.profile_phones.confirm_phone.o;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmPhoneModule_ProvideConfirmPhoneViewModel$_avito_profile_phones_impl_verificationFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final c f227007a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f227008b;

    /* renamed from: c, reason: collision with root package name */
    public final n f227009c;

    public d(c cVar, dagger.internal.l lVar, n nVar) {
        this.f227007a = cVar;
        this.f227008b = lVar;
        this.f227009c = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        S0 s02 = (S0) this.f227008b.f393949a;
        m mVar = (m) this.f227009c.get();
        this.f227007a.getClass();
        return (l) new P0(s02, mVar, null, 4, null).a(o.class);
    }
}
