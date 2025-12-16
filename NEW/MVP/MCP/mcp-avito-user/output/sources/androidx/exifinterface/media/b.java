package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import j.InterfaceC42164u;
import j.X;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* compiled from: ExifInterfaceUtils.java */
/* loaded from: classes.dex */
class b {

    /* compiled from: ExifInterfaceUtils.java */
    @X
    public static class a {
        @InterfaceC42164u
        public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        @InterfaceC42164u
        public static FileDescriptor b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        @InterfaceC42164u
        public static long c(FileDescriptor fileDescriptor, long j12, int i12) {
            return Os.lseek(fileDescriptor, j12, i12);
        }
    }

    /* compiled from: ExifInterfaceUtils.java */
    @X
    /* renamed from: androidx.exifinterface.media.b$b, reason: collision with other inner class name */
    public static class C1788b {
        @InterfaceC42164u
        public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e12) {
                throw e12;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            jArr[i12] = iArr[i12];
        }
        return jArr;
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i12 = inputStream.read(bArr);
            if (i12 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i12);
            }
        }
    }

    public static void d(InputStream inputStream, OutputStream outputStream, int i12) throws IOException {
        byte[] bArr = new byte[8192];
        while (i12 > 0) {
            int iMin = Math.min(i12, 8192);
            int i13 = inputStream.read(bArr, 0, iMin);
            if (i13 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i12 -= i13;
            outputStream.write(bArr, 0, i13);
        }
    }
}
