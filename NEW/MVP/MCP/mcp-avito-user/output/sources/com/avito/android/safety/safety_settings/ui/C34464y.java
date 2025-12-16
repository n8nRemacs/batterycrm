package com.avito.android.safety.safety_settings.ui;

import android.content.Context;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.safety.safety_settings.mvi.entity.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vo0.InterfaceC49362a;

/* compiled from: SafetySettingsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "paddingValues", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.safety.safety_settings.ui.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34464y extends kotlin.jvm.internal.N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257923l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.safety.safety_settings.mvi.entity.b f257924m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC49362a> f257925n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f257926o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C34464y(Y41.l<? super com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar, com.avito.android.safety.safety_settings.mvi.entity.b bVar, InterfaceC43160i<? extends InterfaceC49362a> interfaceC43160i, com.akita.compose.component.toast_bar.u uVar) {
        super(3);
        this.f257923l = lVar;
        this.f257924m = bVar;
        this.f257925n = interfaceC43160i;
        this.f257926o = uVar;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
        String str;
        T1 t13 = t12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(t13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.toast_bar.J f66806c = com.akita.compose.theme.re23.b.u(a13).getF66806c();
            com.akita.compose.component.toast_bar.J f66804a = com.akita.compose.theme.re23.b.u(a13).getF66804a();
            Context context = (Context) a13.o(AndroidCompositionLocals_androidKt.f41069b);
            String strC = u0.i.c(a13, R.string.safety_settings_additional_sessions_error_title);
            String strC2 = u0.i.c(a13, R.string.safety_settings_additional_sessions_error_button);
            Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar = this.f257923l;
            C22187u0.d(new C34463x(this.f257925n, context, this.f257926o, f66806c, f66804a, strC, strC2, C22126m3.m(lVar, a13), null), a13, G0.f406611a);
            com.avito.android.safety.safety_settings.mvi.entity.b bVar = this.f257924m;
            if (bVar instanceof b.c) {
                a13.C(958805530);
                a13.C(1554949432);
                b.c cVar = (b.c) bVar;
                if (cVar.f257747g) {
                    Y.a(lVar, null, a13, 0);
                }
                a13.h();
                a13.C(1554956812);
                if (cVar.f257748h) {
                    F.a(cVar.f257749i, cVar.f257743c, lVar, a13, 8);
                }
                a13.h();
                a13.C(1554967828);
                if (cVar.f257750j && (str = cVar.f257751k) != null) {
                    C34447g.a(0, lVar, a13, null, str);
                }
                a13.h();
                v.a aVar = androidx.compose.ui.v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.d0(fillElement);
                z.c(this.f257923l, cVar.f257742b, cVar.f257746f, t13, fillElement, a13, ((iIntValue << 9) & 7168) | 24640);
                a13.h();
            } else if (bVar instanceof b.C7737b) {
                a13.C(960157409);
                v.a aVar2 = androidx.compose.ui.v.f42878y1;
                FillElement fillElement2 = C20588k2.f28682c;
                aVar2.d0(fillElement2);
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, fillElement2);
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
                com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(a13).getF66694c(), null, a13, 0, 2);
                a13.z();
                a13.h();
            } else if (bVar instanceof b.a) {
                a13.C(960544072);
                String str2 = ((b.a) bVar).f257740b;
                v.a aVar4 = androidx.compose.ui.v.f42878y1;
                FillElement fillElement3 = C20588k2.f28682c;
                aVar4.d0(fillElement3);
                z.b(384, lVar, a13, fillElement3, str2);
                a13.h();
            } else {
                a13.C(960788600);
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
