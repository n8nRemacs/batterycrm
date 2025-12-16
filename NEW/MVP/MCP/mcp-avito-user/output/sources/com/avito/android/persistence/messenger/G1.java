package com.avito.android.persistence.messenger;

import android.database.Cursor;
import androidx.room.rxjava3.EmptyResultSetException;
import java.util.concurrent.Callable;

/* compiled from: MessageDao_Impl.java */
/* loaded from: classes15.dex */
class G1 implements Callable<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N1 f215178c;

    public G1(N1 n12, androidx.room.F0 f02) {
        this.f215178c = n12;
        this.f215177b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Long call() {
        androidx.room.F0 f02 = this.f215177b;
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215178c.f215213a;
        messengerDatabase_Impl.c();
        try {
            Cursor cursorB = V1.c.b(messengerDatabase_Impl, f02, false);
            try {
                Long lValueOf = null;
                if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                    lValueOf = Long.valueOf(cursorB.getLong(0));
                }
                if (lValueOf == null) {
                    throw new EmptyResultSetException("Query returned empty result set: ".concat(f02.getF19815b()));
                }
                messengerDatabase_Impl.s();
                cursorB.close();
                return lValueOf;
            } catch (Throwable th2) {
                cursorB.close();
                throw th2;
            }
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    public final void finalize() {
        this.f215177b.d();
    }
}
