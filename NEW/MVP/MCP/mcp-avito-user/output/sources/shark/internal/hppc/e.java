package shark.internal.hppc;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: LongLongScatterMap.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lshark/internal/hppc/c;", "invoke", "()Lshark/internal/hppc/c;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class e extends N implements Y41.a<c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f438537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.f f438538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f438539n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, l0.f fVar, int i12) {
        super(0);
        this.f438537l = dVar;
        this.f438538m = fVar;
        this.f438539n = i12;
    }

    @Override // Y41.a
    public final c invoke() {
        l0.f fVar = this.f438538m;
        int i12 = fVar.f406840b;
        d dVar = this.f438537l;
        int i13 = this.f438539n;
        if (i12 < i13) {
            fVar.f406840b = i12 + 1;
            while (true) {
                int i14 = fVar.f406840b;
                if (i14 >= i13) {
                    break;
                }
                long j12 = dVar.f438530a[i14];
                if (j12 != 0) {
                    return new c(j12, dVar.f438531b[i14]);
                }
                fVar.f406840b = i14 + 1;
            }
        }
        int i15 = fVar.f406840b;
        if (i15 != i13 || !dVar.f438535f) {
            return null;
        }
        fVar.f406840b = i15 + 1;
        return new c(0L, dVar.f438531b[i13]);
    }
}
