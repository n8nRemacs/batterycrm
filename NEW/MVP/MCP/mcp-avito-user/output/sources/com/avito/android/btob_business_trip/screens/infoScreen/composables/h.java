package com.avito.android.btob_business_trip.screens.infoScreen.composables;

import Y41.q;
import androidx.appcompat.app.r;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.theme.re23.style.C27547l0;
import com.akita.compose.theme.re23.style.InterfaceC27532i0;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ErrorScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_btob-business-trip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* compiled from: ErrorScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f107936l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(2);
            this.f107936l = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                v vVarD = C20588k2.d(aVar, 1.0f);
                C20585k.f28659a.getClass();
                C20585k.d dVar = C20585k.f28661c;
                InterfaceC22215f.f39074a.getClass();
                C20568f2 c20568f2A = C20563e2.a(dVar, InterfaceC22215f.a.f39085k, a13, 6);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = androidx.compose.ui.n.c(a13, vVarD);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20576h2 c20576h2 = C20576h2.f28641a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64237O3, 0, a13);
                com.akita.compose.foundation.p pVar2 = com.akita.compose.theme.re23.b.f63984b.f63938l;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.e.a(eVarA, null, C21086w0.c(R1.i(aVar, 8), false, null, null, this.f107936l, 7), pVar2, a13, 56, 0);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ErrorScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements q<T1, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f107937l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f107938m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Y41.a<G0> aVar) {
            super(3);
            this.f107937l = str;
            this.f107938m = aVar;
        }

        @Override // Y41.q
        public final G0 invoke(T1 t12, A a12, Integer num) {
            T1 t13 = t12;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(t13) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.d0(fillElement);
                v vVarH = R1.h(fillElement, t13);
                String strC = u0.i.c(a13, R.string.error_layout_unknown_error);
                String strC2 = u0.i.c(a13, R.string.error_layout_refresh);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.content_placeholder.d dVarA = com.akita.compose.component.content_placeholder.d.a(((InterfaceC27532i0) a13.o(C27547l0.f66667b)).getF66097a(), null, 0.0f, null, com.akita.compose.theme.re23.b.c(a13).M(), 16127);
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.content_placeholder.b.c(R.drawable.placeholders_img_unknown_error, strC, this.f107937l, strC2, this.f107938m, vVarH, dVarA, androidx.compose.ui.unit.i.a((float) 129.6d, (float) 178.2d), null, null, false, false, a13, (com.akita.compose.component.content_placeholder.d.f61096o << 18) | 12582912, 0, 3840);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ErrorScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f107939l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f107940m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f107941n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f107942o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f107943p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f107944q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a<G0> aVar, Y41.a<G0> aVar2, v vVar, String str, int i12, int i13) {
            super(2);
            this.f107939l = aVar;
            this.f107940m = aVar2;
            this.f107941n = vVar;
            this.f107942o = str;
            this.f107943p = i12;
            this.f107944q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f107943p | 1);
            Y41.a<G0> aVar = this.f107940m;
            h.a(this.f107939l, aVar, this.f107941n, this.f107942o, a12, iA2, this.f107944q);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.a<kotlin.G0> r17, @Y61.k Y41.a<kotlin.G0> r18, @Y61.l androidx.compose.ui.v r19, @Y61.l java.lang.String r20, @Y61.l androidx.compose.runtime.A r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.infoScreen.composables.h.a(Y41.a, Y41.a, androidx.compose.ui.v, java.lang.String, androidx.compose.runtime.A, int, int):void");
    }
}
