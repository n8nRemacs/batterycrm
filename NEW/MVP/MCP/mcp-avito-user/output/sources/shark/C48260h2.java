package shark;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: HprofHeapGraph.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/internal/hppc/f;", "Lshark/internal/X;", "it", "Lshark/M1;", "invoke", "(Lshark/internal/hppc/f;)Lshark/M1;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.h2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48260h2 extends kotlin.jvm.internal.N implements Y41.l<shark.internal.hppc.f<? extends shark.internal.X>, M1> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48240c2 f438285l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.f f438286m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48260h2(C48240c2 c48240c2, l0.f fVar) {
        super(1);
        this.f438285l = c48240c2;
        this.f438286m = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final M1 invoke(shark.internal.hppc.f<? extends shark.internal.X> fVar) {
        shark.internal.hppc.f<? extends shark.internal.X> fVar2 = fVar;
        this.f438286m.f406840b++;
        shark.internal.X x12 = (shark.internal.X) fVar2.f438541b;
        int i12 = C48240c2.f438251j;
        return this.f438285l.n(x12, fVar2.f438540a);
    }
}
