package com.avito.android.comfortable_deal.phone_call.mvi;

import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneCallReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.phone_call.mvi.builder.c f122520a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.phone_call.di.c f122521b;

    public m(com.avito.android.comfortable_deal.phone_call.mvi.builder.c cVar, com.avito.android.comfortable_deal.phone_call.di.c cVar2) {
        this.f122520a = cVar;
        this.f122521b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.comfortable_deal.phone_call.mvi.builder.a) this.f122520a.get(), (InterfaceC35945t1) this.f122521b.get());
    }
}
