package okio.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okio.S;

/* compiled from: ZipEntry.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/q;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final S f420102a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f420103b;

    /* renamed from: c, reason: collision with root package name */
    public final long f420104c;

    /* renamed from: d, reason: collision with root package name */
    public final long f420105d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420106e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Long f420107f;

    /* renamed from: g, reason: collision with root package name */
    public final long f420108g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f420109h;

    public q(@Y61.k S s5, boolean z12, long j12, long j13, int i12, @Y61.l Long l12, long j14) {
        this.f420102a = s5;
        this.f420103b = z12;
        this.f420104c = j12;
        this.f420105d = j13;
        this.f420106e = i12;
        this.f420107f = l12;
        this.f420108g = j14;
        this.f420109h = new ArrayList();
    }

    public /* synthetic */ q(S s5, boolean z12, String str, long j12, long j13, long j14, int i12, Long l12, long j15, int i13, C42822w c42822w) {
        this(s5, (i13 & 2) != 0 ? false : z12, (i13 & 16) != 0 ? -1L : j13, (i13 & 32) != 0 ? -1L : j14, (i13 & 64) != 0 ? -1 : i12, (i13 & 128) != 0 ? null : l12, (i13 & 256) == 0 ? j15 : -1L);
    }
}
