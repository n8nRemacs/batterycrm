package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import bo.C25686c;
import bo.InterfaceC25684a;
import bo.InterfaceC25685b;
import com.akita.compose.component.toast_bar.J;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
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

/* compiled from: TreeScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_category-items-tree_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w {

    /* compiled from: TreeScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f117076l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(2);
            this.f117076l = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                com.akita.compose.component.navbar.t.b(null, null, com.akita.compose.theme.re23.e.f64233O, this.f117076l, null, a13, 0, 19);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TreeScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C25686c f117077l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC25684a, G0> f117078m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(C25686c c25686c, Y41.l<? super InterfaceC25684a, G0> lVar) {
            super(3);
            this.f117077l = c25686c;
            this.f117078m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r8, androidx.compose.runtime.A r9, java.lang.Integer r10) {
            /*
                r7 = this;
                androidx.compose.foundation.layout.T1 r8 = (androidx.compose.foundation.layout.T1) r8
                androidx.compose.runtime.A r9 = (androidx.compose.runtime.A) r9
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                r0 = r10 & 14
                if (r0 != 0) goto L18
                boolean r0 = r9.B(r8)
                if (r0 == 0) goto L16
                r0 = 4
                goto L17
            L16:
                r0 = 2
            L17:
                r10 = r10 | r0
            L18:
                r10 = r10 & 91
                r0 = 18
                if (r10 != r0) goto L29
                boolean r10 = r9.c()
                if (r10 != 0) goto L25
                goto L29
            L25:
                r9.f()
                goto L87
            L29:
                bo.c r10 = r7.f117077l
                boolean r0 = r10.f57447b
                if (r0 == 0) goto L43
                r10 = -278487974(0xffffffffef669c5a, float:-7.137057E28)
                r9.C(r10)
                androidx.compose.ui.v$a r10 = androidx.compose.ui.v.f42878y1
                androidx.compose.ui.v r8 = androidx.compose.foundation.layout.R1.h(r10, r8)
                r10 = 0
                com.avito.android.category_items_tree.screens.tree_screen.components.w.c(r8, r9, r10, r10)
                r9.h()
                goto L87
            L43:
                r0 = -278393610(0xffffffffef680cf6, float:-7.181619E28)
                r9.C(r0)
                androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
                androidx.compose.ui.v r4 = androidx.compose.foundation.layout.R1.h(r0, r8)
                r8 = -978804566(0xffffffffc5a8a0aa, float:-5396.083)
                r9.C(r8)
                Y41.l<bo.a, kotlin.G0> r8 = r7.f117078m
                boolean r0 = r9.B(r8)
                java.lang.Object r1 = r9.t()
                if (r0 != 0) goto L6a
                androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
                r0.getClass()
                androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
                if (r1 != r0) goto L72
            L6a:
                com.avito.android.category_items_tree.screens.tree_screen.components.x r1 = new com.avito.android.category_items_tree.screens.tree_screen.components.x
                r1.<init>(r8)
                r9.H(r1)
            L72:
                r3 = r1
                Y41.l r3 = (Y41.l) r3
                r9.h()
                com.avito.android.remote.model.text.AttributedText r1 = r10.f57449d
                java.util.List<com.avito.android.category_items_tree.screens.tree_screen.k> r2 = r10.f57450e
                com.avito.android.remote.model.text.AttributedText r0 = r10.f57448c
                r6 = 584(0x248, float:8.18E-43)
                r5 = r9
                com.avito.android.category_items_tree.screens.tree_screen.components.w.b(r0, r1, r2, r3, r4, r5, r6)
                r9.h()
            L87:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_items_tree.screens.tree_screen.components.w.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TreeScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.category_items_tree.screens.tree_screen.components.TreeScreenKt$TreeScreen$3", f = "TreeScreen.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f117079q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f117080r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC25685b> f117081s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f117082t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ J f117083u;

        /* compiled from: TreeScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbo/b;", "event", "Lkotlin/G0;", "emit", "(Lbo/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f117084b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f117085c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ J f117086d;

            public a(T t12, com.akita.compose.component.toast_bar.u uVar, J j12) {
                this.f117084b = t12;
                this.f117085c = uVar;
                this.f117086d = j12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC25685b interfaceC25685b = (InterfaceC25685b) obj;
                if (interfaceC25685b instanceof InterfaceC25685b.a) {
                    C43259k.d(this.f117084b, null, null, new y(interfaceC25685b, this.f117085c, this.f117086d, null), 3);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC43160i<? extends InterfaceC25685b> interfaceC43160i, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f117081s = interfaceC43160i;
            this.f117082t = uVar;
            this.f117083u = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f117081s, this.f117082t, this.f117083u, continuation);
            cVar.f117080r = obj;
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
            int i12 = this.f117079q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((T) this.f117080r, this.f117082t, this.f117083u);
                this.f117079q = 1;
                if (this.f117081s.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: TreeScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C25686c f117087l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC25685b> f117088m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC25684a, G0> f117089n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f117090o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C25686c c25686c, InterfaceC43160i<? extends InterfaceC25685b> interfaceC43160i, Y41.l<? super InterfaceC25684a, G0> lVar, Y41.a<G0> aVar, int i12) {
            super(2);
            this.f117087l = c25686c;
            this.f117088m = interfaceC43160i;
            this.f117089n = lVar;
            this.f117090o = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(65);
            Y41.a<G0> aVar = this.f117090o;
            w.a(this.f117087l, this.f117088m, this.f117089n, aVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C25686c c25686c, @Y61.k InterfaceC43160i<? extends InterfaceC25685b> interfaceC43160i, @Y61.k Y41.l<? super InterfaceC25684a, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(940020799);
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        com.akita.compose.component.scaffold.g.a(null, androidx.compose.runtime.internal.r.c(-1878990853, new a(aVar), bE2), null, uVarA, null, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, androidx.compose.runtime.internal.r.c(813590610, new b(c25686c, lVar), bE2), bE2, 12582960, 85);
        C22187u0.d(new c(interfaceC43160i, uVarA, jP2, null), bE2, G0.f406611a);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(c25686c, interfaceC43160i, lVar, aVar, i12);
        }
    }

    public static final void b(AttributedText attributedText, AttributedText attributedText2, List list, Y41.l lVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-322189634);
        C20585k c20585k = C20585k.f28659a;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20585k.j jVarG = C20585k.g(12);
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
        bE2.C(-1677812862);
        if (attributedText != null) {
            com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, R1.k(16, 0.0f, 2, androidx.compose.ui.v.f42878y1), R.attr.textH30, null, null, 0, bE2, 56, 56);
        }
        bE2.X(false);
        bE2.C(-1677805819);
        if (attributedText2 != null) {
            com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText2, R1.k(16, 0.0f, 2, androidx.compose.ui.v.f42878y1), R.attr.textM20, null, null, 0, bE2, 56, 56);
        }
        bE2.X(false);
        v.a(list, lVar, bE2, ((i12 >> 6) & 112) | 8);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new z(attributedText, attributedText2, list, lVar, vVar, i12);
        }
    }

    public static final void c(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(1658862804);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i14 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            if (i15 != 0) {
                vVar = androidx.compose.ui.v.f42878y1;
            }
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(12);
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            float f12 = 16;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(R1.l(androidx.compose.ui.v.f42878y1, f12, 7, f12, 5), 152, 14), androidx.compose.foundation.shape.o.a(6), null, false, bE2, 0, 6), bE2, 0);
            v.b(null, bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new A(vVar, i12, i13);
        }
    }
}
