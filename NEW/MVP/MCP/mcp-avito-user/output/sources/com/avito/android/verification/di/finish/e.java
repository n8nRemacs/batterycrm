package com.avito.android.verification.di.finish;

import com.avito.android.socketEvents.SocketEventParserByClass;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationFinishEventModule_ProvideStatusUpdatedEventMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<mx0.c> {

    /* compiled from: VerificationFinishEventModule_ProvideStatusUpdatedEventMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f323637a = new e();
    }

    public static e a() {
        return a.f323637a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f323636a.getClass();
        return new mx0.c(com.avito.android.verification.verification_finish.c.class, new mx0.e("verification.StatusUpdated", null, false, 6, null), new SocketEventParserByClass(com.avito.android.verification.verification_finish.c.class));
    }
}
