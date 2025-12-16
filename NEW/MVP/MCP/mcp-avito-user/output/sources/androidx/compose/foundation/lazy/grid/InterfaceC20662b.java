package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyGridDsl.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/b;", "", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC20662b {

    /* compiled from: LazyGridDsl.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/grid/b$a;", "Landroidx/compose/foundation/lazy/grid/b;", "Landroidx/compose/ui/unit/h;", "minSize", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.b$a */
    public static final class a implements InterfaceC20662b {

        /* renamed from: a, reason: collision with root package name */
        public final float f29097a;

        public a(float f12, C42822w c42822w) {
            this.f29097a = f12;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            if (Float.compare(f12, 0) > 0) {
                return;
            }
            androidx.compose.foundation.internal.e.a("Provided min size should be larger than zero.");
        }

        @Override // androidx.compose.foundation.lazy.grid.InterfaceC20662b
        @Y61.k
        public final List<Integer> a(@Y61.k androidx.compose.ui.unit.d dVar, int i12, int i13) {
            return C20672g.d(i12, Math.max((i12 + i13) / (dVar.y0(this.f29097a) + i13), 1), i13);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof a) {
                if (androidx.compose.ui.unit.h.b(this.f29097a, ((a) obj).f29097a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.hashCode(this.f29097a);
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/b$b;", "Landroidx/compose/foundation/lazy/grid/b;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.b$b, reason: collision with other inner class name */
    public static final class C1591b implements InterfaceC20662b {

        /* renamed from: a, reason: collision with root package name */
        public final int f29098a;

        public C1591b(int i12) {
            this.f29098a = i12;
            if (i12 > 0) {
                return;
            }
            androidx.compose.foundation.internal.e.a("Provided count should be larger than zero");
        }

        @Override // androidx.compose.foundation.lazy.grid.InterfaceC20662b
        @Y61.k
        public final List<Integer> a(@Y61.k androidx.compose.ui.unit.d dVar, int i12, int i13) {
            return C20672g.d(i12, this.f29098a, i13);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof C1591b) {
                if (this.f29098a == ((C1591b) obj).f29098a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return -this.f29098a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/grid/b$c;", "Landroidx/compose/foundation/lazy/grid/b;", "Landroidx/compose/ui/unit/h;", "size", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.b$c */
    public static final class c implements InterfaceC20662b {

        /* renamed from: a, reason: collision with root package name */
        public final float f29099a;

        public c(float f12, C42822w c42822w) {
            this.f29099a = f12;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            if (Float.compare(f12, 0) > 0) {
                return;
            }
            androidx.compose.foundation.internal.e.a("Provided size should be larger than zero.");
        }

        @Override // androidx.compose.foundation.lazy.grid.InterfaceC20662b
        @Y61.k
        public final List<Integer> a(@Y61.k androidx.compose.ui.unit.d dVar, int i12, int i13) {
            int iY02 = dVar.y0(this.f29099a);
            int i14 = iY02 + i13;
            int i15 = i13 + i12;
            if (i14 >= i15) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i12));
                return arrayList;
            }
            int i16 = i15 / i14;
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 < i16; i17++) {
                arrayList2.add(Integer.valueOf(iY02));
            }
            return arrayList2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof c) {
                if (androidx.compose.ui.unit.h.b(this.f29099a, ((c) obj).f29099a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.hashCode(this.f29099a);
        }
    }

    @Y61.k
    List<Integer> a(@Y61.k androidx.compose.ui.unit.d dVar, int i12, int i13);
}
