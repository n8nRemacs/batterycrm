package qu;

import Y61.k;
import Y61.l;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.avito.android.db.f;
import com.avito.android.db.h;
import com.avito.android.db.j;
import com.avito.android.util.C35851n0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import uK0.C48914a;

/* compiled from: FavoritesSyncDao.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lqu/d;", "Lcom/avito/android/db/b;", "Lqu/c;", "_avito-discouraged_persistence_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qu.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47448d extends com.avito.android.db.b implements InterfaceC47447c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f429468b;

    public C47448d(@k f fVar, @k h hVar) {
        super(fVar);
        this.f429468b = hVar;
    }

    public static ArrayList t(C47448d c47448d, SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        c47448d.getClass();
        e.f429469a.getClass();
        Cursor cursorQuery = sQLiteDatabase.query("favorites_sync", new String[]{"entity_id"}, str, strArr, null, null, null);
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        C48914a c48914aA = C35851n0.a(cursorQuery);
        while (true) {
            boolean z12 = false;
            try {
                try {
                    if (!cursorQuery.moveToNext()) {
                        G0 g02 = G0.f406611a;
                        c48914aA.close();
                        return arrayList;
                    }
                    e.f429469a.getClass();
                    arrayList.add(c48914aA.d("entity_id"));
                } catch (Exception e12) {
                    z12 = true;
                    try {
                        c48914aA.close();
                    } catch (Exception unused) {
                    }
                    throw e12;
                }
            } catch (Throwable th2) {
                if (!z12) {
                    c48914aA.close();
                }
                throw th2;
            }
        }
    }

    public static LinkedHashMap u(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        e.f429469a.getClass();
        Cursor cursorQuery = sQLiteDatabase.query("favorites_sync", new String[]{"entity_id", "x_hash", "analytics_source"}, str, strArr, null, null, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C48914a c48914aA = C35851n0.a(cursorQuery);
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    e.f429469a.getClass();
                    String strD = c48914aA.d("entity_id");
                    C47445a c47445a = new C47445a(c48914aA.f("x_hash"), c48914aA.f("analytics_source"));
                    Object arrayList = linkedHashMap.get(c47445a);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(c47445a, arrayList);
                    }
                    ((List) arrayList).add(strD);
                } catch (Throwable th2) {
                    if (0 == 0) {
                        c48914aA.close();
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                try {
                    c48914aA.close();
                } catch (Exception unused) {
                }
                throw e12;
            }
        }
        G0 g02 = G0.f406611a;
        c48914aA.close();
        return linkedHashMap;
    }

    @Override // qu.InterfaceC47447c
    public final boolean b(@k String str, boolean z12) {
        synchronized (this.f429468b) {
            SQLiteDatabase readableDatabase = this.f132678a.getReadableDatabase();
            e.f429469a.getClass();
            if (j.a(readableDatabase, "favorites_sync", e.f429470b + " AND marked_for_remove = ?", new String[]{str, String.valueOf(z12 ? 1 : 0)}) > 0) {
                z12 = !z12;
            }
        }
        return z12;
    }

    @Override // qu.InterfaceC47447c
    public final void c(@k List<String> list) {
        synchronized (this.f429468b) {
            SQLiteDatabase writableDatabase = this.f132678a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                for (String str : list) {
                    synchronized (this.f429468b) {
                        SQLiteDatabase writableDatabase2 = this.f132678a.getWritableDatabase();
                        e.f429469a.getClass();
                        writableDatabase2.delete("favorites_sync", e.f429470b, new String[]{str});
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3 A[Catch: all -> 0x00e7, TRY_ENTER, TryCatch #2 {, blocks: (B:15:0x0038, B:16:0x0054, B:18:0x0058, B:21:0x0068, B:34:0x00e0, B:44:0x00f3, B:45:0x00f6), top: B:57:0x0038, outer: #3 }] */
    @Override // qu.InterfaceC47447c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Boolean> d(@Y61.k java.util.List<java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.C47448d.d(java.util.List):java.util.Map");
    }

    @Override // qu.InterfaceC47447c
    public final void e(@k String str, @l String str2, @l String str3) {
        v(str, str2, str3, true);
    }

    @Override // qu.InterfaceC47447c
    public final boolean f(@k String str) {
        boolean z12;
        synchronized (this.f429468b) {
            SQLiteDatabase readableDatabase = this.f132678a.getReadableDatabase();
            e.f429469a.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e.f429470b);
            sb2.append(" AND marked_for_remove = ?");
            z12 = j.a(readableDatabase, "favorites_sync", sb2.toString(), new String[]{str, "1"}) > 0;
        }
        return z12;
    }

    @Override // qu.InterfaceC47447c
    public final void g(@k String str, @l String str2, @l String str3) {
        synchronized (this.f429468b) {
            SQLiteDatabase writableDatabase = this.f132678a.getWritableDatabase();
            C47446b c47446b = e.f429469a;
            c47446b.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.clear();
            c47446b.getClass();
            contentValues.put("entity_id", str);
            contentValues.put("x_hash", str2);
            contentValues.put("analytics_source", str3);
            writableDatabase.insert("favorites_sync", null, contentValues);
        }
    }

    @Override // qu.InterfaceC47447c
    public final int getCount() {
        int iA2;
        synchronized (this.f429468b) {
            SQLiteDatabase readableDatabase = this.f132678a.getReadableDatabase();
            e.f429469a.getClass();
            iA2 = j.a(readableDatabase, "favorites_sync", null, null);
        }
        return iA2;
    }

    @Override // qu.InterfaceC47447c
    @k
    public final ArrayList h() {
        ArrayList arrayListT;
        synchronized (this.f429468b) {
            SQLiteDatabase readableDatabase = this.f132678a.getReadableDatabase();
            e.f429469a.getClass();
            arrayListT = t(this, readableDatabase, "marked_for_remove = ?", new String[]{"1"});
        }
        return arrayListT;
    }

    @Override // qu.InterfaceC47447c
    @k
    public final LinkedHashMap i() {
        LinkedHashMap linkedHashMapU;
        synchronized (this.f429468b) {
            SQLiteDatabase readableDatabase = this.f132678a.getReadableDatabase();
            e.f429469a.getClass();
            linkedHashMapU = u(readableDatabase, "marked_for_remove = ?", new String[]{"1"});
        }
        return linkedHashMapU;
    }

    @Override // qu.InterfaceC47447c
    @k
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMapU;
        synchronized (this.f429468b) {
            SQLiteDatabase readableDatabase = this.f132678a.getReadableDatabase();
            e.f429469a.getClass();
            linkedHashMapU = u(readableDatabase, "marked_for_remove = ?", new String[]{"0"});
        }
        return linkedHashMapU;
    }

    @Override // qu.InterfaceC47447c
    @k
    public final ArrayList l() {
        ArrayList arrayListT;
        synchronized (this.f429468b) {
            SQLiteDatabase readableDatabase = this.f132678a.getReadableDatabase();
            e.f429469a.getClass();
            arrayListT = t(this, readableDatabase, "marked_for_remove = ?", new String[]{"0"});
        }
        return arrayListT;
    }

    @Override // qu.InterfaceC47447c
    public final void m(@k String str, @l String str2) {
        v(str, str2, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #5 {, blocks: (B:4:0x0003, B:18:0x0058, B:31:0x006a, B:32:0x006d), top: B:42:0x0003, outer: #1 }] */
    @Override // qu.InterfaceC47447c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Boolean> n() {
        /*
            r11 = this;
            com.avito.android.db.h r0 = r11.f429468b     // Catch: java.lang.Exception -> L5d
            monitor-enter(r0)     // Catch: java.lang.Exception -> L5d
            com.avito.android.db.f r1 = r11.f132678a     // Catch: java.lang.Throwable -> L5f
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L5f
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            qu.b r3 = qu.e.f429469a     // Catch: java.lang.Throwable -> L5f
            r3.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "favorites_sync"
            java.lang.String r4 = "entity_id"
            java.lang.String r5 = "marked_for_remove"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch: java.lang.Throwable -> L5f
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5f
            uK0.a r3 = com.avito.android.util.C35851n0.a(r2)     // Catch: java.lang.Throwable -> L5f
        L2b:
            r4 = 1
            r5 = 0
            boolean r6 = r2.moveToNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r6 == 0) goto L56
            qu.b r6 = qu.e.f429469a     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r6.getClass()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r6 = "entity_id"
            java.lang.String r6 = r3.d(r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r7 = "marked_for_remove"
            int r7 = r3.b(r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r7 != 0) goto L48
            r7 = r4
            goto L49
        L48:
            r7 = r5
        L49:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r1.put(r6, r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            goto L2b
        L51:
            r1 = move-exception
            r4 = r5
            goto L68
        L54:
            r1 = move-exception
            goto L61
        L56:
            kotlin.G0 r2 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r3.close()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)     // Catch: java.lang.Exception -> L5d
            goto L7d
        L5d:
            r0 = move-exception
            goto L70
        L5f:
            r1 = move-exception
            goto L6e
        L61:
            r3.close()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            goto L67
        L65:
            r1 = move-exception
            goto L68
        L67:
            throw r1     // Catch: java.lang.Throwable -> L65
        L68:
            if (r4 != 0) goto L6d
            r3.close()     // Catch: java.lang.Throwable -> L5f
        L6d:
            throw r1     // Catch: java.lang.Throwable -> L5f
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Exception -> L5d
            throw r1     // Catch: java.lang.Exception -> L5d
        L70:
            com.avito.android.util.V2 r1 = com.avito.android.util.V2.f318762a
            java.lang.String r2 = "FavoritesSyncDaoImpl - isFavorite"
            java.lang.String r3 = "DEFAULT_TAG"
            r1.a(r3, r2, r0)
            java.util.Map r1 = kotlin.collections.P0.c()
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.C47448d.n():java.util.Map");
    }

    public final void v(String str, String str2, String str3, boolean z12) {
        synchronized (this.f429468b) {
            SQLiteDatabase writableDatabase = this.f132678a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.clear();
            C47446b c47446b = e.f429469a;
            c47446b.getClass();
            contentValues.put("entity_id", str);
            contentValues.put("x_hash", str2);
            contentValues.put("analytics_source", str3);
            c47446b.getClass();
            contentValues.put("marked_for_remove", Boolean.valueOf(z12));
            writableDatabase.insert("favorites_sync", null, contentValues);
        }
    }

    @Override // qu.InterfaceC47447c
    public final void wipe() {
        synchronized (this.f429468b) {
            SQLiteDatabase writableDatabase = this.f132678a.getWritableDatabase();
            e.f429469a.getClass();
            writableDatabase.delete("favorites_sync", null, null);
            G0 g02 = G0.f406611a;
        }
    }
}
