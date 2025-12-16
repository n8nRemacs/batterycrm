package com.avito.android.multi_message_send.di;

import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import dagger.internal.x;
import dagger.internal.y;
import x20.C49754c;
import x20.InterfaceC49752a;

/* compiled from: MultiMessageSendFeaturesModule_MultiMessageSendTestGroupFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<u3.l<MultiMessageSendTestGroup>> {

    /* renamed from: a, reason: collision with root package name */
    public final C49754c f206680a;

    public k(C49754c c49754c) {
        this.f206680a = c49754c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49752a interfaceC49752a = (InterfaceC49752a) this.f206680a.get();
        j.f206679a.getClass();
        return interfaceC49752a.a();
    }
}
