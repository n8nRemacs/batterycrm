package com.avito.android.mnz_common.compose;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.J3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.Q0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MnzImage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {

    /* compiled from: MnzImage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Image f197888l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f197889m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f197890n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f197891o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f197892p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f197893q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f197894r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22215f f197895s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22374n f197896t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f197897u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f197898v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Image image, float f12, float f13, String str, androidx.compose.ui.v vVar, androidx.compose.ui.graphics.painter.e eVar, androidx.compose.ui.graphics.painter.e eVar2, InterfaceC22215f interfaceC22215f, InterfaceC22374n interfaceC22374n, int i12, int i13) {
            super(2);
            this.f197888l = image;
            this.f197889m = f12;
            this.f197890n = f13;
            this.f197891o = str;
            this.f197892p = vVar;
            this.f197893q = eVar;
            this.f197894r = eVar2;
            this.f197895s = interfaceC22215f;
            this.f197896t = interfaceC22374n;
            this.f197897u = i12;
            this.f197898v = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f197897u | 1);
            androidx.compose.ui.v vVar = this.f197892p;
            androidx.compose.ui.graphics.painter.e eVar = this.f197894r;
            i.a(this.f197888l, this.f197889m, this.f197890n, this.f197891o, vVar, this.f197893q, eVar, this.f197895s, this.f197896t, a12, iA2, this.f197898v);
            return G0.f406611a;
        }
    }

    /* compiled from: MnzImage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f197899b = new b();

        public b() {
            super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            return com.avito.android.advert.item.delivery_suggests.l.m(num2, size, num.intValue());
        }
    }

    @InterfaceC22132o
    public static final void a(@Y61.l Image image, float f12, float f13, @Y61.k String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.ui.graphics.painter.e eVar, @Y61.l androidx.compose.ui.graphics.painter.e eVar2, @Y61.l InterfaceC22215f interfaceC22215f, @Y61.l InterfaceC22374n interfaceC22374n, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        InterfaceC22215f interfaceC22215f2;
        InterfaceC22374n interfaceC22374n2;
        androidx.compose.runtime.B bE2 = a12.E(-216970287);
        androidx.compose.ui.v vVar2 = (i13 & 16) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        androidx.compose.ui.graphics.painter.e eVar3 = (i13 & 32) != 0 ? null : eVar;
        androidx.compose.ui.graphics.painter.e eVar4 = (i13 & 64) != 0 ? null : eVar2;
        if ((i13 & 128) != 0) {
            InterfaceC22215f.f39074a.getClass();
            interfaceC22215f2 = InterfaceC22215f.a.f39080f;
        } else {
            interfaceC22215f2 = interfaceC22215f;
        }
        if ((i13 & 256) != 0) {
            InterfaceC22374n.f40491a.getClass();
            interfaceC22374n2 = InterfaceC22374n.a.f40494c;
        } else {
            interfaceC22374n2 = interfaceC22374n;
        }
        bE2.C(958308698);
        J3 j32 = Q0.f41199h;
        int iY02 = ((androidx.compose.ui.unit.d) bE2.o(j32)).y0(f12);
        bE2.h();
        bE2.C(958308698);
        int iY03 = ((androidx.compose.ui.unit.d) bE2.o(j32)).y0(f13);
        bE2.h();
        Uri uriC = C35829k2.b(image, iY02, iY03, 0.0f, 2, 44).c(b.f197899b);
        if (uriC == null) {
            uriC = Uri.EMPTY;
        }
        coil.compose.v.a(uriC, null, C20588k2.q(C22501m2.a(vVar2, str), f12, f13), eVar3, eVar4, eVar4, null, null, null, interfaceC22215f2, interfaceC22374n2, null, bE2, ((i12 << 6) & 1879048192) | 299064, (i12 >> 24) & 14, 63936);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(image, f12, f13, str, vVar2, eVar3, eVar4, interfaceC22215f2, interfaceC22374n2, i12, i13);
        }
    }

    @InterfaceC22132o
    public static final void b(@Y61.k wZ.l lVar, float f12, float f13, @Y61.k String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.ui.graphics.painter.e eVar, @Y61.l InterfaceC22215f interfaceC22215f, @Y61.l InterfaceC22374n interfaceC22374n, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        InterfaceC22215f interfaceC22215f2;
        InterfaceC22374n interfaceC22374n2;
        androidx.compose.runtime.B bE2 = a12.E(-1073714529);
        androidx.compose.ui.v vVar2 = (i13 & 16) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        androidx.compose.ui.graphics.painter.e eVar2 = (i13 & 32) != 0 ? null : eVar;
        if ((i13 & 128) != 0) {
            InterfaceC22215f.f39074a.getClass();
            interfaceC22215f2 = InterfaceC22215f.a.f39080f;
        } else {
            interfaceC22215f2 = interfaceC22215f;
        }
        if ((i13 & 256) != 0) {
            InterfaceC22374n.f40491a.getClass();
            interfaceC22374n2 = InterfaceC22374n.a.f40494c;
        } else {
            interfaceC22374n2 = interfaceC22374n;
        }
        a(lVar.a((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)), f12, f13, str, vVar2, eVar2, null, interfaceC22215f2, interfaceC22374n2, bE2, (i12 & 112) | 2359304 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (29360128 & i12) | (234881024 & i12), 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(lVar, f12, f13, str, vVar2, eVar2, interfaceC22215f2, interfaceC22374n2, i12, i13);
        }
    }

    @InterfaceC22132o
    @Y61.l
    public static final androidx.compose.ui.graphics.painter.e c(@Y61.l androidx.compose.runtime.A a12) {
        a12.C(1328089526);
        androidx.compose.ui.graphics.painter.d dVar = null;
        if (((Boolean) a12.o(C22543x1.f41638a)).booleanValue()) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            dVar = new androidx.compose.ui.graphics.painter.d(com.akita.compose.theme.re23.b.f63984b.f63862L0.c(a12), null);
        }
        a12.h();
        return dVar;
    }
}
