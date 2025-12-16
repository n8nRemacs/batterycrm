package com.avito.android.comfortable_deal.common.view.client;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import coil.compose.C27242f;
import com.avito.android.R;
import com.avito.android.comfortable_deal.common.view.x;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ClientCard.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    /* compiled from: ClientCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120663l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f120663l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f120663l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<Context, ImageView> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f120664l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final ImageView invoke(Context context) {
            return new ImageView(context);
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/widget/ImageView;", "it", "Lkotlin/G0;", "invoke", "(Landroid/widget/ImageView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<ImageView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ClientCardData f120665l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ClientCardData clientCardData) {
            super(1);
            this.f120665l = clientCardData;
        }

        @Override // Y41.l
        public final G0 invoke(ImageView imageView) {
            ImageView imageView2 = imageView;
            ClientCardData clientCardData = this.f120665l;
            Uri uriA = com.avito.android.image_loader.n.a(clientCardData.f120637c).a(imageView2);
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView2));
            aVar.f(uriA);
            aVar.f169485c = Integer.valueOf(R.drawable.placeholder_circle_bg_comfortable_deal);
            aVar.f169492j = D6.u(imageView2, R.drawable.placeholder_circle_bg_comfortable_deal);
            aVar.f169493k = null;
            aVar.f169503u = true;
            aVar.c();
            imageView2.setForeground(clientCardData.f120641g ? D6.u(imageView2, R.drawable.gray_round_mask) : null);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ClientCardData f120666l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120667m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ClientCardData clientCardData, Y41.a<G0> aVar, int i12) {
            super(2);
            this.f120666l = clientCardData;
            this.f120667m = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) throws Throwable {
            num.intValue();
            int iA2 = C22066f2.a(1);
            e.a(this.f120666l, this.f120667m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil/compose/f$c$b;", "it", "Lkotlin/G0;", "invoke", "(Lcoil/compose/f$c$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comfortable_deal.common.view.client.e$e, reason: collision with other inner class name */
    public static final class C3558e extends N implements Y41.l<C27242f.c.b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f120668l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3558e(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f120668l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final G0 invoke(C27242f.c.b bVar) {
            this.f120668l.setValue(Boolean.FALSE);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RealtyData f120669l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RealtyData realtyData) {
            super(1);
            this.f120669l = realtyData;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            com.avito.android.util.text.j.a(aVar, this.f120669l.f120644c, null);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/progress_bar/ProgressBar;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.l<Context, ProgressBar> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f120670l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final ProgressBar invoke(Context context) {
            Context context2 = context;
            ProgressBar progressBar = new ProgressBar(context2, null, 0, 0, 14, null);
            progressBar.setEmptyColor(C35835l0.d(R.attr.gray12, context2));
            return progressBar;
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/progress_bar/ProgressBar;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/progress_bar/ProgressBar;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<ProgressBar, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RealtyData f120671l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RealtyData realtyData) {
            super(1);
            this.f120671l = realtyData;
        }

        @Override // Y41.l
        public final G0 invoke(ProgressBar progressBar) {
            ProgressBar progressBar2 = progressBar;
            RealtyData realtyData = this.f120671l;
            progressBar2.setProgress(realtyData.f120648g);
            progressBar2.setFillColor(C48063a.f437606a.a(progressBar2.getContext(), realtyData.f120647f));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f120672l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            com.avito.android.lib.design.text_view.a aVar2 = aVar;
            aVar2.setMaxLines(1);
            aVar2.setEllipsize(TextUtils.TruncateAt.END);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RealtyData f120673l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(RealtyData realtyData) {
            super(1);
            this.f120673l = realtyData;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            com.avito.android.util.text.j.a(aVar, this.f120673l.f120645d, null);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RealtyData f120674l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f120675m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(RealtyData realtyData, boolean z12, int i12) {
            super(2);
            this.f120674l = realtyData;
            this.f120675m = z12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) throws Throwable {
            num.intValue();
            int iA2 = C22066f2.a(1);
            e.c(this.f120674l, this.f120675m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0200  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    @androidx.compose.runtime.InterfaceC22132o
    @android.annotation.SuppressLint({"ComposeAndroidView"})
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.comfortable_deal.common.view.client.ClientCardData r47, @Y61.k Y41.a<kotlin.G0> r48, @Y61.l androidx.compose.runtime.A r49, int r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.common.view.client.e.a(com.avito.android.comfortable_deal.common.view.client.ClientCardData, Y41.a, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(boolean z12, @Y61.l A a12, int i12) {
        boolean z13;
        B bE2 = a12.E(1258886792);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
            z13 = z12;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39085k;
            C20568f2 c20568f2A = C20563e2.a(c1589k, bVar, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
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
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarO = C20588k2.o(aVar, 40);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
            long jC2 = aVar4.f63842E1.c(bE2);
            int i14 = com.google.accompanist.placeholder.c.f342887a;
            C20608p2.a(bE2, com.google.accompanist.placeholder.j.c(vVarO, jC2, androidx.compose.foundation.shape.o.f30153a, com.google.accompanist.placeholder.material.a.a(bE2)));
            com.akita.compose.foundation.ui.g.b(16, null, bE2, 6, 2);
            C20585k.l lVar = C20585k.f28662d;
            i.a aVar5 = InterfaceC22215f.a.f39088n;
            I iA2 = H.a(lVar, aVar5, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar);
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
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            K k12 = K.f28344a;
            float f12 = 6;
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            float f13 = 104;
            androidx.compose.ui.v vVarF = C20588k2.f(C20588k2.t(aVar, f13), 10);
            com.akita.compose.foundation.p pVar5 = aVar4.f63842E1;
            C20608p2.a(bE2, x.a(vVarF, pVar5.c(bE2), com.google.accompanist.placeholder.material.a.a(bE2)));
            float f14 = 12;
            com.akita.compose.foundation.ui.g.a(f14, null, bE2, 6);
            float f15 = 9;
            C20608p2.a(bE2, x.a(C20588k2.f(C20588k2.t(aVar, 200), f15), pVar5.c(bE2), com.google.accompanist.placeholder.material.a.a(bE2)));
            com.akita.compose.foundation.ui.g.a(f14, null, bE2, 6);
            C20568f2 c20568f2A2 = C20563e2.a(c1589k, bVar, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, aVar);
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
            R3.b(pVar, bE2, c20568f2A2);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            C20608p2.a(bE2, com.google.accompanist.placeholder.j.c(C20588k2.o(aVar, 64), pVar5.c(bE2), androidx.compose.foundation.shape.o.a(f12), com.google.accompanist.placeholder.material.a.a(bE2)));
            com.akita.compose.foundation.ui.g.b(f14, null, bE2, 6, 2);
            I iA3 = H.a(lVar, aVar5, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S4 = bE2.S();
            androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, aVar);
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
            R3.b(pVar, bE2, iA3);
            R3.b(pVar2, bE2, o1S4);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            R3.b(pVar4, bE2, vVarC4);
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            C20608p2.a(bE2, x.a(C20588k2.f(C20588k2.t(aVar, f13), f15), pVar5.c(bE2), com.google.accompanist.placeholder.material.a.a(bE2)));
            com.akita.compose.foundation.ui.g.a(14, null, bE2, 6);
            C20608p2.a(bE2, x.a(C20588k2.f(C20588k2.t(aVar, f13), 7), pVar5.c(bE2), com.google.accompanist.placeholder.material.a.a(bE2)));
            z13 = true;
            androidx.compose.foundation.H.B(bE2, true, true, true, true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.comfortable_deal.common.view.client.f(z13, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e3  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    @androidx.compose.runtime.InterfaceC22132o
    @android.annotation.SuppressLint({"ComposeAndroidView"})
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.avito.android.comfortable_deal.common.view.client.RealtyData r42, boolean r43, androidx.compose.runtime.A r44, int r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.common.view.client.e.c(com.avito.android.comfortable_deal.common.view.client.RealtyData, boolean, androidx.compose.runtime.A, int):void");
    }
}
