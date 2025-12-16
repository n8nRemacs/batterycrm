package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.la, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38949la implements S7, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f380960a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f380961b;

    /* renamed from: c, reason: collision with root package name */
    private final String f380962c;

    /* renamed from: d, reason: collision with root package name */
    private final a f380963d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f380964e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC38823g8 f380965f;

    /* renamed from: com.yandex.metrica.impl.ob.la$a */
    public class a extends Lm {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            HashMap map;
            synchronized (C38949la.this.f380960a) {
                C38949la.b(C38949la.this);
                C38949la.this.f380964e = true;
                C38949la.this.f380960a.notifyAll();
            }
            while (isRunning()) {
                synchronized (this) {
                    if (C38949la.this.f380961b.size() == 0) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    map = new HashMap(C38949la.this.f380961b);
                    C38949la.this.f380961b.clear();
                }
                if (map.size() > 0) {
                    C38949la.a(C38949la.this, map);
                    map.clear();
                }
            }
        }
    }

    public C38949la(O7 o72, String str) {
        this(str, new C38873i8(o72));
    }

    public static void a(C38949la c38949la, Map map) {
        SQLiteDatabase sQLiteDatabaseA;
        c38949la.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i12 = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c38949la) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i12] = contentValues;
            i12++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = c38949la.f380965f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i13 = 0; i13 < size; i13++) {
                        ContentValues contentValues2 = contentValuesArr[i13];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseA.delete(c38949la.f380962c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(c38949la.f380962c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                    A2.a(sQLiteDatabaseA);
                    c38949la.f380965f.a(sQLiteDatabaseA);
                }
            }
        } catch (Throwable unused2) {
        }
        A2.a(sQLiteDatabaseA);
        c38949la.f380965f.a(sQLiteDatabaseA);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.yandex.metrica.impl.ob.C38949la r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            com.yandex.metrica.impl.ob.g8 r4 = r13.f380965f     // Catch: java.lang.Throwable -> L92
            android.database.sqlite.SQLiteDatabase r4 = r4.a()     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L93
            java.lang.String r6 = r13.f380962c     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L93
            r11 = 0
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L93
        L22:
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L90
            int r6 = r5.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L90
            int r7 = r5.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> L90
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L90
            int r8 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L90
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L90
            if (r9 != 0) goto L22
            r9 = 1
            if (r8 == r9) goto L71
            r9 = 2
            if (r8 == r9) goto L68
            r9 = 3
            if (r8 == r9) goto L5f
            r9 = 4
            if (r8 == r9) goto L88
            r9 = 5
            if (r8 == r9) goto L56
            goto L87
        L56:
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            goto L88
        L5f:
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            goto L88
        L68:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            goto L88
        L71:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L90
            if (r8 == 0) goto L7c
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L90
            goto L88
        L7c:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L90
            if (r7 == 0) goto L87
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L90
            goto L88
        L87:
            r7 = r3
        L88:
            if (r7 == 0) goto L22
            java.util.Map<java.lang.String, java.lang.Object> r8 = r13.f380960a     // Catch: java.lang.Throwable -> L90
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L90
            goto L22
        L90:
            r3 = r5
            goto L93
        L92:
            r4 = r3
        L93:
            com.yandex.metrica.impl.ob.A2.a(r3)
            com.yandex.metrica.impl.ob.g8 r13 = r13.f380965f
            r13.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C38949la.b(com.yandex.metrica.impl.ob.la):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @j.k0
    public void close() {
        if (this.f380963d.isRunning()) {
            this.f380963d.stopRunning();
        }
    }

    public C38949la(String str, InterfaceC38823g8 interfaceC38823g8) {
        this.f380960a = new HashMap();
        this.f380961b = new HashMap();
        this.f380965f = interfaceC38823g8;
        this.f380962c = str;
        Locale locale = Locale.US;
        a aVar = new a(AK.c.g(Mm.c(), "YMM-DW-"));
        this.f380963d = aVar;
        aVar.start();
    }

    private Object c(String str) {
        Object obj;
        synchronized (this.f380960a) {
            c();
            obj = this.f380960a.get(str);
        }
        return obj;
    }

    private void c() throws InterruptedException {
        if (this.f380964e) {
            return;
        }
        try {
            this.f380960a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void b() {
        synchronized (this.f380963d) {
            this.f380963d.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.ob.S7
    @j.P
    public String b(String str, String str2) {
        Object objC = c(str);
        return objC instanceof String ? (String) objC : str2;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public boolean b(String str, boolean z12) {
        Object objC = c(str);
        return objC instanceof Boolean ? ((Boolean) objC).booleanValue() : z12;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public S7 b(String str) {
        synchronized (this.f380960a) {
            c();
            this.f380960a.remove(str);
        }
        synchronized (this.f380963d) {
            this.f380961b.put(str, this);
            this.f380963d.notifyAll();
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public S7 b(String str, long j12) {
        a(str, Long.valueOf(j12));
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public synchronized S7 b(String str, int i12) {
        a(str, Integer.valueOf(i12));
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public int a(String str, int i12) {
        Object objC = c(str);
        return objC instanceof Integer ? ((Integer) objC).intValue() : i12;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public long a(String str, long j12) {
        Object objC = c(str);
        return objC instanceof Long ? ((Long) objC).longValue() : j12;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public synchronized S7 a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public S7 a(String str, boolean z12) {
        a(str, Boolean.valueOf(z12));
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public boolean a(@j.N String str) {
        boolean zContainsKey;
        synchronized (this.f380960a) {
            c();
            zContainsKey = this.f380960a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    @j.N
    public Set<String> a() {
        HashSet hashSet;
        synchronized (this.f380960a) {
            hashSet = new HashSet(this.f380960a.keySet());
        }
        return hashSet;
    }

    @j.k0
    public void a(String str, Object obj) {
        synchronized (this.f380960a) {
            c();
            this.f380960a.put(str, obj);
        }
        synchronized (this.f380963d) {
            this.f380961b.put(str, obj);
            this.f380963d.notifyAll();
        }
    }
}
