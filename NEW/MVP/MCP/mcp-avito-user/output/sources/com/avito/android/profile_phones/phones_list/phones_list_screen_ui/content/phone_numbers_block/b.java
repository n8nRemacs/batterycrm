package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block;

import Y41.p;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
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
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.list_item.s;
import com.akita.compose.foundation.ui.o;
import com.avito.android.R;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.profile_phones.phones_list.mvi.O;
import com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: PhoneNumbersBlock.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final NumbersListState.Loaded f228244a = new NumbersListState.Loaded(C42745f0.U(new PhoneListItem("", "+7 999 222 11 33", "15 объявлений", PhoneListItem.Status.f228141c, null, "Не используется", Collections.singletonList(new PhoneListItem.Action("detraxit", false, new NoMatchLink())), 0, false, true, false), new PhoneListItem("", "+7 998 123 45 65", "", PhoneListItem.Status.f228142d, null, "Текст ошибки, цвет зависит от status", C42784z0.f406748b, 0, false, false, false)), true, false);

    /* compiled from: PhoneNumbersBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f228245l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneNumbersBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.b$b, reason: collision with other inner class name */
    public static final class C6940b extends N implements Y41.l<PhoneListItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6940b f228246l = new C6940b();

        public C6940b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(PhoneListItem phoneListItem) {
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneNumbersBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f228247l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneNumbersBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f228248l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneNumbersBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ NumbersListState f228249l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f228250m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228251n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<PhoneListItem, G0> f228252o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228253p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228254q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f228255r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f228256s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(NumbersListState numbersListState, v vVar, Y41.a<G0> aVar, Y41.l<? super PhoneListItem, G0> lVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, int i12, int i13) {
            super(2);
            this.f228249l = numbersListState;
            this.f228250m = vVar;
            this.f228251n = aVar;
            this.f228252o = lVar;
            this.f228253p = aVar2;
            this.f228254q = aVar3;
            this.f228255r = i12;
            this.f228256s = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f228255r | 1);
            Y41.l<PhoneListItem, G0> lVar = this.f228252o;
            b.a(this.f228249l, this.f228250m, this.f228251n, lVar, this.f228253p, this.f228254q, a12, iA2, this.f228256s);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k NumbersListState numbersListState, @Y61.l v vVar, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.l<? super PhoneListItem, G0> lVar, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l A a12, int i12, int i13) {
        int i14;
        Y41.a<G0> aVar4;
        int i15;
        Y41.l<? super PhoneListItem, G0> lVar2;
        int i16;
        Y41.a<G0> aVar5;
        int i17;
        Y41.a<G0> aVar6;
        int i18;
        B bE2 = a12.E(18663095);
        if ((i12 & 14) == 0) {
            i14 = i12 | (bE2.B(numbersListState) ? 4 : 2);
        } else {
            i14 = i12;
        }
        int i19 = i13 & 4;
        if (i19 != 0) {
            i15 = i14 | 384;
            aVar4 = aVar;
        } else {
            aVar4 = aVar;
            i15 = i14 | (bE2.u(aVar4) ? 256 : 128);
        }
        int i22 = i13 & 8;
        if (i22 != 0) {
            i16 = i15 | 3072;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            i16 = i15 | (bE2.u(lVar2) ? 2048 : 1024);
        }
        int i23 = i13 & 16;
        if (i23 != 0) {
            i17 = i16 | 24576;
            aVar5 = aVar2;
        } else {
            aVar5 = aVar2;
            i17 = i16 | (bE2.u(aVar5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        }
        int i24 = i13 & 32;
        if (i24 != 0) {
            i18 = i17 | 196608;
            aVar6 = aVar3;
        } else {
            aVar6 = aVar3;
            i18 = i17 | (bE2.u(aVar6) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        }
        if ((374491 & i18) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            Y41.a<G0> aVar7 = i19 != 0 ? a.f228245l : aVar4;
            if (i22 != 0) {
                lVar2 = C6940b.f228246l;
            }
            if (i23 != 0) {
                aVar5 = c.f228247l;
            }
            if (i24 != 0) {
                aVar6 = d.f228248l;
            }
            v vVarD = C20588k2.d(vVar, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.l lVar3 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar3, InterfaceC22215f.a.f39088n, bE2, 0);
            int i25 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
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
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i25))) {
                AK.c.y(i25, bE2, i25, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            int i26 = i18 >> 3;
            int i27 = (i26 & 112) | 6;
            d(k12, aVar7, bE2, i27);
            if (numbersListState instanceof NumbersListState.Default) {
                bE2.C(1229022607);
                bE2.X(false);
            } else if (numbersListState instanceof NumbersListState.EmptyNumbers) {
                bE2.C(1229116940);
                h.a aVar9 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(14, null, bE2, 6);
                b(k12, aVar7, bE2, i27);
                bE2.X(false);
            } else if (numbersListState instanceof NumbersListState.Error) {
                bE2.C(1229268871);
                h.a aVar10 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(14, null, bE2, 6);
                c(k12, aVar5, bE2, ((i18 >> 9) & 112) | 6);
                bE2.X(false);
            } else if (numbersListState instanceof NumbersListState.Loaded) {
                bE2.C(1229429761);
                h.a aVar11 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(14, null, bE2, 6);
                NumbersListState.Loaded loaded = (NumbersListState.Loaded) numbersListState;
                f(k12, loaded, lVar2, bE2, (i26 & 896) | 6);
                e(k12, loaded, aVar6, bE2, ((i18 >> 9) & 896) | 6);
                bE2.X(false);
            } else {
                bE2.C(1229648218);
                bE2.X(false);
            }
            bE2.X(true);
            aVar4 = aVar7;
        }
        Y41.l<? super PhoneListItem, G0> lVar4 = lVar2;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(numbersListState, vVar, aVar4, lVar4, aVar5, aVar6, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(K k12, Y41.a aVar, A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(1728227010);
        if ((i12 & 112) == 0) {
            i13 = (bE2.u(aVar) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 81) == 16 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            String strC = u0.i.c(bE2, R.string.settings_phones_empty);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i14 = androidx.compose.ui.text.style.i.f42680g;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65240k, null, false, 0L, androidx.compose.ui.text.style.i.a(i14), 0, 0, false, null, bE2, 0, 988);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
            b12 = bE2;
            com.akita.compose.component.button.m.c(u0.i.c(bE2, R.string.settings_phones_add_phone), aVar, com.akita.compose.theme.re23.b.c(bE2).v1(), v.f42878y1, null, null, null, false, false, null, bE2, (i13 & 112) | 3584, 1008);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.c(k12, aVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(K k12, Y41.a aVar, A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(-1544944899);
        if ((i12 & 112) == 0) {
            i13 = (bE2.u(aVar) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 81) == 16 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            String strC = u0.i.c(bE2, R.string.numbers_phones_error);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i14 = androidx.compose.ui.text.style.i.f42680g;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65240k, null, false, 0L, androidx.compose.ui.text.style.i.a(i14), 0, 0, false, null, bE2, 0, 988);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
            b12 = bE2;
            com.akita.compose.component.button.m.c(u0.i.c(bE2, R.string.settings_phones_refresh), aVar, com.akita.compose.theme.re23.b.c(bE2).v1(), v.f42878y1, null, null, null, false, false, null, bE2, (i13 & 112) | 3584, 1008);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.d(k12, aVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(K k12, Y41.a aVar, A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(371041818);
        if ((i12 & 112) == 0) {
            i13 = (bE2.u(aVar) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 81) == 16 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar2 = v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, aVar2);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            String strC = u0.i.c(bE2, R.string.numbers_and_calls_phone_title);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i15 = androidx.compose.ui.text.style.i.f42680g;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65234e, null, false, 0L, androidx.compose.ui.text.style.i.a(i15), 0, 0, false, null, bE2, 0, 988);
            C20608p2.a(bE2, c20576h2.a(aVar2, 1.0f, true));
            v vVarC2 = c20576h2.c(aVar2, InterfaceC22215f.a.f39086l);
            bE2.C(530677705);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            bE2.X(false);
            v vVarO = C20588k2.o(C21086w0.b(vVarC2, (androidx.compose.foundation.interaction.m) objT, com.akita.compose.foundation.n.d(0.0f, 6, 0L, false), true, null, aVar, 24), 24);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64630l, 0, bE2);
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.e.b(56, 0, X2.h.f18556d.c(bE2), bE2, vVarO, eVarA, null);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.e(k12, aVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(androidx.compose.foundation.layout.K r19, com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState.Loaded r20, Y41.a r21, androidx.compose.runtime.A r22, int r23) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.b.e(androidx.compose.foundation.layout.K, com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState$Loaded, Y41.a, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(K k12, NumbersListState.Loaded loaded, Y41.l lVar, A a12, int i12) {
        B bE2 = a12.E(615666010);
        int i13 = (i12 & 112) == 0 ? (bE2.B(loaded) ? 32 : 16) | i12 : i12;
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar) ? 256 : 128;
        }
        if ((i13 & 721) == 144 && bE2.c()) {
            bE2.f();
        } else {
            boolean z12 = loaded.f227981c;
            List<PhoneListItem> listE0 = loaded.f227980b;
            if (z12 && !loaded.f227982d) {
                listE0 = C42745f0.E0(listE0, O.f227945d);
            }
            for (PhoneListItem phoneListItem : listE0) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                s f66432c = com.akita.compose.theme.re23.b.m(bE2).getF66432c();
                bE2.C(-1931269583);
                C22602e.b bVar = new C22602e.b(0, 1, null);
                bVar.f(phoneListItem.f228127c);
                bE2.C(-1931266962);
                if (phoneListItem.f228135k) {
                    bVar.f(" ");
                    com.akita.compose.theme.re23.b.f63986d.getClass();
                    o.c(bVar, com.akita.compose.theme.re23.g.f65189u0, com.akita.compose.theme.re23.b.f63988f.f65240k, com.akita.compose.theme.re23.b.f63984b.f63945n0.c(bE2));
                }
                bE2.X(false);
                C22602e c22602eM = bVar.m();
                bE2.X(false);
                com.akita.compose.component.list_item.m.b(c22602eM, f66432c, null, r.c(-1253732041, new h(phoneListItem), bE2), null, r.c(-166772491, new j(lVar, phoneListItem), bE2), bE2, 199680, 20);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(k12, loaded, lVar, i12);
        }
    }
}
