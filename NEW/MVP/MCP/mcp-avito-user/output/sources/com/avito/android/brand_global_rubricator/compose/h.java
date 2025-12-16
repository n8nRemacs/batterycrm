package com.avito.android.brand_global_rubricator.compose;

import Y41.l;
import Y41.p;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.k;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.avito.android.brand_global_rubricator.q;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BrandGlobalRubricatorUi.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bx-content_widget_brand-global-rubricator_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* compiled from: BrandGlobalRubricatorUi.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f107444l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.brand_global_rubricator.h, G0> f107445m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q qVar, l<? super com.avito.android.brand_global_rubricator.h, G0> lVar) {
            super(1);
            this.f107444l = qVar;
            this.f107445m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            ArrayList arrayList = this.f107444l.f107465a;
            m0Var.a(arrayList.size(), null, new f(d.f107439l, arrayList), new C22096n(-632812321, new g(this.f107445m, arrayList), true));
            return G0.f406611a;
        }
    }

    /* compiled from: BrandGlobalRubricatorUi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f107446l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.brand_global_rubricator.h, G0> f107447m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q qVar, l<? super com.avito.android.brand_global_rubricator.h, G0> lVar, int i12) {
            super(2);
            this.f107446l = qVar;
            this.f107447m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            h.b(this.f107446l, this.f107447m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(UniversalImage universalImage, boolean z12, A a12, int i12) {
        C20644z c20644z;
        Uri uriC;
        B bE2 = a12.E(-211333255);
        v.a aVar = v.f42878y1;
        v vVarD = C20588k2.d(aVar, 1.0f);
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarD);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, interfaceC22365i0D);
        p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20644z c20644z2 = C20644z.f28804a;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        v vVarA = k.a(C20588k2.d(C20588k2.f(R1.m(aVar, 0.0f, 30, 0.0f, 0.0f, 13), 44), 1.0f), o.a(16));
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.b.f63987e.getClass();
        com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
        v vVarB = androidx.compose.foundation.A.b(vVarA, X2.b.f18131j.c(bE2), Y0.f39346a);
        InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = n.c(bE2, vVarB);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, interfaceC22365i0D2);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        bE2.C(485350602);
        if (z12) {
            com.akita.compose.theme.re23.b.f63985c.getClass();
            c20644z = c20644z2;
            com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64420Z, 0, bE2), null, c20644z.d(C20588k2.k(aVar, 20), InterfaceC22215f.a.f39080f), null, bE2, 56, 8);
        } else {
            c20644z = c20644z2;
        }
        bE2.X(false);
        bE2.X(true);
        bE2.C(1737021292);
        if (!z12) {
            float f12 = 68;
            if (universalImage == null) {
                uriC = null;
            } else {
                Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
                androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
                uriC = C35829k2.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)), dVar.y0(f12), dVar.y0(f12), 0.0f, 1, 44).c(i.f107448b);
            }
            if (uriC != null) {
                v vVarD2 = c20644z.d(C20588k2.o(aVar, f12), InterfaceC22215f.a.f39080f);
                InterfaceC22374n.f40491a.getClass();
                coil.compose.v.b(uriC, null, vVarD2, null, InterfaceC22374n.a.f40498g, null, bE2, 1572920, 4024);
            }
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new com.avito.android.brand_global_rubricator.compose.a(universalImage, z12, aVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k com.avito.android.brand_global_rubricator.q r18, @Y61.k Y41.l<? super com.avito.android.brand_global_rubricator.h, kotlin.G0> r19, @Y61.l androidx.compose.runtime.A r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = 715017908(0x2a9e4eb4, float:2.812105E-13)
            r4 = r20
            androidx.compose.runtime.B r3 = r4.E(r3)
            boolean r4 = r3.B(r0)
            r5 = 2
            r6 = 4
            if (r4 == 0) goto L19
            r4 = r6
            goto L1a
        L19:
            r4 = r5
        L1a:
            r4 = r4 | r2
            boolean r7 = r3.u(r1)
            r8 = 32
            if (r7 == 0) goto L25
            r7 = r8
            goto L27
        L25:
            r7 = 16
        L27:
            r4 = r4 | r7
            r7 = r4 & 91
            r9 = 18
            if (r7 != r9) goto L3a
            boolean r7 = r3.c()
            if (r7 != 0) goto L35
            goto L3a
        L35:
            r3.f()
            goto La4
        L3a:
            androidx.compose.ui.v$a r7 = androidx.compose.ui.v.f42878y1
            r9 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.v r7 = androidx.compose.foundation.layout.C20588k2.d(r7, r9)
            r9 = 10
            float r9 = (float) r9
            androidx.compose.ui.unit.h$a r10 = androidx.compose.ui.unit.h.f42849c
            r10 = 0
            androidx.compose.foundation.layout.V1 r9 = androidx.compose.foundation.layout.R1.c(r9, r10, r5)
            androidx.compose.foundation.layout.k r5 = androidx.compose.foundation.layout.C20585k.f28659a
            r10 = 8
            float r10 = (float) r10
            r5.getClass()
            androidx.compose.foundation.layout.k$j r10 = androidx.compose.foundation.layout.C20585k.g(r10)
            r5 = -1233340915(0xffffffffb67cb60d, float:-3.7656894E-6)
            r3.C(r5)
            r5 = r4 & 14
            r11 = 0
            r12 = 1
            if (r5 != r6) goto L66
            r5 = r12
            goto L67
        L66:
            r5 = r11
        L67:
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r8) goto L6c
            goto L6d
        L6c:
            r12 = r11
        L6d:
            r4 = r5 | r12
            java.lang.Object r5 = r3.t()
            if (r4 != 0) goto L7e
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            r4.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r4) goto L86
        L7e:
            com.avito.android.brand_global_rubricator.compose.h$a r5 = new com.avito.android.brand_global_rubricator.compose.h$a
            r5.<init>(r0, r1)
            r3.H(r5)
        L86:
            r13 = r5
            Y41.l r13 = (Y41.l) r13
            r3.X(r11)
            r11 = 0
            r12 = 0
            r5 = 0
            r8 = 0
            r14 = 0
            r15 = 0
            r16 = 24966(0x6186, float:3.4985E-41)
            r17 = 490(0x1ea, float:6.87E-43)
            r4 = r7
            r6 = r9
            r7 = r8
            r8 = r10
            r9 = r14
            r10 = r15
            r14 = r3
            r15 = r16
            r16 = r17
            androidx.compose.foundation.lazy.C20650b.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        La4:
            androidx.compose.runtime.c2 r3 = r3.Z()
            if (r3 == 0) goto Lb1
            com.avito.android.brand_global_rubricator.compose.h$b r4 = new com.avito.android.brand_global_rubricator.compose.h$b
            r4.<init>(r0, r1, r2)
            r3.f38184d = r4
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.brand_global_rubricator.compose.h.b(com.avito.android.brand_global_rubricator.q, Y41.l, androidx.compose.runtime.A, int):void");
    }

    public static final void c(com.avito.android.brand_global_rubricator.h hVar, l lVar, A a12, int i12) {
        B bE2 = a12.E(1450143864);
        v.a aVar = v.f42878y1;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        v vVarC = C21086w0.c(C20588k2.t(aVar, 104), false, null, null, new com.avito.android.brand_global_rubricator.compose.b(lVar, hVar), 7);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC2 = n.c(bE2, vVarC);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC2);
        K k12 = K.f28344a;
        a(hVar.getF107452c(), hVar.getF107453d(), bE2, 8);
        v vVarD = C20588k2.d(R1.m(aVar, 0.0f, 6, 0.0f, 0.0f, 13), 1.0f);
        String f107450a = hVar.getF107450a();
        com.akita.compose.theme.re23.b.f63983a.getClass();
        r rVar = com.akita.compose.theme.re23.b.f63988f.f65246q;
        com.akita.compose.theme.re23.b.f63987e.getClass();
        com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
        long jC2 = X2.h.f18556d.c(bE2);
        androidx.compose.ui.text.style.i.f42675b.getClass();
        int i14 = androidx.compose.ui.text.style.i.f42678e;
        s.f42720b.getClass();
        com.akita.compose.foundation.ui.p.b(f107450a, rVar, vVarD, false, jC2, androidx.compose.ui.text.style.i.a(i14), 2, s.f42722d, false, null, bE2, 14156160, 776);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(hVar, lVar, aVar, i12);
        }
    }
}
