package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update;

import com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacVoipPushTokenUpdaterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f168379a;

    public m(u uVar) {
        this.f168379a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((SendPushTokenInteractor) this.f168379a.get());
    }
}
