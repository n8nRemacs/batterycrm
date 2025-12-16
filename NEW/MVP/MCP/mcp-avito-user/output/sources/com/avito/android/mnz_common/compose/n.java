package com.avito.android.mnz_common.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.C22501m2;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;
import wZ.C49578b;

/* compiled from: MnzNavBar.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n {

    /* compiled from: MnzNavBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/i;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/i;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.q<com.akita.compose.component.navbar.i, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C49578b f197915l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f197916m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C49578b c49578b, Y41.l<? super DeepLink, G0> lVar) {
            super(3);
            this.f197915l = c49578b;
            this.f197916m = lVar;
        }

        @Override // Y41.q
        public final G0 invoke(com.akita.compose.component.navbar.i iVar, androidx.compose.runtime.A a12, Integer num) {
            com.akita.compose.component.navbar.i iVar2 = iVar;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(iVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.component.navbar.h.b(iVar2, k.f197910l, C22501m2.a(androidx.compose.ui.v.f42878y1, "mnz_nav_bar_right_button"), androidx.compose.runtime.internal.r.c(1353451273, new m(this.f197915l, this.f197916m), a13), a13, (iIntValue & 14) | 3504, 0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MnzNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f197917l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ wZ.j f197918m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f197919n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f197920o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f197921p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f197922q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f197923r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f197924s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.a<G0> aVar, wZ.j jVar, Y41.l<? super DeepLink, G0> lVar, androidx.compose.ui.v vVar, boolean z12, boolean z13, int i12, int i13) {
            super(2);
            this.f197917l = aVar;
            this.f197918m = jVar;
            this.f197919n = lVar;
            this.f197920o = vVar;
            this.f197921p = z12;
            this.f197922q = z13;
            this.f197923r = i12;
            this.f197924s = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f197923r | 1);
            androidx.compose.ui.v vVar = this.f197920o;
            n.b(this.f197917l, this.f197918m, this.f197919n, vVar, this.f197921p, this.f197922q, a12, iA2, this.f197924s);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(Y41.a aVar, androidx.compose.ui.v vVar, C22096n c22096n, Float f12, boolean z12, boolean z13, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-934198272);
        int i14 = i12 | (bE2.u(aVar) ? 4 : 2);
        if ((i12 & 112) == 0) {
            i14 |= bE2.B(vVar) ? 32 : 16;
        }
        int i15 = i14 | (bE2.u(c22096n) ? 256 : 128) | (bE2.B(f12) ? 2048 : 1024);
        if ((i12 & 57344) == 0) {
            i15 |= bE2.j(z12) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i16 = i15 | (bE2.j(z13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        if ((374491 & i16) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.component.navbar.u uVar = (com.akita.compose.component.navbar.u) bE2.o(com.akita.compose.component.navbar.v.f62301a);
            if (z12) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                i13 = com.akita.compose.theme.re23.e.f64237O3;
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                i13 = com.akita.compose.theme.re23.e.f64233O;
            }
            com.akita.compose.component.navbar.t.c(C22501m2.a(vVar, "mnz_nav_bar"), com.akita.compose.component.navbar.u.a(uVar, null, i13, 1791), aVar, 0, androidx.compose.runtime.internal.r.c(-1040384385, new o(c22096n, z13), bE2), androidx.compose.runtime.internal.r.c(-816853698, new q(f12, z13), bE2), bE2, 221184 | ((i16 << 6) & 896), 8);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r(aVar, vVar, c22096n, f12, z12, z13, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k Y41.a<G0> aVar, @Y61.l wZ.j jVar, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.l androidx.compose.ui.v vVar, boolean z12, boolean z13, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(-1089285095);
        androidx.compose.ui.v vVar2 = (i13 & 8) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        boolean z14 = (i13 & 16) != 0 ? true : z12;
        boolean z15 = (i13 & 32) != 0 ? true : z13;
        C49578b c49578b = jVar != null ? jVar.f441570b : null;
        bE2.C(-915861112);
        C22096n c22096nC = c49578b == null ? null : androidx.compose.runtime.internal.r.c(1626942132, new a(c49578b, lVar), bE2);
        bE2.X(false);
        a(aVar, vVar2, c22096nC, jVar != null ? jVar.f441569a : null, z14, z15, bE2, ((i12 >> 6) & 112) | (i12 & 57344));
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar, jVar, lVar, vVar2, z14, z15, i12, i13);
        }
    }
}
