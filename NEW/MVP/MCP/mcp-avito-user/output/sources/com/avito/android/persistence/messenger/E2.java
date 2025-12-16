package com.avito.android.persistence.messenger;

import android.database.Cursor;
import androidx.room.rxjava3.EmptyResultSetException;
import java.util.concurrent.Callable;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
class E2 implements Callable<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O2 f215165c;

    public E2(O2 o22, androidx.room.F0 f02) {
        this.f215165c = o22;
        this.f215164b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Integer call() {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215165c.f215264a;
        androidx.room.F0 f02 = this.f215164b;
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
        this.f215164b.d();
    }
}
