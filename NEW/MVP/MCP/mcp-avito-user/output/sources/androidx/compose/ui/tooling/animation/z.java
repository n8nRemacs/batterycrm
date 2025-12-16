package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.animation.t;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PreviewAnimationClock.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class z extends N implements Y41.l<Object, G0> {

    /* compiled from: PreviewAnimationClock.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class a extends N implements Y41.a<Long> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u f42802l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar) {
            super(0);
            this.f42802l = uVar;
        }

        @Override // Y41.a
        public final Long invoke() {
            Long lValueOf;
            u uVar = this.f42802l;
            Iterator it = C42745f0.h0(uVar.f42798f.values(), C42745f0.h0(uVar.f42796d.values(), C42745f0.h0(uVar.f42795c.values(), uVar.f42794b.values()))).iterator();
            Long lValueOf2 = null;
            if (it.hasNext()) {
                lValueOf = Long.valueOf(((androidx.compose.ui.tooling.animation.clock.e) it.next()).a());
                while (it.hasNext()) {
                    Long lValueOf3 = Long.valueOf(((androidx.compose.ui.tooling.animation.clock.e) it.next()).a());
                    if (lValueOf.compareTo(lValueOf3) < 0) {
                        lValueOf = lValueOf3;
                    }
                }
            } else {
                lValueOf = null;
            }
            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            Iterator it2 = uVar.f42797e.values().iterator();
            if (it2.hasNext()) {
                lValueOf2 = Long.valueOf(((androidx.compose.ui.tooling.animation.clock.f) it2.next()).c());
                while (it2.hasNext()) {
                    Long lValueOf4 = Long.valueOf(((androidx.compose.ui.tooling.animation.clock.f) it2.next()).c());
                    if (lValueOf2.compareTo(lValueOf4) < 0) {
                        lValueOf2 = lValueOf4;
                    }
                }
            }
            return Long.valueOf(Math.max(jLongValue, lValueOf2 != null ? lValueOf2.longValue() : 0L));
        }
    }

    @Override // Y41.l
    public final G0 invoke(Object obj) {
        t.f42789c.getClass();
        if (t.a.a(null) == null) {
            return G0.f406611a;
        }
        throw null;
    }
}
