package com.avito.android.iac_dialer_watcher.impl_module.db;

import android.database.Cursor;
import androidx.room.F0;
import j.P;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class p implements Callable<List<Long>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f167838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167839c;

    public p(z zVar, F0 f02) {
        this.f167839c = zVar;
        this.f167838b = f02;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final List<Long> call() {
        Cursor cursorP = this.f167839c.f167844a.p(this.f167838b);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(Long.valueOf(cursorP.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f167838b.d();
    }
}
