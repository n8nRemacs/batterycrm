package com.avito.android.mortgage.sign;

import android.content.Context;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.snapshots.D;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.graphics.vector.W;
import androidx.compose.ui.graphics.vector.e0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.R;
import com.avito.android.mortgage.sign.motions.MotionEvent;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import o10.InterfaceC44505c;

/* compiled from: SignScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\n²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Ll0/n;", "canvasSize", "Landroidx/compose/ui/graphics/Path;", "currentPath", "Lcom/avito/android/mortgage/sign/motions/MotionEvent;", "motionEvent", "previousMotionEvent", "Ll0/g;", "currentPosition", "previousPosition", "_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k {

    /* compiled from: SignScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.sign.SignScreenKt$SignScreen$1$1", f = "SignScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ D<Path> f203661q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ o10.d f203662r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D<Path> d12, o10.d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f203661q = d12;
            this.f203662r = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f203661q, this.f203662r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Iterable iterable = (Iterable) this.f203662r.f419305b.f419293a;
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.avito.android.mortgage.sign.draw.b) it.next()).b());
            }
            this.f203661q.addAll(arrayList);
            return G0.f406611a;
        }
    }

    /* compiled from: SignScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.sign.SignScreenKt$SignScreen$2", f = "SignScreen.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203663q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC44505c> f203664r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ D<Path> f203665s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ D<com.avito.android.mortgage.sign.draw.c> f203666t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f203667u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ J f203668v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f203669w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f203670x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Path> f203671y;

        /* compiled from: SignScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo10/c;", "it", "Lkotlin/G0;", "emit", "(Lo10/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D<Path> f203672b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ D<com.avito.android.mortgage.sign.draw.c> f203673c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f203674d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ J f203675e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Context f203676f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Y41.a<G0> f203677g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<Path> f203678h;

            public a(D<Path> d12, D<com.avito.android.mortgage.sign.draw.c> d13, com.akita.compose.component.toast_bar.u uVar, J j12, Context context, Y41.a<G0> aVar, InterfaceC22204y1<Path> interfaceC22204y1) {
                this.f203672b = d12;
                this.f203673c = d13;
                this.f203674d = uVar;
                this.f203675e = j12;
                this.f203676f = context;
                this.f203677g = aVar;
                this.f203678h = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC44505c interfaceC44505c = (InterfaceC44505c) obj;
                if (L.f(interfaceC44505c, InterfaceC44505c.a.f419301a)) {
                    this.f203672b.clear();
                    this.f203678h.setValue(C22315w.a());
                    this.f203673c.clear();
                } else {
                    if (interfaceC44505c instanceof InterfaceC44505c.b) {
                        Object objA = this.f203674d.a(this.f203675e, ((InterfaceC44505c.b) interfaceC44505c).f419302a.k0(this.f203676f), G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, continuation);
                        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
                    }
                    if (L.f(interfaceC44505c, InterfaceC44505c.C12157c.f419303a)) {
                        ((com.avito.android.mortgage.sign.a) this.f203677g).invoke();
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43160i<? extends InterfaceC44505c> interfaceC43160i, D<Path> d12, D<com.avito.android.mortgage.sign.draw.c> d13, com.akita.compose.component.toast_bar.u uVar, J j12, Context context, Y41.a<G0> aVar, InterfaceC22204y1<Path> interfaceC22204y1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f203664r = interfaceC43160i;
            this.f203665s = d12;
            this.f203666t = d13;
            this.f203667u = uVar;
            this.f203668v = j12;
            this.f203669w = context;
            this.f203670x = aVar;
            this.f203671y = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f203664r, this.f203665s, this.f203666t, this.f203667u, this.f203668v, this.f203669w, this.f203670x, this.f203671y, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203663q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Y41.a<G0> aVar = this.f203670x;
                a aVar2 = new a(this.f203665s, this.f203666t, this.f203667u, this.f203668v, this.f203669w, aVar, this.f203671y);
                this.f203663q = 1;
                if (this.f203664r.collect(aVar2, this) == coroutine_suspended) {
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

    /* compiled from: SignScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f203679l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ o10.d f203680m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f203681n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a<G0> aVar, o10.d dVar, Y41.a<G0> aVar2) {
            super(2);
            this.f203679l = aVar;
            this.f203680m = dVar;
            this.f203681n = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                v vVarD = C20588k2.d(aVar, 1.0f);
                float f12 = 48;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                v vVarF = C20588k2.f(vVarD, f12);
                C20585k.f28659a.getClass();
                C20585k.h hVar = C20585k.f28666h;
                InterfaceC22215f.f39074a.getClass();
                C20568f2 c20568f2A = C20563e2.a(hVar, InterfaceC22215f.a.f39086l, a13, 54);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = androidx.compose.ui.n.c(a13, vVarF);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20576h2 c20576h2 = C20576h2.f28641a;
                com.avito.android.mortgage.widgets.b.a(C35835l0.j(R.attr.ic_arrowBack24, (Context) a13.o(AndroidCompositionLocals_androidKt.f41069b)), this.f203679l, C20588k2.o(aVar, f12), InterfaceC22215f.a.f39079e, false, null, a13, 3456, 48);
                String str = this.f203680m.f419306c;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65239j;
                androidx.compose.ui.text.style.i.f42675b.getClass();
                androidx.compose.ui.text.style.i iVarA = androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e);
                androidx.compose.ui.text.style.s.f42720b.getClass();
                com.akita.compose.foundation.ui.p.b(str, rVar, null, false, 0L, iVarA, 1, androidx.compose.ui.text.style.s.f42722d, false, null, a13, 14155776, 796);
                com.avito.android.mortgage.widgets.b.a(R.drawable.ic_trash_can, this.f203681n, C20588k2.o(aVar, f12), InterfaceC22215f.a.f39081g, !r12.f419308e, null, a13, 3456, 32);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SignScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.q<T1, A, Integer, G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Path> f203682A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<l0.g> f203683B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ W f203684C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ long f203685D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ float f203686E;

        /* renamed from: F, reason: collision with root package name */
        public final /* synthetic */ long f203687F;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o10.d f203688l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Float, Float, G0> f203689m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f203690n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ float f203691o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ float f203692p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ long f203693q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<MotionEvent> f203694r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<MotionEvent> f203695s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<l0.g> f203696t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ D<com.avito.android.mortgage.sign.draw.c> f203697u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f203698v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Float, Float, G0> f203699w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Y41.l<List<? extends com.avito.android.mortgage.sign.draw.c>, G0> f203700x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ D<Path> f203701y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<l0.n> f203702z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(o10.d dVar, Y41.p<? super Float, ? super Float, G0> pVar, float f12, float f13, float f14, long j12, InterfaceC22204y1<MotionEvent> interfaceC22204y1, InterfaceC22204y1<MotionEvent> interfaceC22204y12, InterfaceC22204y1<l0.g> interfaceC22204y13, D<com.avito.android.mortgage.sign.draw.c> d12, Y41.a<G0> aVar, Y41.p<? super Float, ? super Float, G0> pVar2, Y41.l<? super List<? extends com.avito.android.mortgage.sign.draw.c>, G0> lVar, D<Path> d13, InterfaceC22204y1<l0.n> interfaceC22204y14, InterfaceC22204y1<Path> interfaceC22204y15, InterfaceC22204y1<l0.g> interfaceC22204y16, W w12, long j13, float f15, long j14) {
            super(3);
            this.f203688l = dVar;
            this.f203689m = pVar;
            this.f203690n = f12;
            this.f203691o = f13;
            this.f203692p = f14;
            this.f203693q = j12;
            this.f203694r = interfaceC22204y1;
            this.f203695s = interfaceC22204y12;
            this.f203696t = interfaceC22204y13;
            this.f203697u = d12;
            this.f203698v = aVar;
            this.f203699w = pVar2;
            this.f203700x = lVar;
            this.f203701y = d13;
            this.f203702z = interfaceC22204y14;
            this.f203682A = interfaceC22204y15;
            this.f203683B = interfaceC22204y16;
            this.f203684C = w12;
            this.f203685D = j13;
            this.f203686E = f15;
            this.f203687F = j14;
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x03cd  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r51, androidx.compose.runtime.A r52, java.lang.Integer r53) {
            /*
                Method dump skipped, instructions count: 1014
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.sign.k.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SignScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o10.d f203703l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC44505c> f203704m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f203705n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f203706o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Float, Float, G0> f203707p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f203708q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<List<? extends com.avito.android.mortgage.sign.draw.c>, G0> f203709r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Float, Float, G0> f203710s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(o10.d dVar, InterfaceC43160i<? extends InterfaceC44505c> interfaceC43160i, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.p<? super Float, ? super Float, G0> pVar, Y41.a<G0> aVar3, Y41.l<? super List<? extends com.avito.android.mortgage.sign.draw.c>, G0> lVar, Y41.p<? super Float, ? super Float, G0> pVar2, int i12) {
            super(2);
            this.f203703l = dVar;
            this.f203704m = interfaceC43160i;
            this.f203705n = aVar;
            this.f203706o = aVar2;
            this.f203707p = pVar;
            this.f203708q = aVar3;
            this.f203709r = lVar;
            this.f203710s = pVar2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(65);
            Y41.a<G0> aVar = this.f203705n;
            Y41.p<Float, Float, G0> pVar = this.f203707p;
            Y41.a<G0> aVar2 = this.f203708q;
            k.a(this.f203703l, this.f203704m, aVar, this.f203706o, pVar, aVar2, this.f203709r, this.f203710s, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k o10.d dVar, @Y61.k InterfaceC43160i<? extends InterfaceC44505c> interfaceC43160i, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.p<? super Float, ? super Float, G0> pVar, @Y61.k Y41.a<G0> aVar3, @Y61.k Y41.l<? super List<? extends com.avito.android.mortgage.sign.draw.c>, G0> lVar, @Y61.k Y41.p<? super Float, ? super Float, G0> pVar2, @Y61.l A a12, int i12) {
        long jC2;
        B bE2 = a12.E(-2066630289);
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        bE2.C(-1229129125);
        Object objT = bE2.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g(null);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        Object objI = com.akita.compose.component.accordion.s.i(-1229127050, bE2, false);
        if (objI == c1651a) {
            objI = C22126m3.g(C22315w.a());
            bE2.H(objI);
        }
        InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objI;
        Object objI2 = com.akita.compose.component.accordion.s.i(-1229125382, bE2, false);
        if (objI2 == c1651a) {
            objI2 = new D();
            bE2.H(objI2);
        }
        D d12 = (D) objI2;
        Object objI3 = com.akita.compose.component.accordion.s.i(-1229123168, bE2, false);
        if (objI3 == c1651a) {
            objI3 = new D();
            bE2.H(objI3);
        }
        D d13 = (D) objI3;
        Object objI4 = com.akita.compose.component.accordion.s.i(-1229120928, bE2, false);
        if (objI4 == c1651a) {
            objI4 = C22126m3.g(MotionEvent.f203736b);
            bE2.H(objI4);
        }
        InterfaceC22204y1 interfaceC22204y13 = (InterfaceC22204y1) objI4;
        Object objI5 = com.akita.compose.component.accordion.s.i(-1229118464, bE2, false);
        if (objI5 == c1651a) {
            objI5 = C22126m3.g(MotionEvent.f203736b);
            bE2.H(objI5);
        }
        InterfaceC22204y1 interfaceC22204y14 = (InterfaceC22204y1) objI5;
        Object objI6 = com.akita.compose.component.accordion.s.i(-1229116094, bE2, false);
        if (objI6 == c1651a) {
            l0.g.f413384b.getClass();
            objI6 = C22126m3.g(l0.g.a(l0.g.f413386d));
            bE2.H(objI6);
        }
        InterfaceC22204y1 interfaceC22204y15 = (InterfaceC22204y1) objI6;
        Object objI7 = com.akita.compose.component.accordion.s.i(-1229113662, bE2, false);
        if (objI7 == c1651a) {
            l0.g.f413384b.getClass();
            objI7 = C22126m3.g(l0.g.a(l0.g.f413386d));
            bE2.H(objI7);
        }
        InterfaceC22204y1 interfaceC22204y16 = (InterfaceC22204y1) objI7;
        bE2.X(false);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
        long jC3 = aVar4.f63938l.c(bE2);
        float f12 = 4;
        h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
        if (dVar.f419307d != null) {
            bE2.C(-1229107333);
            jC2 = aVar4.f63880R0.c(bE2);
        } else {
            bE2.C(-1229106245);
            jC2 = aVar4.f63900Y.c(bE2);
        }
        bE2.X(false);
        long j12 = jC2;
        float fC2 = c(1, bE2);
        float fC3 = c(f12, bE2);
        float fC4 = c(8, bE2);
        C22293d.b bVar = C22293d.f39851k;
        W wC2 = e0.c(u0.j.b(bE2, R.drawable.sign_sample), bE2);
        long jC4 = aVar4.f63888U.c(bE2);
        bE2.C(-1229096205);
        Object objT2 = bE2.t();
        if (objT2 == c1651a) {
            objT2 = new com.akita.compose.component.toast_bar.u();
            bE2.H(objT2);
        }
        com.akita.compose.component.toast_bar.u uVar = (com.akita.compose.component.toast_bar.u) objT2;
        bE2.X(false);
        J f66806c = com.akita.compose.theme.re23.b.u(bE2).getF66806c();
        G0 g02 = G0.f406611a;
        bE2.C(-1229092525);
        boolean zB2 = bE2.B(dVar);
        Object objT3 = bE2.t();
        if (zB2 || objT3 == c1651a) {
            objT3 = new a(d12, dVar, null);
            bE2.H(objT3);
        }
        bE2.X(false);
        C22187u0.d((Y41.p) objT3, bE2, g02);
        C22187u0.d(new b(interfaceC43160i, d12, d13, uVar, f66806c, context, aVar, interfaceC22204y12, null), bE2, aVar);
        v.a aVar6 = v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar6.getClass();
        com.akita.compose.component.scaffold.g.a(R1.k(16, 0.0f, 2, fillElement), androidx.compose.runtime.internal.r.c(547750963, new c(aVar, dVar, aVar2), bE2), null, uVar, null, null, null, androidx.compose.runtime.internal.r.c(-1862072196, new d(dVar, pVar, fC4, fC2, fC3, j12, interfaceC22204y13, interfaceC22204y14, interfaceC22204y15, d13, aVar3, pVar2, lVar, d12, interfaceC22204y1, interfaceC22204y12, interfaceC22204y16, wC2, jC4, f12, jC3), bE2), bE2, 12586038, 116);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(dVar, interfaceC43160i, aVar, aVar2, pVar, aVar3, lVar, pVar2, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long b(InterfaceC22204y1 interfaceC22204y1) {
        return ((l0.g) interfaceC22204y1.getF42167b()).f413387a;
    }

    @InterfaceC22132o
    public static final float c(float f12, @Y61.l A a12) {
        a12.C(1276218516);
        float fM02 = ((androidx.compose.ui.unit.d) a12.o(Q0.f41199h)).M0(f12);
        a12.h();
        return fM02;
    }
}
