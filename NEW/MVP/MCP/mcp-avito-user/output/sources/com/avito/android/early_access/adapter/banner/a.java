package com.avito.android.early_access.adapter.banner;

import Y41.p;
import Y41.q;
import Y61.k;
import android.net.Uri;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.g;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessBanner.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: EarlyAccessBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.early_access.adapter.banner.a$a, reason: collision with other inner class name */
    public static final class C4220a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Image f145084l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f145085m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f145086n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f145087o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4220a(Image image, float f12, v vVar, int i12, int i13) {
            super(2);
            this.f145084l = image;
            this.f145085m = f12;
            this.f145086n = vVar;
            this.f145087o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(57);
            a.a(this.f145084l, this.f145085m, this.f145086n, a12, iA2, this.f145087o);
            return G0.f406611a;
        }
    }

    /* compiled from: EarlyAccessBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f145088b = new b();

        public b() {
            super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            return l.m(num2, size, num.intValue());
        }
    }

    /* compiled from: EarlyAccessBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145089a;

        static {
            int[] iArr = new int[BannerType.values().length];
            try {
                BannerType bannerType = BannerType.f145076b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f145089a = iArr;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(Image image, float f12, v vVar, A a12, int i12, int i13) {
        B bE2 = a12.E(1152216608);
        v vVar2 = (i13 & 4) != 0 ? v.f42878y1 : vVar;
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        Uri uriC = C35829k2.b(image, kotlin.math.b.b(dVar.M0(f12)), kotlin.math.b.b(dVar.M0(f12)), 0.0f, 1, 44).c(b.f145088b);
        if (((Boolean) bE2.o(C22543x1.f41638a)).booleanValue()) {
            bE2.C(-2125299009);
            v vVarO = C20588k2.o(vVar2, f12);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
            C20632w.a(androidx.compose.foundation.A.b(vVarO, X2.b.f18127f.c(bE2), Y0.f39346a), bE2, 0);
            bE2.X(false);
        } else {
            bE2.C(-2125136724);
            coil.compose.v.b(uriC, null, C20588k2.o(vVar2, f12), null, null, null, bE2, 56, 4088);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C4220a(image, f12, vVar2, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@k EarlyAccessBannerItem earlyAccessBannerItem, @Y61.l v vVar, @Y61.l A a12, int i12) {
        float f12;
        i.b bVar;
        BannerType bannerType;
        B bE2 = a12.E(-103658831);
        int[] iArr = c.f145089a;
        BannerType bannerType2 = earlyAccessBannerItem.f145083e;
        if (iArr[bannerType2.ordinal()] == 1) {
            f12 = 28;
            h.a aVar = h.f42849c;
        } else {
            f12 = 20;
            h.a aVar2 = h.f42849c;
        }
        if (iArr[bannerType2.ordinal()] == 1) {
            InterfaceC22215f.f39074a.getClass();
            bVar = InterfaceC22215f.a.f39087m;
        } else {
            InterfaceC22215f.f39074a.getClass();
            bVar = InterfaceC22215f.a.f39086l;
        }
        float f13 = iArr[bannerType2.ordinal()] == 1 ? 20 : 12;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.b.f63987e.getClass();
        com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
        v vVarA = androidx.compose.ui.draw.k.a(androidx.compose.foundation.A.b(vVar, X2.b.f18131j.c(bE2), o.a(f12)), o.a(f12));
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarA);
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
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        if (bannerType2 == BannerType.f145076b) {
            bE2.C(493558890);
            float f14 = 12;
            bannerType = bannerType2;
            a(earlyAccessBannerItem.f145082d, 48, androidx.compose.ui.draw.k.a(R1.m(R1.k(0.0f, f14, 1, v.f42878y1), f14, 0.0f, 0.0f, 0.0f, 14), o.a(f14)), bE2, 56, 0);
            g.b(f14, null, bE2, 6, 2);
            bE2.X(false);
        } else {
            bannerType = bannerType2;
            bE2.C(493879430);
            g.b(20, null, bE2, 6, 2);
            bE2.X(false);
        }
        BannerType bannerType3 = bannerType;
        com.akita.compose.foundation.ui.p.b(earlyAccessBannerItem.f145081c, com.akita.compose.theme.re23.b.f63988f.f65241l, R1.k(0.0f, f13, 1, c20576h2.a(v.f42878y1, 1.0f, true)), false, com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2), null, 0, 0, false, null, bE2, 0, 1000);
        if (bannerType3 == BannerType.f145077c) {
            bE2.C(494212990);
            a(earlyAccessBannerItem.f145082d, 80, null, bE2, 56, 4);
            bE2.X(false);
        } else {
            bE2.C(494329798);
            g.b(12, null, bE2, 6, 2);
            bE2.X(false);
        }
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.early_access.adapter.banner.b(earlyAccessBannerItem, vVar, i12);
        }
    }
}
