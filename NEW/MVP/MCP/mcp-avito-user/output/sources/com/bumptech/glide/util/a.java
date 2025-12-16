package com.bumptech.glide.util;

import j.N;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference<byte[]> f339626a = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f339629a;

        /* renamed from: b, reason: collision with root package name */
        public final int f339630b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f339631c;

        public b(@N byte[] bArr, int i12, int i13) {
            this.f339631c = bArr;
            this.f339629a = i12;
            this.f339630b = i13;
        }
    }

    @N
    public static MappedByteBuffer a(@N File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @N
    public static byte[] b(@N ByteBuffer byteBuffer) {
        b bVar = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (bVar != null && bVar.f339629a == 0) {
            if (bVar.f339630b == bVar.f339631c.length) {
                return byteBuffer.array();
            }
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.position(0);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void c(@N ByteBuffer byteBuffer, @N File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @N
    public static InputStream d(@N ByteBuffer byteBuffer) {
        return new C10520a(byteBuffer);
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: com.bumptech.glide.util.a$a, reason: collision with other inner class name */
    public static class C10520a extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        @N
        public final ByteBuffer f339627b;

        /* renamed from: c, reason: collision with root package name */
        public int f339628c = -1;

        public C10520a(@N ByteBuffer byteBuffer) {
            this.f339627b = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f339627b.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i12) {
            this.f339628c = this.f339627b.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f339627b;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            int i12 = this.f339628c;
            if (i12 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f339627b.position(i12);
        }

        @Override // java.io.InputStream
        public final long skip(long j12) {
            ByteBuffer byteBuffer = this.f339627b;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j12, byteBuffer.remaining());
            byteBuffer.position((int) (byteBuffer.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public final int read(@N byte[] bArr, int i12, int i13) {
            ByteBuffer byteBuffer = this.f339627b;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i13, byteBuffer.remaining());
            byteBuffer.get(bArr, i12, iMin);
            return iMin;
        }
    }
}
