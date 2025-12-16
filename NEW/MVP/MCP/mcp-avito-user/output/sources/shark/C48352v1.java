package shark;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import okio.C44802l;
import okio.InterfaceC44804n;

/* compiled from: FileSourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/v1;", "Lshark/u1;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.v1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48352v1 implements InterfaceC48348u1 {

    /* compiled from: FileSourceProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/v1$a", "Lshark/d3;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.v1$a */
    public static final class a implements d3 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RandomAccessFile f438788b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f438789c;

        public a(RandomAccessFile randomAccessFile, byte[] bArr) {
            this.f438788b = randomAccessFile;
            this.f438789c = bArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f438788b.close();
            } catch (Throwable th2) {
                j3.f438639b.getClass();
                leakcanary.u uVar = j3.f438638a;
                if (uVar != null) {
                    uVar.b("Failed to close file, ignoring", th2);
                }
            }
        }

        @Override // shark.d3
        public final long i4(long j12, @Y61.k C44802l c44802l, long j13) throws IOException {
            long j14;
            int i12 = (int) j13;
            RandomAccessFile randomAccessFile = this.f438788b;
            randomAccessFile.seek(j12);
            byte[] bArr = this.f438789c;
            int length = bArr.length;
            int i13 = 0;
            while (true) {
                j14 = i13;
                if (j14 >= j13) {
                    break;
                }
                int i14 = randomAccessFile.read(bArr, 0, Math.min(i12 - i13, length));
                if (i14 != -1) {
                    c44802l.write(bArr, 0, i14);
                    i13 += i14;
                } else if (i13 == 0) {
                    throw new IllegalStateException("Did not expect to reach end of file after reading 0 bytes");
                }
            }
            return j14;
        }
    }

    @Override // shark.f3
    @Y61.k
    public final d3 a() {
        return new a(new RandomAccessFile((File) null, "r"), new byte[500000]);
    }

    @Override // shark.o3
    @Y61.k
    public final InterfaceC44804n b() {
        return new okio.Y(okio.M.g(new FileInputStream((File) null)));
    }
}
