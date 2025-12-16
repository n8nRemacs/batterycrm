package com.avito.android.iac_dialer_watcher.impl_module.db;

import android.database.Cursor;
import androidx.room.F0;
import androidx.room.rxjava3.EmptyResultSetException;
import j.P;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class m implements Callable<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f167832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167833c;

    public m(z zVar, F0 f02) {
        this.f167833c = zVar;
        this.f167832b = f02;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final Long call() {
        InAppCallsDatabase_Impl inAppCallsDatabase_Impl = this.f167833c.f167844a;
        F0 f02 = this.f167832b;
        Cursor cursorP = inAppCallsDatabase_Impl.p(f02);
        try {
            Long lValueOf = null;
            if (cursorP.moveToFirst() && !cursorP.isNull(0)) {
                lValueOf = Long.valueOf(cursorP.getLong(0));
            }
            if (lValueOf != null) {
                return lValueOf;
            }
            throw new EmptyResultSetException("Query returned empty result set: ".concat(f02.getF19815b()));
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f167832b.d();
    }
}
