package com.avito.android.gsm_call_starter.impl_module.intent_factory;

import android.content.Context;
import com.avito.android.di.module.C30040f7;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DialIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30040f7 f161217a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f161218b;

    public d(C30040f7 c30040f7, C30102l3 c30102l3) {
        this.f161217a = c30040f7;
        this.f161218b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC35945t1) this.f161217a.get(), (Context) this.f161218b.get());
    }
}
