package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose;

import Y41.l;
import Y41.p;
import Y41.q;
import Y61.k;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.o;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.J1;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.u;
import com.akita.compose.component.toast_bar.w;
import com.avito.android.analytics.screens.mvi.r;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vs.InterfaceC49374a;
import vs.InterfaceC49375b;

/* compiled from: RegionSheetScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002¨\u0006\u0007²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u001e\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lvs/a;", "Lkotlin/G0;", "action", "", "", "closeWithResult", "_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* compiled from: ContentDrawTracking.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "com/avito/android/analytics/screens/compose/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<androidx.compose.ui.graphics.drawscope.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f128478l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.compose.a f128479m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, com.avito.android.analytics.screens.compose.a aVar) {
            super(1);
            this.f128478l = rVar;
            this.f128479m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            dVar.y1();
            com.avito.android.analytics.screens.compose.a aVar = this.f128479m;
            r rVar = this.f128478l;
            if (rVar != null) {
                aVar.n(rVar.f90666a, rVar.f90667b, null);
            }
            aVar.f();
            return G0.f406611a;
        }
    }

    /* compiled from: RegionSheetScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.RegionSheetScreenKt$RegionSheetScreen$1", f = "RegionSheetScreen.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f128480q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f128481r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC49375b> f128482s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f128483t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f128484u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ J f128485v;

        /* compiled from: RegionSheetScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvs/b;", "event", "Lkotlin/G0;", "emit", "(Lvs/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f128486b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f128487c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ u f128488d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ J f128489e;

            public a(T t12, InterfaceC22204y1 interfaceC22204y1, u uVar, J j12) {
                this.f128486b = t12;
                this.f128487c = interfaceC22204y1;
                this.f128488d = uVar;
                this.f128489e = j12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC49375b interfaceC49375b = (InterfaceC49375b) obj;
                if (interfaceC49375b instanceof InterfaceC49375b.a) {
                    ((l) this.f128487c.getF42167b()).invoke(((InterfaceC49375b.a) interfaceC49375b).f441016a);
                } else if (interfaceC49375b instanceof InterfaceC49375b.C12795b) {
                    C43259k.d(this.f128486b, null, null, new com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.e(interfaceC49375b, this.f128488d, this.f128489e, null), 3);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC43160i interfaceC43160i, InterfaceC22204y1 interfaceC22204y1, u uVar, J j12, Continuation continuation) {
            super(2, continuation);
            this.f128482s = interfaceC43160i;
            this.f128483t = interfaceC22204y1;
            this.f128484u = uVar;
            this.f128485v = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f128482s, this.f128483t, this.f128484u, this.f128485v, continuation);
            bVar.f128481r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f128480q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((T) this.f128481r, this.f128483t, this.f128484u, this.f128485v);
                this.f128480q = 1;
                if (this.f128482s.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RegionSheetScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RegionSheetState f128490l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f128491m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RegionSheetState regionSheetState, InterfaceC22204y1 interfaceC22204y1) {
            super(2);
            this.f128490l = regionSheetState;
            this.f128491m = interfaceC22204y1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r11, java.lang.Integer r12) {
            /*
                r10 = this;
                r7 = r11
                androidx.compose.runtime.A r7 = (androidx.compose.runtime.A) r7
                java.lang.Number r12 = (java.lang.Number) r12
                int r11 = r12.intValue()
                r11 = r11 & 11
                r12 = 2
                if (r11 != r12) goto L19
                boolean r11 = r7.c()
                if (r11 != 0) goto L15
                goto L19
            L15:
                r7.f()
                goto L53
            L19:
                com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState r11 = r10.f128490l
                com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$a r11 = r11.f128394e
                java.lang.String r1 = r11.f128430a
                r11 = -2068908151(0xffffffff84aef789, float:-4.113453E-36)
                r7.C(r11)
                androidx.compose.runtime.y1 r11 = r10.f128491m
                boolean r12 = r7.B(r11)
                java.lang.Object r0 = r7.t()
                if (r12 != 0) goto L3a
                androidx.compose.runtime.A$a r12 = androidx.compose.runtime.A.f37866a
                r12.getClass()
                androidx.compose.runtime.A$a$a r12 = androidx.compose.runtime.A.a.f37868b
                if (r0 != r12) goto L42
            L3a:
                com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.f r0 = new com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.f
                r0.<init>(r11)
                r7.H(r0)
            L42:
                r3 = r0
                Y41.a r3 = (Y41.a) r3
                r7.h()
                r8 = 0
                r9 = 117(0x75, float:1.64E-43)
                r0 = 0
                r2 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.avito.android.mnz_common.compose.C32578a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L53:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.d.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RegionSheetScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.d$d, reason: collision with other inner class name */
    public static final class C3813d extends N implements q<T1, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RegionSheetState f128492l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f128493m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3813d(RegionSheetState regionSheetState, InterfaceC22204y1 interfaceC22204y1) {
            super(3);
            this.f128492l = regionSheetState;
            this.f128493m = interfaceC22204y1;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r41, androidx.compose.runtime.A r42, java.lang.Integer r43) {
            /*
                Method dump skipped, instructions count: 512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.d.C3813d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RegionSheetScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RegionSheetState f128494l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<InterfaceC49374a, G0> f128495m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC49375b> f128496n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f128497o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f128498p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(RegionSheetState regionSheetState, l<? super InterfaceC49374a, G0> lVar, InterfaceC43160i<? extends InterfaceC49375b> interfaceC43160i, l<? super List<Long>, G0> lVar2, int i12) {
            super(2);
            this.f128494l = regionSheetState;
            this.f128495m = lVar;
            this.f128496n = interfaceC43160i;
            this.f128497o = (N) lVar2;
            this.f128498p = i12;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f128498p | 1);
            ?? r32 = this.f128497o;
            d.a(this.f128494l, this.f128495m, this.f128496n, r32, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k RegionSheetState regionSheetState, @k l<? super InterfaceC49374a, G0> lVar, @k InterfaceC43160i<? extends InterfaceC49375b> interfaceC43160i, @k l<? super List<Long>, G0> lVar2, @Y61.l A a12, int i12) {
        boolean z12;
        B bE2 = a12.E(-409439031);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        u uVarA = w.a(bE2);
        C22187u0.d(new b(interfaceC43160i, interfaceC22204y1M2, uVarA, com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2), null), bE2, interfaceC43160i);
        r perfTrackerParams = regionSheetState.getPerfTrackerParams();
        bE2.C(-976608008);
        bE2.C(2063036140);
        if (((Boolean) bE2.o(C22543x1.f41638a)).booleanValue()) {
            z12 = false;
            bE2.C(421109671);
            com.akita.compose.component.scaffold.g.a(androidx.compose.ui.input.nestedscroll.e.a(v.f42878y1, J1.e(bE2), null), null, androidx.compose.runtime.internal.r.c(-719304602, new c(regionSheetState, interfaceC22204y1M), bE2), uVarA, null, null, null, androidx.compose.runtime.internal.r.c(383859870, new C3813d(regionSheetState, interfaceC22204y1M), bE2), bE2, 12583296, 114);
            bE2.X(false);
        } else {
            bE2.C(420357239);
            com.avito.android.analytics.screens.compose.a aVar = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
            if (perfTrackerParams != null) {
                aVar.m(perfTrackerParams.f90666a);
            }
            aVar.l();
            v.a aVar2 = v.f42878y1;
            v vVarD = o.d(aVar2, new a(perfTrackerParams, aVar));
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarD);
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
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            z12 = false;
            com.akita.compose.component.scaffold.g.a(androidx.compose.ui.input.nestedscroll.e.a(aVar2, J1.e(bE2), null), null, androidx.compose.runtime.internal.r.c(-719304602, new c(regionSheetState, interfaceC22204y1M), bE2), uVarA, null, null, null, androidx.compose.runtime.internal.r.c(383859870, new C3813d(regionSheetState, interfaceC22204y1M), bE2), bE2, 12583296, 114);
            bE2.X(true);
            bE2.X(false);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z12, z12);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new e(regionSheetState, lVar, interfaceC43160i, lVar2, i12);
        }
    }

    public static final HashMap b(boolean z12) {
        int i12;
        RegionSheetState.Location.CheckboxState checkboxState;
        HashMap map;
        int i13;
        char c12;
        RegionSheetState.Location.CheckboxState checkboxState2;
        HashMap map2 = new HashMap();
        int i14 = z12 ? 5 : 10;
        ArrayList arrayList = new ArrayList(i14);
        int i15 = 0;
        while (i15 < i14) {
            long j12 = i15;
            Long lValueOf = Long.valueOf(j12);
            int i16 = i15 % 4;
            RegionSheetState.Location.CheckboxState checkboxState3 = i16 != 0 ? i16 != 1 ? i16 != 2 ? RegionSheetState.Location.CheckboxState.f128407d : RegionSheetState.Location.CheckboxState.f128408e : RegionSheetState.Location.CheckboxState.f128406c : RegionSheetState.Location.CheckboxState.f128405b;
            Boolean bool = i16 != 0 ? i16 != 1 ? Boolean.TRUE : Boolean.FALSE : null;
            if (i16 == 0) {
                i12 = i14;
                map = new HashMap();
                checkboxState = checkboxState3;
            } else {
                HashMap map3 = new HashMap();
                int i17 = z12 ? 2 : 3;
                ArrayList arrayList2 = new ArrayList(i17);
                int i18 = 0;
                while (i18 < i17) {
                    RegionSheetState.Location.CheckboxState checkboxState4 = checkboxState3;
                    long j13 = i18;
                    Long lValueOf2 = Long.valueOf(j13);
                    int i19 = i14;
                    int i22 = i15 % 3;
                    if (i22 != 0) {
                        i13 = i17;
                        if (i22 != 1) {
                            c12 = 2;
                            checkboxState2 = i22 != 2 ? RegionSheetState.Location.CheckboxState.f128407d : RegionSheetState.Location.CheckboxState.f128408e;
                        } else {
                            c12 = 2;
                            checkboxState2 = RegionSheetState.Location.CheckboxState.f128406c;
                        }
                    } else {
                        i13 = i17;
                        c12 = 2;
                        checkboxState2 = z12 ? RegionSheetState.Location.CheckboxState.f128409f : RegionSheetState.Location.CheckboxState.f128405b;
                    }
                    map3.put(lValueOf2, new RegionSheetState.Location(j13, "Московская область", checkboxState2, null, new HashMap(), C42784z0.f406748b, false, false, 192, null));
                    arrayList2.add(G0.f406611a);
                    i18++;
                    checkboxState3 = checkboxState4;
                    i14 = i19;
                    i17 = i13;
                }
                i12 = i14;
                checkboxState = checkboxState3;
                map = map3;
            }
            map2.put(lValueOf, new RegionSheetState.Location(j12, "Московская область", checkboxState, bool, map, C42784z0.f406748b, false, false, 192, null));
            arrayList.add(G0.f406611a);
            i15++;
            i14 = i12;
        }
        return map2;
    }
}
