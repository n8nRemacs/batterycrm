package com.avito.android.iac_dialer_watcher.impl_module.db;

import android.database.Cursor;
import androidx.room.F0;
import j.P;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class o implements Callable<List<B>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f167836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167837c;

    public o(z zVar, F0 f02) {
        this.f167837c = zVar;
        this.f167836b = f02;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final List<B> call() {
        Cursor cursorP = this.f167837c.f167844a.p(this.f167836b);
        try {
            int iB2 = V1.b.b(cursorP, "lineId");
            int iB3 = V1.b.b(cursorP, "log_session_id");
            int iB4 = V1.b.b(cursorP, "created_at");
            int iB5 = V1.b.b(cursorP, "line_text");
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(new B(cursorP.getString(iB5), cursorP.getLong(iB2), cursorP.getLong(iB3), cursorP.getLong(iB4)));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f167836b.d();
    }
}
