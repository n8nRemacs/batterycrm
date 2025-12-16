package com.avito.android.beduin.v2.page.impl.compose.screen;

import Hi.e;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.u;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.render.compose.C36345b;
import com.avito.beduin.v2.render.compose.G;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2-page_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: BeduinBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.v2.page.impl.compose.screen.a$a, reason: collision with other inner class name */
    public static final class C3134a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105002l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e.a f105003m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3134a(Y41.a<G0> aVar, e.a aVar2) {
            super(0);
            this.f105002l = aVar;
            this.f105003m = aVar2;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f105002l.invoke();
            e.a aVar = this.f105003m;
            aVar.f7623e.invoke();
            aVar.f7619a.destroy();
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.q<J, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e.a f105004l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ G f105005m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.theme.k f105006n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f105007o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ BottomSheetContentPaddings f105008p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e.a aVar, G g12, com.avito.beduin.v2.theme.k kVar, boolean z12, BottomSheetContentPaddings bottomSheetContentPaddings) {
            super(3);
            this.f105004l = aVar;
            this.f105005m = g12;
            this.f105006n = kVar;
            this.f105007o = z12;
            this.f105008p = bottomSheetContentPaddings;
        }

        @Override // Y41.q
        public final G0 invoke(J j12, A a12, Integer num) {
            v vVarF;
            v vVarK;
            boolean z12;
            float f12;
            A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                a13.C(-454992238);
                e.a aVar = this.f105004l;
                BottomSheetHeight bottomSheetHeight = aVar.f7620b;
                a13.C(-455008875);
                if (bottomSheetHeight == BottomSheetHeight.f337303c) {
                    vVarF = C20588k2.w(C20588k2.d(v.f42878y1, 1.0f), null, 3);
                } else if (bottomSheetHeight == BottomSheetHeight.f337304d) {
                    v.a aVar2 = v.f42878y1;
                    FillElement fillElement = C20588k2.f28682c;
                    aVar2.d0(fillElement);
                    vVarF = fillElement;
                } else {
                    if (bottomSheetHeight != BottomSheetHeight.f337305e) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVarF = C20588k2.f(C20588k2.d(v.f42878y1, 1.0f), ((androidx.compose.ui.unit.d) a13.o(Q0.f41199h)).J(C35835l0.g((Context) a13.o(AndroidCompositionLocals_androidKt.f41069b)).y / 2));
                }
                a13.h();
                a13.C(-454991198);
                if (this.f105008p == BottomSheetContentPaddings.f337297d) {
                    a13.C(1210600508);
                    if (((Boolean) a13.o(C22543x1.f41638a)).booleanValue()) {
                        a13.C(1131857975);
                        Configuration configuration = (Configuration) a13.o(AndroidCompositionLocals_androidKt.f41068a);
                        z12 = Math.min(configuration.screenWidthDp, configuration.screenHeightDp) >= 600;
                        a13.h();
                        a13.h();
                    } else {
                        a13.C(1132011239);
                        long jA2 = DU.a.a(a13);
                        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a13.o(Q0.f41199h);
                        float fMin = Math.min(dVar.J((int) (jA2 >> 32)), dVar.J((int) (jA2 & 4294967295L)));
                        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                        z12 = Float.compare(fMin, (float) 600) >= 0;
                        a13.h();
                        a13.h();
                    }
                    if (z12) {
                        f12 = 32;
                        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                    } else {
                        f12 = 16;
                        h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                    }
                    vVarK = R1.k(f12, 0.0f, 2, vVarF);
                } else {
                    vVarK = vVarF;
                }
                a13.h();
                a13.h();
                C36345b.a(this.f105005m, this.f105006n, aVar.f7619a, vVarK, false, this.f105007o, a13, 576, 16);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e.a f105009l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ u f105010m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ G f105011n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.theme.k f105012o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f105013p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105014q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e.a aVar, u uVar, G g12, com.avito.beduin.v2.theme.k kVar, boolean z12, Y41.a<G0> aVar2, int i12) {
            super(2);
            this.f105009l = aVar;
            this.f105010m = uVar;
            this.f105011n = g12;
            this.f105012o = kVar;
            this.f105013p = z12;
            this.f105014q = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(4097);
            G g12 = this.f105011n;
            com.avito.beduin.v2.theme.k kVar = this.f105012o;
            a.a(this.f105009l, this.f105010m, g12, kVar, this.f105013p, this.f105014q, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Hi.e.a r25, @Y61.k com.akita.compose.component.toast_bar.u r26, @Y61.k com.avito.beduin.v2.render.compose.G r27, @Y61.k com.avito.beduin.v2.theme.k r28, boolean r29, @Y61.k Y41.a<kotlin.G0> r30, @Y61.l androidx.compose.runtime.A r31, int r32) {
        /*
            r6 = r25
            r7 = r30
            r0 = -1516268004(0xffffffffa59f961c, float:-2.7683821E-16)
            r1 = r31
            androidx.compose.runtime.B r15 = r1.E(r0)
            r0 = -1757526454(0xffffffff973e464a, float:-6.148103E-25)
            r15.C(r0)
            boolean r0 = r15.B(r7)
            r1 = 0
            r2 = 1
            boolean r3 = r15.B(r6)
            r0 = r0 | r3
            java.lang.Object r3 = r15.t()
            if (r0 != 0) goto L2d
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r0) goto L35
        L2d:
            com.avito.android.beduin.v2.page.impl.compose.screen.a$a r3 = new com.avito.android.beduin.v2.page.impl.compose.screen.a$a
            r3.<init>(r7, r6)
            r15.H(r3)
        L35:
            r8 = r3
            Y41.a r8 = (Y41.a) r8
            r15.X(r1)
            com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings r0 = com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings.f337298e
            com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings r5 = r6.f7621c
            if (r5 != r0) goto L44
            r21 = r2
            goto L46
        L44:
            r21 = r1
        L46:
            com.avito.android.beduin.v2.page.impl.compose.screen.a$b r9 = new com.avito.android.beduin.v2.page.impl.compose.screen.a$b
            r0 = r9
            r1 = r25
            r2 = r27
            r3 = r28
            r4 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1008715580(0x3c1fc73c, float:0.009752091)
            androidx.compose.runtime.internal.n r20 = androidx.compose.runtime.internal.r.c(r0, r9, r15)
            r18 = 0
            r19 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r22 = 0
            r23 = 384(0x180, float:5.38E-43)
            r24 = 3958(0xf76, float:5.546E-42)
            r11 = r26
            r0 = r15
            r15 = r21
            r21 = r0
            com.akita.compose.component.bottom_sheet.H.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.runtime.c2 r8 = r0.Z()
            if (r8 == 0) goto L94
            com.avito.android.beduin.v2.page.impl.compose.screen.a$c r9 = new com.avito.android.beduin.v2.page.impl.compose.screen.a$c
            r0 = r9
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f38184d = r9
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.v2.page.impl.compose.screen.a.a(Hi.e$a, com.akita.compose.component.toast_bar.u, com.avito.beduin.v2.render.compose.G, com.avito.beduin.v2.theme.k, boolean, Y41.a, androidx.compose.runtime.A, int):void");
    }
}
