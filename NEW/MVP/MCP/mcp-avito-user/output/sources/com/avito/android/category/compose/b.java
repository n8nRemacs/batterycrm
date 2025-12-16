package com.avito.android.category.compose;

import Pn.InterfaceC14813a;
import android.os.Parcelable;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.accordion.s;
import com.akita.compose.component.navbar.t;
import com.avito.android.R;
import com.avito.android.category.ListItem;
import com.avito.android.category.mvi.entity.CategoryState;
import com.avito.android.category.mvi.entity.OverlayState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*B\b\u0000\u0010\u0006\"\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00002\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0000¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/android/category/ListItem;", "Lkotlin/S;", "name", "item", "Lkotlin/G0;", "OnCategoryClicked", "Lcom/avito/android/category/mvi/entity/CategoryState;", VoiceInfo.STATE, "_avito_category_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* compiled from: CategoryScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.category.q f116500l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.category.q qVar, int i12) {
            super(2);
            this.f116500l = qVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            b.a(this.f116500l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.category.compose.b$b, reason: collision with other inner class name */
    public static final class C3398b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f116501l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ OverlayState f116502m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f116503n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List<ListItem> f116504o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f116505p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ListItem, G0> f116506q;

        /* compiled from: CategoryScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.category.compose.b$b$a */
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[OverlayState.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Parcelable.Creator<OverlayState> creator = OverlayState.CREATOR;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Parcelable.Creator<OverlayState> creator2 = OverlayState.CREATOR;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3398b(Y41.a<G0> aVar, OverlayState overlayState, Y41.a<G0> aVar2, List<? extends ListItem> list, com.avito.android.analytics.screens.mvi.r rVar, Y41.l<? super ListItem, G0> lVar) {
            super(2);
            this.f116501l = aVar;
            this.f116502m = overlayState;
            this.f116503n = aVar2;
            this.f116504o = list;
            this.f116505p = rVar;
            this.f116506q = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13;
            A a14 = a12;
            if ((num.intValue() & 11) == 2 && a14.c()) {
                a14.f();
            } else {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.d0(fillElement);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                v vVarB = androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a14), Y0.f39346a);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a14, 0);
                int f37888q = a14.getF37888Q();
                O1 o1Y = a14.y();
                v vVarC = androidx.compose.ui.n.c(a14, vVarB);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a14.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a14.A();
                if (a14.getF37887P()) {
                    a14.b(aVar2);
                } else {
                    a14.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
                R3.b(pVar, a14, iA2);
                Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
                R3.b(pVar2, a14, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
                if (a14.getF37887P() || !L.f(a14.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a14, f37888q, pVar3);
                }
                Y41.p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
                R3.b(pVar4, a14, vVarC);
                K k12 = K.f28344a;
                t.d(u0.i.c(a14, R.string.categories), C22501m2.a(aVar, "nav_bar"), com.akita.compose.theme.re23.b.n(a14).getF66453a(), 0, this.f116501l, null, a14, 48, 40);
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q2 = a14.getF37888Q();
                O1 o1Y2 = a14.y();
                v vVarC2 = androidx.compose.ui.n.c(a14, fillElement);
                if (a14.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a14.A();
                if (a14.getF37887P()) {
                    a14.b(aVar2);
                } else {
                    a14.d();
                }
                R3.b(pVar, a14, interfaceC22365i0D);
                R3.b(pVar2, a14, o1Y2);
                if (a14.getF37887P() || !L.f(a14.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a14, f37888q2, pVar3);
                }
                R3.b(pVar4, a14, vVarC2);
                C20644z c20644z = C20644z.f28804a;
                int iOrdinal = this.f116502m.ordinal();
                if (iOrdinal == 0) {
                    a13 = a14;
                    a13.C(1544980434);
                    b.d(c20644z, a13, 6);
                    a13.h();
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        a14.C(650536570);
                        a14.h();
                    } else {
                        a14.C(1545000447);
                        b.c(this.f116504o, this.f116505p, this.f116506q, a14, 8);
                        a14.h();
                    }
                    a13 = a14;
                } else {
                    a14.C(1544982642);
                    com.akita.compose.component.content_placeholder.b.c(R.drawable.placeholders_img_unknown_error, u0.i.c(a14, R.string.unknown_error), "", u0.i.c(a14, R.string.try_again), this.f116503n, fillElement, null, 0L, null, null, false, false, a14, 196608, 0, 4032);
                    a14.h();
                    a13 = a14;
                }
                a13.z();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ OverlayState f116507l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<ListItem> f116508m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f116509n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f116510o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f116511p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ListItem, G0> f116512q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f116513r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(OverlayState overlayState, List<? extends ListItem> list, com.avito.android.analytics.screens.mvi.r rVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.l<? super ListItem, G0> lVar, int i12) {
            super(2);
            this.f116507l = overlayState;
            this.f116508m = list;
            this.f116509n = rVar;
            this.f116510o = aVar;
            this.f116511p = aVar2;
            this.f116512q = lVar;
            this.f116513r = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f116513r | 1);
            com.avito.android.analytics.screens.mvi.r rVar = this.f116509n;
            Y41.a<G0> aVar = this.f116510o;
            b.b(this.f116507l, this.f116508m, rVar, aVar, this.f116511p, this.f116512q, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category/ListItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/category/ListItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<ListItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.category.q f116514l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.category.q qVar) {
            super(1);
            this.f116514l = qVar;
        }

        @Override // Y41.l
        public final G0 invoke(ListItem listItem) {
            this.f116514l.accept(new InterfaceC14813a.C0862a(listItem));
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.category.q f116515l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.category.q qVar) {
            super(0);
            this.f116515l = qVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f116515l.accept(InterfaceC14813a.b.f13275a);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.category.q f116516l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.category.q qVar) {
            super(0);
            this.f116516l = qVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f116516l.accept(InterfaceC14813a.c.f13276a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k com.avito.android.category.q qVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1703125509);
        InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(qVar.getState(), bE2);
        bE2.C(-201027947);
        Object objT = bE2.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = new e(qVar);
            bE2.H(objT);
        }
        Y41.a aVar = (Y41.a) objT;
        Object objI = s.i(-201024811, bE2, false);
        if (objI == c1651a) {
            objI = new f(qVar);
            bE2.H(objI);
        }
        Y41.a aVar2 = (Y41.a) objI;
        Object objI2 = s.i(-201020890, bE2, false);
        if (objI2 == c1651a) {
            objI2 = new d(qVar);
            bE2.H(objI2);
        }
        bE2.X(false);
        b(((CategoryState) interfaceC22204y1B.getF42167b()).f116677b, ((CategoryState) interfaceC22204y1B.getF42167b()).f116678c, ((CategoryState) interfaceC22204y1B.getF42167b()).getPerfTrackerParams(), aVar, aVar2, (Y41.l) objI2, bE2, 224320);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(qVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(OverlayState overlayState, List<? extends ListItem> list, com.avito.android.analytics.screens.mvi.r rVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.l<? super ListItem, G0> lVar, A a12, int i12) {
        B bE2 = a12.E(859653323);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(23405094, new C3398b(aVar, overlayState, aVar2, list, rVar, lVar), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(overlayState, list, rVar, aVar, aVar2, lVar, i12);
        }
    }

    public static final void c(List list, com.avito.android.analytics.screens.mvi.r rVar, Y41.l lVar, A a12, int i12) {
        boolean z12;
        B bE2 = a12.E(1627172545);
        int i13 = i12 >> 3;
        bE2.C(-976608008);
        bE2.C(2063036140);
        boolean zBooleanValue = ((Boolean) bE2.o(C22543x1.f41638a)).booleanValue();
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (zBooleanValue) {
            bE2.C(421109671);
            v vVarB = a2.b(v.f42878y1, (d2) com.avito.android.analytics.screens.compose.s.b(com.avito.android.category.compose.d.f116519l, bE2), true, true);
            C20585k.f28659a.getClass();
            C20585k.l lVar2 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (interfaceC22078i == null) {
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
            bE2.C(1745694821);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ListItem listItem = (ListItem) it.next();
                if (listItem instanceof ListItem.Category) {
                    bE2.C(14302234);
                    com.avito.android.category.compose.a.a((ListItem.Category) listItem, lVar, bE2, i13 & 112);
                    bE2.X(false);
                } else if (listItem instanceof ListItem.Header) {
                    bE2.C(14304792);
                    r.a((ListItem.Header) listItem, lVar, null, bE2, i13 & 112);
                    bE2.X(false);
                } else {
                    bE2.C(443500045);
                    bE2.X(false);
                }
            }
            z12 = false;
            androidx.compose.foundation.H.A(bE2, false, true, false);
        } else {
            bE2.C(420357239);
            com.avito.android.analytics.screens.compose.a aVar2 = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
            if (rVar != null) {
                aVar2.m(rVar.f90666a);
            }
            aVar2.l();
            v.a aVar3 = v.f42878y1;
            v vVarD = androidx.compose.ui.draw.o.d(aVar3, new com.avito.android.category.compose.c(rVar, aVar2));
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2 = InterfaceC22413h.a.f40796g;
            R3.b(pVar2, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, U, G0> pVar3 = InterfaceC22413h.a.f40795f;
            R3.b(pVar3, bE2, o1S2);
            Y41.p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar4);
            }
            Y41.p<InterfaceC22413h, v, G0> pVar5 = InterfaceC22413h.a.f40793d;
            R3.b(pVar5, bE2, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            v vVarB2 = a2.b(aVar3, (d2) com.avito.android.analytics.screens.compose.s.b(com.avito.android.category.compose.d.f116519l, bE2), true, true);
            C20585k.f28659a.getClass();
            I iA3 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            v vVarC3 = androidx.compose.ui.n.c(bE2, vVarB2);
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
            R3.b(pVar2, bE2, iA3);
            R3.b(pVar3, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar4);
            }
            R3.b(pVar5, bE2, vVarC3);
            K k13 = K.f28344a;
            bE2.C(1745694821);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ListItem listItem2 = (ListItem) it2.next();
                if (listItem2 instanceof ListItem.Category) {
                    bE2.C(14302234);
                    com.avito.android.category.compose.a.a((ListItem.Category) listItem2, lVar, bE2, i13 & 112);
                    bE2.X(false);
                } else if (listItem2 instanceof ListItem.Header) {
                    bE2.C(14304792);
                    r.a((ListItem.Header) listItem2, lVar, null, bE2, i13 & 112);
                    bE2.X(false);
                } else {
                    bE2.C(443500045);
                    bE2.X(false);
                }
            }
            androidx.compose.foundation.H.B(bE2, false, true, true, false);
            z12 = false;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z12, z12);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new com.avito.android.category.compose.e(list, rVar, lVar, i12);
        }
    }

    public static final void d(C20644z c20644z, A a12, int i12) {
        int i13;
        B bE2 = a12.E(-2023107305);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c20644z) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarO = C20588k2.o(c20644z.d(aVar, InterfaceC22215f.a.f39080f), 36);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.b(vVarO, com.akita.compose.theme.re23.b.f63984b.f63938l, com.akita.compose.theme.re23.b.r(bE2).getF66694c().f62824c, 0, null, bE2, 0, 24);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new n(c20644z, i12);
        }
    }
}
