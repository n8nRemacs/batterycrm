package com.avito.android.persistence.messenger;

import android.database.Cursor;
import androidx.room.rxjava3.EmptyResultSetException;
import java.util.concurrent.Callable;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.o2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33101o2 implements Callable<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33132w2 f215527c;

    public CallableC33101o2(C33132w2 c33132w2, androidx.room.F0 f02) {
        this.f215527c = c33132w2;
        this.f215526b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Integer call() {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215527c.f215556a;
        androidx.room.F0 f02 = this.f215526b;
        Cursor cursorP = messengerDatabase_Impl.p(f02);
        try {
            Integer numValueOf = null;
            if (cursorP.moveToFirst() && !cursorP.isNull(0)) {
                numValueOf = Integer.valueOf(cursorP.getInt(0));
            }
            if (numValueOf != null) {
                return numValueOf;
            }
            throw new EmptyResultSetException("Query returned empty result set: ".concat(f02.getF19815b()));
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215526b.d();
    }
}
