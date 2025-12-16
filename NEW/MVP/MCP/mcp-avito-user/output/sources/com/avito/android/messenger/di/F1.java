package com.avito.android.messenger.di;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.di.module.C30102l3;

/* compiled from: MessengerModule_ProvideYandexApiKeyFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class F1 implements dagger.internal.h<com.avito.android.messenger.conversation.adapter.C> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195629a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f195630b;

    public F1(U0 u02, C30102l3 c30102l3) {
        this.f195629a = u02;
        this.f195630b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f195630b.get();
        this.f195629a.getClass();
        return new com.avito.android.messenger.conversation.adapter.C(context.getResources().getString(R.string.yandex_api_key));
    }
}
