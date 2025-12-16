package com.avito.android.installmentsblock.compose;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
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
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import c3.C26932a;
import com.akita.compose.component.button.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.installments_block.entity.InstallmentsBlockStateData;
import com.avito.android.installments_block.entity.InstallmentsButton;
import com.avito.android.installments_block.entity.InstallmentsIcon;
import com.avito.android.installments_block.entity.InstallmentsOfferDetailsItem;
import com.avito.android.installments_block.entity.InstallmentsPriceInfo;
import com.avito.android.installments_block.entity.InstallmentsProgress;
import com.avito.android.installments_block.entity.util.InstallmentsColoredIcon;
import com.avito.android.installments_block.entity.util.InstallmentsSize;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsBlock.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_installments-block_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InstallmentsButton, G0> f172893l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InstallmentsButton f172894m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super InstallmentsButton, G0> lVar, InstallmentsButton installmentsButton) {
            super(0);
            this.f172893l = lVar;
            this.f172894m = installmentsButton;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f172893l.invoke(this.f172894m);
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.installmentsblock.compose.b$b, reason: collision with other inner class name */
    public static final class C5095b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ dO.d f172895l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f172896m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InstallmentsButton, G0> f172897n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f172898o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f172899p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5095b(dO.d dVar, Y41.l<? super String, G0> lVar, Y41.l<? super InstallmentsButton, G0> lVar2, Y41.l<? super DeepLink, G0> lVar3, int i12) {
            super(2);
            this.f172895l = dVar;
            this.f172896m = lVar;
            this.f172897n = lVar2;
            this.f172898o = lVar3;
            this.f172899p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f172899p | 1);
            Y41.l<InstallmentsButton, G0> lVar = this.f172897n;
            Y41.l<DeepLink, G0> lVar2 = this.f172898o;
            b.a(this.f172895l, this.f172896m, lVar, lVar2, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ dO.d f172900l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f172901m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InstallmentsButton, G0> f172902n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f172903o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f172904p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(dO.d dVar, Y41.l<? super String, G0> lVar, Y41.l<? super InstallmentsButton, G0> lVar2, Y41.l<? super DeepLink, G0> lVar3, int i12) {
            super(2);
            this.f172900l = dVar;
            this.f172901m = lVar;
            this.f172902n = lVar2;
            this.f172903o = lVar3;
            this.f172904p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f172904p | 1);
            Y41.l<InstallmentsButton, G0> lVar = this.f172902n;
            Y41.l<DeepLink, G0> lVar2 = this.f172903o;
            b.a(this.f172900l, this.f172901m, lVar, lVar2, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InstallmentsColoredIcon f172905l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f172906m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f172907n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InstallmentsColoredIcon installmentsColoredIcon, v vVar, int i12, int i13) {
            super(2);
            this.f172905l = installmentsColoredIcon;
            this.f172906m = vVar;
            this.f172907n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            v vVar = this.f172906m;
            int i12 = this.f172907n;
            b.e(this.f172905l, vVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f172908l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f172909m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.l lVar, AttributedText attributedText) {
            super(1);
            this.f172908l = attributedText;
            this.f172909m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            this.f172908l.setOnDeepLinkClickListener(new g(this.f172909m));
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InstallmentsProgress.Block f172910l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f172911m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f172912n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f172913o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f172914p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f172915q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(InstallmentsProgress.Block block, int i12, Y41.l<? super DeepLink, G0> lVar, v vVar, int i13, int i14) {
            super(2);
            this.f172910l = block;
            this.f172911m = i12;
            this.f172912n = lVar;
            this.f172913o = vVar;
            this.f172914p = i13;
            this.f172915q = i14;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f172914p | 1);
            int i12 = this.f172911m;
            b.h(this.f172910l, i12, this.f172912n, this.f172913o, a12, iA2, this.f172915q);
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f172916b;

        public g(Y41.l lVar) {
            this.f172916b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return L.f(this.f172916b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f172916b;
        }

        public final int hashCode() {
            return this.f172916b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f172916b.invoke(deepLink);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k dO.d dVar, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.l<? super InstallmentsButton, G0> lVar2, @Y61.k Y41.l<? super DeepLink, G0> lVar3, @Y61.l A a12, int i12) {
        Y41.p<InterfaceC22413h, v, G0> pVar;
        InterfaceC22078i<?> interfaceC22078i;
        boolean z12;
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2;
        float f12;
        float f13;
        i.a aVar;
        v vVar;
        Y41.a<InterfaceC22413h> aVar2;
        v.a aVar3;
        InstallmentsBlockStateData installmentsBlockStateData;
        float f14;
        InstallmentsBlockStateData installmentsBlockStateData2;
        float f15;
        AttributedText attributedText;
        float f16;
        float f17;
        int i13;
        B b12;
        boolean z13;
        B bE2 = a12.E(1709381383);
        int i14 = (i12 & 14) == 0 ? (bE2.B(dVar) ? 4 : 2) | i12 : i12;
        if ((i12 & 112) == 0) {
            i14 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.u(lVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.u(lVar3) ? 2048 : 1024;
        }
        int i15 = i14;
        if ((i15 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            InstallmentsBlockStateData installmentsBlockStateData3 = dVar.f393845a;
            if (installmentsBlockStateData3 == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new c(dVar, lVar, lVar2, lVar3, i12);
                    return;
                }
                return;
            }
            v.a aVar4 = v.f42878y1;
            v vVarW = C20588k2.w(C20588k2.d(aVar4, 1.0f), null, 3);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63836C1.c(bE2);
            float f18 = 16;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            float f19 = 24;
            v vVarA = C22501m2.a(R1.l(androidx.compose.foundation.A.b(vVarW, jC2, androidx.compose.foundation.shape.o.a(f18)), f18, f18, 11, f19), "installments_block_tag");
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar3 = InterfaceC22413h.a.f40796g;
            R3.b(pVar3, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, U, G0> pVar4 = InterfaceC22413h.a.f40795f;
            R3.b(pVar4, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar5);
            }
            Y41.p<InterfaceC22413h, v, G0> pVar6 = InterfaceC22413h.a.f40793d;
            R3.b(pVar6, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            C20585k.f28659a.getClass();
            C20585k.l lVar4 = C20585k.f28662d;
            i.a aVar7 = InterfaceC22215f.a.f39088n;
            I iA2 = H.a(lVar4, aVar7, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = androidx.compose.ui.n.c(bE2, aVar4);
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
            R3.b(pVar3, bE2, iA2);
            R3.b(pVar4, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar5);
            }
            R3.b(pVar6, bE2, vVarC2);
            K k12 = K.f28344a;
            bE2.C(-382879433);
            bE2.C(-382880063);
            String str = installmentsBlockStateData3.f172843b;
            if (str == null) {
                pVar2 = pVar3;
                aVar2 = aVar6;
                aVar3 = aVar4;
                installmentsBlockStateData = installmentsBlockStateData3;
                pVar = pVar6;
                f12 = f19;
                f13 = f18;
                aVar = aVar7;
                interfaceC22078i = interfaceC22078i2;
                vVar = null;
                z12 = false;
            } else {
                pVar = pVar6;
                interfaceC22078i = interfaceC22078i2;
                z12 = false;
                pVar2 = pVar3;
                f12 = f19;
                f13 = f18;
                aVar = aVar7;
                vVar = null;
                aVar2 = aVar6;
                aVar3 = aVar4;
                installmentsBlockStateData = installmentsBlockStateData3;
                b(str, installmentsBlockStateData3.f172845d, installmentsBlockStateData3.f172844c, lVar3, C20588k2.d(aVar4, 1.0f), bE2, (i15 & 7168) | 25152);
                G0 g02 = G0.f406611a;
            }
            bE2.X(z12);
            List<dO.e> list = dVar.f393846b;
            boolean zIsEmpty = list.isEmpty();
            ?? r72 = list;
            if (zIsEmpty) {
                r72 = vVar;
            }
            bE2.C(-382866496);
            if (r72 == 0) {
                f14 = f13;
            } else {
                f14 = f13;
                com.akita.compose.foundation.ui.g.a(f14, vVar, bE2, 6);
                i(r72, lVar, bE2, (i15 & 112) | 8);
                G0 g03 = G0.f406611a;
            }
            bE2.X(z12);
            bE2.C(-382860739);
            InstallmentsBlockStateData installmentsBlockStateData4 = installmentsBlockStateData;
            InstallmentsPriceInfo installmentsPriceInfo = installmentsBlockStateData4.f172846e;
            if (installmentsPriceInfo == null) {
                installmentsBlockStateData2 = installmentsBlockStateData4;
                f15 = f14;
            } else {
                bE2.C(98038896);
                String str2 = installmentsPriceInfo.f172867b;
                if (str2 == null || (attributedText = installmentsPriceInfo.f172868c) == null) {
                    installmentsBlockStateData2 = installmentsBlockStateData4;
                    f15 = f14;
                } else {
                    com.akita.compose.foundation.ui.g.a(f14, vVar, bE2, 6);
                    installmentsBlockStateData2 = installmentsBlockStateData4;
                    f15 = f14;
                    g(str2, attributedText, lVar3, C20588k2.d(aVar3, 1.0f), installmentsPriceInfo.f172869d, bE2, ((i15 >> 3) & 896) | 35904);
                }
                bE2.X(z12);
                G0 g04 = G0.f406611a;
            }
            bE2.X(z12);
            bE2.C(-382848356);
            InstallmentsProgress installmentsProgress = installmentsBlockStateData2.f172847f;
            if (installmentsProgress == null) {
                f16 = f15;
                f17 = 1.0f;
            } else {
                f16 = f15;
                com.akita.compose.foundation.ui.g.a(f16, null, bE2, 6);
                f17 = 1.0f;
                d(installmentsProgress, lVar3, C20588k2.d(aVar3, 1.0f), bE2, ((i15 >> 6) & 112) | 392);
                G0 g05 = G0.f406611a;
            }
            bE2.X(z12);
            List<InstallmentsButton> list2 = installmentsBlockStateData2.f172848g;
            if (list2.isEmpty()) {
                list2 = null;
            }
            bE2.C(-382840679);
            if (list2 == null) {
                i13 = i15;
                b12 = bE2;
            } else {
                com.akita.compose.foundation.ui.g.a(f16, null, bE2, 6);
                I iA3 = H.a(C20585k.g(8), aVar, bE2, 6);
                int i18 = bE2.f37888Q;
                O1 o1S3 = bE2.S();
                v vVarC3 = androidx.compose.ui.n.c(bE2, aVar3);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar2);
                } else {
                    bE2.d();
                }
                R3.b(pVar2, bE2, iA3);
                R3.b(pVar4, bE2, o1S3);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                    AK.c.y(i18, bE2, i18, pVar5);
                }
                R3.b(pVar, bE2, vVarC3);
                bE2.C(1219296384);
                for (InstallmentsButton installmentsButton : list2) {
                    String str3 = installmentsButton.f172851c;
                    a aVar8 = new a(lVar2, installmentsButton);
                    bE2.C(1219303452);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    t tVarA = com.akita.compose.theme.re23.style.N.a(com.akita.compose.theme.re23.b.c(bE2), installmentsButton.f172852d);
                    bE2.X(z12);
                    B b13 = bE2;
                    com.akita.compose.component.button.m.c(str3, aVar8, tVarA, C20588k2.d(v.f42878y1, f17), null, null, null, false, false, null, b13, 3584, 1008);
                    i15 = i15;
                    bE2 = b13;
                }
                i13 = i15;
                b12 = bE2;
                b12.X(z12);
                b12.X(true);
                G0 g06 = G0.f406611a;
            }
            b12.X(z12);
            List<InstallmentsOfferDetailsItem> list3 = installmentsBlockStateData2.f172849h;
            if (list3.isEmpty()) {
                list3 = null;
            }
            b12.C(-382819152);
            if (list3 == null) {
                z13 = true;
            } else {
                com.akita.compose.foundation.ui.g.a(f12, null, b12, 6);
                C20585k.f28659a.getClass();
                C20585k.j jVarG = C20585k.g(f16);
                v.a aVar9 = v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                I iA4 = H.a(jVarG, InterfaceC22215f.a.f39088n, b12, 6);
                int i19 = b12.f37888Q;
                O1 o1S4 = b12.S();
                v vVarC4 = androidx.compose.ui.n.c(b12, aVar9);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar10 = InterfaceC22413h.a.f40791b;
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                b12.A();
                if (b12.f37887P) {
                    b12.b(aVar10);
                } else {
                    b12.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, b12, iA4);
                R3.b(InterfaceC22413h.a.f40795f, b12, o1S4);
                Y41.p<InterfaceC22413h, Integer, G0> pVar7 = InterfaceC22413h.a.f40799j;
                if (b12.f37887P || !L.f(b12.t(), Integer.valueOf(i19))) {
                    AK.c.y(i19, b12, i19, pVar7);
                }
                R3.b(InterfaceC22413h.a.f40793d, b12, vVarC4);
                K k13 = K.f28344a;
                b12.C(1219317632);
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    f((InstallmentsOfferDetailsItem) it.next(), lVar3, C20588k2.d(v.f42878y1, f17), b12, ((i13 >> 6) & 112) | 392);
                }
                b12.X(z12);
                z13 = true;
                b12.X(true);
                G0 g07 = G0.f406611a;
            }
            b12.X(z12);
            G0 g08 = G0.f406611a;
            androidx.compose.foundation.H.A(b12, z12, z13, z13);
        }
        C22039c2 c22039c2Z2 = b12.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new C5095b(dVar, lVar, lVar2, lVar3, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l InstallmentsIcon installmentsIcon, @Y61.k Y41.l lVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        Y41.p<InterfaceC22413h, U, G0> pVar;
        Y41.p<InterfaceC22413h, v, G0> pVar2;
        Y41.p<InterfaceC22413h, Integer, G0> pVar3;
        InterfaceC22078i<?> interfaceC22078i;
        Throwable th2;
        Y41.a<InterfaceC22413h> aVar;
        B b12;
        B bE2 = a12.E(1970872446);
        v vVarA = C20646z1.a(vVar, IntrinsicSize.f28334c);
        C20585k.f28659a.getClass();
        C20585k.h hVar = C20585k.f28666h;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(hVar, InterfaceC22215f.a.f39085k, bE2, 54);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i2 = bE2.f37890b;
        if (interfaceC22078i2 == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4 = InterfaceC22413h.a.f40796g;
        R3.b(pVar4, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, U, G0> pVar5 = InterfaceC22413h.a.f40795f;
        R3.b(pVar5, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar6 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar6);
        }
        Y41.p<InterfaceC22413h, v, G0> pVar7 = InterfaceC22413h.a.f40793d;
        R3.b(pVar7, bE2, vVarC);
        v vVarA2 = C20576h2.f28641a.a(v.f42878y1, 1.0f, true);
        I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA2);
        if (interfaceC22078i2 == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(pVar4, bE2, iA2);
        R3.b(pVar5, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar6);
        }
        R3.b(pVar7, bE2, vVarC2);
        K k12 = K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65234e, null, false, 0L, null, 0, 0, false, null, bE2, (i12 & 14) | 3072, 1012);
        bE2.C(569394414);
        if (attributedText == null) {
            pVar = pVar5;
            pVar2 = pVar7;
            pVar3 = pVar6;
            interfaceC22078i = interfaceC22078i2;
            th2 = null;
            aVar = aVar2;
            b12 = bE2;
        } else {
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(2, null, bE2, 6);
            pVar = pVar5;
            pVar2 = pVar7;
            pVar3 = pVar6;
            interfaceC22078i = interfaceC22078i2;
            th2 = null;
            aVar = aVar2;
            b12 = bE2;
            com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, null, 0, null, new com.avito.android.installmentsblock.compose.c(lVar, attributedText), 0, bE2, 8, 46);
        }
        b12.X(false);
        b12.X(true);
        b12.C(936697997);
        if (installmentsIcon != null) {
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            v vVarM = R1.m(C20588k2.f28681b, 10, 0.0f, 0.0f, 0.0f, 14);
            b12.C(569413027);
            Object objT = b12.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                b12.H(objT);
            }
            b12.X(false);
            v vVarB = C21086w0.b(vVarM, (androidx.compose.foundation.interaction.m) objT, null, false, null, new com.avito.android.installmentsblock.compose.d(installmentsIcon, lVar), 28);
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39078d, false);
            int i15 = b12.f37888Q;
            O1 o1S3 = b12.S();
            v vVarC3 = androidx.compose.ui.n.c(b12, vVarB);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw th2;
            }
            b12.A();
            if (b12.f37887P) {
                b12.b(aVar);
            } else {
                b12.d();
            }
            R3.b(pVar4, b12, interfaceC22365i0D);
            R3.b(pVar, b12, o1S3);
            if (b12.f37887P || !L.f(b12.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, b12, i15, pVar3);
            }
            R3.b(pVar2, b12, vVarC3);
            C20644z c20644z = C20644z.f28804a;
            c(installmentsIcon, b12, 8);
            b12.X(true);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(b12, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new com.avito.android.installmentsblock.compose.e(str, attributedText, installmentsIcon, lVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k InstallmentsIcon installmentsIcon, @Y61.l A a12, int i12) {
        Integer num;
        B bE2 = a12.E(1297193833);
        v.a aVar = v.f42878y1;
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        InstallmentsSize installmentsSize = installmentsIcon.f172856d;
        Integer num2 = installmentsSize != null ? installmentsSize.f172886c : null;
        int iIntValue = (installmentsSize == null || (num = installmentsSize.f172885b) == null) ? 32 : num.intValue();
        float f12 = iIntValue;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        v vVarD0 = C20588k2.t(aVar, f12).d0(num2 != null ? C20588k2.f(aVar, num2.intValue()) : C20588k2.w(aVar, null, 3));
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        UniversalImage universalImage = installmentsIcon.f172855c;
        Image imageDependsOnTheme = universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null;
        int iB2 = kotlin.math.b.b(dVar.M0(f12));
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        Uri uriC = C35829k2.b(imageDependsOnTheme, iB2, kotlin.math.b.b(dVar.M0(iIntValue)), 0.0f, 1, 44).c(com.avito.android.installmentsblock.compose.g.f172929b);
        if (uriC != null) {
            bE2.C(-156788678);
            InterfaceC22374n.f40491a.getClass();
            coil.compose.v.b(uriC, null, vVarD0, null, InterfaceC22374n.a.f40496e, null, bE2, 1572920, 4024);
            bE2.X(false);
        } else {
            bE2.C(-156593719);
            InstallmentsColoredIcon installmentsColoredIcon = installmentsIcon.f172854b;
            if (installmentsColoredIcon != null) {
                e(installmentsColoredIcon, R1.k(0.0f, 1, 1, vVarD0), bE2, 8, 0);
            }
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.installmentsblock.compose.f(installmentsIcon, aVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(@Y61.k InstallmentsProgress installmentsProgress, @Y61.k Y41.l lVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(121056694);
        C20585k c20585k = C20585k.f28659a;
        float f12 = installmentsProgress.f172873b;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20585k.j jVarG = C20585k.g(f12);
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(-617147217);
        InstallmentsProgress.Block block = installmentsProgress.f172875d;
        if (block != null) {
            h(block, installmentsProgress.f172874c, lVar, null, bE2, ((i12 << 3) & 896) | 8, 8);
        }
        bE2.X(false);
        bE2.C(-617140522);
        InstallmentsProgress.Block block2 = installmentsProgress.f172876e;
        if (block2 != null) {
            h(block2, installmentsProgress.f172874c, lVar, c20576h2.a(v.f42878y1, 1.0f, true), bE2, ((i12 << 3) & 896) | 8, 0);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new l(installmentsProgress, lVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(@Y61.k InstallmentsColoredIcon installmentsColoredIcon, @Y61.l v vVar, @Y61.l A a12, int i12, int i13) {
        com.akita.compose.foundation.p pVarA;
        String colorKey;
        B bE2 = a12.E(279408673);
        if ((i13 & 2) != 0) {
            vVar = v.f42878y1;
        }
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.e eVar = com.akita.compose.theme.re23.b.f63985c;
        String str = installmentsColoredIcon.f172883b;
        eVar.getClass();
        Integer numD = com.akita.compose.theme.re23.e.d(str);
        if (numD != null) {
            UniversalColor universalColor = installmentsColoredIcon.f172884c;
            if (universalColor == null || (colorKey = universalColor.getColorKey()) == null || (pVarA = C26932a.a(colorKey)) == null) {
                pVarA = com.akita.compose.theme.re23.b.f63984b.f63938l;
            }
            com.akita.compose.foundation.ui.e.a(u0.e.a(numD.intValue(), 0, bE2), null, vVar, pVarA, bE2, 56, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(installmentsColoredIcon, vVar, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(@Y61.k InstallmentsOfferDetailsItem installmentsOfferDetailsItem, @Y61.k Y41.l lVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1296958899);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k c20585k = C20585k.f28659a;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.g(12), bVar, bE2, 54);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(-788148427);
        InstallmentsColoredIcon installmentsColoredIcon = installmentsOfferDetailsItem.f172866c;
        if (installmentsColoredIcon != null) {
            e(installmentsColoredIcon, null, bE2, 8, 2);
        }
        bE2.X(false);
        bE2.C(-788146261);
        AttributedText attributedText = installmentsOfferDetailsItem.f172865b;
        if (attributedText != null) {
            com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, null, 0, null, new m(lVar, attributedText), 0, bE2, 8, 46);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new n(installmentsOfferDetailsItem, lVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void g(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.k Y41.l lVar, @Y61.l v vVar, @Y61.l InstallmentsPriceInfo.PriceBadge priceBadge, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-738319239);
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65234e, null, false, 0L, null, 0, 0, false, null, bE2, (i12 & 14) | 3072, 1012);
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.g.a(2, null, bE2, 6);
        com.avito.android.lib.compose.design.component.attributedtext.a.a(null, o.f172940l, new p(attributedText, lVar, priceBadge, context), 0, bE2, 48, 9);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(str, attributedText, lVar, vVar, priceBadge, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@Y61.k com.avito.android.installments_block.entity.InstallmentsProgress.Block r16, int r17, @Y61.k Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r18, @Y61.l androidx.compose.ui.v r19, @Y61.l androidx.compose.runtime.A r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.installmentsblock.compose.b.h(com.avito.android.installments_block.entity.InstallmentsProgress$Block, int, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(@Y61.k java.util.List r11, @Y61.k Y41.l r12, @Y61.l androidx.compose.runtime.A r13, int r14) {
        /*
            r0 = 1024007244(0x3d091c4c, float:0.03347425)
            androidx.compose.runtime.B r13 = r13.E(r0)
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            com.akita.compose.theme.re23.b r1 = com.akita.compose.theme.re23.b.f63983a
            r1.getClass()
            com.akita.compose.theme.re23.style.T r1 = com.akita.compose.theme.re23.b.d(r13)
            com.akita.compose.component.chips.y r2 = r1.getF66050y()
            com.akita.compose.component.chips.ChipsDisplayType r3 = com.akita.compose.component.chips.ChipsDisplayType.f60862c
            r1 = 1565687027(0x5d527cf3, float:9.4795405E17)
            r13.C(r1)
            r1 = r14 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r4 = 0
            r5 = 32
            if (r1 <= r5) goto L2d
            boolean r1 = r13.B(r12)
            if (r1 != 0) goto L31
        L2d:
            r1 = r14 & 48
            if (r1 != r5) goto L33
        L31:
            r1 = 1
            goto L34
        L33:
            r1 = r4
        L34:
            java.lang.Object r5 = r13.t()
            if (r1 != 0) goto L43
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r1) goto L4b
        L43:
            com.avito.android.installmentsblock.compose.r r5 = new com.avito.android.installmentsblock.compose.r
            r5.<init>(r12)
            r13.H(r5)
        L4b:
            Y41.p r5 = (Y41.p) r5
            r13.X(r4)
            com.avito.android.installmentsblock.compose.a r1 = com.avito.android.installmentsblock.compose.a.f172890a
            r1.getClass()
            androidx.compose.runtime.internal.n r6 = com.avito.android.installmentsblock.compose.a.f172891b
            int r1 = r14 << 6
            r4 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r4
            r4 = 197064(0x301c8, float:2.76145E-40)
            r9 = r4 | r1
            r10 = 64
            r7 = 0
            r1 = r11
            r4 = r5
            r5 = r0
            r8 = r13
            com.akita.compose.component.chips.d.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.runtime.c2 r13 = r13.Z()
            if (r13 == 0) goto L79
            com.avito.android.installmentsblock.compose.s r1 = new com.avito.android.installmentsblock.compose.s
            r1.<init>(r14, r12, r0, r11)
            r13.f38184d = r1
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.installmentsblock.compose.b.i(java.util.List, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
