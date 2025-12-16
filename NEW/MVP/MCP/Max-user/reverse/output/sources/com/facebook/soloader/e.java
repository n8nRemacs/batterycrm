package com.facebook.soloader;

import android.util.Log;
import defpackage.fwf;
import defpackage.n2;
import defpackage.rw5;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public abstract class e implements Closeable {
    public static void c(rw5 rw5Var, byte[] bArr, File file) {
        RandomAccessFile randomAccessFile;
        int i;
        StringBuilder sb = new StringBuilder("extracting DSO ");
        n2 n2Var = (n2) rw5Var.b;
        InputStream inputStream = (InputStream) rw5Var.c;
        sb.append((String) n2Var.b);
        String string = sb.toString();
        if (Log.isLoggable("fb-UnpackingSoSource", 4)) {
            Log.i("fb-UnpackingSoSource", string);
        }
        File file2 = new File(file, (String) n2Var.b);
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                try {
                    int iAvailable = inputStream.available();
                    if (iAvailable > 1) {
                        randomAccessFile = randomAccessFile2;
                        try {
                            SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile2.getFD(), iAvailable);
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                randomAccessFile.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } else {
                        randomAccessFile = randomAccessFile2;
                    }
                    int i2 = 0;
                    while (i2 < Integer.MAX_VALUE && (i = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2))) != -1) {
                        randomAccessFile.write(bArr, 0, i);
                        i2 += i;
                    }
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    if (!file2.setExecutable(true, false)) {
                        throw new IOException("cannot make file executable: " + file2);
                    }
                    randomAccessFile.close();
                    if (!file2.exists() || file2.setWritable(false)) {
                        return;
                    }
                    Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile = randomAccessFile2;
                }
            } catch (IOException e) {
                Log.e("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e);
                fwf.b(file2);
                throw e;
            }
        } catch (Throwable th5) {
            if (file2.exists() && !file2.setWritable(false)) {
                Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
            }
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract n2[] l();

    public abstract void w(File file);
}
