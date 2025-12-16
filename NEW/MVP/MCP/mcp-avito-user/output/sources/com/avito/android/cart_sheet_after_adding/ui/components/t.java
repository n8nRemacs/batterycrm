package com.avito.android.cart_sheet_after_adding.ui.components;

import androidx.compose.animation.C20389u;
import androidx.compose.animation.C20396w0;
import androidx.compose.animation.H0;
import androidx.compose.animation.InterfaceC20401y;
import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20310q;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.snapshots.D;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.semantics.E;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.cart_sheet_after_adding.ui.S;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;

/* compiled from: DiscountOnDelivery.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*0\b\u0000\u0010\u0004\"\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/remote/model/text/AttributedText;", "", "Lcom/avito/android/cart_sheet_after_adding/ui/components/B;", "DiscountOnDeliveryState", "_avito_cart-sheet-after-adding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f115584a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final E<Integer> f115585b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final E<Integer> f115586c;

    /* compiled from: DiscountOnDelivery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/y;", "Landroidx/compose/animation/w0;", "invoke", "(Landroidx/compose/animation/y;)Landroidx/compose/animation/w0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC20401y<?>, C20396w0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f115587l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final C20396w0 invoke(InterfaceC20401y<?> interfaceC20401y) {
            return C20389u.e(H0.d(C20310q.e(210, 90, null, 4), 2), H0.e(C20310q.e(90, 0, null, 6), 2));
        }
    }

    /* compiled from: DiscountOnDelivery.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f115588l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<B> f115589m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, AttributedText attributedText, List list) {
            super(2);
            this.f115588l = attributedText;
            this.f115589m = list;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(73);
            t.a(this.f115588l, this.f115589m, a12, iA2);
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(t.class, "iconRes", "getIconRes(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        n0 n0Var = m0.f406844a;
        f115584a = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(t.class, "discountOnDeliveryProgressCount", "getDiscountOnDeliveryProgressCount(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, n0Var)};
        f115585b = new E<>("IconRes", null, 2, null);
        f115586c = new E<>("DiscountOnDeliveryProgressCounty", null, 2, null);
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k AttributedText attributedText, @Y61.k List<B> list, @Y61.l androidx.compose.runtime.A a12, int i12) {
        Q q12;
        androidx.compose.runtime.B bE2 = a12.E(-1287527591);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarA = C22501m2.a(C20588k2.d(aVar, 1.0f), "DiscountOnDelivery");
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, iA2);
        Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        K k12 = K.f28344a;
        i.b bVar = InterfaceC22215f.a.f39086l;
        androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarD);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, c20568f2A);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        List<B> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            q12 = new Q(Integer.valueOf(com.akita.compose.theme.re23.e.f64837x3), com.akita.compose.theme.re23.b.f63984b.f63972w0);
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f115523a != 1.0f) {
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.theme.re23.b.f63985c.getClass();
                    q12 = new Q(Integer.valueOf(com.akita.compose.theme.re23.e.f64016B2), com.akita.compose.theme.re23.b.f63984b.f63937k1);
                    break;
                }
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            q12 = new Q(Integer.valueOf(com.akita.compose.theme.re23.e.f64837x3), com.akita.compose.theme.re23.b.f63984b.f63972w0);
        }
        Q q13 = q12;
        a aVar3 = a.f115587l;
        r.f115578a.getClass();
        C20389u.b(q13, null, aVar3, null, null, null, r.f115579b, bE2, 1573248, 58);
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.g.b(4, null, bE2, 6, 2);
        C20389u.b(attributedText, null, aVar3, null, null, null, r.f115580c, bE2, 1573256, 58);
        bE2.X(true);
        com.akita.compose.foundation.ui.g.a(12, null, bE2, 6);
        b(list, C22501m2.a(androidx.compose.ui.v.f42878y1, "DiscountOnDelivery-Progress"), bE2, 56);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, attributedText, list);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k List list, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        boolean z12;
        com.akita.compose.component.progress_bar.k f66617i;
        androidx.compose.runtime.B bE2 = a12.E(-2070362077);
        float f12 = 1.0f;
        androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z12 = true;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f115523a != 1.0f) {
                    z12 = false;
                    break;
                }
            }
            z12 = true;
        }
        bE2.C(596148969);
        bE2.C(-1419971481);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = new D();
            bE2.H(objT);
        }
        D d12 = (D) objT;
        bE2.X(false);
        int size = list.size() - d12.size();
        C22187u0.d(new z(size, d12, list, null), bE2, Integer.valueOf(size));
        bE2.X(false);
        C22187u0.d(new v(d12, list, null), bE2, list);
        androidx.compose.ui.v vVarB = androidx.compose.ui.semantics.r.b(vVarD.d0(vVar), false, new w(list));
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        if (z12) {
            bE2.C(-1636640770);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            f66617i = com.akita.compose.theme.re23.b.o(bE2).getF66620l();
            bE2.X(false);
        } else {
            bE2.C(-1636568478);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            f66617i = com.akita.compose.theme.re23.b.o(bE2).getF66617i();
            bE2.X(false);
        }
        bE2.C(-468431213);
        ListIterator listIterator = d12.listIterator();
        int i14 = 0;
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            x xVar = new x((C20268c) next);
            androidx.compose.ui.v vVarA = c20576h2.a(androidx.compose.ui.v.f42878y1, f12, true);
            S.a.C3364a.C3365a c3365a = S.a.C3364a.C3365a.f115519a;
            int i16 = kotlin.s0.f410475c;
            c3365a.getClass();
            com.akita.compose.component.progress_bar.j.a(xVar, f66617i, C22501m2.a(vVarA, "DiscountOnDelivery-Progress-bar-" + ((Object) kotlin.s0.b(i14))), bE2, 0);
            bE2.C(-468420838);
            if (i14 != d12.size() - 1) {
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.b(6, null, bE2, 6, 2);
            }
            bE2.X(false);
            i14 = i15;
            f12 = 1.0f;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new y(list, vVar, i12);
        }
    }
}
