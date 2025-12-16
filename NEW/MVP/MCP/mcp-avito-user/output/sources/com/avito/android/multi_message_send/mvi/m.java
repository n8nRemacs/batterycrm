package com.avito.android.multi_message_send.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiMessageSendBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.multi_message_send.domain.f f206791a;

    public m(com.avito.android.multi_message_send.domain.f fVar) {
        this.f206791a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.multi_message_send.domain.e) this.f206791a.get());
    }
}
