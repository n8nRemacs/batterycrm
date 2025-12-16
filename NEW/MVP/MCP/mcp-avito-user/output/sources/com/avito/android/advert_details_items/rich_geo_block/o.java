package com.avito.android.advert_details_items.rich_geo_block;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.E;
import androidx.compose.foundation.layout.F;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.E0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.q0;
import androidx.compose.ui.text.r0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.advert_details_items.rich_geo_block.c;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35787f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AdvertDetailsRichGeoBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "imageBigSizeState", "_avito_advert-details-items_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o {

    /* compiled from: AdvertDetailsRichGeoBlockView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "offset", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22602e f85444l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f85445m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f85446n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C22602e c22602e, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
            super(1);
            this.f85444l = c22602e;
            this.f85445m = (N) aVar;
            this.f85446n = (N) aVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v12, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r3v13, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iMax = Math.max(num.intValue() - 1, 0);
            C22602e.C1684e c1684e = (C22602e.C1684e) C42745f0.G(this.f85444l.c(iMax, iMax, "default_clickable_tag"));
            if (c1684e != null) {
                String str = (String) c1684e.f42138a;
                if (L.f(str, "address_annotation")) {
                    this.f85445m.invoke();
                } else if (L.f(str, "icon_annotation")) {
                    this.f85446n.invoke();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRichGeoBlockView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f85447l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f85448m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f85449n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f85450o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f85451p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, long j12, Y41.a<G0> aVar, Y41.a<G0> aVar2, int i12) {
            super(2);
            this.f85447l = str;
            this.f85448m = j12;
            this.f85449n = (N) aVar;
            this.f85450o = (N) aVar2;
            this.f85451p = i12;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f85451p | 1);
            ?? r32 = this.f85449n;
            ?? r42 = this.f85450o;
            o.a(this.f85447l, this.f85448m, r32, r42, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRichGeoBlockView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<c.a> f85452l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f85453m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f85454n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(int i12, Y41.a aVar, List list) {
            super(2);
            this.f85452l = list;
            this.f85453m = (N) aVar;
            this.f85454n = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f85454n | 1);
            ?? r02 = this.f85453m;
            o.b(this.f85452l, r02, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRichGeoBlockView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "size", "Lkotlin/G0;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<androidx.compose.ui.unit.u, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f85455l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f85456m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.unit.d dVar, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f85455l = dVar;
            this.f85456m = interfaceC22204y1;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.unit.u uVar) {
            int i12 = (int) (uVar.f42872a & 4294967295L);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            this.f85456m.setValue(Boolean.valueOf(Float.compare(this.f85455l.J(i12), (float) 48) > 0));
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRichGeoBlockView.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.q<F, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f85457l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ UniversalImage f85458m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f85459n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advert_details_items.rich_geo_block.c f85460o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ N f85461p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ N f85462q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ N f85463r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ N f85464s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f85465t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f85466u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(float f12, UniversalImage universalImage, float f13, com.avito.android.advert_details_items.rich_geo_block.c cVar, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, Y41.a aVar4, androidx.compose.ui.unit.d dVar, InterfaceC22204y1 interfaceC22204y1) {
            super(3);
            this.f85457l = f12;
            this.f85458m = universalImage;
            this.f85459n = f13;
            this.f85460o = cVar;
            this.f85461p = (N) aVar;
            this.f85462q = (N) aVar2;
            this.f85463r = (N) aVar3;
            this.f85464s = (N) aVar4;
            this.f85465t = dVar;
            this.f85466u = interfaceC22204y1;
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v2, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r6v1, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r7v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.q
        public final G0 invoke(F f12, A a12, Integer num) {
            float f13;
            int iY02;
            F f14 = f12;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(f14) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                a13.C(1516006846);
                Object objT = a13.t();
                A.f37866a.getClass();
                A.a.C1651a c1651a = A.a.f37868b;
                float f15 = this.f85459n;
                UniversalImage universalImage = this.f85458m;
                if (objT == c1651a) {
                    androidx.compose.ui.unit.d dVar = this.f85465t;
                    float f16 = this.f85457l;
                    if (universalImage == null) {
                        h.a aVar = androidx.compose.ui.unit.h.f42849c;
                        iY02 = dVar.y0(f14.h() - (f16 * 2));
                    } else {
                        float fH2 = f14.h() - f16;
                        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                        iY02 = dVar.y0(fH2 - (62 + f15));
                    }
                    objT = Integer.valueOf(iY02);
                    a13.H(objT);
                }
                int iIntValue2 = ((Number) objT).intValue();
                a13.h();
                long jC2 = C22712b.c(f14.getF28270b(), 0, iIntValue2, 0, 0, 12);
                v.a aVar3 = androidx.compose.ui.v.f42878y1;
                float f17 = this.f85457l;
                if (universalImage == null) {
                    f13 = f17;
                } else {
                    h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                    f13 = 62 + f15;
                }
                o.f(jC2, this.f85460o, this.f85461p, this.f85462q, this.f85463r, R1.m(aVar3, f17, 0.0f, f13, 0.0f, 10), a13, 0);
                if (universalImage != null) {
                    InterfaceC22215f.f39074a.getClass();
                    h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                    o.g(this.f85458m, this.f85466u.getF42167b().booleanValue(), this.f85464s, R1.m(f14.d(aVar3, InterfaceC22215f.a.f39078d), 10, 0.0f, this.f85459n, 0.0f, 10), a13, 8);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRichGeoBlockView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advert_details_items.rich_geo_block.c f85467l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f85468m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f85469n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f85470o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ N f85471p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f85472q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(com.avito.android.advert_details_items.rich_geo_block.c cVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, int i12) {
            super(2);
            this.f85467l = cVar;
            this.f85468m = (N) aVar;
            this.f85469n = (N) aVar2;
            this.f85470o = (N) aVar3;
            this.f85471p = (N) aVar4;
            this.f85472q = i12;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f85472q | 1);
            ?? r32 = this.f85470o;
            ?? r42 = this.f85471p;
            o.c(this.f85467l, this.f85468m, this.f85469n, r32, r42, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRichGeoBlockView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f85473l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f85474m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z12, int i12) {
            super(2);
            this.f85473l = str;
            this.f85474m = z12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            o.e(this.f85473l, this.f85474m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(String str, long j12, Y41.a<G0> aVar, Y41.a<G0> aVar2, A a12, int i12) {
        String string;
        C22602e c22602eB;
        int i13;
        B bE2 = a12.E(-1246715427);
        int i14 = (i12 & 14) == 0 ? (bE2.B(str) ? 4 : 2) | i12 : i12;
        if ((i12 & 112) == 0) {
            i14 |= bE2.n(j12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.u(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-602737880);
            Object objT = bE2.t();
            A.f37866a.getClass();
            int i15 = 0;
            if (objT == A.a.f37868b) {
                C22602e.b bVar = new C22602e.b(0, 1, null);
                com.akita.compose.theme.re23.g.f65049a.getClass();
                String str2 = com.akita.compose.theme.re23.g.f65123k3;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.o.d(bVar, str2, com.akita.compose.theme.re23.b.f63988f.f65241l);
                objT = bVar.m();
                bE2.H(objT);
            }
            C22602e c22602e = (C22602e) objT;
            bE2.X(false);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            x0 x0VarD = com.akita.compose.theme.re23.b.f63988f.f65241l.d(new Object[0], bE2);
            q0 q0VarA = r0.a(0, 0, 1, bE2);
            int i16 = 0;
            while (true) {
                string = C43066x.C0(str.substring(i15, str.length() - i16)).toString();
                StringBuilder sb2 = i16 > 0 ? new StringBuilder("... ") : new StringBuilder(" ");
                sb2.append((Object) c22602e);
                String strQ = androidx.appcompat.app.r.q(string, sb2.toString());
                com.akita.compose.theme.re23.b.f63983a.getClass();
                c22602eB = com.akita.compose.foundation.ui.o.b(strQ, com.akita.compose.theme.re23.b.f63988f.f65241l);
                if (!q0.b(q0VarA, c22602eB, x0VarD, 0, false, 3, j12, null, null, null, 1964).e() || (i13 = i16 + 1) >= str.length()) {
                    break;
                }
                i16 = i13;
                i15 = 0;
            }
            List<y> listU = C42745f0.U(new y("address_annotation", 0, string.length(), "default_clickable_tag"), new y("icon_annotation", string.length(), c22602eB.f42127c.length(), "default_clickable_tag"));
            C22602e.b bVar2 = new C22602e.b(0, 1, null);
            bVar2.d(c22602eB);
            for (y yVar : listU) {
                bVar2.a(yVar.f85500b, yVar.f85501c, yVar.f85502d, yVar.f85499a);
            }
            C22602e c22602eM = bVar2.m();
            androidx.compose.ui.text.style.s.f42720b.getClass();
            int i17 = androidx.compose.ui.text.style.s.f42721c;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(0.0f, 1, 1, aVar3);
            bE2.C(-602685218);
            boolean zB2 = ((i14 & 7168) == 2048) | bE2.B(c22602eM) | ((i14 & 896) == 256);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == A.a.f37868b) {
                objT2 = new a(c22602eM, aVar, aVar2);
                bE2.H(objT2);
            }
            bE2.X(false);
            com.akita.compose.foundation.ui.a.a(c22602eM, (Y41.l) objT2, vVarK, x0VarD, false, i17, 3, null, null, bE2, 1769856, Constants.MINIMAL_ERROR_STATUS_CODE);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(str, j12, aVar, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(List<c.a> list, Y41.a<G0> aVar, A a12, int i12) {
        B bE2 = a12.E(1725471080);
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarM = R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 1, 0.0f, 0.0f, 13);
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        bE2.C(-1751508764);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d((c.a) it.next(), C21086w0.c(androidx.compose.ui.v.f42878y1, false, null, null, aVar, 7), bE2, 8);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new c(i12, aVar, list);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(com.avito.android.advert_details_items.rich_geo_block.c cVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, A a12, int i12) {
        B bE2 = a12.E(812372336);
        int i13 = (bE2.B(cVar) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar3) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(aVar4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i13 & 46811) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            float fA2 = u0.f.a(bE2, R.dimen.content_horizontal_padding);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            bE2.C(-871576123);
            Object objT = bE2.t();
            A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = C22126m3.g(Boolean.FALSE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            bE2.C(-871571441);
            boolean zB2 = bE2.B(dVar);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == obj) {
                objT2 = new d(dVar, interfaceC22204y1);
                bE2.H(objT2);
            }
            bE2.X(false);
            E.a(E0.a(vVarD, (Y41.l) objT2), null, false, androidx.compose.runtime.internal.r.c(-157031738, new e(fA2, cVar.f85420d, fA2, cVar, aVar, aVar4, aVar2, aVar3, dVar, interfaceC22204y1), bE2), bE2, 3072, 6);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(cVar, aVar, aVar2, aVar3, aVar4, i12);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(c.a aVar, androidx.compose.ui.v vVar, A a12, int i12) {
        ArrayList arrayList;
        boolean z12;
        boolean z13;
        float f12;
        v.a aVar2;
        ?? r12;
        boolean z14;
        B bE2 = a12.E(272901182);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
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
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        C20585k.j jVarG = C20585k.g(-5);
        v.a aVar5 = androidx.compose.ui.v.f42878y1;
        C20568f2 c20568f2A2 = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 6);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar5);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, c20568f2A2);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        List<String> list = aVar.f85422a;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Integer numA = C35787f0.a((String) it.next());
                if (numA != null) {
                    arrayList2.add(numA);
                }
            }
            arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(T.a(V.b(((Number) it2.next()).intValue())));
            }
        } else {
            arrayList = null;
        }
        bE2.C(-549098760);
        boolean z15 = false;
        if (arrayList == null) {
            z12 = false;
            z13 = true;
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                long j12 = ((T) it3.next()).f39331a;
                v.a aVar6 = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarO = C20588k2.o(R1.m(aVar6, 0.0f, 7, 0.0f, 5, 5), 9);
                androidx.compose.foundation.shape.n nVar = androidx.compose.foundation.shape.o.f30153a;
                androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(vVarO, nVar);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                long jC2 = com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2);
                Y0.a aVar7 = Y0.f39346a;
                androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarA, jC2, aVar7);
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, z15);
                int i15 = bE2.f37888Q;
                O1 o1S3 = bE2.S();
                androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarB);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar8 = InterfaceC22413h.a.f40791b;
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar8);
                } else {
                    bE2.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S3);
                Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                    AK.c.y(i15, bE2, i15, pVar5);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC3);
                C20632w.a(androidx.compose.foundation.A.b(androidx.compose.ui.draw.k.a(C20588k2.o(C20644z.f28804a.d(aVar6, InterfaceC22215f.a.f39080f), 8), nVar), j12, aVar7), bE2, 0);
                bE2.X(true);
                z15 = false;
            }
            z12 = z15;
            z13 = true;
            G0 g02 = G0.f406611a;
        }
        bE2.X(z12);
        bE2.X(z13);
        v.a aVar9 = androidx.compose.ui.v.f42878y1;
        float f13 = 4;
        C20608p2.a(bE2, C20588k2.t(aVar9, f13));
        bE2.C(758573335);
        String str = aVar.f85423b;
        if (str == null) {
            f12 = f13;
            aVar2 = aVar9;
            r12 = z13;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            f12 = f13;
            aVar2 = aVar9;
            r12 = z13;
            com.akita.compose.foundation.ui.p.d(str, com.akita.compose.theme.re23.b.f63988f.f65241l.d(new Object[0], bE2), null, 0L, null, 0, 0, false, null, bE2, 0, 508);
            G0 g03 = G0.f406611a;
        }
        bE2.X(false);
        v.a aVar10 = aVar2;
        C20608p2.a(bE2, C20588k2.t(aVar10, f12));
        bE2.C(758580854);
        if (L.f(aVar.f85424c, "walkingRoute16")) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64334Tf, 0, bE2);
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
            com.akita.compose.foundation.ui.e.b(56, 8, X2.h.f18557e.c(bE2), bE2, null, eVarA, null);
            C20608p2.a(bE2, C20588k2.t(aVar10, (float) r12));
        }
        bE2.X(false);
        bE2.C(758592281);
        String str2 = aVar.f85425d;
        if (str2 == null) {
            z14 = false;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            x0 x0VarD = com.akita.compose.theme.re23.b.f63988f.f65241l.d(new Object[0], bE2);
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
            z14 = false;
            com.akita.compose.foundation.ui.p.d(str2, x0VarD, null, X2.h.f18557e.c(bE2), null, 0, 0, false, null, bE2, 0, 500);
            G0 g04 = G0.f406611a;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z14, r12);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new x(aVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(String str, boolean z12, A a12, int i12) {
        x0 x0VarD;
        B b12;
        B bE2 = a12.E(1844132647);
        int i13 = (bE2.B(str) ? 4 : 2) | i12 | (bE2.j(z12) ? 32 : 16);
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            if (z12) {
                bE2.C(-940730478);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                x0VarD = com.akita.compose.theme.re23.b.f63988f.f65239j.d(new Object[0], bE2);
                bE2.X(false);
            } else {
                bE2.C(-940662030);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                x0VarD = com.akita.compose.theme.re23.b.f63988f.f65236g.d(new Object[0], bE2);
                bE2.X(false);
            }
            x0 x0Var = x0VarD;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.d(str, x0Var, R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, 0.0f, 1, 7), 0L, null, 0, 0, false, null, bE2, (i13 & 14) | 384, 504);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(str, z12, i12);
        }
    }

    public static final void f(long j12, com.avito.android.advert_details_items.rich_geo_block.c cVar, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, androidx.compose.ui.v vVar, A a12, int i12) {
        int i13;
        boolean z12;
        boolean z13;
        B bE2 = a12.E(-1446439011);
        if ((i12 & 14) == 0) {
            i13 = (bE2.n(j12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(cVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar2) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(aVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.B(vVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            bE2.C(-2127715681);
            String str = cVar.f85417a;
            if (str == null) {
                z12 = false;
            } else {
                z12 = false;
                e(str, cVar.f85421e, bE2, 0);
            }
            bE2.X(z12);
            bE2.C(-2127713853);
            String str2 = cVar.f85418b;
            if (str2 == null) {
                z13 = z12;
            } else {
                z13 = z12;
                a(str2, j12, aVar, aVar2, bE2, ((i13 << 3) & 112) | (i13 & 896) | (i13 & 7168));
            }
            bE2.X(z13);
            bE2.C(-2127710734);
            List<c.a> list = cVar.f85419c;
            if (list != null) {
                b(list, aVar3, bE2, ((i13 >> 9) & 112) | 8);
            }
            bE2.X(z13);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(j12, cVar, aVar, aVar2, aVar3, vVar, i12);
        }
    }

    public static final void g(UniversalImage universalImage, boolean z12, Y41.a aVar, androidx.compose.ui.v vVar, A a12, int i12) {
        B bE2 = a12.E(783282224);
        if (universalImage == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new v(universalImage, z12, aVar, vVar, i12);
                return;
            }
            return;
        }
        float f12 = z12 ? 52 : 44;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        float f13 = z12 ? 8 : 2;
        Uri uriA = com.avito.android.advert_details_items.compose.b.a(universalImage, f12, f12, bE2);
        androidx.compose.ui.graphics.painter.e eVarB = com.google.accompanist.drawablepainter.c.b(androidx.core.content.d.getDrawable((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b), R.color.gray48), bE2);
        InterfaceC22374n.f40491a.getClass();
        coil.compose.v.a(uriA, null, C21086w0.c(androidx.compose.ui.draw.k.a(C20588k2.o(R1.m(vVar, 0.0f, f13, 0.0f, 0.0f, 13), f12), androidx.compose.foundation.shape.o.a(16)), false, null, null, aVar, 7), eVarB, null, null, null, null, null, null, InterfaceC22374n.a.f40493b, null, bE2, 4152, 6, 64496);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new w(universalImage, z12, aVar, vVar, i12);
        }
    }
}
