package com.akita.compose.component.date_picker.ui;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.InterfaceC20834q1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.M1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DayItem.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f61317l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20834q1 f61318m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f61319n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61320o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f61321p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.r f61322q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f61323r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f61324s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f61325t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f61326u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.compose.foundation.interaction.m mVar, InterfaceC20834q1 interfaceC20834q1, boolean z12, Y41.a<G0> aVar, String str, com.akita.compose.foundation.r rVar, com.akita.compose.foundation.p pVar, boolean z13, com.akita.compose.foundation.p pVar2, float f12) {
        super(2);
        this.f61317l = mVar;
        this.f61318m = interfaceC20834q1;
        this.f61319n = z12;
        this.f61320o = aVar;
        this.f61321p = str;
        this.f61322q = rVar;
        this.f61323r = pVar;
        this.f61324s = z13;
        this.f61325t = pVar2;
        this.f61326u = f12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13;
        com.akita.compose.foundation.p pVar;
        A a14 = a12;
        if ((num.intValue() & 11) == 2 && a14.c()) {
            a14.f();
        } else {
            v.a aVar = v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.d0(fillElement);
            C20632w.a(C21086w0.b(fillElement, this.f61317l, this.f61318m, this.f61319n, null, this.f61320o, 24), a14, 0);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int f37888q = a14.getF37888Q();
            O1 o1Y = a14.y();
            v vVarC = androidx.compose.ui.n.c(a14, fillElement);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (a14.F() == null) {
                C22190v.b();
                throw null;
            }
            a14.A();
            if (a14.getF37887P()) {
                a14.b(aVar2);
            } else {
                a14.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a14, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, a14, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
            if (a14.getF37887P() || !L.f(a14.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a14, f37888q, pVar2);
            }
            R3.b(InterfaceC22413h.a.f40793d, a14, vVarC);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.foundation.ui.p.b(this.f61321p, this.f61322q, null, false, this.f61323r.c(a14), null, 0, 0, false, null, a14, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            if (!this.f61324s || (pVar = this.f61325t) == null) {
                a13 = a14;
            } else {
                float f12 = this.f61326u * 2;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                v vVarC2 = M1.c(0.0f, 13, 1, C20588k2.o(aVar, f12));
                a13 = a14;
                C20632w.a(androidx.compose.foundation.A.b(vVarC2, pVar.c(a13), androidx.compose.foundation.shape.o.f30153a), a13, 0);
            }
            a13.z();
        }
        return G0.f406611a;
    }
}
