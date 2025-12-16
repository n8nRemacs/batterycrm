package com.google.android.datatransport.runtime.scheduling.persistence;

import CX0.a;
import CX0.b;
import CX0.c;
import CX0.d;
import CX0.e;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.scheduling.persistence.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class n implements s.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f343250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f343251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f343252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f343253d;

    public /* synthetic */ n(s sVar, Object obj, Object obj2, int i12) {
        this.f343250a = i12;
        this.f343251b = sVar;
        this.f343253d = obj;
        this.f343252c = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.google.android.datatransport.runtime.scheduling.persistence.s.b
    public final Object apply(Object obj) {
        long jInsert;
        String str;
        LogEventDropped.Reason reason;
        LogEventDropped.Reason reason2;
        String str2 = "bytes";
        int i12 = 5;
        int i13 = 4;
        int i14 = 3;
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        int i15 = 2;
        Object obj2 = this.f343252c;
        int i16 = 0;
        Object obj3 = this.f343253d;
        s sVar = this.f343251b;
        int i17 = 1;
        switch (this.f343250a) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                com.google.android.datatransport.c cVar = s.f343263g;
                long jSimpleQueryForLong = sVar.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * sVar.f().compileStatement("PRAGMA page_count").simpleQueryForLong();
                e eVar = sVar.f343267e;
                com.google.android.datatransport.runtime.j jVar = (com.google.android.datatransport.runtime.j) obj3;
                if (jSimpleQueryForLong >= eVar.e()) {
                    sVar.d(1L, reason3, jVar.h());
                    return -1L;
                }
                com.google.android.datatransport.runtime.r rVar = (com.google.android.datatransport.runtime.r) obj2;
                Long lG2 = s.g(sQLiteDatabase, rVar);
                if (lG2 != null) {
                    jInsert = lG2.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", rVar.b());
                    contentValues.put("priority", Integer.valueOf(HX0.a.a(rVar.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (rVar.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(rVar.c(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD2 = eVar.d();
                byte[] bArr = jVar.e().f343166b;
                boolean z12 = bArr.length <= iD2;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", jVar.h());
                contentValues2.put("timestamp_ms", Long.valueOf(jVar.f()));
                contentValues2.put("uptime_ms", Long.valueOf(jVar.i()));
                contentValues2.put("payload_encoding", jVar.e().f343165a.f342922a);
                contentValues2.put("code", jVar.d());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z12));
                contentValues2.put("payload", z12 ? bArr : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z12) {
                    int iCeil = (int) Math.ceil(bArr.length / iD2);
                    for (int i18 = 1; i18 <= iCeil; i18++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i18 - 1) * iD2, Math.min(i18 * iD2, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i18));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(jVar.c()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 1:
                Cursor cursor = (Cursor) obj;
                com.google.android.datatransport.c cVar2 = s.f343263g;
                sVar.getClass();
                while (cursor.moveToNext()) {
                    long j12 = cursor.getLong(0);
                    int i19 = cursor.getInt(7) != 0 ? i17 : 0;
                    j.a aVarA = com.google.android.datatransport.runtime.j.a();
                    aVarA.g(cursor.getString(i17));
                    aVarA.f(cursor.getLong(i15));
                    aVarA.h(cursor.getLong(3));
                    if (i19 != 0) {
                        String string = cursor.getString(4);
                        aVarA.e(new com.google.android.datatransport.runtime.i(string == null ? s.f343263g : new com.google.android.datatransport.c(string), cursor.getBlob(5)));
                        str = str2;
                    } else {
                        String string2 = cursor.getString(4);
                        com.google.android.datatransport.c cVar3 = string2 == null ? s.f343263g : new com.google.android.datatransport.c(string2);
                        Cursor cursorQuery = sVar.f().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j12)}, null, null, "sequence_num");
                        try {
                            Cursor cursor2 = cursorQuery;
                            com.google.android.datatransport.c cVar4 = s.f343263g;
                            ArrayList arrayList = new ArrayList();
                            int length = 0;
                            while (cursor2.moveToNext()) {
                                byte[] blob = cursor2.getBlob(0);
                                arrayList.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr2 = new byte[length];
                            int i22 = 0;
                            int length2 = 0;
                            while (i22 < arrayList.size()) {
                                byte[] bArr3 = (byte[]) arrayList.get(i22);
                                ArrayList arrayList2 = arrayList;
                                String str3 = str2;
                                System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
                                length2 += bArr3.length;
                                i22++;
                                arrayList = arrayList2;
                                str2 = str3;
                            }
                            str = str2;
                            cursorQuery.close();
                            aVarA.e(new com.google.android.datatransport.runtime.i(cVar3, bArr2));
                        } catch (Throwable th2) {
                            cursorQuery.close();
                            throw th2;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        aVarA.d(Integer.valueOf(cursor.getInt(6)));
                    }
                    ((ArrayList) obj3).add(new b(j12, (com.google.android.datatransport.runtime.r) obj2, aVarA.b()));
                    str2 = str;
                    i15 = 2;
                    i17 = 1;
                }
                return null;
            default:
                Cursor cursor3 = (Cursor) obj;
                com.google.android.datatransport.c cVar5 = s.f343263g;
                sVar.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor3.moveToNext()) {
                        String string3 = cursor3.getString(i16);
                        int i23 = cursor3.getInt(1);
                        LogEventDropped.Reason reason4 = LogEventDropped.Reason.REASON_UNKNOWN;
                        if (i23 != 0) {
                            if (i23 == 1) {
                                reason4 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                            } else if (i23 == 2) {
                                reason = reason3;
                                reason2 = reason;
                            } else if (i23 == i14) {
                                reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                            } else if (i23 == i13) {
                                reason4 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                            } else if (i23 == i12) {
                                reason4 = LogEventDropped.Reason.INVALID_PAYLOD;
                            } else if (i23 == 6) {
                                reason4 = LogEventDropped.Reason.SERVER_ERROR;
                            } else {
                                DX0.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i23));
                            }
                            reason2 = reason3;
                            reason = reason4;
                        } else {
                            reason2 = reason3;
                            reason = reason4;
                        }
                        long j13 = cursor3.getLong(2);
                        if (!map.containsKey(string3)) {
                            map.put(string3, new ArrayList());
                        }
                        List list = (List) map.get(string3);
                        int i24 = LogEventDropped.f343151c;
                        LogEventDropped.a aVar = new LogEventDropped.a();
                        aVar.f343164b = reason;
                        aVar.f343163a = j13;
                        list.add(new LogEventDropped(aVar.f343163a, aVar.f343164b));
                        reason3 = reason2;
                        i12 = 5;
                        i13 = 4;
                        i14 = 3;
                        i16 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            a.C0113a c0113a = (a.C0113a) obj2;
                            if (!it.hasNext()) {
                                final long jO2 = sVar.f343265c.O();
                                c0113a.f2212a = (CX0.e) sVar.h(new s.b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m
                                    @Override // com.google.android.datatransport.runtime.scheduling.persistence.s.b
                                    public final Object apply(Object obj4) {
                                        com.google.android.datatransport.c cVar6 = s.f343263g;
                                        Cursor cursorRawQuery = ((SQLiteDatabase) obj4).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                        long j14 = jO2;
                                        try {
                                            Cursor cursor4 = cursorRawQuery;
                                            com.google.android.datatransport.c cVar7 = s.f343263g;
                                            cursor4.moveToNext();
                                            long j15 = cursor4.getLong(0);
                                            int i25 = CX0.e.f2229c;
                                            e.a aVar2 = new e.a();
                                            aVar2.f2232a = j15;
                                            aVar2.f2233b = j14;
                                            return new CX0.e(aVar2.f2232a, aVar2.f2233b);
                                        } finally {
                                            cursorRawQuery.close();
                                        }
                                    }
                                });
                                int i25 = CX0.b.f2216b;
                                b.a aVar2 = new b.a();
                                int i26 = CX0.d.f2224c;
                                d.a aVar3 = new d.a();
                                aVar3.f2227a = sVar.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * sVar.f().compileStatement("PRAGMA page_count").simpleQueryForLong();
                                aVar3.f2228b = e.f343243a.f343230b;
                                aVar2.f2218a = new CX0.d(aVar3.f2227a, aVar3.f2228b);
                                c0113a.f2214c = new CX0.b(aVar2.f2218a);
                                c0113a.f2215d = sVar.f343268f.get();
                                return new CX0.a(c0113a.f2212a, Collections.unmodifiableList(c0113a.f2213b), c0113a.f2214c, c0113a.f2215d);
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i27 = CX0.c.f2219c;
                            c.a aVar4 = new c.a();
                            aVar4.f2222a = (String) entry2.getKey();
                            aVar4.f2223b = (List) entry2.getValue();
                            c0113a.f2213b.add(new CX0.c(aVar4.f2222a, Collections.unmodifiableList(aVar4.f2223b)));
                        }
                    }
                }
        }
    }
}
