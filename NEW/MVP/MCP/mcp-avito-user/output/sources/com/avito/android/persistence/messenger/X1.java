package com.avito.android.persistence.messenger;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* loaded from: classes15.dex */
class X1 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f215347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33132w2 f215348c;

    public X1(C33132w2 c33132w2, List list) {
        this.f215348c = c33132w2;
        this.f215347b = list;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        C33132w2 c33132w2 = this.f215348c;
        MessengerDatabase_Impl messengerDatabase_Impl = c33132w2.f215556a;
        messengerDatabase_Impl.c();
        try {
            c33132w2.f215558c.e(this.f215347b);
            messengerDatabase_Impl.s();
            messengerDatabase_Impl.l();
            return null;
        } catch (Throwable th2) {
            messengerDatabase_Impl.l();
            throw th2;
        }
    }
}
