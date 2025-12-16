package com.akita.compose.component.slider;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SliderState.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"slider_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {

    /* compiled from: SliderState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f62758l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f62758l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a aVar = (Y41.a) this.f62758l.getF42167b();
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    public static final float a(float f12, float[] fArr, float f13, float f14) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f15 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f15);
            } else {
                float fAbs = Math.abs(E0.e.b(f13, f14, f15) - f12);
                kotlin.ranges.k it = new kotlin.ranges.l(1, length, 1).iterator();
                while (it.f406910d) {
                    float f16 = fArr[it.a()];
                    float fAbs2 = Math.abs(E0.e.b(f13, f14, f16) - f12);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f15 = f16;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f15);
            }
        }
        return fValueOf != null ? E0.e.b(f13, f14, fValueOf.floatValue()) : f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.akita.compose.component.slider.q b(float r4, @Y61.k Y41.l<? super java.lang.Float, kotlin.G0> r5, @Y61.l kotlin.ranges.f<java.lang.Float> r6, @Y61.l Y41.a<kotlin.G0> r7, @j.F int r8, @Y61.l androidx.compose.runtime.A r9, int r10, int r11) {
        /*
            r0 = -1446269141(0xffffffffa9cbaf2b, float:-9.045398E-14)
            r9.C(r0)
            r11 = r11 & 16
            r0 = 0
            if (r11 == 0) goto Lc
            r8 = r0
        Lc:
            androidx.compose.runtime.y1 r7 = androidx.compose.runtime.C22126m3.m(r7, r9)
            r11 = 34736478(0x212095e, float:1.0729074E-37)
            r9.C(r11)
            r11 = r10 & 896(0x380, float:1.256E-42)
            r11 = r11 ^ 384(0x180, float:5.38E-43)
            r1 = 1
            r2 = 256(0x100, float:3.59E-43)
            if (r11 <= r2) goto L25
            boolean r11 = r9.B(r6)
            if (r11 != 0) goto L29
        L25:
            r11 = r10 & 384(0x180, float:5.38E-43)
            if (r11 != r2) goto L2b
        L29:
            r11 = r1
            goto L2c
        L2b:
            r11 = r0
        L2c:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r10
            r2 = r2 ^ 24576(0x6000, float:3.4438E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 <= r3) goto L3c
            boolean r2 = r9.m(r8)
            if (r2 != 0) goto L40
        L3c:
            r10 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r10 != r3) goto L41
        L40:
            r0 = r1
        L41:
            r10 = r11 | r0
            java.lang.Object r11 = r9.t()
            if (r10 != 0) goto L52
            androidx.compose.runtime.A$a r10 = androidx.compose.runtime.A.f37866a
            r10.getClass()
            androidx.compose.runtime.A$a$a r10 = androidx.compose.runtime.A.a.f37868b
            if (r11 != r10) goto L5f
        L52:
            com.akita.compose.component.slider.q r11 = new com.akita.compose.component.slider.q
            com.akita.compose.component.slider.r$a r10 = new com.akita.compose.component.slider.r$a
            r10.<init>(r7)
            r11.<init>(r4, r8, r10, r6)
            r9.H(r11)
        L5f:
            com.akita.compose.component.slider.q r11 = (com.akita.compose.component.slider.q) r11
            r9.h()
            r11.f62747j = r5
            r9.h()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.slider.r.b(float, Y41.l, kotlin.ranges.f, Y41.a, int, androidx.compose.runtime.A, int, int):com.akita.compose.component.slider.q");
    }
}
