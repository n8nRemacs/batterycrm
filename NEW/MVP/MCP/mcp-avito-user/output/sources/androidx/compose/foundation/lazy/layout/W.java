package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyLayoutNearestRangeState.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/W;", "Landroidx/compose/runtime/I3;", "Lkotlin/ranges/l;", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W implements I3<kotlin.ranges.l> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f29365f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f29366b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29367c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29368d;

    /* renamed from: e, reason: collision with root package name */
    public int f29369e;

    /* compiled from: LazyLayoutNearestRangeState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/W$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public W(int i12, int i13, int i14) {
        this.f29366b = i13;
        this.f29367c = i14;
        f29365f.getClass();
        int i15 = (i12 / i13) * i13;
        this.f29368d = C22126m3.f(kotlin.ranges.s.r(Math.max(i15 - i14, 0), i15 + i13 + i14), C22126m3.o());
        this.f29369e = i12;
    }

    public final void a(int i12) {
        if (i12 != this.f29369e) {
            this.f29369e = i12;
            f29365f.getClass();
            int i13 = this.f29366b;
            int i14 = (i12 / i13) * i13;
            int i15 = this.f29367c;
            ((C22082i3) this.f29368d).setValue(kotlin.ranges.s.r(Math.max(i14 - i15, 0), i14 + i13 + i15));
        }
    }

    @Override // androidx.compose.runtime.I3
    /* renamed from: getValue */
    public final kotlin.ranges.l getF42167b() {
        return (kotlin.ranges.l) ((C22082i3) this.f29368d).getF42167b();
    }
}
