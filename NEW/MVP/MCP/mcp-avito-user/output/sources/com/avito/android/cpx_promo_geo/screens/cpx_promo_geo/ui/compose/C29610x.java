package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose;

import androidx.compose.foundation.layout.C20544a3;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ts.C48709c;

/* compiled from: CpxPromoGeoScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29610x extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c f128241l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f128242m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f128243n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29610x(C48709c c48709c, boolean z12, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f128241l = c48709c;
        this.f128242m = z12;
        this.f128243n = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C48709c c48709c = this.f128241l;
            if (c48709c.f439507p != null && c48709c.f439495d == null && !c48709c.f439493b && !this.f128242m) {
                androidx.compose.ui.v vVarA = androidx.compose.ui.n.a(androidx.compose.ui.v.f42878y1, C22535v1.f41625a, new C20544a3());
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarA);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.avito.android.mnz_common.compose.D.a(R1.a(10), null, 0, androidx.compose.runtime.internal.r.c(-184519744, new C29609w(c48709c, this.f128243n), a13), a13, 3078, 6);
                a13.z();
            }
        }
        return G0.f406611a;
    }
}
