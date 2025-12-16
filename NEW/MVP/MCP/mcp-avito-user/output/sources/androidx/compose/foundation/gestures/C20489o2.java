package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DragGestureDetector.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/gestures/o2;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Ll0/g;", "initialPositionChange", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20489o2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Orientation f27885a;

    /* renamed from: b, reason: collision with root package name */
    public long f27886b;

    public C20489o2(Orientation orientation, long j12, C42822w c42822w) {
        this.f27885a = orientation;
        this.f27886b = j12;
    }

    public final long a(@Y61.k androidx.compose.ui.input.pointer.C c12, float f12) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long j12 = l0.g.j(this.f27886b, l0.g.i(c12.f40118c, c12.f40122g));
        this.f27886b = j12;
        Orientation orientation = this.f27885a;
        if ((orientation == null ? l0.g.e(j12) : Math.abs(b(j12))) < f12) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        if (orientation == null) {
            long j13 = this.f27886b;
            return l0.g.i(this.f27886b, l0.g.k(l0.g.c(j13, l0.g.e(j13)), f12));
        }
        float fB2 = b(this.f27886b) - (Math.signum(b(this.f27886b)) * f12);
        long j14 = this.f27886b;
        Orientation orientation2 = Orientation.f27426c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation == orientation2 ? j14 & 4294967295L : j14 >> 32));
        if (orientation == orientation2) {
            jFloatToRawIntBits = Float.floatToRawIntBits(fB2);
            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        } else {
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            iFloatToRawIntBits = Float.floatToRawIntBits(fB2);
        }
        return (jFloatToRawIntBits << 32) | (iFloatToRawIntBits & 4294967295L);
    }

    public final float b(long j12) {
        return Float.intBitsToFloat((int) (this.f27885a == Orientation.f27426c ? j12 >> 32 : j12 & 4294967295L));
    }

    public final void c() {
        l0.g.f413384b.getClass();
        this.f27886b = 0L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20489o2(Orientation orientation, long j12, int i12, C42822w c42822w) {
        orientation = (i12 & 1) != 0 ? null : orientation;
        if ((i12 & 2) != 0) {
            l0.g.f413384b.getClass();
            j12 = 0;
        }
        this(orientation, j12, null);
    }
}
