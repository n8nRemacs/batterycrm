package androidx.compose.foundation;

import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: ClipScrollableContainer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/k1;", "Landroidx/compose/ui/graphics/h1;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20536k1 implements androidx.compose.ui.graphics.h1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C20536k1 f28187a = new C20536k1();

    @Override // androidx.compose.ui.graphics.h1
    @Y61.k
    public final androidx.compose.ui.graphics.D0 a(long j12, @Y61.k LayoutDirection layoutDirection, @Y61.k androidx.compose.ui.unit.d dVar) {
        float fY02 = dVar.y0(K0.f26750a);
        return new D0.b(new l0.j(0.0f, -fY02, Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)) + fY02));
    }
}
