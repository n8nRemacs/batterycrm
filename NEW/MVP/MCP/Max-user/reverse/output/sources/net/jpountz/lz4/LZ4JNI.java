package net.jpountz.lz4;

import defpackage.ica;
import defpackage.vb9;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
enum LZ4JNI {
    ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v4 */
    static {
        File file;
        File fileCreateTempFile = ".";
        synchronized (ica.class) {
            if (!ica.a) {
                ica.a();
                try {
                    System.loadLibrary("lz4-java");
                    ica.a = true;
                } catch (UnsatisfiedLinkError unused) {
                    String strD = ica.d();
                    InputStream resourceAsStream = ica.class.getResourceAsStream(strD);
                    if (resourceAsStream == null) {
                        throw new UnsupportedOperationException("Unsupported OS/arch, cannot find " + strD + ". Please try building from source.");
                    }
                    File file2 = null;
                    try {
                        try {
                            fileCreateTempFile = File.createTempFile("liblz4-java-", "." + vb9.b(ica.c()) + ".lck");
                            try {
                                file = new File(fileCreateTempFile.getAbsolutePath().replaceFirst(".lck$", ""));
                            } catch (IOException e) {
                                e = e;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i = resourceAsStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i);
                                    }
                                }
                                fileOutputStream.close();
                                System.load(file.getAbsolutePath());
                                ica.a = true;
                                file.deleteOnExit();
                                fileCreateTempFile.deleteOnExit();
                            } finally {
                            }
                        } catch (IOException e2) {
                            e = e2;
                            throw new ExceptionInInitializerError("Cannot unpack liblz4-java: " + e);
                        } catch (Throwable th2) {
                            th = th2;
                            file2 = file;
                            if (ica.a) {
                                file2.deleteOnExit();
                                fileCreateTempFile.deleteOnExit();
                            } else {
                                if (file2 != null && file2.exists() && !file2.delete()) {
                                    throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary native library " + file2);
                                }
                                if (fileCreateTempFile != 0 && fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                                    throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary lock file " + fileCreateTempFile);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    } catch (Throwable th3) {
                        th = th3;
                        fileCreateTempFile = 0;
                    }
                }
            }
        }
        init();
    }

    public static native int LZ4_compressBound(int i);

    public static native int LZ4_compressHC(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4, int i5);

    public static native int LZ4_compress_limitedOutput(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4);

    public static native int LZ4_decompress_fast(byte[] bArr, ByteBuffer byteBuffer, int i, byte[] bArr2, ByteBuffer byteBuffer2, int i2, int i3);

    public static native int LZ4_decompress_safe(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4);

    public static native void init();
}
