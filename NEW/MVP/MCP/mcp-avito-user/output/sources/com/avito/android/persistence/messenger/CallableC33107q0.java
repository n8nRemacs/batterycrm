package com.avito.android.persistence.messenger;

import java.util.LinkedHashSet;
import java.util.concurrent.Callable;

/* compiled from: ChannelTagDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.q0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33107q0 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f215534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33122u0 f215535c;

    public CallableC33107q0(C33122u0 c33122u0, LinkedHashSet linkedHashSet) {
        this.f215535c = c33122u0;
        this.f215534b = linkedHashSet;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        C33122u0 c33122u0 = this.f215535c;
        MessengerDatabase_Impl messengerDatabase_Impl = c33122u0.f215550a;
        messengerDatabase_Impl.c();
        try {
            c33122u0.f215551b.e(this.f215534b);
            messengerDatabase_Impl.s();
            messengerDatabase_Impl.l();
            return null;
        } catch (Throwable th2) {
            messengerDatabase_Impl.l();
            throw th2;
        }
    }
}
