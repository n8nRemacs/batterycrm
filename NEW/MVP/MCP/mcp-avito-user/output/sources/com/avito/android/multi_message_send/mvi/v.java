package com.avito.android.multi_message_send.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiMessageSendViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final p f206803a;

    public v(p pVar) {
        this.f206803a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((o) this.f206803a.get(), null, 2, null);
    }
}
