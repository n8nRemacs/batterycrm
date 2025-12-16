package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.util.S3;

/* compiled from: PhoneAttributerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class p0 implements dagger.internal.h<o0> {

    /* renamed from: a, reason: collision with root package name */
    public final S3 f119588a;

    public p0(S3 s32) {
        this.f119588a = s32;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f119588a.getClass();
        return new o0(S3.a());
    }
}
