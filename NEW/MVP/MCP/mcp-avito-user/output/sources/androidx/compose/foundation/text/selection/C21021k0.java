package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import l0.g;

/* compiled from: SelectionHandles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21021k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f32052a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f32053b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.semantics.E<C21019j0> f32054c;

    static {
        float f12 = 25;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f32052a = f12;
        f32053b = f12;
        f32054c = new androidx.compose.ui.semantics.E<>("SelectionHandleInfo", null, 2, null);
    }

    public static final long a(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) - 1.0f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }
}
