package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyStaggeredGridCells.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/I0;", "", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface I0 {

    /* compiled from: LazyStaggeredGridCells.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/I0$a;", "Landroidx/compose/foundation/lazy/staggeredgrid/I0;", "Landroidx/compose/ui/unit/h;", "minSize", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements I0 {

        /* renamed from: a, reason: collision with root package name */
        public final float f29572a;

        public a(float f12, C42822w c42822w) {
            this.f29572a = f12;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            if (Float.compare(f12, 0) > 0) {
                return;
            }
            androidx.compose.foundation.internal.e.a("invalid minSize");
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof a) {
                if (androidx.compose.ui.unit.h.b(this.f29572a, ((a) obj).f29572a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.hashCode(this.f29572a);
        }
    }

    /* compiled from: LazyStaggeredGridCells.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/I0$b;", "Landroidx/compose/foundation/lazy/staggeredgrid/I0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements I0 {
        public final boolean equals(@Y61.l Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* compiled from: LazyStaggeredGridCells.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/I0$c;", "Landroidx/compose/foundation/lazy/staggeredgrid/I0;", "Landroidx/compose/ui/unit/h;", "size", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements I0 {

        /* renamed from: a, reason: collision with root package name */
        public final float f29573a;

        public c(float f12, C42822w c42822w) {
            this.f29573a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof c) {
                if (androidx.compose.ui.unit.h.b(this.f29573a, ((c) obj).f29573a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.hashCode(this.f29573a);
        }
    }
}
