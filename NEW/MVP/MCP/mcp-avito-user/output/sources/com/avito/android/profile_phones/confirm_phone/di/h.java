package com.avito.android.profile_phones.confirm_phone.di;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.google.android.gms.internal.p001authapiphone.zzab;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SmsRetrieverModule_ProvideSmsRetrieverClientFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.google.android.gms.auth.api.phone.f> {

    /* renamed from: a, reason: collision with root package name */
    public final g f227029a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f227030b;

    public h(g gVar, C30102l3 c30102l3) {
        this.f227029a = gVar;
        this.f227030b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f227030b.get();
        this.f227029a.getClass();
        return new zzab(context);
    }
}
