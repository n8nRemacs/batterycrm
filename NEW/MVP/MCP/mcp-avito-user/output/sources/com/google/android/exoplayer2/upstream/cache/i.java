package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.camera.camera2.internal.G;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36586b;
import com.google.android.exoplayer2.util.U;
import j.P;
import j.l0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: CachedContentIndex.java */
/* loaded from: classes6.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, h> f347865a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<String> f347866b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f347867c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f347868d = new SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    public final c f347869e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public c f347870f;

    /* compiled from: CachedContentIndex.java */
    public static final class a implements c {

        /* renamed from: e, reason: collision with root package name */
        public static final String[] f347871e = {"id", "key", "metadata"};

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.database.f f347872a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<h> f347873b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        public String f347874c;

        /* renamed from: d, reason: collision with root package name */
        public String f347875d;

        public a(com.google.android.exoplayer2.database.f fVar) {
            this.f347872a = fVar;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void a(h hVar, boolean z12) {
            SparseArray<h> sparseArray = this.f347873b;
            int i12 = hVar.f347858a;
            if (z12) {
                sparseArray.delete(i12);
            } else {
                sparseArray.put(i12, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void b(HashMap<String, h> map, SparseArray<String> sparseArray) throws DatabaseIOException {
            com.google.android.exoplayer2.database.f fVar = this.f347872a;
            C36585a.d(this.f347873b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = fVar.getReadableDatabase();
                String str = this.f347874c;
                str.getClass();
                if (com.google.android.exoplayer2.database.g.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = fVar.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        i(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                SQLiteDatabase readableDatabase2 = fVar.getReadableDatabase();
                String str2 = this.f347875d;
                str2.getClass();
                Cursor cursorQuery = readableDatabase2.query(str2, f347871e, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i12 = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new h(i12, string, i.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i12, string);
                    } finally {
                    }
                }
                cursorQuery.close();
            } catch (SQLiteException e12) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e12);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void c(long j12) {
            String hexString = Long.toHexString(j12);
            this.f347874c = hexString;
            this.f347875d = G.f("ExoPlayerCacheIndex", hexString);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void d(HashMap<String, h> map) throws DatabaseIOException {
            try {
                SQLiteDatabase writableDatabase = this.f347872a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    i(writableDatabase);
                    Iterator<h> it = map.values().iterator();
                    while (it.hasNext()) {
                        h(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f347873b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            } catch (SQLException e12) {
                throw new DatabaseIOException(e12);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void delete() throws DatabaseIOException {
            com.google.android.exoplayer2.database.f fVar = this.f347872a;
            String str = this.f347874c;
            str.getClass();
            try {
                String strConcat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = fVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i12 = com.google.android.exoplayer2.database.g.f344203a;
                    try {
                        if (U.P(writableDatabase, "ExoPlayerVersions")) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                        writableDatabase.setTransactionSuccessful();
                    } catch (SQLException e12) {
                        throw new DatabaseIOException(e12);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e13) {
                throw new DatabaseIOException(e13);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final boolean e() {
            SQLiteDatabase readableDatabase = this.f347872a.getReadableDatabase();
            String str = this.f347874c;
            str.getClass();
            return com.google.android.exoplayer2.database.g.a(readableDatabase, 1, str) != -1;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void f(HashMap<String, h> map) throws DatabaseIOException {
            SparseArray<h> sparseArray = this.f347873b;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f347872a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    try {
                        h hVarValueAt = sparseArray.valueAt(i12);
                        if (hVarValueAt == null) {
                            int iKeyAt = sparseArray.keyAt(i12);
                            String str = this.f347875d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            h(writableDatabase, hVarValueAt);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e12) {
                throw new DatabaseIOException(e12);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void g(h hVar) {
            this.f347873b.put(hVar.f347858a, hVar);
        }

        public final void h(SQLiteDatabase sQLiteDatabase, h hVar) throws IOException, SQLException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            i.b(hVar.f347862e, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(hVar.f347858a));
            contentValues.put("key", hVar.f347859b);
            contentValues.put("metadata", byteArray);
            String str = this.f347875d;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        public final void i(SQLiteDatabase sQLiteDatabase) throws SQLException, DatabaseIOException {
            String str = this.f347874c;
            str.getClass();
            com.google.android.exoplayer2.database.g.b(sQLiteDatabase, 1, str);
            String str2 = this.f347875d;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f347875d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    /* compiled from: CachedContentIndex.java */
    public interface c {
        void a(h hVar, boolean z12);

        void b(HashMap<String, h> map, SparseArray<String> sparseArray);

        void c(long j12);

        void d(HashMap<String, h> map);

        void delete();

        boolean e();

        void f(HashMap<String, h> map);

        void g(h hVar);
    }

    public i(@P com.google.android.exoplayer2.database.f fVar, @P File file) {
        a aVar = new a(fVar);
        b bVar = new b(new File(file, "cached_content_index.exi"));
        this.f347869e = aVar;
        this.f347870f = bVar;
    }

    public static l a(DataInputStream dataInputStream) throws IOException {
        int i12 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < i12; i13++) {
            String utf = dataInputStream.readUTF();
            int i14 = dataInputStream.readInt();
            if (i14 < 0) {
                throw new IOException(AK.c.g(i14, "Invalid value size: "));
            }
            int iMin = Math.min(i14, 10485760);
            byte[] bArrCopyOf = U.f348110e;
            int i15 = 0;
            while (i15 != i14) {
                int i16 = i15 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i16);
                dataInputStream.readFully(bArrCopyOf, i15, iMin);
                iMin = Math.min(i14 - i16, 10485760);
                i15 = i16;
            }
            map.put(utf, bArrCopyOf);
        }
        return new l(map);
    }

    public static void b(l lVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = lVar.f347885b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @P
    public final h c(String str) {
        return this.f347865a.get(str);
    }

    public final h d(String str) {
        HashMap<String, h> map = this.f347865a;
        h hVar = map.get(str);
        if (hVar != null) {
            return hVar;
        }
        SparseArray<String> sparseArray = this.f347866b;
        int size = sparseArray.size();
        int i12 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i12 < size && i12 == sparseArray.keyAt(i12)) {
                i12++;
            }
            iKeyAt = i12;
        }
        h hVar2 = new h(iKeyAt, str, l.f347883c);
        map.put(str, hVar2);
        sparseArray.put(iKeyAt, str);
        this.f347868d.put(iKeyAt, true);
        this.f347869e.g(hVar2);
        return hVar2;
    }

    @l0
    public final void e(long j12) {
        c cVar;
        c cVar2 = this.f347869e;
        cVar2.c(j12);
        c cVar3 = this.f347870f;
        if (cVar3 != null) {
            cVar3.c(j12);
        }
        boolean zE2 = cVar2.e();
        SparseArray<String> sparseArray = this.f347866b;
        HashMap<String, h> map = this.f347865a;
        if (zE2 || (cVar = this.f347870f) == null || !cVar.e()) {
            cVar2.b(map, sparseArray);
        } else {
            this.f347870f.b(map, sparseArray);
            cVar2.d(map);
        }
        c cVar4 = this.f347870f;
        if (cVar4 != null) {
            cVar4.delete();
            this.f347870f = null;
        }
    }

    public final void f(String str) {
        HashMap<String, h> map = this.f347865a;
        h hVar = map.get(str);
        if (hVar != null && hVar.f347860c.isEmpty() && hVar.f347861d.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = this.f347868d;
            int i12 = hVar.f347858a;
            boolean z12 = sparseBooleanArray.get(i12);
            this.f347869e.a(hVar, z12);
            SparseArray<String> sparseArray = this.f347866b;
            if (z12) {
                sparseArray.remove(i12);
                sparseBooleanArray.delete(i12);
            } else {
                sparseArray.put(i12, null);
                this.f347867c.put(i12, true);
            }
        }
    }

    @l0
    public final void g() {
        this.f347869e.f(this.f347865a);
        SparseBooleanArray sparseBooleanArray = this.f347867c;
        int size = sparseBooleanArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f347866b.remove(sparseBooleanArray.keyAt(i12));
        }
        sparseBooleanArray.clear();
        this.f347868d.clear();
    }

    /* compiled from: CachedContentIndex.java */
    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Cipher f347876a = null;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final SecretKeySpec f347877b = null;

        /* renamed from: c, reason: collision with root package name */
        public final C36586b f347878c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f347879d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public o f347880e;

        public b(File file) {
            this.f347878c = new C36586b(file);
        }

        public static int h(h hVar, int i12) {
            int iHashCode = hVar.f347859b.hashCode() + (hVar.f347858a * 31);
            if (i12 >= 2) {
                return (iHashCode * 31) + hVar.f347862e.hashCode();
            }
            long jB2 = hVar.f347862e.b();
            return (iHashCode * 31) + ((int) (jB2 ^ (jB2 >>> 32)));
        }

        public static h i(int i12, DataInputStream dataInputStream) throws IOException {
            l lVarA;
            int i13 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i12 < 2) {
                long j12 = dataInputStream.readLong();
                k kVar = new k();
                kVar.a(Long.valueOf(j12), "exo_len");
                lVarA = l.f347883c.a(kVar);
            } else {
                lVarA = i.a(dataInputStream);
            }
            return new h(i13, utf, lVarA);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void a(h hVar, boolean z12) {
            this.f347879d = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[Catch: all -> 0x0070, IOException -> 0x0073, TRY_LEAVE, TryCatch #6 {IOException -> 0x0073, all -> 0x0070, blocks: (B:11:0x0037, B:16:0x0041, B:23:0x0053, B:24:0x005d, B:25:0x0064, B:32:0x0078, B:33:0x007d, B:34:0x007e, B:36:0x0087, B:38:0x008d, B:39:0x009c), top: B:57:0x0037 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.h> r13, android.util.SparseArray<java.lang.String> r14) throws java.lang.Throwable {
            /*
                r12 = this;
                r0 = 1
                boolean r1 = r12.f347879d
                r1 = r1 ^ r0
                com.google.android.exoplayer2.util.C36585a.d(r1)
                com.google.android.exoplayer2.util.b r1 = r12.f347878c
                java.io.File r2 = r1.f348119a
                java.io.File r3 = r1.f348119a
                boolean r2 = r2.exists()
                java.io.File r1 = r1.f348120b
                if (r2 != 0) goto L1b
                boolean r2 = r1.exists()
                if (r2 == 0) goto Lca
            L1b:
                r2 = 0
                java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb9
                boolean r5 = r1.exists()     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb9
                if (r5 == 0) goto L2a
                r3.delete()     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb9
                r1.renameTo(r3)     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb9
            L2a:
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb9
                r5.<init>(r3)     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb9
                r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb9
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb9
                r5.<init>(r4)     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb9
                int r2 = r5.readInt()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                if (r2 < 0) goto L4c
                r6 = 2
                if (r2 <= r6) goto L41
                goto L4c
            L41:
                int r7 = r5.readInt()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r7 = r7 & r0
                if (r7 == 0) goto L7e
                javax.crypto.Cipher r7 = r12.f347876a
                if (r7 != 0) goto L51
            L4c:
                com.google.android.exoplayer2.util.U.h(r5)
                goto Lbe
            L51:
                r8 = 16
                byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r5.readFully(r8)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                javax.crypto.spec.IvParameterSpec r9 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r9.<init>(r8)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                javax.crypto.spec.SecretKeySpec r8 = r12.f347877b     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73 java.security.InvalidAlgorithmParameterException -> L75 java.security.InvalidKeyException -> L77
                int r10 = com.google.android.exoplayer2.util.U.f348106a     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73 java.security.InvalidAlgorithmParameterException -> L75 java.security.InvalidKeyException -> L77
                r7.init(r6, r8, r9)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73 java.security.InvalidAlgorithmParameterException -> L75 java.security.InvalidKeyException -> L77
                java.io.DataInputStream r6 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                javax.crypto.CipherInputStream r8 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r8.<init>(r4, r7)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r6.<init>(r8)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r5 = r6
                goto L7e
            L70:
                r13 = move-exception
                r2 = r5
                goto Lb3
            L73:
                r2 = r5
                goto Lb9
            L75:
                r0 = move-exception
                goto L78
            L77:
                r0 = move-exception
            L78:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                throw r2     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            L7e:
                int r4 = r5.readInt()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r6 = 0
                r7 = r6
                r8 = r7
            L85:
                if (r7 >= r4) goto L9c
                com.google.android.exoplayer2.upstream.cache.h r9 = i(r2, r5)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                java.lang.String r10 = r9.f347859b
                r13.put(r10, r9)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                int r11 = r9.f347858a     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r14.put(r11, r10)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                int r9 = h(r9, r2)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                int r8 = r8 + r9
                int r7 = r7 + r0
                goto L85
            L9c:
                int r2 = r5.readInt()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                int r4 = r5.read()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
                r7 = -1
                if (r4 != r7) goto La8
                goto La9
            La8:
                r0 = r6
            La9:
                if (r2 != r8) goto L4c
                if (r0 != 0) goto Lae
                goto L4c
            Lae:
                com.google.android.exoplayer2.util.U.h(r5)
                goto Lca
            Lb2:
                r13 = move-exception
            Lb3:
                if (r2 == 0) goto Lb8
                com.google.android.exoplayer2.util.U.h(r2)
            Lb8:
                throw r13
            Lb9:
                if (r2 == 0) goto Lbe
                com.google.android.exoplayer2.util.U.h(r2)
            Lbe:
                r13.clear()
                r14.clear()
                r3.delete()
                r1.delete()
            Lca:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.i.b.b(java.util.HashMap, android.util.SparseArray):void");
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void d(HashMap<String, h> map) throws Throwable {
            DataOutputStream dataOutputStream;
            C36586b c36586b = this.f347878c;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream outputStreamA = c36586b.a();
                o oVar = this.f347880e;
                if (oVar == null) {
                    this.f347880e = new o(outputStreamA);
                } else {
                    oVar.a(outputStreamA);
                }
                dataOutputStream = new DataOutputStream(this.f347880e);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(map.size());
                int iH2 = 0;
                for (h hVar : map.values()) {
                    dataOutputStream.writeInt(hVar.f347858a);
                    dataOutputStream.writeUTF(hVar.f347859b);
                    i.b(hVar.f347862e, dataOutputStream);
                    iH2 += h(hVar, 2);
                }
                dataOutputStream.writeInt(iH2);
                dataOutputStream.close();
                c36586b.f348120b.delete();
                int i12 = U.f348106a;
                this.f347879d = false;
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream2 = dataOutputStream;
                U.h(dataOutputStream2);
                throw th;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void delete() {
            C36586b c36586b = this.f347878c;
            c36586b.f348119a.delete();
            c36586b.f348120b.delete();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final boolean e() {
            C36586b c36586b = this.f347878c;
            return c36586b.f348119a.exists() || c36586b.f348120b.exists();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void f(HashMap<String, h> map) throws Throwable {
            if (this.f347879d) {
                d(map);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void g(h hVar) {
            this.f347879d = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.c
        public final void c(long j12) {
        }
    }
}
