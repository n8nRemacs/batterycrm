package com.avito.android.gig_apply.ui.common;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
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
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SlotPaymentInfoWidget.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_slot-screen_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {

    /* compiled from: SlotPaymentInfoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f159944l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: SlotPaymentInfoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f159945l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f159946m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.lib.design.text_view.a, G0> f159947n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f159948o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f159949p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(AttributedText attributedText, androidx.compose.ui.v vVar, Y41.l<? super com.avito.android.lib.design.text_view.a, G0> lVar, int i12, int i13) {
            super(2);
            this.f159945l = attributedText;
            this.f159946m = vVar;
            this.f159947n = lVar;
            this.f159948o = i12;
            this.f159949p = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            i.a(this.f159945l, this.f159946m, this.f159947n, a12, C22066f2.a(this.f159948o | 1), this.f159949p);
            return G0.f406611a;
        }
    }

    /* compiled from: SlotPaymentInfoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ UniversalImage f159950l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UniversalImage universalImage, int i12) {
            super(2);
            this.f159950l = universalImage;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            i.b(this.f159950l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: SlotPaymentInfoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ UniversalImage f159951l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UniversalImage universalImage, int i12) {
            super(2);
            this.f159951l = universalImage;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            i.b(this.f159951l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: SlotPaymentInfoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f159952b = new e();

        public e() {
            super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            return com.avito.android.advert.item.delivery_suggests.l.m(num2, size, num.intValue());
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(AttributedText attributedText, androidx.compose.ui.v vVar, Y41.l<? super com.avito.android.lib.design.text_view.a, G0> lVar, androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.ui.v vVar2;
        androidx.compose.runtime.B bE2 = a12.E(1428002602);
        androidx.compose.ui.v vVar3 = (i13 & 2) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        Y41.l<? super com.avito.android.lib.design.text_view.a, G0> lVar2 = (i13 & 4) != 0 ? a.f159944l : lVar;
        if (((Boolean) bE2.o(C22543x1.f41638a)).booleanValue()) {
            bE2.C(1555904675);
            String text = attributedText.getText();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            vVar2 = vVar3;
            com.akita.compose.foundation.ui.p.b(text, com.akita.compose.theme.re23.b.f63988f.f65241l, vVar3, false, 0L, null, 0, 0, false, null, bE2, (i12 << 3) & 896, 1016);
            bE2.X(false);
        } else {
            bE2.C(1555725650);
            com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, vVar3, R.attr.textS20, null, lVar2, 0, bE2, (i12 & 112) | 8 | ((i12 << 6) & 57344), 40);
            bE2.X(false);
            vVar2 = vVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(attributedText, vVar2, lVar2, i12, i13);
        }
    }

    @InterfaceC22132o
    public static final void b(UniversalImage universalImage, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(739787095);
        if (universalImage == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new c(universalImage, i12);
                return;
            }
            return;
        }
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)));
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        float f12 = 44;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        int iB2 = kotlin.math.b.b(dVar.M0(f12));
        Uri uriC = C35829k2.b(imageDependsOnThemeOrDefault, iB2, iB2, 0.0f, 1, 44).c(e.f159952b);
        if (uriC == null) {
            uriC = Uri.EMPTY;
        }
        coil.compose.v.b(uriC, "", C20588k2.o(R1.k(0.0f, 11, 1, androidx.compose.ui.v.f42878y1), f12), null, null, null, bE2, 440, 4088);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new d(universalImage, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k com.avito.android.gig_apply.ui.common.t r35, @Y61.l Y41.a r36, @Y61.l Y41.a r37, @Y61.l androidx.compose.runtime.A r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_apply.ui.common.i.c(com.avito.android.gig_apply.ui.common.t, Y41.a, Y41.a, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(h hVar, Y41.a aVar, v.a aVar2, androidx.compose.runtime.A a12, int i12) {
        int i13;
        ?? r32;
        androidx.compose.runtime.B bE2 = a12.E(867130269);
        androidx.compose.ui.v vVarD = C20588k2.d(aVar2, 1.0f);
        bE2.C(-1040025391);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = androidx.compose.foundation.interaction.l.a();
            bE2.H(objT);
        }
        bE2.X(false);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.a aVar3 = com.akita.compose.theme.re23.b.f63984b;
        androidx.compose.ui.v vVarK = R1.k(16, 0.0f, 2, C21086w0.b(vVarD, (androidx.compose.foundation.interaction.m) objT, com.akita.compose.foundation.n.d(0.0f, 3, aVar3.f63936k0.c(bE2), false), false, null, aVar, 28));
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28667i, bVar, bE2, 54);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar4);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        b(hVar.f159942c, bE2, 8);
        v.a aVar5 = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarA = c20576h2.a(R1.m(aVar5, 13, 0.0f, 0.0f, 0.0f, 14), 1.0f, true);
        I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar4);
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
        com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
        androidx.compose.ui.text.style.i.f42675b.getClass();
        androidx.compose.ui.text.style.i iVarA = androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42680g);
        androidx.compose.ui.text.style.s.f42720b.getClass();
        com.akita.compose.foundation.ui.p.b(hVar.f159940a, rVar, null, false, 0L, iVarA, 2, androidx.compose.ui.text.style.s.f42722d, false, null, bE2, 14155776, 796);
        bE2.C(-1153271245);
        AttributedText attributedText = hVar.f159941b;
        if (attributedText == null) {
            r32 = 0;
            i13 = 2;
        } else {
            i13 = 2;
            a(attributedText, R1.m(aVar5, 0.0f, 2, 0.0f, 0.0f, 13), null, bE2, 56, 4);
            r32 = 0;
        }
        bE2.X(r32);
        bE2.X(true);
        com.akita.compose.theme.re23.b.f63985c.getClass();
        com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64527f0, r32, bE2), "", R1.m(R1.m(aVar5, 12, 0.0f, 0.0f, 0.0f, 14), 0.0f, i13, 0.0f, 0.0f, 13), aVar3.f63938l, bE2, 440, 0);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o(hVar, aVar, aVar2, i12);
        }
    }
}
