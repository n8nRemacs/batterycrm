package com.avito.android.code_confirmation.code_confirmation.di;

import android.app.Activity;
import com.google.android.gms.internal.p001authapiphone.zzab;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CodeConfirmationPresentationModule_ProvideSmsRetrieverClient$_avito_code_confirmation_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<com.google.android.gms.auth.api.phone.f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f119493a;

    public g(l lVar) {
        this.f119493a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Activity activity = (Activity) this.f119493a.f393949a;
        int i12 = e.f119491a;
        return new zzab(activity);
    }
}
