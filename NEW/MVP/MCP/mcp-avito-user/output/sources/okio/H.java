package okio;

import java.io.RandomAccessFile;
import kotlin.Metadata;

/* compiled from: JvmFileHandle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/H;", "Lokio/t;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class H extends AbstractC44809t {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RandomAccessFile f420026e;

    public H(@Y61.k RandomAccessFile randomAccessFile) {
        this.f420026e = randomAccessFile;
    }

    @Override // okio.AbstractC44809t
    public final synchronized void a() {
        this.f420026e.close();
    }

    @Override // okio.AbstractC44809t
    public final synchronized int b(long j12, @Y61.k byte[] bArr, int i12, int i13) {
        this.f420026e.seek(j12);
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                break;
            }
            int i15 = this.f420026e.read(bArr, i12, i13 - i14);
            if (i15 != -1) {
                i14 += i15;
            } else if (i14 == 0) {
                return -1;
            }
        }
        return i14;
    }

    @Override // okio.AbstractC44809t
    public final synchronized long c() {
        return this.f420026e.length();
    }
}
