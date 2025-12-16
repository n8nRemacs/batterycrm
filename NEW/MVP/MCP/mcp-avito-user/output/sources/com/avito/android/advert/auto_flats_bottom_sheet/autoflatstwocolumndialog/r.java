package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog;

import U3.a;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AutoFlatsTwoColumnDialogScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {

    /* compiled from: ContentDrawTracking.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "com/avito/android/analytics/screens/compose/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f68734l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.compose.a f68735m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.analytics.screens.mvi.r rVar, com.avito.android.analytics.screens.compose.a aVar) {
            super(1);
            this.f68734l = rVar;
            this.f68735m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            dVar.y1();
            com.avito.android.analytics.screens.compose.a aVar = this.f68735m;
            com.avito.android.analytics.screens.mvi.r rVar = this.f68734l;
            if (rVar != null) {
                aVar.n(rVar.f90666a, rVar.f90667b, null);
            }
            aVar.f();
            return G0.f406611a;
        }
    }

    /* compiled from: AutoFlatsTwoColumnDialogScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.AutoFlatsTwoColumnDialogScreenKt$AutoFlatsTwoColumnDialogScreen$1", f = "AutoFlatsTwoColumnDialogScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ U3.c f68736q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f68737r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(U3.c cVar, Y41.l<? super String, G0> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f68736q = cVar;
            this.f68737r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f68736q, this.f68737r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = this.f68736q.f16142d;
            if (str != null) {
                this.f68737r.invoke(str);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutoFlatsTwoColumnDialogScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<U3.a, G0> f68738l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super U3.a, G0> lVar) {
            super(0);
            this.f68738l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f68738l.invoke(a.b.f16136a);
            return G0.f406611a;
        }
    }

    /* compiled from: AutoFlatsTwoColumnDialogScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ U3.c f68739l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(U3.c cVar) {
            super(1);
            this.f68739l = cVar;
        }

        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            ArrayList arrayList = this.f68739l.f16143e;
            m0Var.a(arrayList.size(), null, new u(s.f68743l, arrayList), new C22096n(-632812321, new v(arrayList), true));
            return G0.f406611a;
        }
    }

    /* compiled from: AutoFlatsTwoColumnDialogScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ U3.c f68740l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f68741m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<U3.a, G0> f68742n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(U3.c cVar, Y41.l<? super String, G0> lVar, Y41.l<? super U3.a, G0> lVar2, int i12) {
            super(2);
            this.f68740l = cVar;
            this.f68741m = lVar;
            this.f68742n = lVar2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            Y41.l<String, G0> lVar = this.f68741m;
            Y41.l<U3.a, G0> lVar2 = this.f68742n;
            r.b(this.f68740l, lVar, lVar2, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(U3.c cVar, Y41.a aVar, A a12, int i12) {
        B bE2 = a12.E(-1693946505);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        com.avito.android.analytics.screens.mvi.r perfTrackerParams = cVar.getPerfTrackerParams();
        bE2.C(-976608008);
        bE2.C(2063036140);
        if (((Boolean) bE2.o(C22543x1.f41638a)).booleanValue()) {
            bE2.C(421109671);
            FillElement fillElement = C20588k2.f28682c;
            aVar2.getClass();
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.scaffold.g.a(R1.i(fillElement, 16), null, null, null, null, null, null, androidx.compose.runtime.internal.r.c(-1367058612, new p(aVar), bE2), bE2, 12582912, WebSocketProtocol.PAYLOAD_SHORT);
            bE2.X(false);
        } else {
            bE2.C(420357239);
            com.avito.android.analytics.screens.compose.a aVar4 = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
            if (perfTrackerParams != null) {
                aVar4.m(perfTrackerParams.f90666a);
            }
            aVar4.l();
            androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(aVar2, new o(perfTrackerParams, aVar4));
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar5);
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
            FillElement fillElement2 = C20588k2.f28682c;
            aVar2.getClass();
            h.a aVar6 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.scaffold.g.a(R1.i(fillElement2, 16), null, null, null, null, null, null, androidx.compose.runtime.internal.r.c(-1367058612, new p(aVar), bE2), bE2, 12582912, WebSocketProtocol.PAYLOAD_SHORT);
            bE2.X(true);
            bE2.X(false);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, false);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new q(cVar, aVar, aVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k U3.c r18, @Y61.k Y41.l<? super java.lang.String, kotlin.G0> r19, @Y61.k Y41.l<? super U3.a, kotlin.G0> r20, @Y61.l androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.r.b(U3.c, Y41.l, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
