package com.avito.android.comfortable_deal.client_room;

import androidx.compose.animation.C20340d0;
import androidx.compose.animation.InterfaceC20343e0;
import androidx.compose.animation.core.C20283h;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import com.avito.android.remote.model.Image;
import fp.C40460a;
import fp.C40461b;
import fp.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ClientRoomScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t {

    /* compiled from: ClientRoomScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f120036l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120037m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f120036l = interfaceC22204y1;
            this.f120037m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f120036l;
            interfaceC22204y1.setValue(Boolean.valueOf(!interfaceC22204y1.getF42167b().booleanValue()));
            if (interfaceC22204y1.getF42167b().booleanValue()) {
                this.f120037m.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC22276o0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<Float> f120038l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I3<Float> i32) {
            super(1);
            this.f120038l = i32;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
            interfaceC22276o0.d(this.f120038l.getF42167b().floatValue());
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/e0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/e0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.q<InterfaceC20343e0, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f120039l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(3);
            this.f120039l = str;
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20343e0 interfaceC20343e0, androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65244o;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.p.b(this.f120039l, rVar, R1.m(C22501m2.a(androidx.compose.ui.v.f42878y1, "AnswerItemDescriptionTag"), 0.0f, 10, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, a12, 384, 1016);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/y1;", "", "invoke", "()Landroidx/compose/runtime/y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<InterfaceC22204y1<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f120040l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC22204y1<Boolean> invoke() {
            return C22126m3.g(Boolean.FALSE);
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f120041l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f120042m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120043n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i12, Y41.a aVar, String str, String str2) {
            super(2);
            this.f120041l = str;
            this.f120042m = str2;
            this.f120043n = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.a<G0> aVar = this.f120043n;
            t.a(this.f120041l, this.f120042m, aVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120044l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a<G0> aVar) {
            super(2);
            this.f120044l = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.component.navbar.t.b(null, null, 0, this.f120044l, null, a13, 0, 23);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ fp.g f120045l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120046m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120047n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120048o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120049p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120050q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120051r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120052s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120053t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(fp.g gVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.l<? super String, G0> lVar, Y41.l<? super String, G0> lVar2, Y41.l<? super String, G0> lVar3, Y41.l<? super String, G0> lVar4, Y41.l<? super String, G0> lVar5, Y41.a<G0> aVar3) {
            super(3);
            this.f120045l = gVar;
            this.f120046m = aVar;
            this.f120047n = aVar2;
            this.f120048o = lVar;
            this.f120049p = lVar2;
            this.f120050q = lVar3;
            this.f120051r = lVar4;
            this.f120052s = lVar5;
            this.f120053t = aVar3;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x026f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0367  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0502  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r39, androidx.compose.runtime.A r40, java.lang.Integer r41) {
            /*
                Method dump skipped, instructions count: 1518
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.client_room.t.g.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ fp.g f120054l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120055m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120056n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120057o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120058p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120059q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120060r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120061s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120062t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120063u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(fp.g gVar, Y41.a<G0> aVar, Y41.l<? super String, G0> lVar, Y41.l<? super String, G0> lVar2, Y41.l<? super String, G0> lVar3, Y41.l<? super String, G0> lVar4, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.l<? super String, G0> lVar5, Y41.a<G0> aVar4, int i12) {
            super(2);
            this.f120054l = gVar;
            this.f120055m = aVar;
            this.f120056n = lVar;
            this.f120057o = lVar2;
            this.f120058p = lVar3;
            this.f120059q = lVar4;
            this.f120060r = aVar2;
            this.f120061s = aVar3;
            this.f120062t = lVar5;
            this.f120063u = aVar4;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            Y41.a<G0> aVar = this.f120060r;
            Y41.a<G0> aVar2 = this.f120061s;
            t.b(this.f120054l, this.f120055m, this.f120056n, this.f120057o, this.f120058p, this.f120059q, aVar, aVar2, this.f120062t, this.f120063u, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f120064l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f120065m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, androidx.compose.ui.graphics.painter.e eVar, int i12) {
            super(2);
            this.f120064l = str;
            this.f120065m = eVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(65);
            t.c(this.f120064l, this.f120065m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120066l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f120067m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Y41.l lVar) {
            super(0);
            this.f120066l = lVar;
            this.f120067m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f120066l.invoke(this.f120067m);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientRoomScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f120068l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f120069m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f120070n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f120071o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ float f120072p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ float f120073q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ float f120074r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f120075s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f120076t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Y41.l<? super String, G0> lVar, String str, String str2, androidx.compose.ui.graphics.painter.e eVar, float f12, float f13, float f14, int i12, int i13) {
            super(2);
            this.f120068l = lVar;
            this.f120069m = str;
            this.f120070n = str2;
            this.f120071o = eVar;
            this.f120072p = f12;
            this.f120073q = f13;
            this.f120074r = f14;
            this.f120075s = i12;
            this.f120076t = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f120075s | 1);
            float f12 = this.f120072p;
            float f13 = this.f120073q;
            t.d(this.f120068l, this.f120069m, this.f120070n, this.f120071o, f12, f13, this.f120074r, a12, iA2, this.f120076t);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(String str, String str2, Y41.a<G0> aVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-1741002688);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.u(aVar) ? 256 : 128);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(16, 0.0f, 2, aVar2);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            K k12 = K.f28344a;
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) androidx.compose.runtime.saveable.j.c(new Object[0], null, d.f120040l, bE2, 3080, 6);
            androidx.compose.ui.v vVarD = C20588k2.d(C22501m2.a(aVar2, "AnswerItemTag"), 1.0f);
            bE2.C(1163736180);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            bE2.X(false);
            bE2.C(1163739804);
            boolean zB2 = bE2.B(interfaceC22204y1) | ((i13 & 896) == 256);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == obj) {
                objT2 = new a(aVar, interfaceC22204y1);
                bE2.H(objT2);
            }
            bE2.X(false);
            androidx.compose.ui.v vVarB = C21086w0.b(vVarD, mVar, null, false, null, (Y41.a) objT2, 28);
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarB);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, c20576h2.a(C22501m2.a(aVar2, "AnswerItemTitleTag"), 1.0f, true), false, 0L, null, 0, 0, false, null, bE2, i13 & 14, 1016);
            I3 i3B = C20283h.b(((Boolean) interfaceC22204y1.getF42167b()).booleanValue() ? 0.0f : 180.0f, null, "RotationAnimation", bE2, 3072, 22);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            b12 = bE2;
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64352V, 0, b12);
            androidx.compose.ui.v vVarM = R1.m(aVar2, 0.0f, 4, 0.0f, 0.0f, 13);
            b12.C(227553331);
            boolean zB3 = b12.B(i3B);
            Object objT3 = b12.t();
            if (zB3 || objT3 == obj) {
                objT3 = new b(i3B);
                b12.H(objT3);
            }
            b12.X(false);
            com.akita.compose.foundation.ui.e.a(eVarA, null, C22274n0.a(vVarM, (Y41.l) objT3), com.akita.compose.theme.re23.b.f63984b.f63938l, b12, 56, 0);
            b12.X(true);
            C20340d0.b(k12, ((Boolean) interfaceC22204y1.getF42167b()).booleanValue(), null, null, null, null, androidx.compose.runtime.internal.r.c(2078545422, new c(str2), b12), b12, 1572870, 30);
            com.akita.compose.foundation.ui.g.a(20, null, b12, 6);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(i12, aVar, str, str2);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k fp.g gVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k Y41.l<? super String, G0> lVar3, @Y61.k Y41.l<? super String, G0> lVar4, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.k Y41.l<? super String, G0> lVar5, @Y61.k Y41.a<G0> aVar4, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(721302875);
        v.a aVar5 = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar5.getClass();
        com.akita.compose.component.scaffold.g.a(fillElement, androidx.compose.runtime.internal.r.c(-298663137, new f(aVar), bE2), null, null, null, null, null, androidx.compose.runtime.internal.r.c(1532635688, new g(gVar, aVar3, aVar4, lVar, lVar2, lVar3, lVar4, lVar5, aVar2), bE2), bE2, 12582966, 124);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(gVar, aVar, lVar, lVar2, lVar3, lVar4, aVar2, aVar3, lVar5, aVar4, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(String str, androidx.compose.ui.graphics.painter.e eVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-730515170);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarK = R1.k(16, 0.0f, 2, vVarD);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39085k;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        float f12 = 12;
        androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(C20588k2.o(aVar, 56), androidx.compose.foundation.shape.o.a(f12));
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, interfaceC22365i0D);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        C20644z c20644z = C20644z.f28804a;
        C20806p1.a(eVar, null, null, null, null, 0.0f, null, bE2, 56, 124);
        bE2.X(true);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65240k, R1.m(C22501m2.a(aVar, "ProsItemTextTag"), f12, 0.0f, 0.0f, 6, 6), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(str, eVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(Y41.l<? super java.lang.String, kotlin.G0> r34, java.lang.String r35, java.lang.String r36, androidx.compose.ui.graphics.painter.e r37, float r38, float r39, float r40, androidx.compose.runtime.A r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.client_room.t.d(Y41.l, java.lang.String, java.lang.String, androidx.compose.ui.graphics.painter.e, float, float, float, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(Y41.l r13, androidx.compose.runtime.A r14, int r15) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.client_room.t.e(Y41.l, androidx.compose.runtime.A, int):void");
    }

    public static final void f(String str, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(140859249);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65233d;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, R1.k(16, 0.0f, 2, R1.m(C22501m2.a(androidx.compose.ui.v.f42878y1, "HeaderTag"), 0.0f, 28, 0.0f, 0.0f, 13)), false, 0L, null, 0, 0, false, null, bE2, (i13 & 14) | 384, 1016);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new y(str, i12);
        }
    }

    public static final void g(Y41.a aVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(2126580545);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarA = C22501m2.a(aVar2, "HelpBlockTag");
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar3 = InterfaceC22215f.a.f39088n;
            I iA2 = H.a(lVar, aVar3, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            K k12 = K.f28344a;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar2, 1.0f);
            float f12 = 16;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarF = C20588k2.f(R1.k(f12, 0.0f, 2, vVarD), 66);
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39086l, bE2, 48);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarF);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            androidx.compose.ui.v vVarA2 = androidx.compose.ui.draw.k.a(C20588k2.o(aVar2, 48), androidx.compose.foundation.shape.o.f30153a);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar6 = com.akita.compose.theme.re23.b.f63984b;
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarA2, aVar6.f63973w1.c(bE2), Y0.f39346a);
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i16 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarB);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, interfaceC22365i0D);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.theme.re23.b.f63985c.getClass();
            C20806p1.a(u0.e.a(com.akita.compose.theme.re23.e.f64405Y1, 0, bE2), null, null, null, null, 0.0f, null, bE2, 56, 124);
            bE2.X(true);
            I iA3 = H.a(lVar, aVar3, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S4 = bE2.S();
            androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, aVar2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA3);
            R3.b(pVar2, bE2, o1S4);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            R3.b(pVar4, bE2, vVarC4);
            String strC = u0.i.c(bE2, R.string.client_room_help_title);
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            float f13 = 12;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65241l, R1.m(C22501m2.a(aVar2, "HelpBlockTitleTag"), f13, 0.0f, 0.0f, 0.0f, 14), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.client_room_help_subtitle), iVar.f65245p, R1.m(C22501m2.a(aVar2, "HelpBlockSubtitleTag"), f13, 0.0f, 0.0f, 0.0f, 14), false, aVar6.f63918e0.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
            bE2.X(true);
            bE2.X(true);
            b12 = bE2;
            com.akita.compose.component.button.m.c(u0.i.c(bE2, R.string.client_room_help_button_text), aVar, com.akita.compose.theme.re23.b.c(bE2).r2(), R1.m(R1.k(f12, 0.0f, 2, C20588k2.d(aVar2, 1.0f)), 0.0f, 10, 0.0f, 6, 5), null, null, null, false, false, null, bE2, ((i13 << 3) & 112) | 3584, 1008);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new z(i12, aVar);
        }
    }

    public static final void h(PartnerStatus partnerStatus, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(146187498);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(partnerStatus) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.ui.v.f42878y1, "PartnerBlockTag");
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            if (partnerStatus instanceof PartnerStatus.Agency) {
                bE2.C(-1252387871);
                PartnerStatus.Agency agency = (PartnerStatus.Agency) partnerStatus;
                PartnerStatus.Agent agent = agency.f119874e;
                Image image = agency.f119873d;
                String str = agency.f119872c;
                if (agent == null) {
                    bE2.C(-1252346269);
                    com.avito.android.comfortable_deal.common.view.client.a.a(str, image, bE2, 64);
                    bE2.X(false);
                } else {
                    bE2.C(-1252243194);
                    PartnerStatus.Agent agent2 = agency.f119874e;
                    com.avito.android.comfortable_deal.common.view.client.c.a(agent2.f119876c, agent2.f119877d, bE2, 64);
                    h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                    com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
                    com.avito.android.comfortable_deal.common.view.client.b.a(str, image, bE2, 64);
                    bE2.X(false);
                }
                bE2.X(false);
            } else if (partnerStatus instanceof PartnerStatus.Agent) {
                bE2.C(-1251976625);
                PartnerStatus.Agent agent3 = (PartnerStatus.Agent) partnerStatus;
                com.avito.android.comfortable_deal.common.view.client.c.a(agent3.f119876c, agent3.f119877d, bE2, 64);
                bE2.X(false);
            } else if (L.f(partnerStatus, PartnerStatus.Empty.f119882b)) {
                bE2.C(1899280037);
                bE2.X(false);
            } else {
                bE2.C(-1251847231);
                bE2.X(false);
            }
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new A(partnerStatus, i12);
        }
    }

    public static final void i(androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-777710125);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.ui.v.f42878y1, "ProsItemsTag");
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            c(u0.i.c(bE2, R.string.client_room_pros_item_1), u0.e.a(R.drawable.ic_gears, 0, bE2), bE2, 64);
            float f12 = 10;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            c(u0.i.c(bE2, R.string.client_room_pros_item_2), u0.e.a(R.drawable.ic_rub, 0, bE2), bE2, 64);
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            c(u0.i.c(bE2, R.string.client_room_pros_item_3), u0.e.a(R.drawable.ic_item, 0, bE2), bE2, 64);
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            c(u0.i.c(bE2, R.string.client_room_pros_item_4), u0.e.a(R.drawable.ic_logo_avito, 0, bE2), bE2, 64);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new B(i12);
        }
    }

    public static final void j(c.b bVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1145927980);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        C40461b c40461b = bVar.f396092a;
        com.avito.android.comfortable_deal.common.view.client.p.a(c40461b.f396086a, c40461b.f396089d, c40461b.f396090e, c40461b.f396087b, c40461b.f396088c, bE2, 33344);
        bE2.C(-1145303808);
        C40460a c40460a = bVar.f396093b;
        if (c40460a != null) {
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
            com.avito.android.comfortable_deal.common.view.client.b.a(c40460a.f396084a, c40460a.f396085b, bE2, 64);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new C(bVar, i12);
        }
    }

    public static final void k(String str, String str2, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(1864960488);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarA = C22501m2.a(aVar, "TitleBlockTag");
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65231b;
            androidx.compose.ui.v vVarA2 = C22501m2.a(aVar, "TitleBlockTitleTag");
            float f12 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, R1.k(f12, 0.0f, 2, vVarA2), false, 0L, null, 0, 0, false, null, bE2, (i14 & 14) | 384, 1016);
            b12.C(-935004852);
            if (str2 != null) {
                com.akita.compose.foundation.ui.p.b(str2, iVar.f65240k, R1.k(f12, 0.0f, 2, R1.m(C22501m2.a(aVar, "TitleBlockDescriptionTag"), 0.0f, 12, 0.0f, 0.0f, 13)), false, 0L, null, 0, 0, false, null, b12, ((i14 >> 3) & 14) | 384, 1016);
            }
            b12.X(false);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new D(str, str2, i12);
        }
    }

    public static final void l(Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-982750017);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(lVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar3) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(lVar4) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(a2.b(C20588k2.d(C22501m2.a(androidx.compose.ui.v.f42878y1, "UsefulToReadBlockTag"), 1.0f), a2.a(bE2), false, true), 0.0f, 0.0f, 0.0f, 6, 7);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
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
            float f12 = 10;
            d(lVar, u0.i.c(bE2, R.string.client_room_useful_to_read_item_title1), u0.i.c(bE2, R.string.client_room_useful_to_read_item_subtitle1), u0.e.a(R.drawable.ic_contract, 0, bE2), f12, 0.0f, 0.0f, bE2, (i13 & 14) | 28672, 96);
            d(lVar4, u0.i.c(bE2, R.string.client_room_useful_to_read_item_title2), u0.i.c(bE2, R.string.client_room_useful_to_read_item_subtitle2), u0.e.a(R.drawable.ic_benefit, 0, bE2), 0.0f, 0.0f, 0.0f, bE2, ((i13 >> 9) & 14) | 4096, 112);
            d(lVar2, u0.i.c(bE2, R.string.client_room_useful_to_read_item_title3), u0.i.c(bE2, R.string.client_room_useful_to_read_item_subtitle3), u0.e.a(R.drawable.ic_keys, 0, bE2), 0.0f, 0.0f, 0, bE2, ((i13 >> 3) & 14) | 1576960, 48);
            d(lVar3, u0.i.c(bE2, R.string.client_room_useful_to_read_item_title4), u0.i.c(bE2, R.string.client_room_useful_to_read_item_subtitle4), u0.e.a(R.drawable.ic_building, 0, bE2), 0.0f, f12, 0.0f, bE2, ((i13 >> 6) & 14) | 200704, 80);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new E(lVar, lVar2, lVar3, lVar4, i12);
        }
    }
}
