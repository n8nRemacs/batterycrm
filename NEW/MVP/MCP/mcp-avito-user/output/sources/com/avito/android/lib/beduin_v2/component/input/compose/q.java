package com.avito.android.lib.beduin_v2.component.input.compose;

import com.akita.compose.component.input.InputState;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputFormat;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: InnerInput.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2_renderer-compose_component_input"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q {

    /* compiled from: InnerInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AvitoInputState.InputState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoInputState.InputState inputState = AvitoInputState.InputState.f334485c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AvitoInputState.InputState inputState2 = AvitoInputState.InputState.f334485c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AvitoInputFormat.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AvitoInputFormat.a aVar = AvitoInputFormat.f334457c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AvitoInputFormat.a aVar2 = AvitoInputFormat.f334457c;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AvitoInputFormat.a aVar3 = AvitoInputFormat.f334457c;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AvitoInputFormat.a aVar4 = AvitoInputFormat.f334457c;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AvitoInputFormat.a aVar5 = AvitoInputFormat.f334457c;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AvitoInputFormat.a aVar6 = AvitoInputFormat.f334457c;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AvitoInputFormat.a aVar7 = AvitoInputFormat.f334457c;
                iArr2[7] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AvitoInputFormat.a aVar8 = AvitoInputFormat.f334457c;
                iArr2[8] = 9;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.beduin.v2.avito.component.input.state.AvitoInputState r29, @Y61.l androidx.compose.ui.v r30, @Y61.l androidx.compose.runtime.A r31, int r32) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.input.compose.q.a(com.avito.beduin.v2.avito.component.input.state.AvitoInputState, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r8, androidx.compose.ui.v r9, androidx.compose.runtime.A r10, int r11) {
        /*
            r0 = -1353990438(0xffffffffaf4bbeda, float:-1.8530547E-10)
            androidx.compose.runtime.B r10 = r10.E(r0)
            r0 = r11 & 14
            if (r0 != 0) goto L16
            boolean r0 = r10.B(r8)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r11
            goto L17
        L16:
            r0 = r11
        L17:
            r1 = r11 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L27
            boolean r1 = r10.B(r9)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r0 = r0 | r1
        L27:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L39
            boolean r1 = r10.c()
            if (r1 != 0) goto L34
            goto L39
        L34:
            r10.f()
            goto Lb0
        L39:
            java.lang.Integer r1 = com.avito.android.lib.util.q.a(r8)
            if (r1 == 0) goto Lc3
            int r1 = r1.intValue()
            androidx.compose.runtime.J3 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f41069b
            java.lang.Object r2 = r10.o(r2)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources$Theme r3 = r2.getTheme()
            r4 = 1176756347(0x4623e07b, float:10488.12)
            r10.C(r4)
            boolean r3 = r10.B(r3)
            java.lang.Object r4 = r10.t()
            r5 = 0
            if (r3 != 0) goto L69
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r3) goto L83
        L69:
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int[] r1 = new int[]{r1}
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r1)
            int r2 = r1.getResourceId(r5, r5)     // Catch: java.lang.Throwable -> Lbe
            r1.recycle()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r10.H(r4)
        L83:
            java.lang.Number r4 = (java.lang.Number) r4
            int r1 = r4.intValue()
            r10.X(r5)
            if (r1 != 0) goto L9c
            androidx.compose.runtime.c2 r10 = r10.Z()
            if (r10 == 0) goto Ld0
            com.avito.android.lib.beduin_v2.component.input.compose.b r0 = new com.avito.android.lib.beduin_v2.component.input.compose.b
            r0.<init>(r11, r9, r8)
            r10.f38184d = r0
            goto Ld0
        L9c:
            androidx.compose.ui.graphics.painter.e r1 = u0.e.a(r1, r5, r10)
            int r0 = r0 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r6 = r0 | 56
            r4 = 0
            r7 = 8
            java.lang.String r2 = ""
            r3 = r9
            r5 = r10
            com.akita.compose.foundation.ui.e.a(r1, r2, r3, r4, r5, r6, r7)
        Lb0:
            androidx.compose.runtime.c2 r10 = r10.Z()
            if (r10 == 0) goto Ld0
            com.avito.android.lib.beduin_v2.component.input.compose.c r0 = new com.avito.android.lib.beduin_v2.component.input.compose.c
            r0.<init>(r11, r9, r8)
            r10.f38184d = r0
            goto Ld0
        Lbe:
            r8 = move-exception
            r1.recycle()
            throw r8
        Lc3:
            androidx.compose.runtime.c2 r10 = r10.Z()
            if (r10 == 0) goto Ld0
            com.avito.android.lib.beduin_v2.component.input.compose.d r0 = new com.avito.android.lib.beduin_v2.component.input.compose.d
            r0.<init>(r11, r9, r8)
            r10.f38184d = r0
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.input.compose.q.b(java.lang.String, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    public static final InputState c(AvitoInputState.InputState inputState) {
        int iOrdinal = inputState.ordinal();
        if (iOrdinal == 0) {
            return InputState.f61668b;
        }
        if (iOrdinal == 1) {
            return InputState.f61669c;
        }
        if (iOrdinal == 2) {
            return InputState.f61670d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
