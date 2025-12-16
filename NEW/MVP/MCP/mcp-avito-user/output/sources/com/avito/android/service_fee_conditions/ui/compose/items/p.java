package com.avito.android.service_fee_conditions.ui.compose.items;

import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qu0.c;

/* compiled from: ServiceFeeConditionsSnippetItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-fee-conditions_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p {

    /* compiled from: ServiceFeeConditionsSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c.g f278550l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f278551m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f278552n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f278553o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c.g gVar, v vVar, int i12, int i13) {
            super(2);
            this.f278550l = gVar;
            this.f278551m = vVar;
            this.f278552n = i12;
            this.f278553o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f278552n | 1);
            v vVar = this.f278551m;
            int i12 = this.f278553o;
            p.a(this.f278550l, vVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceFeeConditionsSnippetItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c.g f278554l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c.g gVar) {
            super(2);
            this.f278554l = gVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                C20585k.f28659a.getClass();
                C20585k.C1589k c1589k = C20585k.f28660b;
                InterfaceC22215f.f39074a.getClass();
                C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = androidx.compose.ui.n.c(a13, aVar);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
                R3.b(pVar, a13, c20568f2A);
                Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
                R3.b(pVar2, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar3);
                }
                Y41.p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
                R3.b(pVar4, a13, vVarC);
                C20576h2 c20576h2 = C20576h2.f28641a;
                c.g gVar = this.f278554l;
                Image image = gVar.f429500a;
                float f12 = 81;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                com.avito.android.mnz_common.compose.i.a(image, f12, f12, "SERVICE_FEE_CONDITIONS_SNIPPET_IMAGE_TEST_TAG", androidx.compose.ui.draw.k.a(R1.m(aVar, 0.0f, 0.0f, 12, 0.0f, 11), androidx.compose.foundation.shape.o.a(10)), com.avito.android.mnz_common.compose.i.c(a13), null, null, null, a13, 265656, 448);
                I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                v vVarC2 = androidx.compose.ui.n.c(a13, aVar);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(pVar, a13, iA2);
                R3.b(pVar2, a13, o1Y2);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    r.B(f37888q2, a13, f37888q2, pVar3);
                }
                R3.b(pVar4, a13, vVarC2);
                K k12 = K.f28344a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.ui.p.b(gVar.f429501b, iVar.f65236g, C22501m2.a(aVar, "SERVICE_FEE_CONDITIONS_SNIPPET_MAIN_TEXT_TEST_TAG"), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
                s.f42720b.getClass();
                com.akita.compose.foundation.ui.p.b(gVar.f429502c, iVar.f65241l, C22501m2.a(aVar, "SERVICE_FEE_CONDITIONS_SNIPPET_PRIMARY_TEXT_TEST_TAG"), false, 0L, null, 1, s.f42722d, false, null, a13, 14156160, 824);
                com.akita.compose.foundation.ui.p.b(gVar.f429503d, iVar.f65245p, C22501m2.a(aVar, "SERVICE_FEE_CONDITIONS_SNIPPET_SECONDARY_TEXT_TEST_TAG"), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
                com.akita.compose.foundation.ui.p.b(gVar.f429504e, iVar.f65245p, C22501m2.a(aVar, "SERVICE_FEE_CONDITIONS_SNIPPET_STATUS_TEXT_TEST_TAG"), false, com.akita.compose.theme.re23.b.f63984b.f63918e0.c(a13), null, 0, 0, false, null, a13, 384, 1000);
                a13.z();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceFeeConditionsSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c.g f278555l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f278556m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f278557n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f278558o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c.g gVar, v vVar, int i12, int i13) {
            super(2);
            this.f278555l = gVar;
            this.f278556m = vVar;
            this.f278557n = i12;
            this.f278558o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f278557n | 1);
            v vVar = this.f278556m;
            int i12 = this.f278558o;
            p.a(this.f278555l, vVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l qu0.c.g r16, @Y61.l androidx.compose.ui.v r17, @Y61.l androidx.compose.runtime.A r18, int r19, int r20) {
        /*
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = 2
            r4 = -770058612(0xffffffffd219d68c, float:-1.6518237E11)
            r5 = r18
            androidx.compose.runtime.B r4 = r5.E(r4)
            r5 = r1 & 14
            if (r5 != 0) goto L1f
            boolean r5 = r4.B(r0)
            if (r5 == 0) goto L1c
            r5 = 4
            goto L1d
        L1c:
            r5 = r3
        L1d:
            r5 = r5 | r1
            goto L20
        L1f:
            r5 = r1
        L20:
            r3 = r3 & r2
            r6 = 16
            if (r3 == 0) goto L2a
            r5 = r5 | 48
        L27:
            r7 = r17
            goto L3b
        L2a:
            r7 = r1 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L27
            r7 = r17
            boolean r8 = r4.B(r7)
            if (r8 == 0) goto L39
            r8 = 32
            goto L3a
        L39:
            r8 = r6
        L3a:
            r5 = r5 | r8
        L3b:
            r5 = r5 & 91
            r8 = 18
            if (r5 != r8) goto L4d
            boolean r5 = r4.c()
            if (r5 != 0) goto L48
            goto L4d
        L48:
            r4.f()
            r3 = r7
            goto L9c
        L4d:
            if (r3 == 0) goto L52
            androidx.compose.ui.v$a r3 = androidx.compose.ui.v.f42878y1
            goto L53
        L52:
            r3 = r7
        L53:
            if (r0 != 0) goto L63
            androidx.compose.runtime.c2 r4 = r4.Z()
            if (r4 == 0) goto L62
            com.avito.android.service_fee_conditions.ui.compose.items.p$a r5 = new com.avito.android.service_fee_conditions.ui.compose.items.p$a
            r5.<init>(r0, r3, r1, r2)
            r4.f38184d = r5
        L62:
            return
        L63:
            com.akita.compose.theme.re23.b r5 = com.akita.compose.theme.re23.b.f63983a
            r5.getClass()
            com.akita.compose.theme.re23.style.x r5 = com.akita.compose.theme.re23.b.b(r4)
            com.akita.compose.component.banner.h r5 = r5.getF66891b()
            r7 = 12
            float r7 = (float) r7
            androidx.compose.ui.unit.h$a r8 = androidx.compose.ui.unit.h.f42849c
            float r6 = (float) r6
            androidx.compose.foundation.layout.V1 r7 = androidx.compose.foundation.layout.R1.d(r7, r7, r7, r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.v r6 = androidx.compose.foundation.layout.C20588k2.d(r3, r6)
            com.avito.android.service_fee_conditions.ui.compose.items.p$b r8 = new com.avito.android.service_fee_conditions.ui.compose.items.p$b
            r8.<init>(r0)
            r9 = 262157772(0xfa035cc, float:1.579794E-29)
            androidx.compose.runtime.internal.n r12 = androidx.compose.runtime.internal.r.c(r9, r8, r4)
            r8 = 12582912(0xc00000, float:1.7632415E-38)
            int r9 = com.akita.compose.component.banner.h.f60462o
            r14 = r9 | r8
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r15 = 120(0x78, float:1.68E-43)
            r13 = r4
            com.akita.compose.component.banner.g.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L9c:
            androidx.compose.runtime.c2 r4 = r4.Z()
            if (r4 == 0) goto La9
            com.avito.android.service_fee_conditions.ui.compose.items.p$c r5 = new com.avito.android.service_fee_conditions.ui.compose.items.p$c
            r5.<init>(r0, r3, r1, r2)
            r4.f38184d = r5
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_fee_conditions.ui.compose.items.p.a(qu0.c$g, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }
}
