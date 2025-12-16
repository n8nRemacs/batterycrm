package com.avito.android.code_check.code_confirm;

import android.content.Context;
import com.google.android.gms.internal.p001authapiphone.zzab;

/* compiled from: CodeConfirmModule_ProvideSmsRetrieverFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class y implements dagger.internal.h<com.google.android.gms.auth.api.phone.g> {

    /* renamed from: a, reason: collision with root package name */
    public final r f118805a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f118806b;

    public y(r rVar, dagger.internal.l lVar) {
        this.f118805a = rVar;
        this.f118806b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f118806b.f393949a;
        this.f118805a.getClass();
        return new zzab(context);
    }
}
