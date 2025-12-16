package com.google.android.play.core.assetpacks;

import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class B1 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358090h = new com.google.android.play.core.assetpacks.internal.F("SliceMetadataManager");

    /* renamed from: b, reason: collision with root package name */
    public final Q f358092b;

    /* renamed from: c, reason: collision with root package name */
    public final String f358093c;

    /* renamed from: d, reason: collision with root package name */
    public final int f358094d;

    /* renamed from: e, reason: collision with root package name */
    public final long f358095e;

    /* renamed from: f, reason: collision with root package name */
    public final String f358096f;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f358091a = new byte[8192];

    /* renamed from: g, reason: collision with root package name */
    public int f358097g = -1;

    public B1(Q q12, String str, int i12, long j12, String str2) {
        this.f358092b = q12;
        this.f358093c = str;
        this.f358094d = i12;
        this.f358095e = j12;
        this.f358096f = str2;
    }

    public final int a() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Q q12 = this.f358092b;
        q12.getClass();
        File file = new File(new File(new File(new File(q12.d(this.f358094d, this.f358095e, this.f358093c), "_slices"), "_metadata"), this.f358096f), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME)) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C37184v0("Slice checkpoint file corrupt.");
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    public final Z b() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Q q12 = this.f358092b;
        q12.getClass();
        File file = new File(new File(new File(new File(q12.d(this.f358094d, this.f358095e, this.f358093c), "_slices"), "_metadata"), this.f358096f), "checkpoint.dat");
        if (!file.exists()) {
            throw new C37184v0("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new C37184v0("Slice checkpoint file corrupt.");
            }
            try {
                int i12 = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j12 = Long.parseLong(properties.getProperty("fileOffset", DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME));
                long j13 = Long.parseLong(properties.getProperty("remainingBytes", DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME));
                int i13 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f358097g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new Z(i12, i13, j12, j13, property);
            } catch (NumberFormatException e12) {
                throw new C37184v0("Slice checkpoint file corrupt.", e12);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    public final File c() {
        Q q12 = this.f358092b;
        q12.getClass();
        File file = new File(new File(new File(q12.d(this.f358094d, this.f358095e, this.f358093c), "_slices"), "_metadata"), this.f358096f);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, this.f358097g + "-NAM.dat");
    }

    public final void d(long j12, byte[] bArr, int i12, int i13) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j12);
            randomAccessFile.write(bArr, i12, i13);
            randomAccessFile.close();
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    public final void e(int i12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i12));
        properties.put("metadataFileCounter", String.valueOf(this.f358097g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    public final void f(String str, long j12, long j13, int i12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j12));
        properties.put("remainingBytes", String.valueOf(j13));
        properties.put("previousChunk", String.valueOf(i12));
        properties.put("metadataFileCounter", String.valueOf(this.f358097g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    public final void g(int i12, byte[] bArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i12));
        properties.put("metadataFileCounter", String.valueOf(this.f358097g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            Q q12 = this.f358092b;
            q12.getClass();
            File file = new File(new File(new File(new File(q12.d(this.f358094d, this.f358095e, this.f358093c), "_slices"), "_metadata"), this.f358096f), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void h(int i12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i12));
        properties.put("metadataFileCounter", String.valueOf(this.f358097g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    public final void i(byte[] bArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        this.f358097g++;
        Q q12 = this.f358092b;
        q12.getClass();
        File file = new File(new File(new File(q12.d(this.f358094d, this.f358095e, this.f358093c), "_slices"), "_metadata"), this.f358096f);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, this.f358097g + "-LFH.dat"));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e12) {
            throw new C37184v0("Could not write metadata file.", e12);
        }
    }

    public final void j(InputStream inputStream, byte[] bArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        byte[] bArr2 = this.f358091a;
        this.f358097g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int i12 = inputStream.read(bArr2);
            while (i12 > 0) {
                fileOutputStream.write(bArr2, 0, i12);
                i12 = inputStream.read(bArr2);
            }
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    public final void k(int i12, byte[] bArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        this.f358097g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i12);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
            }
            throw th2;
        }
    }

    public final File l() throws IOException {
        Q q12 = this.f358092b;
        q12.getClass();
        File file = new File(new File(new File(new File(q12.d(this.f358094d, this.f358095e, this.f358093c), "_slices"), "_metadata"), this.f358096f), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }
}
