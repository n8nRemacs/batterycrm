package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.time_settings_block;

import AK.c;
import Y41.p;
import Y61.k;
import Y61.l;
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
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.base_select.e;
import com.akita.compose.foundation.ui.g;
import com.akita.compose.theme.re23.style.C;
import com.akita.compose.theme.re23.style.F;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import u0.i;

/* compiled from: TimeSettingsBlock.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* compiled from: TimeSettingsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f228291l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: TimeSettingsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.time_settings_block.b$b, reason: collision with other inner class name */
    public static final class C6942b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f228292l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f228293m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f228294n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228295o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f228296p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f228297q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6942b(String str, boolean z12, v vVar, Y41.a<G0> aVar, int i12, int i13) {
            super(2);
            this.f228292l = str;
            this.f228293m = z12;
            this.f228294n = vVar;
            this.f228295o = aVar;
            this.f228296p = i12;
            this.f228297q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f228296p | 1);
            boolean z12 = this.f228293m;
            b.a(this.f228292l, z12, this.f228294n, this.f228295o, a12, iA2, this.f228297q);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k String str, boolean z12, @l v vVar, @l Y41.a<G0> aVar, @l A a12, int i12, int i13) {
        int i14;
        Y41.a<G0> aVar2;
        int i15;
        Y41.a<G0> aVar3;
        B bE2 = a12.E(668469290);
        if ((i12 & 14) == 0) {
            i14 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.j(z12) ? 32 : 16;
        }
        int i16 = i13 & 8;
        if (i16 != 0) {
            i15 = i14 | 3072;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i15 = i14 | (bE2.u(aVar2) ? 2048 : 1024);
        }
        int i17 = i15;
        if ((i17 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            Y41.a<G0> aVar4 = i16 != 0 ? a.f228291l : aVar2;
            v vVarD = C20588k2.d(vVar, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i18 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarD);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                c.y(i18, bE2, i18, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            String strC = i.c(bE2, R.string.numbers_and_calls_when_calls_accept);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i19 = androidx.compose.ui.text.style.i.f42680g;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65234e, null, false, 0L, androidx.compose.ui.text.style.i.a(i19), 0, 0, false, null, bE2, 0, 988);
            float f12 = 16;
            h.a aVar6 = h.f42849c;
            g.a(f12, null, bE2, 6);
            e.a(str, aVar4, ((C) bE2.o(F.f66084b)).getF66920b(), R1.m(v.f42878y1, 0.0f, f12, 0.0f, 0.0f, 13), i.c(bE2, R.string.iac_picker_any_time), false, null, bE2, (i17 & 14) | 3072 | ((i17 >> 6) & 112), 224);
            bE2.C(-1772719050);
            if (z12) {
                g.a(6, null, bE2, 6);
                com.akita.compose.foundation.ui.p.b(i.c(bE2, R.string.iac_settings_time_hint), iVar.f65244o, null, false, 0L, androidx.compose.ui.text.style.i.a(i19), 0, 0, false, null, bE2, 0, 988);
            }
            bE2.X(false);
            bE2.X(true);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C6942b(str, z12, vVar, aVar3, i12, i13);
        }
    }
}
