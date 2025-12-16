package com.avito.android.mortgage.util;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProcessIdGenerator_Factory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* compiled from: ProcessIdGenerator_Factory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f203845a = new e();
    }

    public static e a() {
        return a.f203845a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d();
    }
}
