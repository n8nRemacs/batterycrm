package com.avito.android.iac_dialer_watcher.impl_module.db;

import android.database.Cursor;
import androidx.room.F0;
import j.P;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class i implements Callable<List<C>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f167826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167827c;

    public i(z zVar, F0 f02) {
        this.f167827c = zVar;
        this.f167826b = f02;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final List<C> call() {
        Cursor cursorP = this.f167827c.f167844a.p(this.f167826b);
        try {
            int iB2 = V1.b.b(cursorP, "id");
            int iB3 = V1.b.b(cursorP, "created_at");
            int iB4 = V1.b.b(cursorP, "calls_history");
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(new C(cursorP.getLong(iB2), cursorP.getLong(iB3), cursorP.getString(iB4)));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f167826b.d();
    }
}
