package com.avito.android.advert.item.select.no_click_contact;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.advert.item.select.no_click_contact.AutoSelectNoClickContactItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectNoClickContactScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "leftHeight", "rightHeight", "maxHeight", "_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {

    /* compiled from: AutoSelectNoClickContactScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.deep_linking.links.w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f79490b;

        public a(Y41.l lVar) {
            this.f79490b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof com.avito.android.deep_linking.links.w) && (obj instanceof D)) {
                return L.f(this.f79490b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f79490b;
        }

        public final int hashCode() {
            return this.f79490b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f79490b.invoke(deepLink);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k InterfaceC22204y1 interfaceC22204y1, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.p pVar, @Y61.l v.a aVar, @Y61.l A a12, int i12) {
        v.a aVar2;
        B b12;
        v.a aVar3;
        B bE2 = a12.E(315620747);
        int i13 = i12 | (bE2.B(interfaceC22204y1) ? 4 : 2) | (bE2.u(lVar) ? 32 : 16) | (bE2.u(lVar2) ? 256 : 128) | (bE2.u(pVar) ? 2048 : 1024) | 24576;
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
            aVar3 = aVar;
            b12 = bE2;
        } else {
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            s sVar = (s) interfaceC22204y1.getF42167b();
            if (sVar == null) {
                aVar2 = aVar4;
                b12 = bE2;
            } else {
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(R1.k(16, 0.0f, 2, aVar4), androidx.compose.foundation.shape.o.a(24));
                com.akita.compose.theme.re23.b.f63983a.getClass();
                float f12 = 20;
                androidx.compose.ui.v vVarJ = R1.j(androidx.compose.foundation.A.b(vVarA, com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2), Y0.f39346a), f12, f12);
                C20585k.f28659a.getClass();
                C20585k.l lVar3 = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar3, InterfaceC22215f.a.f39088n, bE2, 0);
                int i14 = bE2.f37888Q;
                O1 o1S = bE2.S();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarJ);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
                if (bE2.f37890b == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar6);
                } else {
                    bE2.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
                Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                    AK.c.y(i14, bE2, i14, pVar2);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
                K k12 = K.f28344a;
                com.akita.compose.foundation.ui.p.b(sVar.f79491a, com.akita.compose.theme.re23.b.f63988f.f65233d, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
                c(sVar.f79492b, sVar.f79493c, lVar, bE2, ((i13 << 3) & 896) | 72);
                int i15 = i13 >> 3;
                aVar2 = aVar4;
                b12 = bE2;
                com.avito.android.advert.item.select.number_input.e.a(sVar.f79494d, lVar2, pVar, lVar, null, bE2, (i15 & 896) | (i15 & 112) | 8 | ((i13 << 6) & 7168), 48);
                b12.X(true);
            }
            aVar3 = aVar2;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(interfaceC22204y1, lVar, lVar2, pVar, aVar3, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(UniversalImage universalImage, AttributedText attributedText, Y41.l lVar, androidx.compose.ui.v vVar, A a12, int i12) {
        B bE2 = a12.E(537222534);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(vVar, androidx.compose.foundation.shape.o.a(16));
        com.akita.compose.theme.re23.b.f63983a.getClass();
        float f12 = 8;
        androidx.compose.ui.v vVarM = R1.m(R1.k(f12, 0.0f, 2, androidx.compose.foundation.A.b(vVarA, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), Y0.f39346a)), 0.0f, 12, 0.0f, 22, 5);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
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
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        Uri uriC = C35829k2.b(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null, kotlin.math.b.b(dVar.M0(132)), kotlin.math.b.b(dVar.M0(42)), 0.0f, 1, 44).c(l.f79472b);
        bE2.C(-351081485);
        if (uriC != null) {
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            InterfaceC22374n.f40491a.getClass();
            coil.compose.v.b(uriC, null, vVarD, null, InterfaceC22374n.a.f40496e, null, bE2, 1573304, 4024);
        }
        bE2.X(false);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, R1.m(androidx.compose.ui.v.f42878y1, 0.0f, f12, 0.0f, 0.0f, 13), R.attr.textM20, null, new k(lVar, attributedText), 0, bE2, 56, 40);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(universalImage, attributedText, lVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard, AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard2, Y41.l lVar, A a12, int i12) {
        B bE2 = a12.E(-391227227);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        bE2.C(-1413053226);
        Object objT = bE2.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = U2.a(0);
            bE2.H(objT);
        }
        InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
        Object objI = com.akita.compose.component.accordion.s.i(-1413051402, bE2, false);
        if (objI == c1651a) {
            objI = U2.a(0);
            bE2.H(objI);
        }
        InterfaceC22196w1 interfaceC22196w12 = (InterfaceC22196w1) objI;
        Object objI2 = com.akita.compose.component.accordion.s.i(-1413049642, bE2, false);
        if (objI2 == c1651a) {
            objI2 = U2.a(0);
            bE2.H(objI2);
        }
        InterfaceC22196w1 interfaceC22196w13 = (InterfaceC22196w1) objI2;
        bE2.X(false);
        boolean z12 = interfaceC22196w13.e() != 0;
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        boolean z13 = z12;
        androidx.compose.ui.v vVarM = R1.m(aVar, 0.0f, 10, 0.0f, 0.0f, 13);
        C20585k.f28659a.getClass();
        C20585k.j jVarG = C20585k.g(8);
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 6);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        androidx.compose.ui.v vVarA = c20576h2.a(aVar, 1.0f, true);
        bE2.C(-1038120474);
        boolean zJ2 = bE2.j(z13);
        Object objT2 = bE2.t();
        if (zJ2 || objT2 == c1651a) {
            objT2 = new n(z13, interfaceC22196w1);
            bE2.H(objT2);
        }
        bE2.X(false);
        int i14 = (i12 & 896) | 72;
        b(noClickContactCard.f79437b, noClickContactCard.f79438c, lVar, C22392w0.a(vVarA, (Y41.l) objT2).d0(z13 ? C20588k2.h(kotlin.math.b.b(interfaceC22196w13.e() / context.getResources().getDisplayMetrics().density), 0.0f, 2, aVar) : aVar), bE2, i14);
        androidx.compose.ui.v vVarA2 = c20576h2.a(aVar, 1.0f, true);
        bE2.C(-1038104761);
        boolean zJ3 = bE2.j(z13);
        Object objT3 = bE2.t();
        if (zJ3 || objT3 == c1651a) {
            objT3 = new o(z13, interfaceC22196w12);
            bE2.H(objT3);
        }
        bE2.X(false);
        b(noClickContactCard2.f79437b, noClickContactCard2.f79438c, lVar, C22392w0.a(vVarA2, (Y41.l) objT3).d0(z13 ? C20588k2.h(kotlin.math.b.b(interfaceC22196w13.e() / context.getResources().getDisplayMetrics().density), 0.0f, 2, aVar) : aVar), bE2, i14);
        bE2.X(true);
        Integer numValueOf = Integer.valueOf(interfaceC22196w1.e());
        Integer numValueOf2 = Integer.valueOf(interfaceC22196w12.e());
        bE2.C(-1413009866);
        Object objT4 = bE2.t();
        if (objT4 == c1651a) {
            objT4 = new p(interfaceC22196w1, interfaceC22196w12, interfaceC22196w13, null);
            bE2.H(objT4);
        }
        bE2.X(false);
        C22187u0.e(numValueOf, numValueOf2, (Y41.p) objT4, bE2);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(noClickContactCard, noClickContactCard2, lVar, aVar, i12);
        }
    }
}
