package com.avito.android.success.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessDeeplinkParser_Factory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* compiled from: SuccessDeeplinkParser_Factory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f291587a = new e();
    }

    public static e a() {
        return a.f291587a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d();
    }
}
