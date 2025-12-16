package com.avito.android.calltracking.di;

import com.avito.android.calltracking.I;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalltrackingFragmentModule_ProvideScreenEventConsumerFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<com.jakewharton.rxrelay3.c<I>> {

    /* compiled from: CalltrackingFragmentModule_ProvideScreenEventConsumerFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f113670a = new k();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g.f113665a.getClass();
        return new com.jakewharton.rxrelay3.c();
    }
}
