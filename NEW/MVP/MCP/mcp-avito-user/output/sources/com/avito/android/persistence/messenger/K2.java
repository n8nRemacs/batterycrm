package com.avito.android.persistence.messenger;

import java.util.concurrent.Callable;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
class K2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33136x2 f215182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O2 f215183c;

    public K2(O2 o22, C33136x2 c33136x2) {
        this.f215183c = o22;
        this.f215182b = c33136x2;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        O2 o22 = this.f215183c;
        MessengerDatabase_Impl messengerDatabase_Impl = o22.f215264a;
        messengerDatabase_Impl.c();
        try {
            o22.f215265b.e(this.f215182b);
            messengerDatabase_Impl.s();
            messengerDatabase_Impl.l();
            return null;
        } catch (Throwable th2) {
            messengerDatabase_Impl.l();
            throw th2;
        }
    }
}
