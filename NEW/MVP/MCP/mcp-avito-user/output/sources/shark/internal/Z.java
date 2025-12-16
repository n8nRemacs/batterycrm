package shark.internal;

import kotlin.Metadata;
import shark.X1;

/* compiled from: InternalSharedExpanderHelpers.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/collections/H0;", "Lshark/X1;", "<name for destructuring parameter 0>", "Lshark/internal/C0;", "invoke", "(Lkotlin/collections/H0;)Lshark/internal/C0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.l<kotlin.collections.H0<? extends X1>, C0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f438484l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(long j12) {
        super(1);
        this.f438484l = j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final C0 invoke(kotlin.collections.H0<? extends X1> h02) {
        kotlin.collections.H0<? extends X1> h03 = h02;
        X1 x12 = (X1) h03.f406644b;
        if (!x12.g()) {
            return null;
        }
        Long lF2 = x12.f();
        if (lF2 != null) {
            return new C0(lF2.longValue(), false, new Y(this, h03.f406643a));
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }
}
