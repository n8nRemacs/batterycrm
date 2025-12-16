package com.google.firebase.crashlytics.internal.metadata;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile.java */
/* loaded from: classes4.dex */
class f implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f361040h = Logger.getLogger(f.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final RandomAccessFile f361041b;

    /* renamed from: c, reason: collision with root package name */
    public int f361042c;

    /* renamed from: d, reason: collision with root package name */
    public int f361043d;

    /* renamed from: e, reason: collision with root package name */
    public b f361044e;

    /* renamed from: f, reason: collision with root package name */
    public b f361045f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f361046g;

    /* compiled from: QueueFile.java */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f361047a = true;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f361048b;

        public a(StringBuilder sb2) {
            this.f361048b = sb2;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.f.d
        public final void a(int i12, InputStream inputStream) {
            boolean z12 = this.f361047a;
            StringBuilder sb2 = this.f361048b;
            if (z12) {
                this.f361047a = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(i12);
        }
    }

    /* compiled from: QueueFile.java */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f361049c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f361050a;

        /* renamed from: b, reason: collision with root package name */
        public final int f361051b;

        public b(int i12, int i13) {
            this.f361050a = i12;
            this.f361051b = i13;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f361050a);
            sb2.append(", length = ");
            return AK.c.i(this.f361051b, "]", sb2);
        }
    }

    /* compiled from: QueueFile.java */
    public interface d {
        void a(int i12, InputStream inputStream);
    }

    public f(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f361046g = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    n(i12, iArr[i13], bArr2);
                    i12 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f361041b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iF2 = f(0, bArr);
        this.f361042c = iF2;
        if (iF2 > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f361042c + ", Actual length: " + randomAccessFile2.length());
        }
        this.f361043d = f(4, bArr);
        int iF3 = f(8, bArr);
        int iF4 = f(12, bArr);
        this.f361044e = d(iF3);
        this.f361045f = d(iF4);
    }

    public static int f(int i12, byte[] bArr) {
        return ((bArr[i12] & 255) << 24) + ((bArr[i12 + 1] & 255) << 16) + ((bArr[i12 + 2] & 255) << 8) + (bArr[i12 + 3] & 255);
    }

    public static void n(int i12, int i13, byte[] bArr) {
        bArr[i12] = (byte) (i13 >> 24);
        bArr[i12 + 1] = (byte) (i13 >> 16);
        bArr[i12 + 2] = (byte) (i13 >> 8);
        bArr[i12 + 3] = (byte) i13;
    }

    public final void a(byte[] bArr) {
        int iK2;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    b(length);
                    boolean zIsEmpty = isEmpty();
                    if (zIsEmpty) {
                        iK2 = 16;
                    } else {
                        b bVar = this.f361045f;
                        iK2 = k(bVar.f361050a + 4 + bVar.f361051b);
                    }
                    b bVar2 = new b(iK2, length);
                    n(0, length, this.f361046g);
                    i(iK2, 4, this.f361046g);
                    i(iK2 + 4, length, bArr);
                    m(this.f361042c, this.f361043d + 1, zIsEmpty ? iK2 : this.f361044e.f361050a, iK2);
                    this.f361045f = bVar2;
                    this.f361043d++;
                    if (zIsEmpty) {
                        this.f361044e = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void b(int i12) throws IOException {
        int i13 = i12 + 4;
        int iJ2 = this.f361042c - j();
        if (iJ2 >= i13) {
            return;
        }
        int i14 = this.f361042c;
        do {
            iJ2 += i14;
            i14 <<= 1;
        } while (iJ2 < i13);
        RandomAccessFile randomAccessFile = this.f361041b;
        randomAccessFile.setLength(i14);
        randomAccessFile.getChannel().force(true);
        b bVar = this.f361045f;
        int iK2 = k(bVar.f361050a + 4 + bVar.f361051b);
        if (iK2 < this.f361044e.f361050a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f361042c);
            long j12 = iK2 - 4;
            if (channel.transferTo(16L, j12, channel) != j12) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i15 = this.f361045f.f361050a;
        int i16 = this.f361044e.f361050a;
        if (i15 < i16) {
            int i17 = (this.f361042c + i15) - 16;
            m(i14, this.f361043d, i16, i17);
            this.f361045f = new b(i17, this.f361045f.f361051b);
        } else {
            m(i14, this.f361043d, i16, i15);
        }
        this.f361042c = i14;
    }

    public final synchronized void c(d dVar) {
        int iK2 = this.f361044e.f361050a;
        for (int i12 = 0; i12 < this.f361043d; i12++) {
            b bVarD = d(iK2);
            dVar.a(bVarD.f361051b, new c(bVarD, null));
            iK2 = k(bVarD.f361050a + 4 + bVarD.f361051b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f361041b.close();
    }

    public final b d(int i12) throws IOException {
        if (i12 == 0) {
            return b.f361049c;
        }
        RandomAccessFile randomAccessFile = this.f361041b;
        randomAccessFile.seek(i12);
        return new b(i12, randomAccessFile.readInt());
    }

    public final synchronized void g() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (this.f361043d == 1) {
            synchronized (this) {
                m(4096, 0, 0, 0);
                this.f361043d = 0;
                b bVar = b.f361049c;
                this.f361044e = bVar;
                this.f361045f = bVar;
                if (this.f361042c > 4096) {
                    RandomAccessFile randomAccessFile = this.f361041b;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f361042c = 4096;
            }
        } else {
            b bVar2 = this.f361044e;
            int iK2 = k(bVar2.f361050a + 4 + bVar2.f361051b);
            h(iK2, 0, 4, this.f361046g);
            int iF2 = f(0, this.f361046g);
            m(this.f361042c, this.f361043d - 1, iK2, this.f361045f.f361050a);
            this.f361043d--;
            this.f361044e = new b(iK2, iF2);
        }
    }

    public final void h(int i12, int i13, int i14, byte[] bArr) throws IOException {
        int iK2 = k(i12);
        int i15 = iK2 + i14;
        int i16 = this.f361042c;
        RandomAccessFile randomAccessFile = this.f361041b;
        if (i15 <= i16) {
            randomAccessFile.seek(iK2);
            randomAccessFile.readFully(bArr, i13, i14);
            return;
        }
        int i17 = i16 - iK2;
        randomAccessFile.seek(iK2);
        randomAccessFile.readFully(bArr, i13, i17);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i13 + i17, i14 - i17);
    }

    public final void i(int i12, int i13, byte[] bArr) throws IOException {
        int iK2 = k(i12);
        int i14 = iK2 + i13;
        int i15 = this.f361042c;
        RandomAccessFile randomAccessFile = this.f361041b;
        if (i14 <= i15) {
            randomAccessFile.seek(iK2);
            randomAccessFile.write(bArr, 0, i13);
            return;
        }
        int i16 = i15 - iK2;
        randomAccessFile.seek(iK2);
        randomAccessFile.write(bArr, 0, i16);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i16, i13 - i16);
    }

    public final synchronized boolean isEmpty() {
        return this.f361043d == 0;
    }

    public final int j() {
        if (this.f361043d == 0) {
            return 16;
        }
        b bVar = this.f361045f;
        int i12 = bVar.f361050a;
        int i13 = this.f361044e.f361050a;
        return i12 >= i13 ? (i12 - i13) + 4 + bVar.f361051b + 16 : (((i12 + 4) + bVar.f361051b) + this.f361042c) - i13;
    }

    public final int k(int i12) {
        int i13 = this.f361042c;
        return i12 < i13 ? i12 : (i12 + 16) - i13;
    }

    public final void m(int i12, int i13, int i14, int i15) throws IOException {
        int[] iArr = {i12, i13, i14, i15};
        byte[] bArr = this.f361046g;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            n(i16, iArr[i17], bArr);
            i16 += 4;
        }
        RandomAccessFile randomAccessFile = this.f361041b;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f361042c);
        sb2.append(", size=");
        sb2.append(this.f361043d);
        sb2.append(", first=");
        sb2.append(this.f361044e);
        sb2.append(", last=");
        sb2.append(this.f361045f);
        sb2.append(", element lengths=[");
        try {
            c(new a(sb2));
        } catch (IOException e12) {
            f361040h.log(Level.WARNING, "read error", (Throwable) e12);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* compiled from: QueueFile.java */
    public final class c extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        public int f361052b;

        /* renamed from: c, reason: collision with root package name */
        public int f361053c;

        public c(b bVar, a aVar) {
            int i12 = bVar.f361050a + 4;
            Logger logger = f.f361040h;
            this.f361052b = f.this.k(i12);
            this.f361053c = bVar.f361051b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i12, int i13) throws IOException {
            Logger logger = f.f361040h;
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i12 | i13) < 0 || i13 > bArr.length - i12) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i14 = this.f361053c;
            if (i14 <= 0) {
                return -1;
            }
            if (i13 > i14) {
                i13 = i14;
            }
            int i15 = this.f361052b;
            f fVar = f.this;
            fVar.h(i15, i12, i13, bArr);
            this.f361052b = fVar.k(this.f361052b + i13);
            this.f361053c -= i13;
            return i13;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f361053c == 0) {
                return -1;
            }
            f fVar = f.this;
            fVar.f361041b.seek(this.f361052b);
            int i12 = fVar.f361041b.read();
            this.f361052b = fVar.k(this.f361052b + 1);
            this.f361053c--;
            return i12;
        }
    }
}
