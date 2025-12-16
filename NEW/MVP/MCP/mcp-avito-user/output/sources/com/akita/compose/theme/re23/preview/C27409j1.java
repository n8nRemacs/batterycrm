package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: SelectorCardPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.j1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27409j1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C27409j1 f65716a = new C27409j1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f65717b = new C22096n(-567114894, a.f65718l, false);

    /* compiled from: SelectorCardPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.j1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20640y, androidx.compose.foundation.layout.T1, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f65718l = new a();

        public a() {
            super(4);
        }

        @Override // Y41.r
        public final kotlin.G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.foundation.layout.T1 t12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.foundation.layout.T1 t13 = t12;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 112) == 0) {
                iIntValue |= a13.B(t13) ? 32 : 16;
            }
            if ((iIntValue & 721) == 144 && a13.c()) {
                a13.f();
            } else {
                androidx.compose.ui.v vVarH = androidx.compose.foundation.layout.R1.h(androidx.compose.ui.v.f42878y1, t13);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                androidx.compose.runtime.O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarH);
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
                androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.ui.p.b("Заголовок", iVar.f65234e, null, false, 0L, null, 0, 0, false, null, a13, 6, 1020);
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(16, null, a13, 6);
                com.akita.compose.foundation.ui.p.b("Короткое описание того, что нужно знать пользователю", iVar.f65240k, null, false, 0L, null, 0, 0, false, null, a13, 6, 1020);
                a13.z();
            }
            return kotlin.G0.f406611a;
        }
    }
}
