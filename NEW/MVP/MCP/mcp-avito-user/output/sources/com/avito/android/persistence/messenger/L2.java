package com.avito.android.persistence.messenger;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
class L2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f215186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O2 f215187c;

    public L2(O2 o22, List list) {
        this.f215187c = o22;
        this.f215186b = list;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        O2 o22 = this.f215187c;
        MessengerDatabase_Impl messengerDatabase_Impl = o22.f215264a;
        messengerDatabase_Impl.c();
        try {
            o22.f215266c.e(this.f215186b);
            messengerDatabase_Impl.s();
            messengerDatabase_Impl.l();
            return null;
        } catch (Throwable th2) {
            messengerDatabase_Impl.l();
            throw th2;
        }
    }
}
