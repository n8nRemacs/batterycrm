package ru.ok.android.onelog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class Files {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final byte[] SEPARATOR = {44};
    private static AtomicReference<byte[]> BUF = new AtomicReference<>();

    private Files() {
    }

    public static void cat(File file, File file2) throws IOException {
        if (!file2.exists() || file2.length() == 0) {
            return;
        }
        if (!file.exists()) {
            mkdirs(file.getParentFile());
            if (file2.renameTo(file)) {
                return;
            }
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            byte[] bArrObtainBuf = obtainBuf();
            try {
                fileOutputStream.write(SEPARATOR);
                while (true) {
                    int i = fileInputStream.read(bArrObtainBuf);
                    if (i < 0) {
                        fileInputStream.close();
                        delete(file2);
                        return;
                    }
                    fileOutputStream.write(bArrObtainBuf, 0, i);
                }
            } finally {
                releaseBuf(bArrObtainBuf);
                fileOutputStream.close();
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public static void delete(File file) throws IOException {
        if (file.delete()) {
            return;
        }
        throw new IOException("Cannot delete file " + file);
    }

    public static void mkdirs(File file) throws IOException {
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

    public static void mkfile(File file) throws IOException {
        mkdirs(file.getParentFile());
        if (!file.exists() || file.isFile()) {
            return;
        }
        throw new IOException(file.getAbsolutePath() + " is expected to be a file");
    }

    private static byte[] obtainBuf() {
        byte[] andSet = BUF.getAndSet(null);
        return andSet != null ? andSet : new byte[4098];
    }

    private static void releaseBuf(byte[] bArr) {
        BUF.set(bArr);
    }

    public static void cat(File file, File... fileArr) throws IOException {
        for (File file2 : fileArr) {
            cat(file, file2);
        }
    }
}
