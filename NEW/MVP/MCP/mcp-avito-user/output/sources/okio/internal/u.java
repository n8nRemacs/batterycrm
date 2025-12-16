package okio.internal;

import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import okio.Y;

/* compiled from: ZipFiles.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "headerId", "", "dataSize", "Lkotlin/G0;", "invoke", "(IJ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class u extends N implements Y41.p<Integer, Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f420116l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.h<Long> f420117m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h<Long> f420118n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.h<Long> f420119o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Y y12, l0.h hVar, l0.h hVar2, l0.h hVar3) {
        super(2);
        this.f420116l = y12;
        this.f420117m = hVar;
        this.f420118n = hVar2;
        this.f420119o = hVar3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Long] */
    @Override // Y41.p
    public final G0 invoke(Integer num, Long l12) throws IOException {
        int iIntValue = num.intValue();
        long jLongValue = l12.longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b12 = this.f420116l.readByte();
            boolean z12 = (b12 & 1) == 1;
            boolean z13 = (b12 & 2) == 2;
            boolean z14 = (b12 & 4) == 4;
            long j12 = z12 ? 5L : 1L;
            if (z13) {
                j12 += 4;
            }
            if (z14) {
                j12 += 4;
            }
            if (jLongValue < j12) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z12) {
                this.f420117m.f406842b = Long.valueOf(r2.c() * 1000);
            }
            if (z13) {
                this.f420118n.f406842b = Long.valueOf(r2.c() * 1000);
            }
            if (z14) {
                this.f420119o.f406842b = Long.valueOf(r2.c() * 1000);
            }
        }
        return G0.f406611a;
    }
}
