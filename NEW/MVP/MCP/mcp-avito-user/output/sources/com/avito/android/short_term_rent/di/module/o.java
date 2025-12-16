package com.avito.android.short_term_rent.di.module;

import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSoftBookingFragmentModule_ProvideGsonFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<Gson> {

    /* compiled from: StrSoftBookingFragmentModule_ProvideGsonFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o f282346a = new o();
    }

    public static o a() {
        return a.f282346a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k.f282341a.getClass();
        return new com.google.gson.d().a();
    }
}
