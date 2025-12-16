package com.google.firebase.messaging;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: ByteStreams.java */
/* renamed from: com.google.firebase.messaging.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37609c {
    public static byte[] a(ArrayDeque arrayDeque, int i12) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i12) {
            return bArr;
        }
        int length = i12 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i12 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i12 = 0;
        while (i12 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i12);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i13 = 0;
            while (i13 < iMin2) {
                int i14 = inputStream.read(bArr, i13, iMin2 - i13);
                if (i14 == -1) {
                    return a(arrayDeque, i12);
                }
                i13 += i14;
                i12 += i14;
            }
            long j12 = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j12 > 2147483647L ? Integer.MAX_VALUE : j12 < -2147483648L ? BeduinInputModel.MIN_TEXT_VERSION : (int) j12;
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* compiled from: ByteStreams.java */
    /* renamed from: com.google.firebase.messaging.c$a */
    public static final class a extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        public long f361848b;

        /* renamed from: c, reason: collision with root package name */
        public long f361849c;

        public a(InputStream inputStream) {
            super(inputStream);
            this.f361849c = -1L;
            this.f361848b = 1048577L;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f361848b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i12) {
            ((FilterInputStream) this).in.mark(i12);
            this.f361849c = this.f361848b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            if (this.f361848b == 0) {
                return -1;
            }
            int i12 = ((FilterInputStream) this).in.read();
            if (i12 != -1) {
                this.f361848b--;
            }
            return i12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f361849c == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f361848b = this.f361849c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j12) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j12, this.f361848b));
            this.f361848b -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i12, int i13) throws IOException {
            long j12 = this.f361848b;
            if (j12 == 0) {
                return -1;
            }
            int i14 = ((FilterInputStream) this).in.read(bArr, i12, (int) Math.min(i13, j12));
            if (i14 != -1) {
                this.f361848b -= i14;
            }
            return i14;
        }
    }
}
