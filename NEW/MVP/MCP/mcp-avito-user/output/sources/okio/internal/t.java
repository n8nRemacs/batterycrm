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
final class t extends N implements Y41.p<Integer, Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f420110l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f420111m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.g f420112n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y f420113o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0.g f420114p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l0.g f420115q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l0.a aVar, long j12, l0.g gVar, Y y12, l0.g gVar2, l0.g gVar3) {
        super(2);
        this.f420110l = aVar;
        this.f420111m = j12;
        this.f420112n = gVar;
        this.f420113o = y12;
        this.f420114p = gVar2;
        this.f420115q = gVar3;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, Long l12) throws IOException {
        int iIntValue = num.intValue();
        long jLongValue = l12.longValue();
        if (iIntValue == 1) {
            l0.a aVar = this.f420110l;
            if (aVar.f406838b) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            aVar.f406838b = true;
            if (jLongValue < this.f420111m) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            l0.g gVar = this.f420112n;
            long jD2 = gVar.f406841b;
            Y y12 = this.f420113o;
            if (jD2 == 4294967295L) {
                jD2 = y12.d();
            }
            gVar.f406841b = jD2;
            l0.g gVar2 = this.f420114p;
            gVar2.f406841b = gVar2.f406841b == 4294967295L ? y12.d() : 0L;
            l0.g gVar3 = this.f420115q;
            gVar3.f406841b = gVar3.f406841b == 4294967295L ? y12.d() : 0L;
        }
        return G0.f406611a;
    }
}
