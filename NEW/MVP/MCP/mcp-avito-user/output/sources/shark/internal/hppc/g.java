package shark.internal.hppc;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: LongObjectScatterMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lshark/internal/hppc/f;", "invoke", "()Lshark/internal/hppc/f;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class g extends N implements Y41.a<f<Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f438542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.f f438543m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f438544n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, l0.f fVar, int i12) {
        super(0);
        this.f438542l = hVar;
        this.f438543m = fVar;
        this.f438544n = i12;
    }

    @Override // Y41.a
    public final f<Object> invoke() {
        l0.f fVar = this.f438543m;
        int i12 = fVar.f406840b;
        h hVar = this.f438542l;
        int i13 = this.f438544n;
        if (i12 < i13) {
            fVar.f406840b = i12 + 1;
            while (true) {
                int i14 = fVar.f406840b;
                if (i14 >= i13) {
                    break;
                }
                long j12 = hVar.f438545a[i14];
                if (j12 != 0) {
                    Object obj = hVar.f438546b[i14];
                    if (obj != null) {
                        return new f<>(j12, obj);
                    }
                    L.k();
                    throw null;
                }
                fVar.f406840b = i14 + 1;
            }
        }
        int i15 = fVar.f406840b;
        if (i15 != i13 || !hVar.f438550f) {
            return null;
        }
        fVar.f406840b = i15 + 1;
        Object obj2 = hVar.f438546b[i13];
        if (obj2 != null) {
            return new f<>(0L, obj2);
        }
        L.k();
        throw null;
    }
}
