package okio.internal;

import androidx.compose.foundation.H;
import java.io.IOException;
import kotlin.Metadata;
import okio.AbstractC44815z;
import okio.C44802l;
import okio.e0;

/* compiled from: FixedLengthSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/m;", "Lokio/z;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class m extends AbstractC44815z {

    /* renamed from: g, reason: collision with root package name */
    public final long f420092g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f420093h;

    /* renamed from: i, reason: collision with root package name */
    public long f420094i;

    public m(@Y61.k e0 e0Var, long j12, boolean z12) {
        super(e0Var);
        this.f420092g = j12;
        this.f420093h = z12;
    }

    @Override // okio.AbstractC44815z, okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
        long j13 = this.f420094i;
        long j14 = this.f420092g;
        if (j13 > j14) {
            j12 = 0;
        } else if (this.f420093h) {
            long j15 = j14 - j13;
            if (j15 == 0) {
                return -1L;
            }
            j12 = Math.min(j12, j15);
        }
        long j16 = super.read(c44802l, j12);
        if (j16 != -1) {
            this.f420094i += j16;
        }
        long j17 = this.f420094i;
        if ((j17 >= j14 || j16 != -1) && j17 <= j14) {
            return j16;
        }
        if (j16 > 0 && j17 > j14) {
            long j18 = c44802l.f420125c - (j17 - j14);
            C44802l c44802l2 = new C44802l();
            c44802l2.h2(c44802l);
            c44802l.write(c44802l2, j18);
            c44802l2.a();
        }
        StringBuilder sbQ = H.q(j14, "expected ", " bytes but got ");
        sbQ.append(this.f420094i);
        throw new IOException(sbQ.toString());
    }
}
