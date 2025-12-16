package com.avito.android.wallet.history.mvi;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletHistoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.wallet.history.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36136a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36136a f327550a = new C36136a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f327551b = new C22096n(311864902, C10152a.f327555l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f327552c = new C22096n(497509159, b.f327556l, false);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C22096n f327553d = new C22096n(2055511375, c.f327557l, false);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C22096n f327554e = new C22096n(328939565, d.f327558l, false);

    /* compiled from: WalletHistoryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.history.mvi.a$a, reason: collision with other inner class name */
    public static final class C10152a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10152a f327555l = new C10152a();

        public C10152a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarO = C20588k2.o(androidx.compose.ui.v.f42878y1, 24);
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.ic_arrow_back, 0, a13);
                InterfaceC22374n.f40491a.getClass();
                C20806p1.a(eVarA, null, vVarO, null, InterfaceC22374n.a.f40498g, 0.0f, null, a13, 25016, 104);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletHistoryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.history.mvi.a$b */
    public static final class b extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f327556l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                K k12 = K.f28344a;
                a13.C(-1685065973);
                for (int i12 = 0; i12 < 10; i12++) {
                    G.b(a13, 0);
                }
                a13.h();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletHistoryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.history.mvi.a$c */
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f327557l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarO = C20588k2.o(androidx.compose.ui.v.f42878y1, 24);
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.ic_arrow_back, 0, a13);
                InterfaceC22374n.f40491a.getClass();
                C20806p1.a(eVarA, null, vVarO, null, InterfaceC22374n.a.f40498g, 0.0f, null, a13, 25016, 104);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletHistoryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.history.mvi.a$d */
    public static final class d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f327558l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarO = C20588k2.o(androidx.compose.ui.v.f42878y1, 24);
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.ic_arrow_back, 0, a13);
                InterfaceC22374n.f40491a.getClass();
                C20806p1.a(eVarA, null, vVarO, null, InterfaceC22374n.a.f40498g, 0.0f, null, a13, 25016, 104);
            }
            return G0.f406611a;
        }
    }
}
