package com.avito.android.code_check.phone_list.mvi;

import com.avito.android.util.S3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneSearchFilterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final S3 f119005a;

    public j(S3 s32) {
        this.f119005a = s32;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f119005a.getClass();
        return new i(S3.a());
    }
}
