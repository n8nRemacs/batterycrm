package com.avito.android.services_portfolio.project.components;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
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
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.pull_to_refresh.j;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ErrorState.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_services-portfolio_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: ErrorState.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.services_portfolio.project.components.a$a, reason: collision with other inner class name */
    public static final class C8330a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Drawable f280153l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f280154m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f280155n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8330a(Drawable drawable, String str, String str2) {
            super(2);
            this.f280153l = drawable;
            this.f280154m = str;
            this.f280155n = str2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                v vVarB = a2.b(R1.k(16, 0.0f, 2, aVar).d0(C20588k2.f28682c), a2.a(a13), true, true);
                C20585k.f28659a.getClass();
                C20585k.c cVar = C20585k.f28664f;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(cVar, InterfaceC22215f.a.f39089o, a13, 54);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = n.c(a13, vVarB);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                K k12 = K.f28344a;
                coil.compose.v.b(this.f280153l, null, null, null, null, null, a13, 56, 4092);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.ui.p.b(this.f280154m, iVar.f65233d, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
                androidx.compose.ui.text.style.i.f42675b.getClass();
                com.akita.compose.foundation.ui.p.b(this.f280155n, iVar.f65241l, null, false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, a13, 0, 988);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ErrorState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f280156l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f280157m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f280158n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f280159o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(j jVar, boolean z12, Y41.a<G0> aVar, boolean z13, int i12) {
            super(2);
            this.f280156l = jVar;
            this.f280157m = z12;
            this.f280158n = (N) aVar;
            this.f280159o = z13;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            ?? r22 = this.f280158n;
            a.a(this.f280156l, this.f280157m, r22, this.f280159o, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k j jVar, boolean z12, @k Y41.a<G0> aVar, boolean z13, @l A a12, int i12) {
        B bE2 = a12.E(452801663);
        int i13 = i12 | (bE2.j(z12) ? 32 : 16) | (bE2.u(aVar) ? 256 : 128) | (bE2.j(z13) ? 2048 : 1024);
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            Resources resources = ((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)).getResources();
            com.akita.compose.component.pull_to_refresh.i.b(jVar, z12, aVar, v.f42878y1, null, null, androidx.compose.runtime.internal.r.c(1172225065, new C8330a(z13 ? resources.getDrawable(R.drawable.no_internet) : resources.getDrawable(R.drawable.something_wrong_error), resources.getString(z13 ? R.string.services_portfolio_no_internet_error_title : R.string.services_portfolio_something_wrong_error_title), resources.getString(z13 ? R.string.services_portfolio_no_internet_error_description : R.string.services_portfolio_something_wrong_error_description)), bE2), bE2, (i13 & 112) | 1575944 | (i13 & 896), 48);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(jVar, z12, aVar, z13, i12);
        }
    }
}
