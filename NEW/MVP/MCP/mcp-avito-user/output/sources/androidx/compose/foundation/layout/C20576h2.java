package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.C22350b;
import kotlin.Metadata;

/* compiled from: Row.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/h2;", "Landroidx/compose/foundation/layout/g2;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20576h2 implements InterfaceC20572g2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C20576h2 f28641a = new C20576h2();

    @Override // androidx.compose.foundation.layout.InterfaceC20572g2
    @F3
    @Y61.k
    public final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, float f12, boolean z12) {
        if (f12 <= 0.0d) {
            N.a.a("invalid weight; must be greater than zero");
        }
        return vVar.d0(new LayoutWeightElement(kotlin.ranges.s.c(f12, Float.MAX_VALUE), z12));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20572g2
    @F3
    @Y61.k
    public final androidx.compose.ui.v c(@Y61.k androidx.compose.ui.v vVar, @Y61.k i.b bVar) {
        return vVar.d0(new VerticalAlignElement(bVar));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20572g2
    @F3
    @Y61.k
    public final androidx.compose.ui.v d(@Y61.k androidx.compose.ui.v vVar) {
        return vVar.d0(new WithAlignmentLineElement(C22350b.f40439a));
    }
}
