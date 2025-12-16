package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.i;
import kotlin.Metadata;

/* compiled from: Column.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/K;", "Landroidx/compose/foundation/layout/J;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final K f28344a = new K();

    @Override // androidx.compose.foundation.layout.J
    @F3
    @Y61.k
    public final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, float f12, boolean z12) {
        if (f12 <= 0.0d) {
            N.a.a("invalid weight; must be greater than zero");
        }
        return vVar.d0(new LayoutWeightElement(kotlin.ranges.s.c(f12, Float.MAX_VALUE), z12));
    }

    @F3
    @Y61.k
    public final androidx.compose.ui.v c(@Y61.k androidx.compose.ui.v vVar, @Y61.k i.a aVar) {
        return vVar.d0(new HorizontalAlignElement(aVar));
    }
}
