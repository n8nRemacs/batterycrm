package com.avito.android.category_items_tree.screens.items_screen.components;

import Yn.C18303c;
import Yn.InterfaceC18301a;
import Yn.InterfaceC18302b;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
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
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.J;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CategoryItemsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LYn/a;", "Lkotlin/G0;", "action", "_avito_category-items-tree_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {

    /* compiled from: CategoryItemsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f116858l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(2);
            this.f116858l = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                com.akita.compose.component.navbar.t.b(null, null, com.akita.compose.theme.re23.e.f64233O, this.f116858l, null, a13, 0, 19);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItemsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C18303c f116859l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f116860m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC18301a, G0> f116861n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(C18303c c18303c, String str, Y41.l<? super InterfaceC18301a, G0> lVar) {
            super(3);
            this.f116859l = c18303c;
            this.f116860m = str;
            this.f116861n = lVar;
        }

        @Override // Y41.q
        public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
            T1 t13 = t12;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(t13) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                C18303c c18303c = this.f116859l;
                if (c18303c.f19656c.isEmpty()) {
                    a13.C(-1152675367);
                    i.c(R1.h(androidx.compose.ui.v.f42878y1, t13), a13, 0, 0);
                    a13.h();
                } else {
                    a13.C(-1152577934);
                    com.avito.android.analytics.screens.mvi.r perfTrackerParams = c18303c.getPerfTrackerParams();
                    a13.C(-976608008);
                    a13.C(2063036140);
                    boolean zBooleanValue = ((Boolean) a13.o(C22543x1.f41638a)).booleanValue();
                    String str = this.f116860m;
                    Y41.l<InterfaceC18301a, G0> lVar = this.f116861n;
                    if (zBooleanValue) {
                        a13.C(421109671);
                        i.b(str, c18303c.f19655b, c18303c.f19656c, lVar, R1.h(androidx.compose.ui.v.f42878y1, t13), a13, 512, 0);
                        a13.h();
                    } else {
                        a13.C(420357239);
                        com.avito.android.analytics.screens.compose.a aVar = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                        if (perfTrackerParams != null) {
                            aVar.m(perfTrackerParams.f90666a);
                        }
                        aVar.l();
                        v.a aVar2 = androidx.compose.ui.v.f42878y1;
                        androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(aVar2, new j(perfTrackerParams, aVar));
                        InterfaceC22215f.f39074a.getClass();
                        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                        int f37888q = a13.getF37888Q();
                        O1 o1Y = a13.y();
                        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
                        InterfaceC22413h.f40789C1.getClass();
                        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                        if (a13.F() == null) {
                            C22190v.b();
                            throw null;
                        }
                        a13.A();
                        if (a13.getF37887P()) {
                            a13.b(aVar3);
                        } else {
                            a13.d();
                        }
                        R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                        R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                        if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                            androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                        }
                        R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                        C20644z c20644z = C20644z.f28804a;
                        i.b(str, c18303c.f19655b, c18303c.f19656c, lVar, R1.h(aVar2, t13), a13, 512, 0);
                        a13.z();
                        a13.h();
                    }
                    com.avito.android.authorization.auto_recovery.phone_confirm.b.m(a13);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItemsScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.category_items_tree.screens.items_screen.components.CategoryItemsScreenKt$CategoryItemsScreen$3", f = "CategoryItemsScreen.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f116862q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f116863r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC18302b> f116864s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f116865t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ J f116866u;

        /* compiled from: CategoryItemsScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYn/b;", "event", "Lkotlin/G0;", "emit", "(LYn/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f116867b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f116868c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ J f116869d;

            public a(T t12, com.akita.compose.component.toast_bar.u uVar, J j12) {
                this.f116867b = t12;
                this.f116868c = uVar;
                this.f116869d = j12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC18302b interfaceC18302b = (InterfaceC18302b) obj;
                if (interfaceC18302b instanceof InterfaceC18302b.a) {
                    C43259k.d(this.f116867b, null, null, new k(interfaceC18302b, this.f116868c, this.f116869d, null), 3);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC43160i<? extends InterfaceC18302b> interfaceC43160i, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f116864s = interfaceC43160i;
            this.f116865t = uVar;
            this.f116866u = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f116864s, this.f116865t, this.f116866u, continuation);
            cVar.f116863r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f116862q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((T) this.f116863r, this.f116865t, this.f116866u);
                this.f116862q = 1;
                if (this.f116864s.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItemsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C18303c f116870l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f116871m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC18302b> f116872n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f116873o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC18301a, G0> f116874p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C18303c c18303c, String str, InterfaceC43160i<? extends InterfaceC18302b> interfaceC43160i, Y41.a<G0> aVar, Y41.l<? super InterfaceC18301a, G0> lVar, int i12) {
            super(2);
            this.f116870l = c18303c;
            this.f116871m = str;
            this.f116872n = interfaceC43160i;
            this.f116873o = aVar;
            this.f116874p = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(513);
            Y41.a<G0> aVar = this.f116873o;
            String str = this.f116871m;
            InterfaceC43160i<InterfaceC18302b> interfaceC43160i = this.f116872n;
            i.a(this.f116870l, str, interfaceC43160i, aVar, this.f116874p, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C18303c c18303c, @Y61.k String str, @Y61.k InterfaceC43160i<? extends InterfaceC18302b> interfaceC43160i, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super InterfaceC18301a, G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1023073294);
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        com.akita.compose.component.scaffold.g.a(null, androidx.compose.runtime.internal.r.c(-1000513866, new a(aVar), bE2), null, uVarA, null, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, androidx.compose.runtime.internal.r.c(-1037107457, new b(c18303c, str, lVar), bE2), bE2, 12582960, 85);
        C22187u0.d(new c(interfaceC43160i, uVarA, jP2, null), bE2, G0.f406611a);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(c18303c, str, interfaceC43160i, aVar, lVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r22, com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse.ActionType r23, java.util.List r24, Y41.l r25, androidx.compose.ui.v r26, androidx.compose.runtime.A r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_items_tree.screens.items_screen.components.i.b(java.lang.String, com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse$ActionType, java.util.List, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }

    public static final void c(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.ui.v vVar2;
        int i14;
        androidx.compose.ui.v vVar3;
        androidx.compose.runtime.B bE2 = a12.E(690330908);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
            vVar2 = vVar;
        } else if ((i12 & 14) == 0) {
            vVar2 = vVar;
            i14 = (bE2.B(vVar2) ? 4 : 2) | i12;
        } else {
            vVar2 = vVar;
            i14 = i12;
        }
        if ((i14 & 11) == 2 && bE2.c()) {
            bE2.f();
            vVar3 = vVar2;
        } else {
            vVar3 = i15 != 0 ? androidx.compose.ui.v.f42878y1 : vVar2;
            androidx.compose.ui.v vVarD0 = vVar3.d0(C20588k2.f28682c);
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(12);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39088n;
            I iA2 = H.a(jVarG, aVar2, bE2, 6);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD0);
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
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            K k12 = K.f28344a;
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            float f12 = 16;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(R1.l(aVar4, f12, 7, f12, 5), 152, 14), androidx.compose.foundation.shape.o.a(6), null, false, bE2, 0, 6), bE2, 0);
            androidx.compose.ui.v vVarB = a2.b(R1.k(f12, 0.0f, 2, aVar4), a2.a(bE2), true, true);
            I iA3 = H.a(C20585k.f28662d, aVar2, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarB);
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
            R3.b(pVar, bE2, iA3);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            bE2.C(-1977118813);
            for (int i18 = 0; i18 < 10; i18++) {
                C29367b.f(null, bE2, 0, 1);
            }
            androidx.compose.foundation.H.A(bE2, false, true, true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new v(vVar3, i12, i13);
        }
    }
}
