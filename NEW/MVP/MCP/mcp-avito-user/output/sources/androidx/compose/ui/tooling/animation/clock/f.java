package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.C20278f0;
import androidx.compose.animation.core.C20281g0;
import androidx.compose.animation.core.H1;
import androidx.compose.animation.core.P1;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.tooling.animation.t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InfiniteTransitionClock.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/f;", "Landroidx/compose/ui/tooling/animation/clock/e;", "Landroidx/compose/ui/tooling/animation/t;", "LA0/c;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f implements e<t, A0.c<Object>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final t f42784a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Long> f42785b;

    /* compiled from: InfiniteTransitionClock.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Long> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f42786l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Long invoke() {
            return 0L;
        }
    }

    public f(t tVar, Y41.a aVar, int i12, C42822w c42822w) {
        aVar = (i12 & 2) != 0 ? a.f42786l : aVar;
        this.f42784a = tVar;
        this.f42785b = aVar;
    }

    public static long b(C20281g0.a aVar) {
        C20278f0 c20278f0 = (C20278f0) aVar.f26281f;
        int i12 = c20278f0.f26258b == RepeatMode.f26134c ? 2 : 1;
        P1 p1A = c20278f0.f26257a.a((H1) aVar.f26279d);
        long f26160d = p1A.getF26160d() + (p1A.getF26159c() * i12);
        List<String> list = k.f42788a;
        return f26160d * 1000000;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.e
    public final long a() {
        return Math.max(c(), this.f42785b.invoke().longValue());
    }

    public final long c() {
        Long l12;
        Iterator<T> it = this.f42784a.f42791a.f26273a.f().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(b((C20281g0.a) it.next()));
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(b((C20281g0.a) it.next()));
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l12 = lValueOf;
        } else {
            l12 = null;
        }
        long jLongValue = l12 != null ? l12.longValue() : 0L;
        List<String> list = k.f42788a;
        return (jLongValue + 999999) / 1000000;
    }
}
