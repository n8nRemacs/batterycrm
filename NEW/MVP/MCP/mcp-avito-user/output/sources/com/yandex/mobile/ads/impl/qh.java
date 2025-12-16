package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
final class qh {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, ph> f389168a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f389169b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f389170c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f389171d = new SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    private c f389172e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private c f389173f;

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f389179a = false;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private final Cipher f389180b = null;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private final SecretKeySpec f389181c = null;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private final SecureRandom f389182d = null;

        /* renamed from: e, reason: collision with root package name */
        private final ic f389183e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f389184f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        private xz0 f389185g;

        public b(File file) {
            this.f389183e = new ic(file);
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void a(long j12) {
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void b() {
            this.f389183e.a();
        }

        private boolean b(HashMap<String, ph> map, SparseArray<String> sparseArray) throws Throwable {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            int iHashCode;
            if (!this.f389183e.b()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.f389183e.c());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int i12 = dataInputStream.readInt();
                if (i12 >= 0 && i12 <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.f389180b == null) {
                            pc1.a((Closeable) dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                        try {
                            Cipher cipher = this.f389180b;
                            SecretKeySpec secretKeySpec = this.f389181c;
                            int i13 = pc1.f388768a;
                            cipher.init(2, secretKeySpec, ivParameterSpec);
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f389180b));
                        } catch (InvalidAlgorithmParameterException e12) {
                            e = e12;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e13) {
                            e = e13;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.f389179a) {
                        this.f389184f = true;
                    }
                    int i14 = dataInputStream.readInt();
                    int i15 = 0;
                    for (int i16 = 0; i16 < i14; i16++) {
                        ph phVarA = a(i12, dataInputStream);
                        map.put(phVarA.f388833b, phVarA);
                        sparseArray.put(phVarA.f388832a, phVarA.f388833b);
                        int iHashCode2 = phVarA.f388833b.hashCode() + (phVarA.f388832a * 31);
                        if (i12 < 2) {
                            long jB2 = phVarA.a().b();
                            iHashCode = (iHashCode2 * 31) + ((int) (jB2 ^ (jB2 >>> 32)));
                        } else {
                            iHashCode = (iHashCode2 * 31) + phVarA.a().hashCode();
                        }
                        i15 += iHashCode;
                    }
                    int i17 = dataInputStream.readInt();
                    boolean z12 = dataInputStream.read() == -1;
                    if (i17 == i15 && z12) {
                        pc1.a((Closeable) dataInputStream);
                        return true;
                    }
                    pc1.a((Closeable) dataInputStream);
                    return false;
                }
                pc1.a((Closeable) dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    pc1.a((Closeable) dataInputStream2);
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    pc1.a((Closeable) dataInputStream2);
                }
                throw th;
            }
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final boolean a() {
            return this.f389183e.b();
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void a(HashMap<String, ph> map, SparseArray<String> sparseArray) {
            db.b(!this.f389184f);
            if (b(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f389183e.a();
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void a(HashMap<String, ph> map) throws Throwable {
            if (this.f389184f) {
                b(map);
            }
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void a(ph phVar) {
            this.f389184f = true;
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void a(ph phVar, boolean z12) {
            this.f389184f = true;
        }

        private static ph a(int i12, DataInputStream dataInputStream) throws IOException {
            oo ooVarA;
            int i13 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i12 < 2) {
                long j12 = dataInputStream.readLong();
                tl tlVar = new tl();
                tl.a(tlVar, j12);
                ooVarA = oo.f388598c.a(tlVar);
            } else {
                ooVarA = qh.a(dataInputStream);
            }
            return new ph(i13, utf, ooVarA);
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void b(HashMap<String, ph> map) throws Throwable {
            DataOutputStream dataOutputStream;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream outputStreamD = this.f389183e.d();
                xz0 xz0Var = this.f389185g;
                if (xz0Var == null) {
                    this.f389185g = new xz0(outputStreamD);
                } else {
                    xz0Var.a(outputStreamD);
                }
                xz0 xz0Var2 = this.f389185g;
                dataOutputStream = new DataOutputStream(xz0Var2);
                try {
                    dataOutputStream.writeInt(2);
                    dataOutputStream.writeInt(this.f389179a ? 1 : 0);
                    if (this.f389179a) {
                        byte[] bArr = new byte[16];
                        SecureRandom secureRandom = this.f389182d;
                        int i12 = pc1.f388768a;
                        secureRandom.nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            this.f389180b.init(1, this.f389181c, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(xz0Var2, this.f389180b));
                        } catch (InvalidAlgorithmParameterException e12) {
                            e = e12;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e13) {
                            e = e13;
                            throw new IllegalStateException(e);
                        }
                    } else {
                        dataOutputStream2 = dataOutputStream;
                    }
                    dataOutputStream2.writeInt(map.size());
                    int iHashCode = 0;
                    for (ph phVar : map.values()) {
                        dataOutputStream2.writeInt(phVar.f388832a);
                        dataOutputStream2.writeUTF(phVar.f388833b);
                        Set<Map.Entry<String, byte[]>> setA = phVar.a().a();
                        dataOutputStream2.writeInt(setA.size());
                        for (Map.Entry<String, byte[]> entry : setA) {
                            dataOutputStream2.writeUTF(entry.getKey());
                            byte[] value = entry.getValue();
                            dataOutputStream2.writeInt(value.length);
                            dataOutputStream2.write(value);
                        }
                        iHashCode += phVar.a().hashCode() + ((phVar.f388833b.hashCode() + (phVar.f388832a * 31)) * 31);
                    }
                    dataOutputStream2.writeInt(iHashCode);
                    this.f389183e.a(dataOutputStream2);
                    int i13 = pc1.f388768a;
                    this.f389184f = false;
                } catch (Throwable th2) {
                    th = th2;
                    pc1.a((Closeable) dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = dataOutputStream2;
            }
        }
    }

    public interface c {
        void a(long j12);

        void a(ph phVar);

        void a(ph phVar, boolean z12);

        void a(HashMap<String, ph> map);

        void a(HashMap<String, ph> map, SparseArray<String> sparseArray);

        boolean a();

        void b();

        void b(HashMap<String, ph> map);
    }

    public qh(@j.P kt ktVar, @j.P File file) {
        a aVar = new a(ktVar);
        b bVar = new b(new File(file, "yandex_cached_content_index.exi"));
        this.f389172e = aVar;
        this.f389173f = bVar;
    }

    @j.l0
    public final void a(long j12) {
        c cVar;
        this.f389172e.a(j12);
        c cVar2 = this.f389173f;
        if (cVar2 != null) {
            cVar2.a(j12);
        }
        if (this.f389172e.a() || (cVar = this.f389173f) == null || !cVar.a()) {
            this.f389172e.a(this.f389168a, this.f389169b);
        } else {
            this.f389173f.a(this.f389168a, this.f389169b);
            this.f389172e.b(this.f389168a);
        }
        c cVar3 = this.f389173f;
        if (cVar3 != null) {
            cVar3.b();
            this.f389173f = null;
        }
    }

    public final ph b(String str) {
        ph phVar = this.f389168a.get(str);
        if (phVar != null) {
            return phVar;
        }
        SparseArray<String> sparseArray = this.f389169b;
        int size = sparseArray.size();
        int i12 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i12 < size && i12 == sparseArray.keyAt(i12)) {
                i12++;
            }
            iKeyAt = i12;
        }
        ph phVar2 = new ph(iKeyAt, str, oo.f388598c);
        this.f389168a.put(str, phVar2);
        this.f389169b.put(iKeyAt, str);
        this.f389171d.put(iKeyAt, true);
        this.f389172e.a(phVar2);
        return phVar2;
    }

    @j.l0
    public final void c() {
        this.f389172e.a(this.f389168a);
        int size = this.f389170c.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f389169b.remove(this.f389170c.keyAt(i12));
        }
        this.f389170c.clear();
        this.f389171d.clear();
    }

    public static final class a implements c {

        /* renamed from: e, reason: collision with root package name */
        private static final String[] f389174e = {"id", "key", "metadata"};

        /* renamed from: a, reason: collision with root package name */
        private final mn f389175a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<ph> f389176b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private String f389177c;

        /* renamed from: d, reason: collision with root package name */
        private String f389178d;

        public a(kt ktVar) {
            this.f389175a = ktVar;
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void a(long j12) {
            String hexString = Long.toHexString(j12);
            this.f389177c = hexString;
            this.f389178d = up1.a("ExoPlayerCacheIndex", hexString);
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void b() throws ln {
            mn mnVar = this.f389175a;
            String str = this.f389177c;
            str.getClass();
            try {
                String strConcat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = mnVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    ke1.a(writableDatabase, str);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e12) {
                throw new ln(e12);
            }
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final boolean a() {
            SQLiteDatabase readableDatabase = this.f389175a.getReadableDatabase();
            String str = this.f389177c;
            str.getClass();
            return ke1.a(readableDatabase, 1, str) != -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[Catch: SQLiteException -> 0x00c9, SYNTHETIC, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x00c9, blocks: (B:43:0x00d6, B:42:0x00d3, B:33:0x00c5, B:38:0x00cd), top: B:48:0x0082, inners: #0 }] */
        @Override // com.yandex.mobile.ads.impl.qh.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.util.HashMap<java.lang.String, com.yandex.mobile.ads.impl.ph> r16, android.util.SparseArray<java.lang.String> r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qh.a.a(java.util.HashMap, android.util.SparseArray):void");
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void b(HashMap<String, ph> map) throws ln {
            try {
                SQLiteDatabase writableDatabase = this.f389175a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    String str = this.f389177c;
                    str.getClass();
                    ke1.a(writableDatabase, 1, str, 1);
                    String str2 = this.f389178d;
                    str2.getClass();
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                    writableDatabase.execSQL("CREATE TABLE " + this.f389178d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                    for (ph phVar : map.values()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        oo ooVarA = phVar.a();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry<String, byte[]>> setA = ooVarA.a();
                        dataOutputStream.writeInt(setA.size());
                        for (Map.Entry<String, byte[]> entry : setA) {
                            dataOutputStream.writeUTF(entry.getKey());
                            byte[] value = entry.getValue();
                            dataOutputStream.writeInt(value.length);
                            dataOutputStream.write(value);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", Integer.valueOf(phVar.f388832a));
                        contentValues.put("key", phVar.f388833b);
                        contentValues.put("metadata", byteArray);
                        String str3 = this.f389178d;
                        str3.getClass();
                        writableDatabase.replaceOrThrow(str3, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f389176b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            } catch (SQLException e12) {
                throw new ln(e12);
            }
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void a(HashMap<String, ph> map) throws ln {
            if (this.f389176b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f389175a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i12 = 0; i12 < this.f389176b.size(); i12++) {
                    try {
                        ph phVarValueAt = this.f389176b.valueAt(i12);
                        if (phVarValueAt == null) {
                            int iKeyAt = this.f389176b.keyAt(i12);
                            String str = this.f389178d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            oo ooVarA = phVarValueAt.a();
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            Set<Map.Entry<String, byte[]>> setA = ooVarA.a();
                            dataOutputStream.writeInt(setA.size());
                            for (Map.Entry<String, byte[]> entry : setA) {
                                dataOutputStream.writeUTF(entry.getKey());
                                byte[] value = entry.getValue();
                                dataOutputStream.writeInt(value.length);
                                dataOutputStream.write(value);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("id", Integer.valueOf(phVarValueAt.f388832a));
                            contentValues.put("key", phVarValueAt.f388833b);
                            contentValues.put("metadata", byteArray);
                            String str2 = this.f389178d;
                            str2.getClass();
                            writableDatabase.replaceOrThrow(str2, null, contentValues);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f389176b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e12) {
                throw new ln(e12);
            }
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void a(ph phVar) {
            this.f389176b.put(phVar.f388832a, phVar);
        }

        @Override // com.yandex.mobile.ads.impl.qh.c
        public final void a(ph phVar, boolean z12) {
            if (z12) {
                this.f389176b.delete(phVar.f388832a);
            } else {
                this.f389176b.put(phVar.f388832a, null);
            }
        }
    }

    public final void c(String str) {
        ph phVar = this.f389168a.get(str);
        if (phVar != null && phVar.c() && phVar.d()) {
            this.f389168a.remove(str);
            int i12 = phVar.f388832a;
            boolean z12 = this.f389171d.get(i12);
            this.f389172e.a(phVar, z12);
            if (z12) {
                this.f389169b.remove(i12);
                this.f389171d.delete(i12);
            } else {
                this.f389169b.put(i12, null);
                this.f389170c.put(i12, true);
            }
        }
    }

    @j.P
    public final ph a(String str) {
        return this.f389168a.get(str);
    }

    public final Collection<ph> a() {
        return Collections.unmodifiableCollection(this.f389168a.values());
    }

    public final void b() {
        Iterator it = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f389168a.keySet()).iterator();
        while (it.hasNext()) {
            c((String) it.next());
        }
    }

    @j.P
    public final String a(int i12) {
        return this.f389169b.get(i12);
    }

    public final void a(String str, tl tlVar) {
        ph phVarB = b(str);
        if (phVarB.a(tlVar)) {
            this.f389172e.a(phVarB);
        }
    }

    public static oo a(DataInputStream dataInputStream) throws IOException {
        int i12 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < i12; i13++) {
            String utf = dataInputStream.readUTF();
            int i14 = dataInputStream.readInt();
            if (i14 >= 0) {
                int iMin = Math.min(i14, 10485760);
                byte[] bArrCopyOf = pc1.f388773f;
                int i15 = 0;
                while (i15 != i14) {
                    int i16 = i15 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i16);
                    dataInputStream.readFully(bArrCopyOf, i15, iMin);
                    iMin = Math.min(i14 - i16, 10485760);
                    i15 = i16;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(ba.a("Invalid value size: ", i14));
            }
        }
        return new oo(map);
    }
}
