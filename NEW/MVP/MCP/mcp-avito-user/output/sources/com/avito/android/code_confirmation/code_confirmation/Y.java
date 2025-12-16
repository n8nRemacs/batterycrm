package com.avito.android.code_confirmation.code_confirmation;

import android.content.res.Resources;
import com.avito.android.util.S3;

/* compiled from: CodeConfirmationResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f119482a;

    /* renamed from: b, reason: collision with root package name */
    public final S3 f119483b;

    public Y(dagger.internal.l lVar, S3 s32) {
        this.f119482a = lVar;
        this.f119483b = s32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new X((Resources) this.f119482a.f393949a, dagger.internal.g.b(this.f119483b));
    }
}
