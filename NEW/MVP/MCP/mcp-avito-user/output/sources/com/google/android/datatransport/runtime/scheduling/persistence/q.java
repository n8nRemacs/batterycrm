package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class q implements s.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f343258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f343259b;

    public /* synthetic */ q(Object obj, int i12) {
        this.f343258a = i12;
        this.f343259b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.s.b
    public final Object apply(Object obj) {
        Object obj2 = this.f343259b;
        switch (this.f343258a) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                com.google.android.datatransport.c cVar = s.f343263g;
                s sVar = (s) obj2;
                sVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sVar.f343265c.O()).execute();
                break;
            default:
                Cursor cursor = (Cursor) obj;
                com.google.android.datatransport.c cVar2 = s.f343263g;
                while (cursor.moveToNext()) {
                    long j12 = cursor.getLong(0);
                    HashMap map = (HashMap) obj2;
                    Set hashSet = (Set) map.get(Long.valueOf(j12));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j12), hashSet);
                    }
                    hashSet.add(new s.c(cursor.getString(1), cursor.getString(2), null));
                }
                break;
        }
        return null;
    }
}
