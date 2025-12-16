package com.avito.android.mortgage.person_form.suggestion;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: SuggestionScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroid/text/TextWatcher;", "textWatcher", "_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u {

    /* compiled from: SuggestionScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f201499l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ H00.c f201500m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f201501n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar, H00.c cVar, Y41.a<G0> aVar2) {
            super(2);
            this.f201499l = (N) aVar;
            this.f201500m = cVar;
            this.f201501n = (N) aVar2;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r7v4, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
                float f12 = 48;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarF = C20588k2.f(vVarD, f12);
                C20585k.f28659a.getClass();
                C20585k.h hVar = C20585k.f28666h;
                InterfaceC22215f.f39074a.getClass();
                C20568f2 c20568f2A = C20563e2.a(hVar, InterfaceC22215f.a.f39086l, a13, 54);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarF);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20576h2 c20576h2 = C20576h2.f28641a;
                com.avito.android.mortgage.widgets.b.a(C35835l0.j(R.attr.ic_arrowBack24, (Context) a13.o(AndroidCompositionLocals_androidKt.f41069b)), this.f201499l, C20588k2.o(aVar, f12), InterfaceC22215f.a.f39079e, false, null, a13, 3456, 48);
                String str = this.f201500m.f6915c;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.r rVar = iVar.f65239j;
                androidx.compose.ui.text.style.i.f42675b.getClass();
                int i12 = androidx.compose.ui.text.style.i.f42678e;
                androidx.compose.ui.text.style.s.f42720b.getClass();
                int i13 = androidx.compose.ui.text.style.s.f42722d;
                com.akita.compose.foundation.ui.p.b(str, rVar, c20576h2.a(aVar, 1.0f, true), false, 0L, androidx.compose.ui.text.style.i.a(i12), 0, i13, false, null, a13, 12582912, 856);
                String strC = u0.i.c(a13, R.string.reset_string);
                long jC2 = com.akita.compose.theme.re23.b.f63984b.f63837D.c(a13);
                a13.C(380480152);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = androidx.compose.foundation.interaction.l.a();
                    a13.H(objT);
                }
                a13.h();
                com.akita.compose.foundation.ui.p.b(strC, iVar.f65241l, C21086w0.b(aVar, (androidx.compose.foundation.interaction.m) objT, null, false, null, this.f201501n, 28), false, jC2, null, 0, i13, false, null, a13, 12582912, 872);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestionScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f201502l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ H00.c f201503m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f201504n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f201505o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ N f201506p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super String, G0> lVar, H00.c cVar, Y41.a<G0> aVar, Y41.l<? super SuggestionContainer<? extends Suggestion>, G0> lVar2, Y41.a<G0> aVar2) {
            super(3);
            this.f201502l = (N) lVar;
            this.f201503m = cVar;
            this.f201504n = (N) aVar;
            this.f201505o = (N) lVar2;
            this.f201506p = (N) aVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1, types: [Y41.a, java.lang.Object, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v4, types: [Y41.l, java.lang.Object, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v8, types: [Y41.l, java.lang.Object, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r6v3, types: [Y41.a, java.lang.Object, kotlin.jvm.internal.N] */
        @Override // Y41.q
        public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, fillElement);
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
                Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
                R3.b(pVar, a13, iA2);
                Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
                R3.b(pVar2, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
                }
                Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
                R3.b(pVar4, a13, vVarC);
                K k12 = K.f28344a;
                a13.C(380488032);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                Object obj = A.a.f37868b;
                if (objT == obj) {
                    objT = C22126m3.g(null);
                    a13.H(objT);
                }
                InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
                a13.h();
                androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarK = R1.k(0.0f, 24, 1, vVarD);
                a13.C(380495667);
                ?? r52 = this.f201502l;
                boolean zB2 = a13.B(r52);
                H00.c cVar = this.f201503m;
                boolean zB3 = zB2 | a13.B(cVar);
                ?? r13 = this.f201504n;
                boolean zB4 = zB3 | a13.B(r13);
                Object objT2 = a13.t();
                if (zB4 || objT2 == obj) {
                    objT2 = new w(cVar, r52, interfaceC22204y1, r13);
                    a13.H(objT2);
                }
                Y41.l lVar2 = (Y41.l) objT2;
                a13.h();
                a13.C(380517806);
                boolean zB5 = a13.B(cVar);
                Object objT3 = a13.t();
                if (zB5 || objT3 == obj) {
                    objT3 = new x(cVar, interfaceC22204y1);
                    a13.H(objT3);
                }
                a13.h();
                androidx.compose.ui.viewinterop.d.b(lVar2, vVarK, (Y41.l) objT3, a13, 48, 0);
                if (cVar.f6922j) {
                    a13.C(-1088429912);
                    for (int i12 = 0; i12 < 5; i12++) {
                        u.d(null, a13, 0);
                    }
                    a13.h();
                } else {
                    a13.C(-1088262171);
                    com.avito.android.analytics.screens.mvi.r perfTrackerParams = cVar.getPerfTrackerParams();
                    a13.C(-976608008);
                    a13.C(2063036140);
                    boolean zBooleanValue = ((Boolean) a13.o(C22543x1.f41638a)).booleanValue();
                    ?? r53 = this.f201505o;
                    ?? r62 = this.f201506p;
                    if (zBooleanValue) {
                        a13.C(421109671);
                        a13.C(1478711134);
                        boolean zB6 = a13.B(cVar) | a13.B(r53) | a13.B(r62);
                        Object objT4 = a13.t();
                        if (zB6 || objT4 == obj) {
                            objT4 = new F(cVar, r53, r62);
                            a13.H(objT4);
                        }
                        a13.h();
                        C20650b.a(fillElement, null, null, false, null, null, null, false, null, (Y41.l) objT4, a13, 6, 510);
                        a13.h();
                    } else {
                        a13.C(420357239);
                        com.avito.android.analytics.screens.compose.a aVar4 = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                        if (perfTrackerParams != null) {
                            aVar4.m(perfTrackerParams.f90666a);
                        }
                        aVar4.l();
                        androidx.compose.ui.v vVarD2 = androidx.compose.ui.draw.o.d(aVar, new G(perfTrackerParams, aVar4));
                        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                        int f37888q2 = a13.getF37888Q();
                        O1 o1Y2 = a13.y();
                        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarD2);
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
                        R3.b(pVar, a13, interfaceC22365i0D);
                        R3.b(pVar2, a13, o1Y2);
                        if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                            androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
                        }
                        R3.b(pVar4, a13, vVarC2);
                        C20644z c20644z = C20644z.f28804a;
                        a13.C(1478711134);
                        boolean zB7 = a13.B(cVar) | a13.B(r53) | a13.B(r62);
                        Object objT5 = a13.t();
                        if (zB7 || objT5 == obj) {
                            objT5 = new F(cVar, r53, r62);
                            a13.H(objT5);
                        }
                        a13.h();
                        C20650b.a(fillElement, null, null, false, null, null, null, false, null, (Y41.l) objT5, a13, 6, 510);
                        a13.z();
                        a13.h();
                    }
                    com.avito.android.authorization.auto_recovery.phone_confirm.b.m(a13);
                }
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestionScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ H00.c f201507l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f201508m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f201509n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f201510o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ N f201511p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ N f201512q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f201513r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(H00.c cVar, Y41.l<? super String, G0> lVar, Y41.l<? super SuggestionContainer<? extends Suggestion>, G0> lVar2, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, int i12) {
            super(2);
            this.f201507l = cVar;
            this.f201508m = (N) lVar;
            this.f201509n = (N) lVar2;
            this.f201510o = (N) aVar;
            this.f201511p = (N) aVar2;
            this.f201512q = (N) aVar3;
            this.f201513r = i12;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f201513r | 1);
            ?? r42 = this.f201511p;
            ?? r52 = this.f201512q;
            ?? r12 = this.f201508m;
            ?? r22 = this.f201509n;
            ?? r32 = this.f201510o;
            u.a(this.f201507l, r12, r22, r32, r42, r52, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @SuppressLint({"ComposeAndroidView"})
    @InterfaceC22181t
    public static final void a(@Y61.k H00.c cVar, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.l<? super SuggestionContainer<? extends Suggestion>, G0> lVar2, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(264956446);
        int i13 = (bE2.B(cVar) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(aVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(aVar3) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i13 & 374491) == 74898 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar4.getClass();
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.component.scaffold.g.a(R1.k(16, 0.0f, 2, fillElement), androidx.compose.runtime.internal.r.c(-2033466918, new a(aVar2, cVar, aVar3), bE2), null, null, null, null, null, androidx.compose.runtime.internal.r.c(1436251441, new b(lVar, cVar, aVar2, lVar2, aVar), bE2), b12, 12582966, 124);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(cVar, lVar, lVar2, aVar, aVar2, aVar3, i12);
        }
    }

    public static final void b(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-236765459);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(6);
            androidx.compose.ui.v vVarH = C20588k2.h(40, 0.0f, 2, C20588k2.d(vVar, 1.0f));
            C20568f2 c20568f2A = C20563e2.a(jVarG, bVar, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarH);
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
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.foundation.ui.e.a(u0.e.a(C35835l0.j(R.attr.ic_plus20, (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)), 0, bE2), null, null, null, bE2, 56, 12);
            String strC = u0.i.c(bE2, R.string.fill_by_hands);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65241l, c20576h2.a(androidx.compose.ui.v.f42878y1, 1.0f, true), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r31, java.lang.String r32, androidx.compose.ui.v r33, androidx.compose.runtime.A r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.suggestion.u.c(java.lang.String, java.lang.String, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }

    public static final void d(v.a aVar, androidx.compose.runtime.A a12, int i12) {
        v.a aVar2;
        androidx.compose.runtime.B bE2 = a12.E(-1667471397);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar3, 1.0f);
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarH = C20588k2.h(40, 0.0f, 2, vVarD);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarH);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar5);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
            androidx.compose.ui.v vVarD2 = c20644z.d(C20588k2.t(aVar3, 200), InterfaceC22215f.a.f39079e);
            int i14 = com.google.accompanist.placeholder.c.f342887a;
            com.akita.compose.foundation.ui.p.b("", rVar, com.google.accompanist.placeholder.material.e.a(vVarD2, com.akita.compose.theme.re23.b.f63984b.f63842E1.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52), false, 0L, null, 0, 0, false, null, bE2, 6, 1016);
            bE2.X(true);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new t(aVar2, i12);
        }
    }
}
