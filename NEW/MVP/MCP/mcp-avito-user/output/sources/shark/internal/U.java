package shark.internal;

import kotlin.Metadata;
import shark.internal.X;

/* compiled from: HprofInMemoryIndex.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/internal/hppc/f;", "Lshark/internal/t;", "it", "Lshark/internal/X$b;", "invoke", "(Lshark/internal/hppc/f;)Lshark/internal/hppc/f;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<shark.internal.hppc.f<? extends C48296t>, shark.internal.hppc.f<? extends X.b>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f438465l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(P p12) {
        super(1);
        this.f438465l = p12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final shark.internal.hppc.f<? extends X.b> invoke(shark.internal.hppc.f<? extends C48296t> fVar) {
        shark.internal.hppc.f<? extends C48296t> fVar2 = fVar;
        C48296t c48296t = (C48296t) fVar2.f438541b;
        P p12 = this.f438465l;
        return new shark.internal.hppc.f<>(fVar2.f438540a, new X.b(c48296t.d(p12.f438416a), c48296t.b(), c48296t.d(p12.f438426k)));
    }
}
