package com.avito.android.str_cancellation_settings;

import Sy0.InterfaceC15270a;
import Sy0.c;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.v;
import com.avito.android.analytics.screens.mvi.r;
import com.avito.android.str_cancellation_settings.composables.b0;
import com.avito.android.str_cancellation_settings.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrCancellationSettingsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-cancellation-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    /* compiled from: ContentDrawTracking.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "com/avito/android/analytics/screens/compose/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f288385l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.compose.a f288386m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, com.avito.android.analytics.screens.compose.a aVar) {
            super(1);
            this.f288385l = rVar;
            this.f288386m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            dVar.y1();
            com.avito.android.analytics.screens.compose.a aVar = this.f288386m;
            r rVar = this.f288385l;
            if (rVar != null) {
                aVar.n(rVar.f90666a, rVar.f90667b, null);
            }
            aVar.f();
            return G0.f406611a;
        }
    }

    /* compiled from: StrCancellationSettingsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15270a, G0> f288387l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super InterfaceC15270a, G0> lVar) {
            super(2);
            this.f288387l = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r3, java.lang.Integer r4) {
            /*
                r2 = this;
                androidx.compose.runtime.A r3 = (androidx.compose.runtime.A) r3
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                r4 = r4 & 11
                r0 = 2
                if (r4 != r0) goto L18
                boolean r4 = r3.c()
                if (r4 != 0) goto L14
                goto L18
            L14:
                r3.f()
                goto L4c
            L18:
                r4 = -458691871(0xffffffffe4a8eae1, float:-2.4927823E22)
                r3.C(r4)
                Y41.l<Sy0.a, kotlin.G0> r4 = r2.f288387l
                boolean r0 = r3.B(r4)
                java.lang.Object r1 = r3.t()
                if (r0 != 0) goto L33
                androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
                r0.getClass()
                androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
                if (r1 != r0) goto L3b
            L33:
                com.avito.android.str_cancellation_settings.j r1 = new com.avito.android.str_cancellation_settings.j
                r1.<init>(r4)
                r3.H(r1)
            L3b:
                Y41.a r1 = (Y41.a) r1
                r3.h()
                androidx.compose.ui.v$a r4 = androidx.compose.ui.v.f42878y1
                androidx.compose.foundation.layout.FillElement r0 = androidx.compose.foundation.layout.C20588k2.f28682c
                r4.getClass()
                r4 = 48
                com.avito.android.str_cancellation_settings.composables.t0.a(r4, r1, r3, r0)
            L4c:
                kotlin.G0 r3 = kotlin.G0.f406611a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_cancellation_settings.i.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrCancellationSettingsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.str_cancellation_settings.mvi.entity.a f288388l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15270a, G0> f288389m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<c.a> f288390n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f288391o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.avito.android.str_cancellation_settings.mvi.entity.a aVar, Y41.l<? super InterfaceC15270a, G0> lVar, InterfaceC43160i<? extends c.a> interfaceC43160i, int i12) {
            super(2);
            this.f288388l = aVar;
            this.f288389m = lVar;
            this.f288390n = interfaceC43160i;
            this.f288391o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f288391o | 1);
            InterfaceC43160i<c.a> interfaceC43160i = this.f288390n;
            i.a(this.f288388l, this.f288389m, interfaceC43160i, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k com.avito.android.str_cancellation_settings.mvi.entity.a aVar, @Y61.k Y41.l<? super InterfaceC15270a, G0> lVar, @Y61.k InterfaceC43160i<? extends c.a> interfaceC43160i, @Y61.l A a12, int i12) {
        B bE2 = a12.E(164938996);
        if (aVar instanceof a.b) {
            bE2.C(2028462320);
            a.b bVar = (a.b) aVar;
            r perfTrackerParams = bVar.getPerfTrackerParams();
            bE2.C(-976608008);
            bE2.C(2063036140);
            if (((Boolean) bE2.o(C22543x1.f41638a)).booleanValue()) {
                bE2.C(421109671);
                b0.a(bVar, lVar, interfaceC43160i, bE2, (i12 & 112) | 512);
                bE2.X(false);
            } else {
                bE2.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar2 = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
                if (perfTrackerParams != null) {
                    aVar2.m(perfTrackerParams.f90666a);
                }
                aVar2.l();
                v vVarD = androidx.compose.ui.draw.o.d(v.f42878y1, new a(perfTrackerParams, aVar2));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int i13 = bE2.f37888Q;
                O1 o1S = bE2.S();
                v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
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
                R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                    AK.c.y(i13, bE2, i13, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
                C20644z c20644z = C20644z.f28804a;
                b0.a(bVar, lVar, interfaceC43160i, bE2, (i12 & 112) | 512);
                bE2.X(true);
                bE2.X(false);
            }
            H.A(bE2, false, false, false);
        } else if (aVar instanceof a.c) {
            bE2.C(2028471619);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.n.a(null, null, 0.0f, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, androidx.compose.runtime.internal.r.c(-106069833, new b(lVar), bE2), bE2, 1572864, 55);
            bE2.X(false);
        } else if (aVar instanceof a.d) {
            bE2.C(2028482594);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.p pVar2 = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            com.avito.android.str_cancellation_settings.a.f288142a.getClass();
            com.akita.compose.foundation.ui.n.a(null, null, 0.0f, pVar2, null, com.avito.android.str_cancellation_settings.a.f288143b, bE2, 1572864, 55);
            bE2.X(false);
        } else {
            bE2.C(-1541228825);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(aVar, lVar, interfaceC43160i, i12);
        }
    }
}
