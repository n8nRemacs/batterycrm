package com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes;

import Y41.p;
import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
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
import androidx.compose.ui.graphics.painter.d;
import androidx.compose.ui.graphics.painter.e;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.akita.compose.foundation.ui.g;
import com.akita.compose.theme.re23.i;
import com.avito.android.R;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import java.util.Iterator;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: QuoteContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float f192702a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final v f192703b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final v f192704c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final v f192705d;

    /* compiled from: QuoteContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f192706l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: QuoteContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.b$b, reason: collision with other inner class name */
    public static final class C5692b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ QuoteViewData f192707l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f192708m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f192709n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f192710o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f192711p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f192712q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5692b(QuoteViewData quoteViewData, c cVar, v vVar, Y41.a<G0> aVar, int i12, int i13) {
            super(2);
            this.f192707l = quoteViewData;
            this.f192708m = cVar;
            this.f192709n = vVar;
            this.f192710o = aVar;
            this.f192711p = i12;
            this.f192712q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f192711p | 1);
            v vVar = this.f192709n;
            c cVar = this.f192708m;
            b.a(this.f192707l, cVar, vVar, this.f192710o, a12, iA2, this.f192712q);
            return G0.f406611a;
        }
    }

    static {
        float f12 = 32;
        h.a aVar = h.f42849c;
        f192702a = f12;
        v.a aVar2 = v.f42878y1;
        float f13 = 8;
        f192703b = androidx.compose.ui.draw.k.a(C20588k2.o(R1.k(f13, 0.0f, 2, aVar2), f12), o.a(f13));
        float f14 = 16;
        float f15 = 10;
        float f16 = 4;
        v vVarL = R1.l(aVar2, f14, f15, f14, f16);
        IntrinsicSize intrinsicSize = IntrinsicSize.f28333b;
        f192704c = C20646z1.c(C20646z1.a(vVarL, intrinsicSize), IntrinsicSize.f28334c);
        f192705d = C20646z1.a(R1.l(aVar2, f14, f15, f14, f16), intrinsicSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k QuoteViewData quoteViewData, @l c cVar, @l v vVar, @l Y41.a<G0> aVar, @l A a12, int i12, int i13) {
        e dVar;
        Uri uri;
        Object next;
        Object objC;
        long jC2;
        Y41.a<InterfaceC22413h> aVar2;
        p<InterfaceC22413h, Integer, G0> pVar;
        p<InterfaceC22413h, Integer, G0> pVar2;
        p<InterfaceC22413h, U, G0> pVar3;
        Y41.a<InterfaceC22413h> aVar3;
        C20576h2 c20576h2;
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4;
        InterfaceC22078i<?> interfaceC22078i;
        v vVar2;
        ?? r15;
        Y41.a<InterfaceC22413h> aVar4;
        p<InterfaceC22413h, Integer, G0> pVar5;
        i iVar;
        boolean z12;
        B bE2 = a12.E(-1436018988);
        v vVar3 = (i13 & 4) != 0 ? v.f42878y1 : vVar;
        Y41.a<G0> aVar5 = (i13 & 8) != 0 ? a.f192706l : aVar;
        QuoteViewData.ImageType imageType = quoteViewData.f189271g;
        if (imageType instanceof QuoteViewData.ImageType.Static) {
            bE2.C(-1747390543);
            dVar = u0.e.a(((QuoteViewData.ImageType.Static) imageType).f189276b, 0, bE2);
            bE2.X(false);
            uri = null;
        } else {
            if (imageType instanceof QuoteViewData.ImageType.Image) {
                bE2.C(-1747269147);
                int iC2 = (int) com.avito.android.messenger.conversation.mvi.messages.utils.i.c(f192702a, bE2);
                QuoteViewData.ImageType.Image image = (QuoteViewData.ImageType.Image) imageType;
                Uri uriD = C35829k2.b(image.f189274b, iC2, iC2, 0.0f, 0, 60).d();
                if (uriD == null) {
                    Iterator<T> it = image.f189274b.getVariants().entrySet().iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int iArea = ((Size) ((Map.Entry) next).getKey()).area();
                            do {
                                Object next2 = it.next();
                                int iArea2 = ((Size) ((Map.Entry) next2).getKey()).area();
                                if (iArea < iArea2) {
                                    next = next2;
                                    iArea = iArea2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Map.Entry entry = (Map.Entry) next;
                    uriD = entry != null ? (Uri) entry.getValue() : null;
                    if (uriD == null) {
                        uriD = Uri.EMPTY;
                    }
                }
                bE2.X(false);
                uri = uriD;
            } else if (imageType instanceof QuoteViewData.ImageType.ImageFromUri) {
                bE2.C(-1747011475);
                bE2.X(false);
                uri = ((QuoteViewData.ImageType.ImageFromUri) imageType).f189275b;
            } else {
                if (imageType != null) {
                    throw f.q(2021757641, bE2, false);
                }
                bE2.C(-1746951273);
                bE2.X(false);
                dVar = null;
                uri = null;
            }
            dVar = null;
        }
        G0 g02 = G0.f406611a;
        bE2.C(2021858187);
        if (((Boolean) bE2.o(C22543x1.f41638a)).booleanValue()) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            dVar = new d(com.akita.compose.theme.re23.b.f63984b.f63862L0.c(bE2), null);
        }
        e eVar = dVar;
        bE2.X(false);
        bE2.C(2021863103);
        QuoteViewData.TextType textType = quoteViewData.f189267c;
        if (textType instanceof QuoteViewData.TextType.Plain) {
            objC = ((QuoteViewData.TextType.Plain) textType).f189280b;
        } else if (textType instanceof QuoteViewData.TextType.Attributed) {
            objC = ((QuoteViewData.TextType.Attributed) textType).f189279b;
        } else {
            if (!(textType instanceof QuoteViewData.TextType.Res)) {
                throw new NoWhenBranchMatchedException();
            }
            objC = u0.i.c(bE2, ((QuoteViewData.TextType.Res) textType).f189281b);
        }
        bE2.X(false);
        String string = objC != null ? objC.toString() : null;
        QuoteViewData.Style style = quoteViewData.f189270f;
        if (style instanceof QuoteViewData.Style.Regular) {
            bE2.C(2021873808);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            jC2 = com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2);
            bE2.X(false);
        } else {
            if (!(style instanceof QuoteViewData.Style.Gray)) {
                throw f.q(2021757641, bE2, false);
            }
            bE2.C(2021875953);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            jC2 = com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2);
            bE2.X(false);
        }
        long j12 = jC2;
        bE2.C(2021877285);
        boolean z13 = quoteViewData.f189269e;
        String str = quoteViewData.f189268d;
        String strB = (!z13 || str == null) ? str : u0.i.b(R.string.messenger_quote_item_price_str_with_delimiter, new Object[]{str}, bE2);
        bE2.X(false);
        Integer num = cVar != null ? cVar.f192713a : null;
        bE2.C(2021885542);
        v vVarD0 = num == null ? null : C20588k2.t(v.f42878y1, u0.f.a(bE2, num.intValue())).d0(f192705d);
        bE2.X(false);
        if (vVarD0 == null) {
            vVarD0 = f192704c;
        }
        v vVarA = C22501m2.a(C21086w0.c(vVar3.d0(vVarD0), false, null, null, aVar5, 7), "QuoteContent");
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39085k;
        C20568f2 c20568f2A = C20563e2.a(c1589k, bVar, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarA);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
        v vVar4 = vVar3;
        InterfaceC22078i<?> interfaceC22078i2 = bE2.f37890b;
        if (interfaceC22078i2 == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar6);
        } else {
            bE2.d();
        }
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar6 = InterfaceC22413h.a.f40796g;
        R3.b(pVar6, bE2, c20568f2A);
        p<InterfaceC22413h, U, G0> pVar7 = InterfaceC22413h.a.f40795f;
        R3.b(pVar7, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar8 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar8);
        }
        p<InterfaceC22413h, v, G0> pVar9 = InterfaceC22413h.a.f40793d;
        R3.b(pVar9, bE2, vVarC);
        C20576h2 c20576h22 = C20576h2.f28641a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.a aVar7 = com.akita.compose.theme.re23.b.f63984b;
        com.akita.compose.foundation.p pVar10 = aVar7.f63938l;
        v.a aVar8 = v.f42878y1;
        FillElement fillElement = C20588k2.f28681b;
        aVar8.getClass();
        float f12 = 2;
        h.a aVar9 = h.f42849c;
        com.avito.android.lib.compose.design.shared.divider.a.a(C20588k2.t(fillElement, f12), pVar10, 0.0f, 0.0f, bE2, 6, 12);
        bE2.C(-203231063);
        if (uri == null && eVar == null) {
            C20608p2.a(bE2, C20588k2.t(aVar8, 8));
        }
        bE2.X(false);
        androidx.compose.ui.i iVar2 = InterfaceC22215f.a.f39080f;
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar2, false);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = n.c(bE2, fillElement);
        if (interfaceC22078i2 == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            aVar2 = aVar6;
            bE2.b(aVar2);
        } else {
            aVar2 = aVar6;
            bE2.d();
        }
        R3.b(pVar6, bE2, interfaceC22365i0D);
        R3.b(pVar7, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            pVar = pVar8;
            AK.c.y(i15, bE2, i15, pVar);
        } else {
            pVar = pVar8;
        }
        R3.b(pVar9, bE2, vVarC2);
        C20644z c20644z = C20644z.f28804a;
        v vVar5 = f192703b;
        if (uri != null) {
            bE2.C(-349272031);
            e eVarA = u0.e.a(R.drawable.ic_messenger_item_no_image, 0, bE2);
            e eVarA2 = u0.e.a(R.drawable.ic_messenger_item_no_image, 0, bE2);
            InterfaceC22374n.f40491a.getClass();
            pVar3 = pVar7;
            aVar3 = aVar2;
            pVar2 = pVar;
            c20576h2 = c20576h22;
            pVar4 = pVar6;
            interfaceC22078i = interfaceC22078i2;
            vVar2 = vVar4;
            coil.compose.v.a(uri, "", C22501m2.a(vVar5, "QuoteImage"), null, eVarA2, eVarA, null, null, null, iVar2, InterfaceC22374n.a.f40493b, null, bE2, 805601720, 6, 63944);
            r15 = 0;
            bE2.X(false);
        } else {
            pVar2 = pVar;
            pVar3 = pVar7;
            aVar3 = aVar2;
            c20576h2 = c20576h22;
            pVar4 = pVar6;
            interfaceC22078i = interfaceC22078i2;
            vVar2 = vVar4;
            r15 = 0;
            r15 = 0;
            if (eVar != null) {
                bE2.C(-348744938);
                InterfaceC22374n.f40491a.getClass();
                C20806p1.a(eVar, "", C22501m2.a(vVar5, "QuoteImage"), iVar2, InterfaceC22374n.a.f40493b, 0.0f, null, bE2, 28088, 96);
                bE2.X(false);
            } else {
                bE2.C(-348432613);
                bE2.X(false);
            }
        }
        bE2.C(820044993);
        if (quoteViewData.f189272h) {
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64574hb, r15, bE2), "", C22501m2.a(aVar8, "QuoteVideoPlayImageOverlay"), aVar7.f63851H1, bE2, 440, 0);
        }
        bE2.X(r15);
        bE2.X(true);
        I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, r15);
        int i16 = bE2.f37888Q;
        O1 o1S3 = bE2.S();
        v vVarC3 = n.c(bE2, aVar8);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            aVar4 = aVar3;
            bE2.b(aVar4);
        } else {
            aVar4 = aVar3;
            bE2.d();
        }
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar11 = pVar4;
        R3.b(pVar11, bE2, iA2);
        p<InterfaceC22413h, U, G0> pVar12 = pVar3;
        R3.b(pVar12, bE2, o1S3);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
            pVar5 = pVar2;
            AK.c.y(i16, bE2, i16, pVar5);
        } else {
            pVar5 = pVar2;
        }
        R3.b(pVar9, bE2, vVarC3);
        K k12 = K.f28344a;
        com.akita.compose.theme.re23.i iVar3 = com.akita.compose.theme.re23.b.f63988f;
        r rVar = iVar3.f65243n;
        s.f42720b.getClass();
        int i17 = s.f42722d;
        p<InterfaceC22413h, Integer, G0> pVar13 = pVar5;
        Y41.a<InterfaceC22413h> aVar10 = aVar4;
        com.akita.compose.foundation.ui.p.b(quoteViewData.f189266b, rVar, C22501m2.a(aVar8, "QuoteAuthorName"), false, 0L, null, 1, i17, false, null, bE2, 14159232, 816);
        g.a(f12, null, bE2, 6);
        C20568f2 c20568f2A2 = C20563e2.a(c1589k, bVar, bE2, 0);
        int i18 = bE2.f37888Q;
        O1 o1S4 = bE2.S();
        v vVarC4 = n.c(bE2, aVar8);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar10);
        } else {
            bE2.d();
        }
        R3.b(pVar11, bE2, c20568f2A2);
        R3.b(pVar12, bE2, o1S4);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
            AK.c.y(i18, bE2, i18, pVar13);
        }
        R3.b(pVar9, bE2, vVarC4);
        bE2.C(544384092);
        if (string == null) {
            z12 = false;
            iVar = iVar3;
        } else {
            iVar = iVar3;
            z12 = false;
            com.akita.compose.foundation.ui.p.b(string, iVar3.f65245p, C22501m2.a(c20576h2.a(aVar8, 1.0f, true), "QuoteLeftText"), false, j12, null, 1, i17, false, null, bE2, 14158848, 800);
        }
        bE2.X(z12);
        bE2.C(544400937);
        if (strB != null) {
            com.akita.compose.foundation.ui.p.b(strB, iVar.f65245p, C22501m2.a(aVar8, "QuoteRightText"), false, 0L, null, 1, i17, false, null, bE2, 14159232, 816);
        }
        bE2.X(z12);
        bE2.X(true);
        bE2.X(true);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C5692b(quoteViewData, cVar, vVar2, aVar5, i12, i13);
        }
    }
}
