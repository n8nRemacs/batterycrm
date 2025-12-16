package com.avito.android.messenger.di;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.di.module.C30102l3;
import com.avito.android.messenger.conversation.adapter.C31915a;

/* compiled from: MessengerModule_ProvideGoogleApiKeyFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.i1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32445i1 implements dagger.internal.h<C31915a> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195800a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f195801b;

    public C32445i1(U0 u02, C30102l3 c30102l3) {
        this.f195800a = u02;
        this.f195801b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f195801b.get();
        this.f195800a.getClass();
        return new C31915a(context.getResources().getString(R.string.google_api_key));
    }
}
