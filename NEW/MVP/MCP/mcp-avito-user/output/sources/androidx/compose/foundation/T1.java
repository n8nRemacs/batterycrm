package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.S1;
import kotlin.Metadata;

/* compiled from: PlatformMagnifier.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/T1;", "Landroidx/compose/foundation/R1;", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
public final class T1 implements R1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final T1 f26867b = new T1();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f26868c = true;

    /* compiled from: PlatformMagnifier.android.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/T1$a;", "Landroidx/compose/foundation/S1$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @j.X
    public static final class a extends S1.a {
        @Override // androidx.compose.foundation.S1.a, androidx.compose.foundation.Q1
        public final void b(long j12, long j13, float f12) {
            if (!Float.isNaN(f12)) {
                this.f26842a.setZoom(f12);
            }
            if ((9223372034707292159L & j13) != 9205357640488583168L) {
                this.f26842a.show(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
            } else {
                this.f26842a.show(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
            }
        }
    }

    @Override // androidx.compose.foundation.R1
    public final boolean a() {
        return f26868c;
    }

    @Override // androidx.compose.foundation.R1
    public final Q1 b(View view, boolean z12, long j12, float f12, float f13, boolean z13, androidx.compose.ui.unit.d dVar, float f14) {
        if (z12) {
            return new a(new Magnifier(view));
        }
        long jL2 = dVar.L(j12);
        float fM02 = dVar.M0(f12);
        float fM03 = dVar.M0(f13);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jL2 != 9205357640488583168L) {
            builder.setSize(kotlin.math.b.b(Float.intBitsToFloat((int) (jL2 >> 32))), kotlin.math.b.b(Float.intBitsToFloat((int) (jL2 & 4294967295L))));
        }
        if (!Float.isNaN(fM02)) {
            builder.setCornerRadius(fM02);
        }
        if (!Float.isNaN(fM03)) {
            builder.setElevation(fM03);
        }
        if (!Float.isNaN(f14)) {
            builder.setInitialZoom(f14);
        }
        builder.setClippingEnabled(z13);
        return new a(builder.build());
    }
}
