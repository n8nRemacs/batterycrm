package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.schedule_settings_block;

import AK.c;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
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

/* compiled from: ScheduleSettingsBlock.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* compiled from: ScheduleSettingsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f228284l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: ScheduleSettingsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.schedule_settings_block.b$b, reason: collision with other inner class name */
    public static final class C6941b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f228285l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f228286m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228287n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f228288o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f228289p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6941b(int i12, int i13, Y41.a aVar, v vVar, String str) {
            super(2);
            this.f228285l = str;
            this.f228286m = vVar;
            this.f228287n = aVar;
            this.f228288o = i12;
            this.f228289p = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f228288o | 1);
            String str = this.f228285l;
            int i12 = this.f228289p;
            b.a(iA2, i12, this.f228287n, a12, this.f228286m, str);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, int i13, @l Y41.a aVar, @l A a12, @l v vVar, @k String str) {
        int i14;
        Y41.a aVar2;
        int i15;
        Y41.a aVar3;
        B bE2 = a12.E(-1082548676);
        if ((i12 & 14) == 0) {
            i14 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i14 = i12;
        }
        int i16 = i13 & 4;
        if (i16 != 0) {
            i15 = i14 | 384;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i15 = i14 | (bE2.u(aVar2) ? 256 : 128);
        }
        int i17 = i15;
        if ((i17 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            Y41.a aVar4 = i16 != 0 ? a.f228284l : aVar2;
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
            String strC = i.c(bE2, R.string.numbers_and_calls_schedule_title);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i19 = androidx.compose.ui.text.style.i.f42680g;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65239j, null, false, 0L, androidx.compose.ui.text.style.i.a(i19), 0, 0, false, null, bE2, 0, 988);
            h.a aVar6 = h.f42849c;
            g.a(12, null, bE2, 6);
            e.a(str, aVar4, ((C) bE2.o(F.f66084b)).getF66921c(), null, i.c(bE2, R.string.numbers_and_calls_schedule_option), false, null, bE2, (i17 & 14) | ((i17 >> 3) & 112), 232);
            bE2.X(true);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C6941b(i12, i13, aVar3, vVar, str);
        }
    }
}
