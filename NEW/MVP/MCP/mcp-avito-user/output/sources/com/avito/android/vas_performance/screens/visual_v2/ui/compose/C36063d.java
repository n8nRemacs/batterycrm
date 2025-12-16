package com.avito.android.vas_performance.screens.visual_v2.ui.compose;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43207v;

/* compiled from: VisualVasV2Screen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_performance.screens.visual_v2.ui.compose.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36063d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36063d f321322a = new C36063d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f321323b = new C22096n(-1866299087, a.f321324l, false);

    /* compiled from: VisualVasV2Screen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.vas_performance.screens.visual_v2.ui.compose.d$a */
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f321324l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(aVar, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a);
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarB);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                RL0.c.f14352k.getClass();
                l.a(RL0.c.a(RL0.c.f14353l, false, null, null, null, null, false, 508), new C43207v(new RL0.b[0]), C36060a.f321319l, C36061b.f321320l, C36062c.f321321l, a13, 28104);
                a13.z();
            }
            return G0.f406611a;
        }
    }
}
