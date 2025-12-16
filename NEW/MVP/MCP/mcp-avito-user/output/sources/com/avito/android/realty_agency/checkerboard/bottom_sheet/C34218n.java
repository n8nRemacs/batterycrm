package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import Zh0.InterfaceC19559a;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: LotItemOptionsBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_checkerboard_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34218n {

    /* compiled from: LotItemOptionsBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.n$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC19559a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f251030l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC19559a interfaceC19559a) {
            return G0.f406611a;
        }
    }

    /* compiled from: LotItemOptionsBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.n$b */
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.a<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f251031b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f251032c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251033d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f251034e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlinx.coroutines.T t12, com.akita.compose.component.bottom_sheet.I i12, Y41.l<? super InterfaceC19559a, G0> lVar, long j12) {
            super(0, L.a.class, "hideBottomSheet", "LotListAdditionalOptionsBottomSheet$hideBottomSheet(Lkotlinx/coroutines/CoroutineScope;Lcom/akita/compose/component/bottom_sheet/BottomSheetState;Lkotlin/jvm/functions/Function1;J)V", 0);
            this.f251031b = t12;
            this.f251032c = i12;
            this.f251033d = lVar;
            this.f251034e = j12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            N0 n0D = C43259k.d(this.f251031b, null, null, new u(this.f251032c, null), 3);
            V0 v02 = (V0) n0D;
            v02.k(new v(this.f251034e, this.f251033d));
            return G0.f406611a;
        }
    }

    /* compiled from: LotItemOptionsBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.n$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f251035l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f251036m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251037n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f251038o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f251039p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlinx.coroutines.T t12, com.akita.compose.component.bottom_sheet.I i12, Y41.l<? super InterfaceC19559a, G0> lVar, long j12, long j13) {
            super(3);
            this.f251035l = t12;
            this.f251036m = i12;
            this.f251037n = lVar;
            this.f251038o = j12;
            this.f251039p = j13;
        }

        @Override // Y41.q
        public final G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarD = C20588k2.d(C20588k2.w(aVar, null, 3), 1.0f);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
                String strC = u0.i.c(a13, R.string.realty_agency_checkerboard_lot_item_binding_option);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.list_item.s f66431b = com.akita.compose.theme.re23.b.m(a13).getF66431b();
                kotlinx.coroutines.T t12 = this.f251035l;
                com.akita.compose.component.bottom_sheet.I i12 = this.f251036m;
                Y41.l<InterfaceC19559a, G0> lVar2 = this.f251037n;
                long j13 = this.f251038o;
                long j14 = this.f251039p;
                androidx.compose.ui.v vVarC2 = C21086w0.c(aVar, false, null, null, new C34221q(t12, i12, lVar2, j13, j14), 7);
                float f12 = 16;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.list_item.m.d(strC, f66431b, R1.k(f12, 0.0f, 2, vVarC2), null, null, null, a13, 0, 56);
                com.akita.compose.component.list_item.m.d(u0.i.c(a13, R.string.realty_agency_checkerboard_lot_item_booking_option), com.akita.compose.theme.re23.b.m(a13).getF66431b(), R1.k(f12, 0.0f, 2, C21086w0.c(aVar, false, null, null, new C34223t(t12, i12, lVar2, j14), 7)), null, null, null, a13, 0, 56);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LotItemOptionsBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.n$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f251040l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f251041m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251042n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f251043o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f251044p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(long j12, long j13, Y41.l<? super InterfaceC19559a, G0> lVar, int i12, int i13) {
            super(2);
            this.f251040l = j12;
            this.f251041m = j13;
            this.f251042n = lVar;
            this.f251043o = i12;
            this.f251044p = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f251043o | 1);
            long j12 = this.f251040l;
            C34218n.a(j12, this.f251041m, this.f251042n, a12, iA2, this.f251044p);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(long r24, long r26, @Y61.l Y41.l<? super Zh0.InterfaceC19559a, kotlin.G0> r28, @Y61.l androidx.compose.runtime.A r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.checkerboard.bottom_sheet.C34218n.a(long, long, Y41.l, androidx.compose.runtime.A, int, int):void");
    }
}
