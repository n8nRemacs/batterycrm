package ru.cyberity.log.utils;

import Y61.k;
import Y61.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.zip.CRC32;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.io.c;
import kotlin.jvm.internal.C42822w;

/* compiled from: SafeFileWriter.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0010J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0012J!\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0015J\u0017\u0010\r\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\r\u0010\u0017J\u001f\u0010\r\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\r\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\r\u0010\u001dJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\r\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lru/cyberity/log/utils/a;", "", "Ljava/io/File;", "file", "Ljava/util/Random;", "random", "<init>", "(Ljava/io/File;Ljava/util/Random;)V", "", "v", "Ljava/io/OutputStream;", "stream", "Lkotlin/G0;", "a", "(BLjava/io/OutputStream;)V", "", "(ILjava/io/OutputStream;)V", "", "(JLjava/io/OutputStream;)V", "", "data", "([BLjava/io/OutputStream;)V", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)I", "count", "(ILjava/io/InputStream;)[B", "c", "(Ljava/io/InputStream;)J", "b", "([B)V", "()[B", "Ljava/io/File;", "()Ljava/io/File;", "Ljava/util/Random;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final File file;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final Random random;

    public a(@k File file, @k Random random) {
        this.file = file;
        this.random = random;
    }

    private final long c(InputStream stream) throws IOException {
        long j12 = stream.read();
        if (j12 < 0) {
            throw new IOException();
        }
        long j13 = stream.read();
        if (j13 < 0) {
            throw new IOException();
        }
        long j14 = stream.read();
        if (j14 < 0) {
            throw new IOException();
        }
        long j15 = stream.read();
        if (j15 >= 0) {
            return j12 + (j13 << 8) + (j14 << 16) + (j15 << 24);
        }
        throw new IOException();
    }

    public final void a(@k byte[] data) {
        if (this.file.exists()) {
            this.file.delete();
        }
        File file = new File(this.file.getAbsoluteFile() + "_random_" + this.random.nextLong() + ".tmp");
        if (this.file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            a(data.length, (OutputStream) fileOutputStream);
            a(data, fileOutputStream);
            CRC32 crc32 = new CRC32();
            crc32.update(data);
            a(crc32.getValue(), fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.getFD().sync();
            G0 g02 = G0.f406611a;
            c.a(fileOutputStream, null);
            file.renameTo(this.file);
        } finally {
        }
    }

    @l
    public final byte[] b() {
        if (!this.file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            byte[] bArrA = a(a(fileInputStream), fileInputStream);
            CRC32 crc32 = new CRC32();
            crc32.update(bArrA);
            if (b(fileInputStream) != crc32.getValue()) {
                c.a(fileInputStream, null);
                return null;
            }
            c.a(fileInputStream, null);
            return bArrA;
        } finally {
        }
    }

    public /* synthetic */ a(File file, Random random, int i12, C42822w c42822w) {
        this(file, (i12 & 2) != 0 ? new Random() : random);
    }

    private final long b(InputStream stream) {
        return c(stream) + (c(stream) << 32);
    }

    private final void a(byte v12, OutputStream stream) throws IOException {
        stream.write(v12);
    }

    private final void a(int v12, OutputStream stream) throws IOException {
        a((byte) (v12 & 255), stream);
        a((byte) ((v12 >> 8) & 255), stream);
        a((byte) ((v12 >> 16) & 255), stream);
        a((byte) ((v12 >> 24) & 255), stream);
    }

    private final void a(long v12, OutputStream stream) throws IOException {
        a((byte) (v12 & 255), stream);
        a((byte) ((v12 >> 8) & 255), stream);
        a((byte) ((v12 >> 16) & 255), stream);
        a((byte) ((v12 >> 24) & 255), stream);
        a((byte) ((v12 >> 32) & 255), stream);
        a((byte) ((v12 >> 40) & 255), stream);
        a((byte) ((v12 >> 48) & 255), stream);
        a((byte) ((v12 >> 56) & 255), stream);
    }

    private final void a(byte[] data, OutputStream stream) throws IOException {
        stream.write(data);
    }

    private final int a(InputStream stream) throws IOException {
        int i12 = stream.read();
        if (i12 >= 0) {
            int i13 = stream.read();
            if (i13 >= 0) {
                int i14 = stream.read();
                if (i14 >= 0) {
                    int i15 = stream.read();
                    if (i15 >= 0) {
                        return i12 + (i13 << 8) + (i14 << 16) + (i15 << 24);
                    }
                    throw new IOException();
                }
                throw new IOException();
            }
            throw new IOException();
        }
        throw new IOException();
    }

    private final byte[] a(int count, InputStream stream) throws IOException {
        byte[] bArr = new byte[count];
        int i12 = 0;
        while (i12 < count) {
            int i13 = stream.read(bArr, i12, count - i12);
            if (i13 > 0) {
                i12 += i13;
            } else if (i13 >= 0) {
                Thread.yield();
            } else {
                throw new IOException();
            }
        }
        return bArr;
    }
}
