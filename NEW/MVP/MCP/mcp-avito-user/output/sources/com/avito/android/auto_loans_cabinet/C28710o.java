package com.avito.android.auto_loans_cabinet;

import Ke.InterfaceC14305a;
import Ke.InterfaceC14306b;
import android.content.Context;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.auto_loans_cabinet.mvi.entity.AppBarData;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import com.avito.android.auto_loans_cabinet.mvi.entity.Item;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoLoanCabinetScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_auto-loans-cabinet_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.auto_loans_cabinet.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28710o {

    /* compiled from: AutoLoanCabinetScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.auto_loans_cabinet.o$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC14305a, G0> f95507l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AutoLoansCabinetState f95508m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super InterfaceC14305a, G0> lVar, AutoLoansCabinetState autoLoansCabinetState) {
            super(2);
            this.f95507l = lVar;
            this.f95508m = autoLoansCabinetState;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                Y41.l<InterfaceC14305a, G0> lVar = this.f95507l;
                com.akita.compose.component.scaffold.g.a(null, androidx.compose.runtime.internal.r.c(517818234, new C28707l(lVar), a13), null, null, null, null, null, androidx.compose.runtime.internal.r.c(1279841937, new C28709n(lVar, this.f95508m), a13), a13, 12582960, 125);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutoLoanCabinetScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.auto_loans_cabinet.o$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AutoLoansCabinetState f95509l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC14306b> f95510m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC14305a, G0> f95511n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(AutoLoansCabinetState autoLoansCabinetState, InterfaceC43160i<? extends InterfaceC14306b> interfaceC43160i, Y41.l<? super InterfaceC14305a, G0> lVar, int i12) {
            super(2);
            this.f95509l = autoLoansCabinetState;
            this.f95510m = interfaceC43160i;
            this.f95511n = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(65);
            Y41.l<InterfaceC14305a, G0> lVar = this.f95511n;
            C28710o.a(this.f95509l, this.f95510m, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k AutoLoansCabinetState autoLoansCabinetState, @Y61.k InterfaceC43160i<? extends InterfaceC14306b> interfaceC43160i, @Y61.k Y41.l<? super InterfaceC14305a, G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1505294215);
        if ((((bE2.B(autoLoansCabinetState) ? 4 : 2) | i12 | (bE2.u(lVar) ? 256 : 128)) & 651) == 130 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1535203138, new a(lVar, autoLoansCabinetState), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(autoLoansCabinetState, interfaceC43160i, lVar, i12);
        }
    }

    public static final void b(AppBarData appBarData, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-66069601);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(appBarData) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
            bE2.C(-2042760295);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = Integer.valueOf(C35835l0.j(R.attr.img_logoPhotoPlaceholder, context));
                bE2.H(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            bE2.X(false);
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(iIntValue, 6, bE2);
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.p pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            float f12 = 32;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.n.a(vVarD, androidx.compose.foundation.shape.o.c(0.0f, 0.0f, f12, f12, 3), 0.0f, pVar, null, androidx.compose.runtime.internal.r.c(-197454629, new C28701f(appBarData, eVarA, lVar), bE2), bE2, 1572870, 52);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C28702g(appBarData, lVar, i12);
        }
    }

    public static final void c(Item item, androidx.compose.ui.v vVar, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        Y41.l lVar2;
        androidx.compose.runtime.B bE2 = a12.E(809175639);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(item) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
            lVar2 = lVar;
        } else {
            if (item instanceof Item.Title) {
                bE2.C(1078144703);
                String strC = u0.i.c(bE2, ((Item.Title) item).f95486b);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65234e, vVar, false, 0L, null, 0, 0, false, null, bE2, (i13 << 3) & 896, 1016);
                b12 = bE2;
                b12.X(false);
            } else {
                b12 = bE2;
                if (item instanceof Item.Space) {
                    b12.C(1835899792);
                    float f12 = ((Item.Space) item).f95485b;
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                    com.akita.compose.foundation.ui.g.a(f12, null, b12, 0);
                    b12.X(false);
                } else if (item instanceof Item.Banner) {
                    b12.C(1835901933);
                    lVar2 = lVar;
                    C28698c.a((Item.Banner) item, vVar, lVar2, b12, i13 & 1008);
                    b12.X(false);
                } else {
                    lVar2 = lVar;
                    b12.C(1078515959);
                    b12.X(false);
                }
            }
            lVar2 = lVar;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C28703h(item, vVar, lVar2, i12);
        }
    }

    public static final void d(Y41.a aVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1474444775);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar2.getClass();
            String strC = u0.i.c(bE2, R.string.auto_loans_cabinet_error_title);
            String strC2 = u0.i.c(bE2, R.string.auto_loans_cabinet_error_text);
            String strC3 = u0.i.c(bE2, R.string.auto_loans_cabinet_error_button_text);
            O.f95326a.getClass();
            com.akita.compose.component.content_placeholder.b.a(O.f95327b, strC, strC2, strC3, aVar, fillElement, null, null, true, false, bE2, ((i13 << 12) & 57344) | 100859910, 704);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C28704i(i12, aVar);
        }
    }

    public static final void e(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-1989678960);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.ui.v vVarD = C20644z.f28804a.d(androidx.compose.ui.v.f42878y1, InterfaceC22215f.a.f39080f);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66694c(), vVarD, bE2, 0, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C28705j(vVar, i12);
        }
    }

    public static final void f(AutoLoansCabinetState.BlanksState.Success success, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1864030822);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar.getClass();
        com.akita.compose.theme.re23.b.f63983a.getClass();
        C20650b.a(androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63909b0.c(bE2), Y0.f39346a), null, null, false, null, null, null, false, null, new s(success, lVar), bE2, 0, 510);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new t(success, lVar, i12);
        }
    }

    public static final void g(int i12, Y41.a aVar, androidx.compose.runtime.A a12, androidx.compose.ui.v vVar) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(126613999);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            String strC = u0.i.c(bE2, R.string.auto_loans_cabinet_more_about_auto_credits_title);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65234e, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
            com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.auto_loans_cabinet_more_about_auto_credits_text), iVar.f65240k, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            com.akita.compose.foundation.ui.g.a(20, null, bE2, 6);
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            com.akita.compose.component.button.t tVarC = com.akita.compose.component.button.t.c(com.akita.compose.theme.re23.b.c(bE2).r2(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, com.akita.compose.theme.re23.b.f63984b.f63933j0, null, null, null, null, null, null, null, null, null, null, null, 33554175);
            O.f95326a.getClass();
            b12 = bE2;
            com.akita.compose.component.button.m.b(aVar, tVarC, vVarD, false, null, O.f95331f, bE2, ((i13 >> 3) & 14) | 197056, 24);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new u(i12, aVar, vVar);
        }
    }
}
