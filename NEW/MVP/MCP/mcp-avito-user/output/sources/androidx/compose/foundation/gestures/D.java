package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.ui.input.pointer.C22340s;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: AndroidScrollable.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/D;", "Landroidx/compose/foundation/gestures/z1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D implements InterfaceC20524z1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewConfiguration f27211a;

    public D(@Y61.k ViewConfiguration viewConfiguration) {
        this.f27211a = viewConfiguration;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.gestures.InterfaceC20524z1
    public final long a(@Y61.k C22340s c22340s) {
        R2.f27452a.getClass();
        ViewConfiguration viewConfiguration = this.f27211a;
        float f12 = -viewConfiguration.getScaledVerticalScrollFactor();
        float f13 = -viewConfiguration.getScaledHorizontalScrollFactor();
        ?? r102 = c22340s.f40278a;
        l0.g.f413384b.getClass();
        l0.g gVarA = l0.g.a(0L);
        int size = ((Collection) r102).size();
        int i12 = 0;
        while (true) {
            long j12 = gVarA.f413387a;
            if (i12 >= size) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) * f13;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) * f12;
                return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
            }
            gVarA = l0.g.a(l0.g.j(j12, ((androidx.compose.ui.input.pointer.C) r102.get(i12)).f40125j));
            i12++;
        }
    }
}
