package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: ElfZipFileChannel.java */
/* loaded from: classes16.dex */
public class p implements n {

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public InputStream f340875b;

    /* renamed from: c, reason: collision with root package name */
    public final ZipEntry f340876c;

    /* renamed from: d, reason: collision with root package name */
    public final ZipFile f340877d;

    /* renamed from: e, reason: collision with root package name */
    public final long f340878e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f340879f = true;

    /* renamed from: g, reason: collision with root package name */
    public long f340880g = 0;

    public p(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f340877d = zipFile;
        this.f340876c = zipEntry;
        this.f340878e = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f340875b = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f340875b;
        if (inputStream != null) {
            inputStream.close();
            this.f340879f = false;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f340879f;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return read(byteBuffer, this.f340880g);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }

    @Override // com.facebook.soloader.n
    public final int read(ByteBuffer byteBuffer, long j12) throws IOException {
        if (this.f340875b == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j13 = this.f340878e;
        long j14 = j13 - j12;
        if (j14 <= 0) {
            return -1;
        }
        int i12 = (int) j14;
        if (iRemaining > i12) {
            iRemaining = i12;
        }
        InputStream inputStream = this.f340875b;
        ZipEntry zipEntry = this.f340876c;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
        long j15 = this.f340880g;
        if (j12 != j15) {
            if (j12 > j13) {
                j12 = j13;
            }
            if (j12 >= j15) {
                inputStream.skip(j12 - j15);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f340877d.getInputStream(zipEntry);
                this.f340875b = inputStream2;
                if (inputStream2 == null) {
                    throw new IOException(zipEntry.getName() + "'s InputStream is null");
                }
                inputStream2.skip(j12);
            }
            this.f340880g = j12;
        }
        if (byteBuffer.hasArray()) {
            this.f340875b.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f340875b.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f340880g += iRemaining;
        return iRemaining;
    }
}
