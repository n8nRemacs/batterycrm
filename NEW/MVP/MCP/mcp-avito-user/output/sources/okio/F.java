package okio;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.remote.model.AdvertStatus;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InflaterSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/F;", "Lokio/e0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class F implements e0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y f420020b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Inflater f420021c;

    /* renamed from: d, reason: collision with root package name */
    public int f420022d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f420023e;

    public F(@Y61.k Y y12, @Y61.k Inflater inflater) {
        this.f420020b = y12;
        this.f420021c = inflater;
    }

    public final long a(@Y61.k C44802l c44802l, long j12) throws DataFormatException, IOException {
        Inflater inflater = this.f420021c;
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
        }
        if (this.f420023e) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        if (j12 == 0) {
            return 0L;
        }
        try {
            Z zA2 = c44802l.A(1);
            int iMin = (int) Math.min(j12, 8192 - zA2.f420052c);
            boolean zNeedsInput = inflater.needsInput();
            Y y12 = this.f420020b;
            if (zNeedsInput && !y12.W2()) {
                Z z12 = y12.f420047c.f420124b;
                int i12 = z12.f420052c;
                int i13 = z12.f420051b;
                int i14 = i12 - i13;
                this.f420022d = i14;
                inflater.setInput(z12.f420050a, i13, i14);
            }
            int iInflate = inflater.inflate(zA2.f420050a, zA2.f420052c, iMin);
            int i15 = this.f420022d;
            if (i15 != 0) {
                int remaining = i15 - inflater.getRemaining();
                this.f420022d -= remaining;
                y12.skip(remaining);
            }
            if (iInflate > 0) {
                zA2.f420052c += iInflate;
                long j13 = iInflate;
                c44802l.f420125c += j13;
                return j13;
            }
            if (zA2.f420051b == zA2.f420052c) {
                c44802l.f420124b = zA2.a();
                a0.a(zA2);
            }
            return 0L;
        } catch (DataFormatException e12) {
            throw new IOException(e12);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f420023e) {
            return;
        }
        this.f420021c.end();
        this.f420023e = true;
        this.f420020b.close();
    }

    @Override // okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) {
        do {
            long jA2 = a(c44802l, j12);
            if (jA2 > 0) {
                return jA2;
            }
            Inflater inflater = this.f420021c;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f420020b.W2());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.e0
    @Y61.k
    /* renamed from: timeout */
    public final i0 getF420025c() {
        return this.f420020b.f420046b.getF420025c();
    }

    public F(@Y61.k e0 e0Var, @Y61.k Inflater inflater) {
        this(new Y(e0Var), inflater);
    }
}
