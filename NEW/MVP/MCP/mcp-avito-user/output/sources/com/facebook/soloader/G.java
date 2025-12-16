package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import com.facebook.soloader.SysUtil;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: UnpackingSoSource.java */
/* loaded from: classes16.dex */
public abstract class G extends C36427d {

    /* renamed from: d, reason: collision with root package name */
    public final Context f340835d;

    /* renamed from: e, reason: collision with root package name */
    @I41.h
    public String f340836e;

    /* renamed from: f, reason: collision with root package name */
    @I41.h
    public s f340837f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f340838g;

    /* compiled from: UnpackingSoSource.java */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public final String f340839b;

        /* renamed from: c, reason: collision with root package name */
        public final String f340840c;

        public a(String str, String str2) {
            this.f340839b = str;
            this.f340840c = str2;
        }
    }

    /* compiled from: UnpackingSoSource.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final a[] f340841a;

        public b(a[] aVarArr) {
            this.f340841a = aVarArr;
        }

        public static final b a(RandomAccessFile randomAccessFile) throws IOException {
            if (randomAccessFile.readByte() != 1) {
                throw new RuntimeException("wrong dso manifest version");
            }
            int i12 = randomAccessFile.readInt();
            if (i12 < 0) {
                throw new RuntimeException("illegal number of shared libraries");
            }
            a[] aVarArr = new a[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                aVarArr[i13] = new a(randomAccessFile.readUTF(), randomAccessFile.readUTF());
            }
            return new b(aVarArr);
        }
    }

    /* compiled from: UnpackingSoSource.java */
    public interface c extends Closeable {
        a C1();

        int available();

        String getFileName();

        void i6(RandomAccessFile randomAccessFile, byte[] bArr);
    }

    /* compiled from: UnpackingSoSource.java */
    public static class e implements c {

        /* renamed from: b, reason: collision with root package name */
        public final a f340842b;

        /* renamed from: c, reason: collision with root package name */
        public final InputStream f340843c;

        public e(a aVar, InputStream inputStream) {
            this.f340842b = aVar;
            this.f340843c = inputStream;
        }

        @Override // com.facebook.soloader.G.c
        public final a C1() {
            return this.f340842b;
        }

        @Override // com.facebook.soloader.G.c
        public final int available() {
            return this.f340843c.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f340843c.close();
        }

        @Override // com.facebook.soloader.G.c
        public final String getFileName() {
            return this.f340842b.f340839b;
        }

        @Override // com.facebook.soloader.G.c
        public final void i6(RandomAccessFile randomAccessFile, byte[] bArr) throws IOException {
            int i12 = 0;
            while (i12 < Integer.MAX_VALUE) {
                int i13 = this.f340843c.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i12));
                if (i13 == -1) {
                    return;
                }
                randomAccessFile.write(bArr, 0, i13);
                i12 += i13;
            }
        }
    }

    public G(Context context, String str) {
        super(j(context, str), 1);
        this.f340838g = new HashMap();
        this.f340835d = context;
    }

    public static File j(Context context, String str) {
        return new File(androidx.camera.camera2.internal.G.g(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str));
    }

    public static void n(File file, byte b12) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b12);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException unused) {
        }
    }

    @Override // com.facebook.soloader.C36427d, com.facebook.soloader.D
    public final int a(String str, int i12, StrictMode.ThreadPolicy threadPolicy) {
        int iD2;
        synchronized (i(str)) {
            iD2 = d(str, i12, this.f340869a, threadPolicy);
        }
        return iD2;
    }

    @Override // com.facebook.soloader.D
    public final void b(int i12) throws IOException {
        File file = this.f340869a;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(androidx.compose.ui.graphics.colorspace.e.j(file, "cannot mkdir: "));
        }
        s sVarC = SysUtil.c(file, new File(file, "dso_lock"), true);
        if (this.f340837f == null) {
            this.f340837f = SysUtil.c(file, new File(file, "dso_instance_lock"), false);
        }
        boolean zCanWrite = file.canWrite();
        try {
            Objects.toString(file);
            if (!zCanWrite) {
                file.setWritable(true);
            }
            if (l(sVarC, i12, h())) {
                sVarC = null;
            } else {
                Objects.toString(file);
            }
        } finally {
            if (!zCanWrite) {
                file.setWritable(false);
            }
            if (sVarC != null) {
                Objects.toString(file);
                sVarC.close();
            } else {
                Objects.toString(file);
            }
        }
    }

    public final void e(a[] aVarArr) throws IOException {
        File file = this.f340869a;
        String[] list = file.list();
        if (list == null) {
            throw new IOException("unable to list directory " + file);
        }
        for (String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_instance_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z12 = false;
                for (int i12 = 0; !z12 && i12 < aVarArr.length; i12++) {
                    if (aVarArr[i12].f340839b.equals(str)) {
                        z12 = true;
                    }
                }
                if (!z12) {
                    File file2 = new File(file, str);
                    file2.toString();
                    SysUtil.a(file2);
                }
            }
        }
    }

    public final void f(c cVar, byte[] bArr) throws IOException {
        File file = this.f340869a;
        String str = cVar.C1().f340839b;
        try {
            if (file.setWritable(true)) {
                g(cVar, bArr);
            } else {
                throw new IOException("cannot make directory writable for us: " + file);
            }
        } finally {
            if (!file.setWritable(false)) {
                file.getCanonicalPath();
            }
        }
    }

    public final void g(c cVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        File file = new File(this.f340869a, cVar.getFileName());
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists() && !file.setWritable(true)) {
                    file.toString();
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (IOException unused) {
                    file.toString();
                    SysUtil.a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int iAvailable = cVar.available();
                if (iAvailable > 1) {
                    SysUtil.LollipopSysdeps.fallocateIfSupported(randomAccessFile2.getFD(), iAvailable);
                }
                cVar.i6(randomAccessFile2, bArr);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (!file.setExecutable(true, false)) {
                    throw new IOException("cannot make file executable: " + file);
                }
                if (!file.setWritable(false)) {
                    file.toString();
                }
                randomAccessFile2.close();
            } catch (IOException e12) {
                SysUtil.a(file);
                throw e12;
            }
        } catch (Throwable th2) {
            if (!file.setWritable(false)) {
                file.toString();
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th2;
        }
    }

    public byte[] h() {
        Parcel parcelObtain = Parcel.obtain();
        f fVarK = k();
        try {
            a[] aVarArr = fVarK.a().f340841a;
            parcelObtain.writeByte((byte) 1);
            parcelObtain.writeInt(aVarArr.length);
            for (int i12 = 0; i12 < aVarArr.length; i12++) {
                parcelObtain.writeString(aVarArr[i12].f340839b);
                parcelObtain.writeString(aVarArr[i12].f340840c);
            }
            fVarK.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th2) {
            try {
                fVarK.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Object i(String str) {
        Object obj;
        synchronized (this.f340838g) {
            try {
                obj = this.f340838g.get(str);
                if (obj == null) {
                    obj = new Object();
                    this.f340838g.put(str, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public abstract f k();

    public final boolean l(s sVar, int i12, byte[] bArr) throws IOException {
        byte b12;
        b bVarA;
        File file = this.f340869a;
        File file2 = new File(file, "dso_state");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            b12 = randomAccessFile.readByte();
        } catch (EOFException unused) {
        } catch (Throwable th2) {
            throw th2;
        }
        if (b12 != 1) {
            Objects.toString(file);
            b12 = 0;
        }
        randomAccessFile.close();
        File file3 = new File(file, "dso_deps");
        randomAccessFile = new RandomAccessFile(file3, "rw");
        try {
            int length = (int) randomAccessFile.length();
            byte[] bArr2 = new byte[length];
            if (randomAccessFile.read(bArr2) != length) {
                b12 = 0;
            }
            if (!Arrays.equals(bArr2, bArr)) {
                b12 = 0;
            }
            if (b12 == 0 || (i12 & 2) != 0) {
                n(file2, (byte) 0);
                f fVarK = k();
                try {
                    bVarA = fVarK.a();
                    m(b12, bVarA, fVarK.b());
                    fVarK.close();
                } finally {
                }
            } else {
                bVarA = null;
            }
            randomAccessFile.close();
            if (bVarA == null) {
                return false;
            }
            F f12 = new F(this, file3, bArr, bVarA, file2, sVar);
            if ((i12 & 1) != 0) {
                new Thread(f12, "SoSync:" + file.getName()).start();
            } else {
                f12.run();
            }
            return true;
        } finally {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void m(byte b12, b bVar, d dVar) throws IOException {
        b bVarA;
        a aVar;
        File file = this.f340869a;
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file, "dso_manifest"), "rw");
        if (b12 == 1) {
            try {
                try {
                    bVarA = b.a(randomAccessFile);
                } catch (Throwable th2) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Exception unused) {
            }
        } else {
            bVarA = null;
        }
        if (bVarA == null) {
            bVarA = new b(new a[0]);
        }
        e(bVar.f340841a);
        byte[] bArr = new byte[32768];
        while (dVar.a()) {
            e eVarB = dVar.b();
            boolean z12 = true;
            int i12 = 0;
            while (true) {
                aVar = eVarB.f340842b;
                if (!z12) {
                    break;
                }
                try {
                    a[] aVarArr = bVarA.f340841a;
                    if (i12 >= aVarArr.length) {
                        break;
                    }
                    if (aVarArr[i12].f340839b.equals(aVar.f340839b) && bVarA.f340841a[i12].f340840c.equals(aVar.f340840c)) {
                        z12 = false;
                    }
                    i12++;
                } catch (Throwable th4) {
                    try {
                        eVarB.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            if (!new File(file, aVar.f340839b).exists()) {
                z12 = true;
            }
            if (z12) {
                f(eVarB, bArr);
            }
            eVarB.close();
        }
        randomAccessFile.close();
    }

    /* compiled from: UnpackingSoSource.java */
    public static abstract class d implements Closeable {
        public abstract boolean a();

        @I41.h
        public abstract e b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* compiled from: UnpackingSoSource.java */
    public static abstract class f implements Closeable {
        public abstract b a();

        public abstract d b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
