package com.avito.android.code_confirmation.code_confirmation.di;

import android.content.IntentFilter;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CodeConfirmationPresentationModule_ProvideCodeReceiverIntentFilter$_avito_code_confirmation_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<IntentFilter> {

    /* compiled from: CodeConfirmationPresentationModule_ProvideCodeReceiverIntentFilter$_avito_code_confirmation_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f119492a = new f();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = e.f119491a;
        return new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
    }
}
