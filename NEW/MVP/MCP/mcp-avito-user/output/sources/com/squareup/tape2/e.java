package com.squareup.tape2;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import com.avito.android.remote.model.AdvertStatus;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: QueueFile.java */
/* loaded from: classes7.dex */
public final class e implements Closeable, Iterable<byte[]> {

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f366489l = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    public final RandomAccessFile f366490b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f366491c;

    /* renamed from: d, reason: collision with root package name */
    public final int f366492d;

    /* renamed from: e, reason: collision with root package name */
    public long f366493e;

    /* renamed from: f, reason: collision with root package name */
    public int f366494f;

    /* renamed from: g, reason: collision with root package name */
    public b f366495g;

    /* renamed from: h, reason: collision with root package name */
    public b f366496h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f366497i;

    /* renamed from: j, reason: collision with root package name */
    public int f366498j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f366499k;

    /* compiled from: QueueFile.java */
    public static final class a {
    }

    /* compiled from: QueueFile.java */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f366500c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final long f366501a;

        /* renamed from: b, reason: collision with root package name */
        public final int f366502b;

        public b(long j12, int i12) {
            this.f366501a = j12;
            this.f366502b = i12;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append("[position=");
            sb2.append(this.f366501a);
            sb2.append(", length=");
            return AK.c.i(this.f366502b, "]", sb2);
        }
    }

    /* compiled from: QueueFile.java */
    public final class c implements Iterator<byte[]> {

        /* renamed from: b, reason: collision with root package name */
        public int f366503b = 0;

        /* renamed from: c, reason: collision with root package name */
        public long f366504c;

        /* renamed from: d, reason: collision with root package name */
        public int f366505d;

        public c() {
            this.f366504c = e.this.f366495g.f366501a;
            this.f366505d = e.this.f366498j;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            e eVar = e.this;
            if (eVar.f366499k) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            if (eVar.f366498j == this.f366505d) {
                return this.f366503b != eVar.f366494f;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final byte[] next() {
            e eVar = e.this;
            if (eVar.f366499k) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            if (eVar.f366498j != this.f366505d) {
                throw new ConcurrentModificationException();
            }
            int i12 = eVar.f366494f;
            if (i12 == 0) {
                throw new NoSuchElementException();
            }
            if (this.f366503b >= i12) {
                throw new NoSuchElementException();
            }
            try {
                b bVarA = eVar.a(this.f366504c);
                int i13 = bVarA.f366502b;
                long j12 = bVarA.f366501a;
                byte[] bArr = new byte[i13];
                long j13 = j12 + 4;
                long j14 = eVar.j(j13);
                this.f366504c = j14;
                eVar.h(i13, bArr, j14);
                this.f366504c = eVar.j(j13 + i13);
                this.f366503b++;
                return bArr;
            } catch (IOException e12) {
                throw new RuntimeException("todo: throw a proper error", e12);
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = e.this;
            if (eVar.f366498j != this.f366505d) {
                throw new ConcurrentModificationException();
            }
            if (eVar.f366494f == 0) {
                throw new NoSuchElementException();
            }
            if (this.f366503b != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                eVar.g(1);
                this.f366505d = eVar.f366498j;
                this.f366503b--;
            } catch (IOException e12) {
                throw new RuntimeException("todo: throw a proper error", e12);
            }
        }
    }

    public e(RandomAccessFile randomAccessFile) throws IOException {
        long jB2;
        long jB3;
        byte[] bArr = new byte[32];
        this.f366497i = bArr;
        this.f366490b = randomAccessFile;
        randomAccessFile.seek(0L);
        randomAccessFile.readFully(bArr);
        boolean z12 = (bArr[0] & 128) != 0;
        this.f366491c = z12;
        if (z12) {
            this.f366492d = 32;
            int iB2 = b(0, bArr) & Integer.MAX_VALUE;
            if (iB2 != 1) {
                throw new IOException(G.e(iB2, "Unable to read version ", " format. Supported versions are 1 and legacy."));
            }
            this.f366493e = d(4, bArr);
            this.f366494f = b(12, bArr);
            jB2 = d(16, bArr);
            jB3 = d(24, bArr);
        } else {
            this.f366492d = 16;
            this.f366493e = b(0, bArr);
            this.f366494f = b(4, bArr);
            jB2 = b(8, bArr);
            jB3 = b(12, bArr);
        }
        if (this.f366493e <= randomAccessFile.length()) {
            if (this.f366493e <= this.f366492d) {
                throw new IOException(AK.c.j(this.f366493e, ") is invalid.", new StringBuilder("File is corrupt; length stored in header (")));
            }
            this.f366495g = a(jB2);
            this.f366496h = a(jB3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f366493e + ", Actual length: " + randomAccessFile.length());
    }

    public static void D(int i12, int i13, byte[] bArr) {
        bArr[i12] = (byte) (i13 >> 24);
        bArr[i12 + 1] = (byte) (i13 >> 16);
        bArr[i12 + 2] = (byte) (i13 >> 8);
        bArr[i12 + 3] = (byte) i13;
    }

    public static void I(int i12, byte[] bArr, long j12) {
        bArr[i12] = (byte) (j12 >> 56);
        bArr[i12 + 1] = (byte) (j12 >> 48);
        bArr[i12 + 2] = (byte) (j12 >> 40);
        bArr[i12 + 3] = (byte) (j12 >> 32);
        bArr[i12 + 4] = (byte) (j12 >> 24);
        bArr[i12 + 5] = (byte) (j12 >> 16);
        bArr[i12 + 6] = (byte) (j12 >> 8);
        bArr[i12 + 7] = (byte) j12;
    }

    public static int b(int i12, byte[] bArr) {
        return ((bArr[i12] & 255) << 24) + ((bArr[i12 + 1] & 255) << 16) + ((bArr[i12 + 2] & 255) << 8) + (bArr[i12 + 3] & 255);
    }

    public static long d(int i12, byte[] bArr) {
        return ((bArr[i12] & 255) << 56) + ((bArr[i12 + 1] & 255) << 48) + ((bArr[i12 + 2] & 255) << 40) + ((bArr[i12 + 3] & 255) << 32) + ((bArr[i12 + 4] & 255) << 24) + ((bArr[i12 + 5] & 255) << 16) + ((bArr[i12 + 6] & 255) << 8) + (bArr[i12 + 7] & 255);
    }

    public final b a(long j12) throws IOException {
        if (j12 == 0) {
            return b.f366500c;
        }
        byte[] bArr = this.f366497i;
        h(4, bArr, j12);
        return new b(j12, b(0, bArr));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f366499k = true;
        this.f366490b.close();
    }

    public final void g(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(G.e(i12, "Cannot remove negative (", ") number of elements."));
        }
        if (i12 == 0) {
            return;
        }
        int i13 = this.f366494f;
        byte[] bArr = f366489l;
        if (i12 == i13) {
            if (this.f366499k) {
                throw new IOException(AdvertStatus.CLOSED);
            }
            y(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, 0, 0L, 0L);
            int i14 = this.f366492d;
            RandomAccessFile randomAccessFile = this.f366490b;
            randomAccessFile.seek(i14);
            randomAccessFile.write(bArr, 0, 4096 - i14);
            this.f366494f = 0;
            b bVar = b.f366500c;
            this.f366495g = bVar;
            this.f366496h = bVar;
            if (this.f366493e > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFile.getChannel().force(true);
            }
            this.f366493e = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            this.f366498j++;
            return;
        }
        if (i13 == 0) {
            throw new NoSuchElementException();
        }
        if (i12 > i13) {
            throw new IllegalArgumentException(AK.c.i(this.f366494f, ").", G.j(i12, "Cannot remove more elements (", ") than present in queue (")));
        }
        b bVar2 = this.f366495g;
        long j12 = bVar2.f366501a;
        int iB2 = bVar2.f366502b;
        long j13 = j12;
        long j14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            j14 += iB2 + 4;
            j13 = j(j13 + 4 + iB2);
            byte[] bArr2 = this.f366497i;
            h(4, bArr2, j13);
            iB2 = b(0, bArr2);
        }
        y(this.f366493e, this.f366494f - i12, j13, this.f366496h.f366501a);
        this.f366494f -= i12;
        this.f366498j++;
        this.f366495g = new b(j13, iB2);
        long j15 = j14;
        while (j15 > 0) {
            int iMin = (int) Math.min(j15, 4096);
            i(iMin, bArr, j12);
            long j16 = iMin;
            j15 -= j16;
            j12 += j16;
        }
    }

    public final void h(int i12, byte[] bArr, long j12) throws IOException {
        long j13 = j(j12);
        long j14 = i12 + j13;
        long j15 = this.f366493e;
        RandomAccessFile randomAccessFile = this.f366490b;
        if (j14 <= j15) {
            randomAccessFile.seek(j13);
            randomAccessFile.readFully(bArr, 0, i12);
            return;
        }
        int i13 = (int) (j15 - j13);
        randomAccessFile.seek(j13);
        randomAccessFile.readFully(bArr, 0, i13);
        randomAccessFile.seek(this.f366492d);
        randomAccessFile.readFully(bArr, i13, i12 - i13);
    }

    public final void i(int i12, byte[] bArr, long j12) {
        long j13 = j(j12);
        long j14 = i12 + j13;
        long j15 = this.f366493e;
        RandomAccessFile randomAccessFile = this.f366490b;
        if (j14 <= j15) {
            randomAccessFile.seek(j13);
            randomAccessFile.write(bArr, 0, i12);
            return;
        }
        int i13 = (int) (j15 - j13);
        randomAccessFile.seek(j13);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(this.f366492d);
        randomAccessFile.write(bArr, i13, i12 - i13);
    }

    @Override // java.lang.Iterable
    public final Iterator<byte[]> iterator() {
        return new c();
    }

    public final long j(long j12) {
        long j13 = this.f366493e;
        return j12 < j13 ? j12 : (this.f366492d + j12) - j13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        r.C(e.class, sb2, "[length=");
        sb2.append(this.f366493e);
        sb2.append(", size=");
        sb2.append(this.f366494f);
        sb2.append(", first=");
        sb2.append(this.f366495g);
        sb2.append(", last=");
        sb2.append(this.f366496h);
        sb2.append("]");
        return sb2.toString();
    }

    public final void y(long j12, int i12, long j13, long j14) {
        RandomAccessFile randomAccessFile = this.f366490b;
        randomAccessFile.seek(0L);
        boolean z12 = this.f366491c;
        byte[] bArr = this.f366497i;
        if (!z12) {
            D(0, (int) j12, bArr);
            D(4, i12, bArr);
            D(8, (int) j13, bArr);
            D(12, (int) j14, bArr);
            randomAccessFile.write(bArr, 0, 16);
            return;
        }
        D(0, -2147483647, bArr);
        I(4, bArr, j12);
        D(12, i12, bArr);
        I(16, bArr, j13);
        I(24, bArr, j14);
        randomAccessFile.write(bArr, 0, 32);
    }
}
