package com.avito.android.persistence.messenger;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: MessageDao_Impl.java */
/* loaded from: classes15.dex */
class D1 implements Callable<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N1 f215159c;

    public D1(N1 n12, androidx.room.F0 f02) {
        this.f215159c = n12;
        this.f215158b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final Long call() {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215159c.f215213a;
        messengerDatabase_Impl.c();
        try {
            Cursor cursorB = V1.c.b(messengerDatabase_Impl, this.f215158b, false);
            try {
                long jValueOf = cursorB.moveToFirst() ? Long.valueOf(cursorB.getLong(0)) : 0L;
                messengerDatabase_Impl.s();
                cursorB.close();
                return jValueOf;
            } catch (Throwable th2) {
                cursorB.close();
                throw th2;
            }
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    public final void finalize() {
        this.f215158b.d();
    }
}
