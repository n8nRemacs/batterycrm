package com.avito.android.recall_me.di;

import com.avito.android.recall_me.presentation.q;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import zi0.InterfaceC50571a;

/* compiled from: RecallMeModule_Companion_ProvideActionConsumerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<com.jakewharton.rxrelay3.c<InterfaceC50571a>> {

    /* renamed from: a, reason: collision with root package name */
    public final l f251827a;

    public k(l lVar) {
        this.f251827a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = (q) this.f251827a.get();
        j.f251825a.getClass();
        com.jakewharton.rxrelay3.c<InterfaceC50571a> cVarM1 = qVar.m1();
        t.d(cVarM1);
        return cVarM1;
    }
}
