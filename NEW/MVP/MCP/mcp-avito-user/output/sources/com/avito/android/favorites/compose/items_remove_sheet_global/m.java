package com.avito.android.favorites.compose.items_remove_sheet_global;

import Y41.p;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.t;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ItemsRemoveBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_favorites_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m {

    /* compiled from: ItemsRemoveBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ComposeView f156849l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f156850m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f156851n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f156852o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComposeView composeView, Y41.a<G0> aVar, com.avito.android.lib.design.bottom_sheet.d dVar, Y41.a<G0> aVar2) {
            super(2);
            this.f156849l = composeView;
            this.f156850m = aVar;
            this.f156851n = dVar;
            this.f156852o = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                this.f156849l.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
                com.akita.compose.theme.re23.c.a(false, r.c(-5884914, new l(this.f156850m, this.f156852o, this.f156851n), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(K k12, String str, t tVar, v.a aVar, Y41.a aVar2, A a12, int i12) {
        int i13;
        v.a aVar3;
        B bE2 = a12.E(1613671918);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(k12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(tVar) ? 256 : 128;
        }
        int i14 = i13 | 3072;
        if ((57344 & i12) == 0) {
            i14 |= bE2.u(aVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i14) == 9362 && bE2.c()) {
            bE2.f();
            aVar3 = aVar;
        } else {
            v.a aVar4 = v.f42878y1;
            v vVarD = C20588k2.d(aVar4, 1.0f);
            InterfaceC22215f.f39074a.getClass();
            aVar3 = aVar4;
            com.akita.compose.component.button.m.c(str, aVar2, tVar, k12.c(vVarD, InterfaceC22215f.a.f39089o), null, null, null, false, false, null, bE2, ((i14 >> 3) & 14) | ((i14 >> 9) & 112) | 512 | (i14 & 896), 1008);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.favorites.compose.items_remove_sheet_global.a(k12, str, tVar, aVar3, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(K k12, String str, com.akita.compose.foundation.r rVar, v.a aVar, A a12, int i12) {
        v.a aVar2;
        B bE2 = a12.E(863992477);
        int i13 = i12 | (bE2.B(str) ? 32 : 16) | (bE2.B(rVar) ? 256 : 128) | 3072;
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            v.a aVar3 = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
            long jC2 = X2.h.f18556d.c(bE2);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i14 = androidx.compose.ui.text.style.i.f42678e;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(6, 0.0f, 2, aVar3);
            InterfaceC22215f.f39074a.getClass();
            com.akita.compose.foundation.ui.p.b(str, rVar, k12.c(vVarK, InterfaceC22215f.a.f39089o), false, jC2, androidx.compose.ui.text.style.i.a(i14), 0, 0, false, null, bE2, (i13 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, 968);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(k12, str, rVar, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(Y41.a aVar, Y41.a aVar2, Y41.a aVar3, v.a aVar4, A a12, int i12) {
        int i13;
        v.a aVar5;
        B bE2 = a12.E(-89985705);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar3) ? 256 : 128;
        }
        int i14 = i13 | 3072;
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar5 = aVar4;
        } else {
            v.a aVar6 = v.f42878y1;
            h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(10, 0.0f, 2, aVar6);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar8 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar8);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            d((i14 >> 3) & 112, aVar3, bE2, k12.c(R1.m(aVar6, 0.0f, 0.0f, 12, 0.0f, 11), InterfaceC22215f.a.f39090p));
            com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
            String strC = u0.i.c(bE2, R.string.favorites_choose_items_to_delete);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            b(k12, strC, iVar.f65233d, null, bE2, 6);
            com.akita.compose.foundation.ui.g.a(4, null, bE2, 6);
            b(k12, u0.i.c(bE2, R.string.favorites_cant_restore_deleted), iVar.f65240k, null, bE2, 6);
            float f12 = 16;
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            a(k12, u0.i.c(bE2, R.string.remove_inactive), com.akita.compose.theme.re23.b.c(bE2).f2(), null, aVar2, bE2, 518 | ((i14 << 9) & 57344));
            com.akita.compose.foundation.ui.g.a(6, null, bE2, 6);
            a(k12, u0.i.c(bE2, R.string.remove_all), com.akita.compose.theme.re23.b.c(bE2).M(), null, aVar, bE2, 518 | ((i14 << 12) & 57344));
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            bE2.X(true);
            aVar5 = aVar6;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(aVar, aVar2, aVar3, aVar5, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(int i12, Y41.a aVar, A a12, v vVar) {
        int i13;
        B bE2 = a12.E(-1927961148);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            v vVarC = C21086w0.c(vVar, false, null, null, aVar, 7);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64237O3, 0, bE2), null, vVarC, null, bE2, 56, 8);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(i12, aVar, vVar);
        }
    }

    public static final void e(@Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k com.avito.android.lib.design.bottom_sheet.d dVar) {
        ComposeView composeView = new ComposeView(dVar.getContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(-932214925, new a(composeView, aVar, dVar, aVar2), true));
        dVar.setContentView(composeView);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
    }
}
