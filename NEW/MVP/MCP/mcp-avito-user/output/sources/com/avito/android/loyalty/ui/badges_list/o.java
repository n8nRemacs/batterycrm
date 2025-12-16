package com.avito.android.loyalty.ui.badges_list;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.grid.C20672g;
import androidx.compose.foundation.lazy.grid.InterfaceC20662b;
import androidx.compose.foundation.lazy.grid.y0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.data.Badge;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BadgesListScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_loyalty_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o {

    /* compiled from: BadgesListScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/y0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<y0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Badge f183387l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<Badge> f183388m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f183389n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f183390o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Badge badge, List<Badge> list, Y41.a<G0> aVar, Y41.l<? super DeepLink, G0> lVar) {
            super(1);
            this.f183387l = badge;
            this.f183388m = list;
            this.f183389n = aVar;
            this.f183390o = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(y0 y0Var) {
            y0 y0Var2 = y0Var;
            y0Var2.d(g.f183379l, new C22096n(-1010257242, new h(this.f183389n), true));
            Y41.l<DeepLink, G0> lVar = this.f183390o;
            Badge badge = this.f183387l;
            if (badge != null) {
                y0Var2.d(i.f183381l, new C22096n(133013604, new j(badge, lVar), true));
            }
            List<Badge> list = this.f183388m;
            y0Var2.f(list.size(), null, null, new m(list), new C22096n(1229287273, new n(lVar, list), true));
            return G0.f406611a;
        }
    }

    /* compiled from: BadgesListScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Badge f183391l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<Badge> f183392m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f183393n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f183394o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Badge badge, List<Badge> list, Y41.l<? super DeepLink, G0> lVar, Y41.a<G0> aVar, int i12) {
            super(2);
            this.f183391l = badge;
            this.f183392m = list;
            this.f183393n = lVar;
            this.f183394o = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(73);
            Y41.l<DeepLink, G0> lVar = this.f183393n;
            Y41.a<G0> aVar = this.f183394o;
            o.a(this.f183391l, this.f183392m, lVar, aVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: BadgesListScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Badge f183395l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f183396m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Badge badge, Y41.l<? super DeepLink, G0> lVar) {
            super(0);
            this.f183395l = badge;
            this.f183396m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = this.f183395l.f182984f;
            if (deepLink != null) {
                this.f183396m.invoke(deepLink);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BadgesListScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Badge f183397l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BadgePosition f183398m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f183399n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f183400o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Badge badge, BadgePosition badgePosition, Y41.l<? super DeepLink, G0> lVar, int i12) {
            super(2);
            this.f183397l = badge;
            this.f183398m = badgePosition;
            this.f183399n = lVar;
            this.f183400o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f183400o | 1);
            BadgePosition badgePosition = this.f183398m;
            Y41.l<DeepLink, G0> lVar = this.f183399n;
            o.b(this.f183397l, badgePosition, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: BadgesListScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e {
        static {
            int[] iArr = new int[BadgePosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BadgePosition badgePosition = BadgePosition.f183354b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BadgePosition badgePosition2 = BadgePosition.f183354b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l Badge badge, @Y61.k List<Badge> list, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-418239246);
        v.a aVar2 = v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar2.getClass();
        InterfaceC20662b.C1591b c1591b = new InterfaceC20662b.C1591b(2);
        C20585k c20585k = C20585k.f28659a;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20672g.c(c1591b, fillElement, null, null, false, null, C20585k.g(16), null, false, null, new a(badge, list, aVar, lVar), bE2, 1572912, 0, 956);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(badge, list, lVar, aVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k Badge badge, @Y61.k BadgePosition badgePosition, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.l A a12, int i12) {
        v vVarK;
        r rVar;
        r rVar2;
        B bE2 = a12.E(-1885981295);
        int iOrdinal = badgePosition.ordinal();
        if (iOrdinal == 0) {
            v.a aVar = v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            vVarK = R1.k(16, 0.0f, 2, aVar);
        } else if (iOrdinal == 1) {
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            vVarK = R1.m(v.f42878y1, 16, 0.0f, 0.0f, 0.0f, 14);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            vVarK = R1.m(v.f42878y1, 0.0f, 0.0f, 16, 0.0f, 11);
        }
        v vVarC = C21086w0.c(R1.m(vVarK.d0(C20588k2.f28682c), 0.0f, 0.0f, 0.0f, 28, 7), false, null, null, new c(badge, lVar), 7);
        C20585k.f28659a.getClass();
        C20585k.c cVar = C20585k.f28664f;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(cVar, InterfaceC22215f.a.f39089o, bE2, 54);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC2 = androidx.compose.ui.n.c(bE2, vVarC);
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
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC2);
        K k12 = K.f28344a;
        BadgePosition badgePosition2 = BadgePosition.f183354b;
        c(badge.f182983e, badgePosition == badgePosition2, bE2, 8);
        if (badgePosition == badgePosition2) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            rVar = com.akita.compose.theme.re23.b.f63988f.f65236g;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            rVar = com.akita.compose.theme.re23.b.f63988f.f65242m;
        }
        if (badgePosition == badgePosition2) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            rVar2 = com.akita.compose.theme.re23.b.f63988f.f65241l;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            rVar2 = com.akita.compose.theme.re23.b.f63988f.f65244o;
        }
        r rVar3 = rVar2;
        s.f42720b.getClass();
        int i14 = s.f42722d;
        com.akita.compose.foundation.ui.p.b(badge.f182981c, rVar, null, false, 0L, null, 1, i14, false, null, bE2, 14155776, 828);
        String str = badge.f182982d;
        if (str == null) {
            str = "";
        }
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(str, rVar3, null, false, com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2), null, 1, i14, false, null, bE2, 14155776, 812);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(badge, badgePosition, lVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.avito.android.remote.model.UniversalImage r19, boolean r20, androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.loyalty.ui.badges_list.o.c(com.avito.android.remote.model.UniversalImage, boolean, androidx.compose.runtime.A, int):void");
    }
}
