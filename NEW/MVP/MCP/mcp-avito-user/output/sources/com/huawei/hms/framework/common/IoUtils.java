package com.huawei.hms.framework.common;

import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* loaded from: classes7.dex */
public class IoUtils {
    public static void close(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static void closeSecure(Reader reader) throws IOException {
        closeSecure((Closeable) reader);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        String packageName = ContextHolder.getAppContext() != null ? ContextHolder.getAppContext().getPackageName() : "";
        byte[] bArr = new byte[4096];
        long j12 = 0;
        while (true) {
            int i12 = inputStream.read(bArr);
            if (-1 == i12) {
                return j12;
            }
            if (j12 > 16777216 && !"com.huawei.health".equals(packageName)) {
                throw new IOException("input data too large for byte.");
            }
            outputStream.write(bArr, 0, i12);
            j12 += i12;
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void closeSecure(Writer writer) throws IOException {
        closeSecure((Closeable) writer);
    }

    public static void closeSecure(InputStream inputStream) throws IOException {
        closeSecure((Closeable) inputStream);
    }

    public static void closeSecure(OutputStream outputStream) throws IOException {
        closeSecure((Closeable) outputStream);
    }

    public static void closeSecure(Closeable closeable) throws IOException {
        if (closeable == null) {
            Logger.w("IOUtil", "closeable is null");
            return;
        }
        try {
            closeable.close();
        } catch (IOException e12) {
            Logger.w("IOUtil", "closeSecure IOException", e12);
        }
    }
}
