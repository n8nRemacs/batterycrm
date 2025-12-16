package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_enable_banner;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
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
import com.akita.compose.component.list_item.m;
import com.avito.android.R;
import com.avito.android.profile_phones.phones_list.mvi.entity.IacEnableSwitchState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import u0.i;

/* compiled from: IacEnableSwitcherBanner.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* compiled from: IacEnableSwitcherBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f228213l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: IacEnableSwitcherBanner.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacEnableSwitchState f228214l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228215m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IacEnableSwitchState iacEnableSwitchState, Y41.a<G0> aVar) {
            super(2);
            this.f228214l = iacEnableSwitchState;
            this.f228215m = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v vVarD = C20588k2.d(v.f42878y1, 1.0f);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = n.c(a13, vVarD);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                K k12 = K.f28344a;
                String strC = i.c(a13, R.string.iac_enable_block_title);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.ui.p.b(strC, iVar.f65233d, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(12, null, a13, 6);
                com.akita.compose.foundation.ui.p.b(i.c(a13, R.string.iac_enable_block_desc), iVar.f65240k, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
                com.akita.compose.foundation.ui.g.a(10, null, a13, 6);
                m.d(i.c(a13, R.string.iac_enable_block_calls), com.akita.compose.theme.re23.b.m(a13).getF66432c(), null, null, null, androidx.compose.runtime.internal.r.c(2058691282, new e(this.f228214l, this.f228215m), a13), a13, 199680, 20);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacEnableSwitcherBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_enable_banner.c$c, reason: collision with other inner class name */
    public static final class C6937c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacEnableSwitchState f228216l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f228217m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228218n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f228219o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f228220p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6937c(IacEnableSwitchState iacEnableSwitchState, v vVar, Y41.a<G0> aVar, int i12, int i13) {
            super(2);
            this.f228216l = iacEnableSwitchState;
            this.f228217m = vVar;
            this.f228218n = aVar;
            this.f228219o = i12;
            this.f228220p = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f228219o | 1);
            IacEnableSwitchState iacEnableSwitchState = this.f228216l;
            c.a(iacEnableSwitchState, this.f228217m, this.f228218n, a12, iA2, this.f228220p);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k IacEnableSwitchState iacEnableSwitchState, @l v vVar, @l Y41.a<G0> aVar, @l A a12, int i12, int i13) {
        int i14;
        Y41.a<G0> aVar2;
        int i15;
        Y41.a<G0> aVar3;
        B bE2 = a12.E(1253453497);
        if ((i12 & 14) == 0) {
            i14 = i12 | (bE2.B(iacEnableSwitchState) ? 4 : 2);
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
        if ((i15 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            Y41.a<G0> aVar4 = i16 != 0 ? a.f228213l : aVar2;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.banner.g.c(com.akita.compose.theme.re23.b.b(bE2).getF66893c(), vVar, null, null, null, 0.0f, null, androidx.compose.runtime.internal.r.c(-651067911, new b(iacEnableSwitchState, aVar4), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 12582960, 124);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C6937c(iacEnableSwitchState, vVar, aVar3, i12, i13);
        }
    }
}
