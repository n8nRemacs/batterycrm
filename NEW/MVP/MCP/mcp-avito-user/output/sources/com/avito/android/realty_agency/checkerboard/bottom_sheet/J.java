package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import Zh0.InterfaceC19559a;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.V0;

/* compiled from: LotsListSortingBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_checkerboard_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class J {

    /* compiled from: LotsListSortingBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC19559a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f250960l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC19559a interfaceC19559a) {
            return G0.f406611a;
        }
    }

    /* compiled from: LotsListSortingBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.a<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f250961b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f250962c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f250963d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlinx.coroutines.T t12, com.akita.compose.component.bottom_sheet.I i12, Y41.l<? super InterfaceC19559a, G0> lVar) {
            super(0, L.a.class, "hideBottomSheet", "LotsListSortingBottomSheet$hideBottomSheet(Lkotlinx/coroutines/CoroutineScope;Lcom/akita/compose/component/bottom_sheet/BottomSheetState;Lkotlin/jvm/functions/Function1;)V", 0);
            this.f250961b = t12;
            this.f250962c = i12;
            this.f250963d = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((V0) C43259k.d(this.f250961b, null, null, new Q(this.f250962c, null), 3)).k(new S(this.f250963d));
            return G0.f406611a;
        }
    }

    /* compiled from: LotsListSortingBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f250964l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f250965m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f250966n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ LotSortingType f250967o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlinx.coroutines.T t12, com.akita.compose.component.bottom_sheet.I i12, Y41.l<? super InterfaceC19559a, G0> lVar, LotSortingType lotSortingType) {
            super(3);
            this.f250964l = t12;
            this.f250965m = i12;
            this.f250966n = lVar;
            this.f250967o = lotSortingType;
        }

        @Override // Y41.q
        public final G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                float f12 = 16;
                androidx.compose.ui.v vVarK = R1.k(f12, 0.0f, 2, C20588k2.d(C20588k2.f(aVar, 52), 1.0f));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarK);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                String strC = u0.i.c(a13, R.string.realty_agency_checkerboard_lots_list_sorting_bottom_sheet_title);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                float f13 = f12;
                com.akita.compose.foundation.ui.p.b(strC, iVar.f65239j, c20644z.d(aVar, InterfaceC22215f.a.f39080f), false, 0L, null, 0, 0, false, null, a13, 0, 1016);
                String strC2 = u0.i.c(a13, R.string.realty_agency_checkerboard_lots_list_sorting_bottom_sheet_reset);
                long jC2 = com.akita.compose.theme.re23.b.f63984b.f63837D.c(a13);
                androidx.compose.ui.v vVarD = c20644z.d(aVar, InterfaceC22215f.a.f39081g);
                kotlinx.coroutines.T t12 = this.f250964l;
                com.akita.compose.component.bottom_sheet.I i12 = this.f250965m;
                Y41.l<InterfaceC19559a, G0> lVar = this.f250966n;
                Y41.l<InterfaceC19559a, G0> lVar2 = lVar;
                com.akita.compose.component.bottom_sheet.I i13 = i12;
                kotlinx.coroutines.T t13 = t12;
                com.akita.compose.foundation.ui.p.b(strC2, iVar.f65240k, C21086w0.c(vVarD, false, null, null, new M(t12, i12, lVar), 7), false, jC2, null, 0, 0, false, null, a13, 0, 1000);
                a13.z();
                Iterator it = ((AbstractC42738c) LotSortingType.f251219f).iterator();
                while (it.hasNext()) {
                    LotSortingType lotSortingType = (LotSortingType) it.next();
                    String strA = Yh0.c.a(lotSortingType, a13);
                    boolean z12 = lotSortingType == this.f250967o;
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    Y41.l<InterfaceC19559a, G0> lVar3 = lVar2;
                    com.akita.compose.component.bottom_sheet.I i14 = i13;
                    kotlinx.coroutines.T t14 = t13;
                    float f14 = f13;
                    com.akita.compose.component.list_item.h.b(strA, z12, com.akita.compose.theme.re23.b.m(a13).getF66431b(), R1.k(f14, 0.0f, 2, C21086w0.c(androidx.compose.ui.v.f42878y1, false, null, null, new P(t14, i14, lVar3, lotSortingType), 7)), null, null, a13, 0, 48);
                    f13 = f14;
                    t13 = t14;
                    lVar2 = lVar3;
                    i13 = i14;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LotsListSortingBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LotSortingType f250968l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f250969m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f250970n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f250971o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(LotSortingType lotSortingType, Y41.l<? super InterfaceC19559a, G0> lVar, int i12, int i13) {
            super(2);
            this.f250968l = lotSortingType;
            this.f250969m = lVar;
            this.f250970n = i12;
            this.f250971o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f250970n | 1);
            Y41.l<InterfaceC19559a, G0> lVar = this.f250969m;
            int i12 = this.f250971o;
            J.a(this.f250968l, lVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l com.avito.android.realty_agency.checkerboard.model.LotSortingType r22, @Y61.l Y41.l<? super Zh0.InterfaceC19559a, kotlin.G0> r23, @Y61.l androidx.compose.runtime.A r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.checkerboard.bottom_sheet.J.a(com.avito.android.realty_agency.checkerboard.model.LotSortingType, Y41.l, androidx.compose.runtime.A, int, int):void");
    }
}
