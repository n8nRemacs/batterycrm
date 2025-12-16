package com.avito.android.iac_dialer_watcher.impl_module.db;

import android.database.Cursor;
import androidx.room.F0;
import j.P;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class q implements Callable<Map<C, List<A>>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f167840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167841c;

    public q(z zVar, F0 f02) {
        this.f167841c = zVar;
        this.f167840b = f02;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final Map<C, List<A>> call() {
        List list;
        Cursor cursorP = this.f167841c.f167844a.p(this.f167840b);
        try {
            int iB2 = V1.b.b(cursorP, "id");
            int iB3 = V1.b.b(cursorP, "created_at");
            int iB4 = V1.b.b(cursorP, "calls_history");
            int iB5 = V1.b.b(cursorP, "log_session_id");
            int iB6 = V1.b.b(cursorP, "call_index_in_session");
            int iB7 = V1.b.b(cursorP, "call_id");
            int iB8 = V1.b.b(cursorP, "scenario");
            int iB9 = V1.b.b(cursorP, "started_at");
            int iB10 = V1.b.b(cursorP, "finished_at");
            int iB11 = V1.b.b(cursorP, "lines_limit_reached");
            int iB12 = V1.b.b(cursorP, "header");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (cursorP.moveToNext()) {
                C c12 = new C(cursorP.getLong(iB2), cursorP.getLong(iB3), cursorP.getString(iB4));
                if (linkedHashMap.containsKey(c12)) {
                    list = (List) linkedHashMap.get(c12);
                } else {
                    ArrayList arrayList = new ArrayList();
                    linkedHashMap.put(c12, arrayList);
                    list = arrayList;
                }
                if (!cursorP.isNull(iB5) || !cursorP.isNull(iB6) || !cursorP.isNull(iB7) || !cursorP.isNull(iB8) || !cursorP.isNull(iB9) || !cursorP.isNull(iB10) || !cursorP.isNull(iB11) || !cursorP.isNull(iB12)) {
                    list.add(new A(cursorP.getLong(iB5), cursorP.getLong(iB6), cursorP.getString(iB7), cursorP.getString(iB8), cursorP.getLong(iB9), cursorP.getLong(iB10), cursorP.getInt(iB11) != 0, cursorP.getString(iB12)));
                }
            }
            cursorP.close();
            return linkedHashMap;
        } catch (Throwable th2) {
            cursorP.close();
            throw th2;
        }
    }

    public final void finalize() {
        this.f167840b.d();
    }
}
