package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Range;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.media3.database.DatabaseIOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;

/* loaded from: classes2.dex */
public final class fa6 implements hz0, e1e {
    public static final String[] o = {"id", "key", "metadata"};
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public fa6(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A() {
        /*
            r8 = this;
            byte[] r0 = defpackage.yxg.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L46
        L10:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L46
            kbd r2 = (defpackage.kbd) r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r8.c     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L46
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L46
            r4 = 64
            if (r3 < r4) goto L29
            goto L48
        L29:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch: java.lang.Throwable -> L46
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L46
            r4 = 5
            if (r3 < r4) goto L33
            goto L10
        L33:
            r1.remove()     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch: java.lang.Throwable -> L46
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L46
            r0.add(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r8.c     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L46
            r3.add(r2)     // Catch: java.lang.Throwable -> L46
            goto L10
        L46:
            r0 = move-exception
            goto L9d
        L48:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r1 = r8.c     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L9a
            r1.size()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r1 = r8.d     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L9a
            r1.size()     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L5e:
            if (r2 >= r1) goto L99
            java.lang.Object r3 = r0.get(r2)
            kbd r3 = (defpackage.kbd) r3
            java.util.concurrent.ExecutorService r4 = r8.s()
            mbd r5 = r3.c
            byte[] r6 = defpackage.yxg.a
            r4.execute(r3)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.RejectedExecutionException -> L74
            goto L8e
        L72:
            r0 = move-exception
            goto L91
        L74:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r6.initCause(r4)     // Catch: java.lang.Throwable -> L72
            r5.j(r6)     // Catch: java.lang.Throwable -> L72
            ou1 r4 = r3.b     // Catch: java.lang.Throwable -> L72
            r4.j(r5, r6)     // Catch: java.lang.Throwable -> L72
            sua r4 = r5.y0
            fa6 r4 = r4.a
            r4.u(r3)
        L8e:
            int r2 = r2 + 1
            goto L5e
        L91:
            sua r1 = r5.y0
            fa6 r1 = r1.a
            r1.u(r3)
            throw r0
        L99:
            return
        L9a:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9a
            throw r0     // Catch: java.lang.Throwable -> L46
        L9d:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa6.A():void");
    }

    public void B(wib wibVar) {
        hc8 hc8Var = (hc8) this.a;
        fc0 fc0Var = (fc0) hc8Var.b;
        if (fc0Var == null) {
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }
        ec0 ec0Var = new ec0();
        ec0Var.a = fc0Var.a;
        ec0Var.b = fc0Var.b;
        ec0Var.c = fc0Var.c;
        ec0Var.d = Integer.valueOf(fc0Var.d);
        ec0Var.a = wibVar;
        hc8Var.b = ec0Var.a();
    }

    public void C(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(wy1.e(i, "The requested target bitrate ", " is not supported. Target bitrate must be greater than 0."));
        }
        hc8 hc8Var = (hc8) this.a;
        fc0 fc0Var = (fc0) hc8Var.b;
        if (fc0Var == null) {
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }
        ec0 ec0Var = new ec0();
        ec0Var.a = fc0Var.a;
        ec0Var.b = fc0Var.b;
        ec0Var.c = fc0Var.c;
        ec0Var.d = Integer.valueOf(fc0Var.d);
        ec0Var.c = new Range(Integer.valueOf(i), Integer.valueOf(i));
        hc8Var.b = ec0Var.a();
    }

    @Override // defpackage.e1e
    public uz9 a() {
        return (uz9) this.c;
    }

    @Override // defpackage.hz0
    public void b(HashMap map) throws DatabaseIOException {
        try {
            SQLiteDatabase writableDatabase = ((df4) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                x(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    p(writableDatabase, (gz0) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.c).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.e1e
    public void c(ContentResolver contentResolver, Uri uri) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, "w");
        if (outputStreamOpenOutputStream == null) {
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream((File) this.b);
            try {
                byte[] bArr = new byte[1024];
                for (int i = fileInputStream.read(bArr); i > 0; i = fileInputStream.read(bArr)) {
                    outputStreamOpenOutputStream.write(bArr, 0, i);
                }
                fileInputStream.close();
                outputStreamOpenOutputStream.close();
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.hz0
    public void d(gz0 gz0Var, boolean z) {
        int i = gz0Var.a;
        SparseArray sparseArray = (SparseArray) this.c;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // defpackage.hz0
    public void e(gz0 gz0Var) {
        ((SparseArray) this.c).put(gz0Var.a, gz0Var);
    }

    @Override // defpackage.hz0
    public boolean f() throws DatabaseIOException {
        try {
            SQLiteDatabase readableDatabase = ((df4) this.b).getReadableDatabase();
            String str = (String) this.a;
            str.getClass();
            return c0h.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.hz0
    public void g(HashMap map) throws DatabaseIOException {
        SparseArray sparseArray = (SparseArray) this.c;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((df4) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    gz0 gz0Var = (gz0) sparseArray.valueAt(i);
                    if (gz0Var == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = (String) this.d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        p(writableDatabase, gz0Var);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.e1e
    public Integer getHeight() {
        return null;
    }

    @Override // defpackage.e1e
    public Integer getWidth() {
        return null;
    }

    @Override // defpackage.e1e
    public Uri h() {
        return (Uri) this.d;
    }

    @Override // defpackage.e1e
    public String i() {
        return (String) this.a;
    }

    @Override // defpackage.hz0
    public void j(long j) {
        String hexString = Long.toHexString(j);
        this.a = hexString;
        this.d = wy1.h("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.e1e
    public Integer k() {
        return null;
    }

    @Override // defpackage.hz0
    public void l(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
        df4 df4Var = (df4) this.b;
        hsi.g(((SparseArray) this.c).size() == 0);
        try {
            SQLiteDatabase readableDatabase = df4Var.getReadableDatabase();
            String str = (String) this.a;
            str.getClass();
            if (c0h.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = df4Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    x(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = df4Var.getReadableDatabase();
            String str2 = (String) this.d;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, o, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new gz0(i, string, ra3.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.hz0
    public void m() throws DatabaseIOException {
        df4 df4Var = (df4) this.b;
        String str = (String) this.a;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = df4Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = c0h.a;
                try {
                    if (zxg.j0(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.e1e
    public void n(File file) throws IOException {
        File file2 = (File) this.b;
        if (!file2.exists()) {
            throw new NoSuchFileException(file2, null, "The source file doesn't exist.");
        }
        if (file.exists() && !file.delete()) {
            throw new FileAlreadyExistsException(file2, file, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file2.isDirectory()) {
            if (!file.mkdirs()) {
                throw new FileSystemException(file2, file, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                swi.a(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public void o(ry9 ry9Var) {
        if (ry9Var instanceof x3a) {
            this.a = (x3a) ry9Var;
            return;
        }
        if (ry9Var instanceof v3a) {
            this.b = (v3a) ry9Var;
        } else if (ry9Var instanceof y3a) {
            this.d = (y3a) ry9Var;
        } else {
            if (!(ry9Var instanceof ks8)) {
                throw new IllegalArgumentException("Unsupported metadata");
            }
            ((HashSet) this.c).add((ks8) ry9Var);
        }
    }

    public void p(SQLiteDatabase sQLiteDatabase, gz0 gz0Var) throws SQLException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ra3.b(gz0Var.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(gz0Var.a));
        contentValues.put("key", gz0Var.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public bhd q() {
        return new bhd((ExecutorService) this.b, ((hc8) this.a).t(), (ycd) this.c, (ycd) this.d);
    }

    public synchronized void r() {
        try {
            Iterator it = ((ArrayDeque) this.b).iterator();
            while (it.hasNext()) {
                ((kbd) it.next()).c.d();
            }
            Iterator it2 = ((ArrayDeque) this.c).iterator();
            while (it2.hasNext()) {
                ((kbd) it2.next()).c.d();
            }
            Iterator it3 = ((ArrayDeque) this.d).iterator();
            while (it3.hasNext()) {
                ((mbd) it3.next()).d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ExecutorService s() {
        try {
            if (((ExecutorService) this.a) == null) {
                this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new no3(yxg.g + " Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExecutorService) this.a;
    }

    public void t(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        A();
    }

    public void u(kbd kbdVar) {
        kbdVar.a.decrementAndGet();
        t((ArrayDeque) this.c, kbdVar);
    }

    public jrf v(l7 l7Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jrf jrfVar = (jrf) arrayList.get(i);
            if (jrfVar != null && jrfVar.b == l7Var) {
                return jrfVar;
            }
        }
        jrf jrfVar2 = new jrf((Context) this.b, l7Var);
        arrayList.add(jrfVar2);
        return jrfVar2;
    }

    public vy9 w(String str) {
        if (!((ConcurrentHashMap) this.d).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.d).containsKey(str)) {
                        try {
                            InputStream inputStreamN = ((cz9) this.a).n(str);
                            ((dz9) this.b).getClass();
                            for (pub pubVar : dz9.a(inputStreamN)) {
                                jm3 jm3Var = (jm3) this.c;
                                i5i i5iVar = jm3Var.b;
                                if (((String) ((jn8) i5iVar.b).e(pubVar)).equals("001")) {
                                    jm3Var.a.b(pubVar);
                                } else {
                                    i5iVar.b(pubVar);
                                }
                            }
                            ((ConcurrentHashMap) this.d).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            throw new IllegalStateException("Failed to read file " + str, e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (jm3) this.c;
    }

    public void x(SQLiteDatabase sQLiteDatabase) throws SQLException {
        String str = (String) this.a;
        str.getClass();
        c0h.b(sQLiteDatabase, 1, str, 1);
        String str2 = (String) this.d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.d) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public boolean y(l7 l7Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(v(l7Var), new dg9((Context) this.b, (nrf) menuItem));
    }

    public boolean z(l7 l7Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        jrf jrfVarV = v(l7Var);
        z0f z0fVar = (z0f) this.d;
        Menu pg9Var = (Menu) z0fVar.get(menu);
        if (pg9Var == null) {
            pg9Var = new pg9((Context) this.b, (vf9) menu);
            z0fVar.put(menu, pg9Var);
        }
        return callback.onCreateActionMode(jrfVarV, pg9Var);
    }

    public fa6(int i) {
        switch (i) {
            case 7:
                this.a = new x3a(0);
                this.c = new HashSet();
                long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + 2082844800;
                this.d = new y3a(jCurrentTimeMillis, jCurrentTimeMillis);
                break;
            case 8:
            case 10:
            default:
                this.b = new ArrayDeque();
                this.c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 9:
                this.b = null;
                ycd ycdVar = bhd.m0;
                this.c = ycdVar;
                this.d = ycdVar;
                this.a = sa0.a();
                break;
            case 11:
                this.a = new us(0);
                this.b = new SparseArray();
                this.c = new ek8((Object) null);
                this.d = new us(0);
                break;
        }
    }
}
