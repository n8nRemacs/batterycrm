package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public abstract class hz5 {
    public static final byte[] a = {44};
    public static final AtomicReference b = new AtomicReference();

    public static void a(File file, File file2, boolean z) throws IOException {
        AtomicReference atomicReference = b;
        if (file == null || file.getParentFile() == null || e(file2) == 0) {
            return;
        }
        if (!file.exists()) {
            f(file.getParentFile());
            try {
                if (file2.renameTo(file)) {
                    return;
                }
            } catch (SecurityException e) {
                throw new IOException("Can't grab file due to security restrictions", e);
            }
        }
        InputStream fileInputStream = new FileInputStream(file2);
        if (z) {
            fileInputStream = new GZIPInputStream(fileInputStream);
        }
        try {
            long jE = e(file);
            OutputStream fileOutputStream = new FileOutputStream(file, true);
            byte[] bArr = (byte[]) atomicReference.getAndSet(null);
            if (bArr == null) {
                bArr = new byte[4096];
            }
            if (z) {
                try {
                    fileOutputStream = new GZIPOutputStream(fileOutputStream, 4096, true);
                } finally {
                    atomicReference.set(bArr);
                }
            }
            if (jE > 0) {
                try {
                    fileOutputStream.write(a);
                } finally {
                }
            }
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i < 0) {
                    fileOutputStream.close();
                    fileInputStream.close();
                    b(file2);
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void b(File file) throws IOException {
        if (file == null || c(file) || c(file)) {
            return;
        }
        throw new IOException("Cannot delete file " + file);
    }

    public static boolean c(File file) {
        File[] fileArrListFiles;
        try {
            if (!file.isDirectory()) {
                if (file.exists()) {
                    return file.delete();
                }
                return true;
            }
            if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (!c(file2)) {
                        return false;
                    }
                }
            }
            return file.delete();
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean d(File file) throws IOException {
        if (file != null && e(file) != 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    new GZIPInputStream(fileInputStream, 4096).close();
                    fileInputStream.close();
                    return true;
                } finally {
                }
            } catch (ZipException unused) {
            }
        }
        return false;
    }

    public static long e(File file) {
        if (file == null) {
            return 0L;
        }
        try {
            return file.length();
        } catch (SecurityException unused) {
            return 0L;
        }
    }

    public static void f(File file) throws IOException {
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            throw new IOException("Cannot create directory " + file.getAbsolutePath());
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IOException(file.getAbsolutePath() + " is expected to be a directory");
    }

    public static void g(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IOException("missing parent file for " + file.getPath());
        }
        f(parentFile);
        if (!file.exists() || file.isFile()) {
            return;
        }
        throw new IOException(file.getAbsolutePath() + " is expected to be a file");
    }

    public static void h(InputStream inputStream, OutputStream... outputStreamArr) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = 0;
            try {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                for (OutputStream outputStream : outputStreamArr) {
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, i2);
                    }
                }
            } finally {
                int length = outputStreamArr.length;
                while (i < length) {
                    OutputStream outputStream2 = outputStreamArr[i];
                    if (outputStream2 != null) {
                        try {
                            outputStream2.flush();
                        } catch (IOException unused) {
                        }
                    }
                    i++;
                }
            }
        }
    }

    public static ArrayList i(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (!file.exists()) {
            file.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file2);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (!zipEntryNextElement.isDirectory()) {
                    File file3 = new File(file, zipEntryNextElement.getName());
                    File parentFile = file3.getParentFile();
                    if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                        int i = 0;
                        try {
                            h(inputStream, fileOutputStream);
                            Closeable[] closeableArr = {inputStream, fileOutputStream};
                            while (i < 2) {
                                Closeable closeable = closeableArr[i];
                                if (closeable != null) {
                                    try {
                                        closeable.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                i++;
                            }
                            arrayList.add(zipEntryNextElement.getName());
                        } catch (Throwable th) {
                            Closeable[] closeableArr2 = {inputStream, fileOutputStream};
                            while (i < 2) {
                                Closeable closeable2 = closeableArr2[i];
                                if (closeable2 != null) {
                                    try {
                                        closeable2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                i++;
                            }
                            throw th;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to ensure directory: ");
                    sb.append(parentFile != null ? parentFile.getAbsolutePath() : null);
                    throw new FileNotFoundException(sb.toString());
                }
            }
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            return arrayList;
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (IOException unused4) {
            }
            throw th2;
        }
    }
}
