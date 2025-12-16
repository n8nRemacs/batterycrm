package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "flingVelocity", "lowerBound", "upperBound", "invoke", "(FFF)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20827v extends kotlin.jvm.internal.N implements Y41.q<Float, Float, Float, Float> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0 f30041l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f30042m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20827v(m0 m0Var, LayoutDirection layoutDirection) {
        super(3);
        this.f30041l = m0Var;
        this.f30042m = layoutDirection;
    }

    @Override // Y41.q
    public final Float invoke(Float f12, Float f13, Float f14) {
        float fFloatValue = f12.floatValue();
        float fFloatValue2 = f13.floatValue();
        float fFloatValue3 = f14.floatValue();
        m0 m0Var = this.f30041l;
        boolean zB2 = androidx.compose.foundation.gestures.snapping.j.b(m0Var, fFloatValue);
        if (m0Var.l().getF29870e() != Orientation.f27425b) {
            if (this.f30042m != LayoutDirection.f42838b) {
                zB2 = !zB2;
            }
        }
        int f29867b = m0Var.l().getF29867b();
        float fA2 = f29867b == 0 ? 0.0f : androidx.compose.foundation.gestures.snapping.j.a(m0Var) / f29867b;
        float f15 = fA2 - ((int) fA2);
        int iA2 = androidx.compose.foundation.gestures.snapping.h.a(fFloatValue, m0Var.f29980q);
        androidx.compose.foundation.gestures.snapping.d.f28003b.getClass();
        if (androidx.compose.foundation.gestures.snapping.d.a(iA2, 0)) {
            fFloatValue2 = Math.abs(f15) > 0.5f ? fFloatValue3 : fFloatValue3;
        } else if (!androidx.compose.foundation.gestures.snapping.d.a(iA2, androidx.compose.foundation.gestures.snapping.d.f28004c)) {
            if (!androidx.compose.foundation.gestures.snapping.d.a(iA2, androidx.compose.foundation.gestures.snapping.d.f28005d)) {
                fFloatValue2 = 0.0f;
            }
        }
        return Float.valueOf(fFloatValue2);
    }
}
