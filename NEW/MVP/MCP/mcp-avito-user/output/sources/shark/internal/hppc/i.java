package shark.internal.hppc;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: LongScatterSet.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class i extends N implements Y41.a<Long> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f438551l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.f f438552m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f438553n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, l0.f fVar, int i12) {
        super(0);
        this.f438551l = jVar;
        this.f438552m = fVar;
        this.f438553n = i12;
    }

    @Override // Y41.a
    public final Long invoke() {
        l0.f fVar = this.f438552m;
        int i12 = fVar.f406840b;
        j jVar = this.f438551l;
        int i13 = this.f438553n;
        if (i12 < i13) {
            fVar.f406840b = i12 + 1;
            while (true) {
                int i14 = fVar.f406840b;
                if (i14 >= i13) {
                    break;
                }
                long j12 = jVar.f438554a[i14];
                if (j12 != 0) {
                    return Long.valueOf(j12);
                }
                fVar.f406840b = i14 + 1;
            }
        }
        int i15 = fVar.f406840b;
        if (i15 != i13 || !jVar.f438558e) {
            return null;
        }
        fVar.f406840b = i15 + 1;
        return 0L;
    }
}
