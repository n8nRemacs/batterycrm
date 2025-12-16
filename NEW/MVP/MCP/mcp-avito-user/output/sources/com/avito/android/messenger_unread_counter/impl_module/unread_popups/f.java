package com.avito.android.messenger_unread_counter.impl_module.unread_popups;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UnreadMessagesPopupsResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f197751a;

    public f(C30102l3 c30102l3) {
        this.f197751a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Context) this.f197751a.get());
    }
}
