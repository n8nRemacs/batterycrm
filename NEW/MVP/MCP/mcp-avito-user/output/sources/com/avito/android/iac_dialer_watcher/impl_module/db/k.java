package com.avito.android.iac_dialer_watcher.impl_module.db;

import android.database.Cursor;
import androidx.room.F0;
import j.P;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class k implements Callable<List<A>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f167830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167831c;

    public k(z zVar, F0 f02) {
        this.f167831c = zVar;
        this.f167830b = f02;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final List<A> call() {
        Cursor cursorP = this.f167831c.f167844a.p(this.f167830b);
        try {
            int iB2 = V1.b.b(cursorP, "log_session_id");
            int iB3 = V1.b.b(cursorP, "call_index_in_session");
            int iB4 = V1.b.b(cursorP, "call_id");
            int iB5 = V1.b.b(cursorP, "scenario");
            int iB6 = V1.b.b(cursorP, "started_at");
            int iB7 = V1.b.b(cursorP, "finished_at");
            int iB8 = V1.b.b(cursorP, "lines_limit_reached");
            int iB9 = V1.b.b(cursorP, "header");
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(new A(cursorP.getLong(iB2), cursorP.getLong(iB3), cursorP.getString(iB4), cursorP.getString(iB5), cursorP.getLong(iB6), cursorP.getLong(iB7), cursorP.getInt(iB8) != 0, cursorP.getString(iB9)));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f167830b.d();
    }
}
