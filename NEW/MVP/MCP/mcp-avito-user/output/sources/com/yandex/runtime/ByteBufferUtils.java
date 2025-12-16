package com.yandex.runtime;

import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okhttp3.internal.http2.Http2;

/* loaded from: classes8.dex */
public final class ByteBufferUtils {
    private ByteBufferUtils() {
    }

    public static ByteBuffer fromAsset(AssetManager assetManager, String str) {
        return fromInputStream(assetManager.open(str));
    }

    public static ByteBuffer fromByteArray(byte[] bArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        return byteBufferAllocateDirect;
    }

    public static ByteBuffer fromFile(String str) throws IOException {
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        try {
            byte[] bArr = new byte[(int) file.length()];
            dataInputStream.readFully(bArr);
            return fromByteArray(bArr);
        } finally {
            fileInputStream.close();
        }
    }

    public static ByteBuffer fromInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i12 = inputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i12 == -1) {
                    byteArrayOutputStream.flush();
                    ByteBuffer byteBufferFromByteArray = fromByteArray(byteArrayOutputStream.toByteArray());
                    inputStream.close();
                    return byteBufferFromByteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    public static ByteBuffer fromResource(Resources resources, int i12) {
        return fromInputStream(resources.openRawResource(i12));
    }
}
