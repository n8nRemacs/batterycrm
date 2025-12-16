package com.akita.compose.component.bottom_sheet;

import androidx.compose.foundation.gestures.C20501s;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: BottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/G;", "Landroidx/compose/ui/input/nestedscroll/a;", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class G implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f60517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, G0> f60518c;

    public G(I i12, Y41.l lVar) {
        Orientation orientation = Orientation.f27425b;
        this.f60517b = i12;
        this.f60518c = lVar;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    public final Object U0(long j12, long j13, @Y61.k Continuation<? super androidx.compose.ui.unit.B> continuation) {
        Orientation orientation = Orientation.f27425b;
        this.f60518c.invoke(Boxing.boxFloat(androidx.compose.ui.unit.B.d(j13)));
        return androidx.compose.ui.unit.B.a(j13);
    }

    public final long a(float f12) {
        Orientation orientation = Orientation.f27425b;
        Orientation orientation2 = Orientation.f27425b;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        Orientation orientation = Orientation.f27425b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 & 4294967295L));
        if (fIntBitsToFloat < 0.0f) {
            androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
            if (androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c)) {
                C20501s<SheetValue> c20501s = this.f60517b.f60524d;
                float fE2 = c20501s.e(fIntBitsToFloat);
                float f12 = fE2 - c20501s.f();
                c20501s.f27976o.a(fE2, 0.0f);
                return a(f12);
            }
        }
        l0.g.f413384b.getClass();
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        if (!androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c)) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        C20501s<SheetValue> c20501s = this.f60517b.f60524d;
        Orientation orientation = Orientation.f27425b;
        float fE2 = c20501s.e(Float.intBitsToFloat((int) (4294967295L & j13)));
        float f12 = fE2 - c20501s.f();
        c20501s.f27976o.a(fE2, 0.0f);
        return a(f12);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    public final Object k0(long j12, @Y61.k Continuation<? super androidx.compose.ui.unit.B> continuation) {
        Orientation orientation = Orientation.f27425b;
        float fD2 = androidx.compose.ui.unit.B.d(j12);
        I i12 = this.f60517b;
        float f12 = i12.f60524d.f();
        float fE2 = i12.f60524d.c().e();
        if (fD2 >= 0.0f || f12 <= fE2) {
            androidx.compose.ui.unit.B.f42836b.getClass();
            j12 = 0;
        } else {
            this.f60518c.invoke(Boxing.boxFloat(fD2));
        }
        return androidx.compose.ui.unit.B.a(j12);
    }
}
