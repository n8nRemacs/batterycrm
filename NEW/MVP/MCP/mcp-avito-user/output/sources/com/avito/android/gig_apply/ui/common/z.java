package com.avito.android.gig_apply.ui.common;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TutorialsWidget.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_slot-screen_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class z {

    /* compiled from: TutorialsWidget.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f159993l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f159993l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f159993l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: TutorialsWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C f159994l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f159995m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f159996n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(C c12, Y41.a<G0> aVar, int i12) {
            super(2);
            this.f159994l = c12;
            this.f159995m = (N) aVar;
            this.f159996n = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f159996n | 1);
            ?? r02 = this.f159995m;
            z.a(this.f159994l, r02, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(C c12, Y41.a<G0> aVar, androidx.compose.runtime.A a12, int i12) {
        Object objFindUri;
        androidx.compose.runtime.B bE2 = a12.E(-497641340);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarD = C20588k2.d(C20588k2.w(aVar2, null, 3), 1.0f);
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(vVarD, androidx.compose.foundation.shape.o.a(20));
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
        androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarA, aVar4.f63973w1.c(bE2), Y0.f39346a);
        bE2.C(1323775354);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = androidx.compose.foundation.interaction.l.a();
            bE2.H(objT);
        }
        androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
        bE2.X(false);
        InterfaceC21084v1 interfaceC21084v1D = com.akita.compose.foundation.n.d(0.0f, 2, aVar4.f63936k0.c(bE2), true);
        bE2.C(1323781922);
        boolean z12 = (((i12 & 112) ^ 48) > 32 && bE2.B(aVar)) || (i12 & 48) == 32;
        Object objT2 = bE2.t();
        if (z12 || objT2 == obj) {
            objT2 = new a(aVar);
            bE2.H(objT2);
        }
        bE2.X(false);
        androidx.compose.ui.v vVarB2 = C21086w0.b(vVarB, mVar, interfaceC21084v1D, false, null, (Y41.a) objT2, 28);
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB2);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar5);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        float f12 = 68;
        bE2.C(499477780);
        float fM02 = ((androidx.compose.ui.unit.d) bE2.o(Q0.f41199h)).M0(f12);
        bE2.X(false);
        int i14 = (int) fM02;
        UniversalImage universalImage = c12.f159889a;
        boolean zB2 = com.avito.android.lib.util.darkTheme.c.b((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
        bE2.C(-1869149911);
        boolean zB3 = bE2.B(universalImage) | bE2.j(zB2);
        Object objT3 = bE2.t();
        if (zB3 || objT3 == obj) {
            Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, zB2) : null;
            if (imageDependsOnThemeOrDefault == null || (objFindUri = imageDependsOnThemeOrDefault.findUri(i14, i14)) == null) {
                objFindUri = Uri.EMPTY;
            }
            objT3 = objFindUri;
            bE2.H(objT3);
        }
        bE2.X(false);
        InterfaceC22374n.f40491a.getClass();
        coil.compose.v.b((Uri) objT3, null, c20576h2.c(C20588k2.o(aVar2, f12), InterfaceC22215f.a.f39087m), null, InterfaceC22374n.a.f40493b, null, bE2, 1572920, 4024);
        C20608p2.a(bE2, C20588k2.t(aVar2, 9));
        I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar2);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar5);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, iA2);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        K k12 = K.f28344a;
        float f13 = 16;
        C20608p2.a(bE2, C20588k2.f(aVar2, f13));
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.b(c12.f159890b, iVar.f65242m, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        C20608p2.a(bE2, k12.a(aVar2, 1.0f, true));
        com.akita.compose.foundation.ui.p.b(c12.f159891c, iVar.f65245p, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        C20608p2.a(bE2, C20588k2.f(aVar2, f13));
        bE2.X(true);
        C20608p2.a(bE2, c20576h2.a(aVar2, 1.0f, true));
        com.akita.compose.theme.re23.b.f63985c.getClass();
        com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64509e0, 0, bE2), null, R1.m(c20576h2.c(aVar2, InterfaceC22215f.a.f39086l), 0.0f, 0.0f, f13, 0.0f, 11), aVar4.f63938l, bE2, 56, 0);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(c12, aVar, i12);
        }
    }
}
