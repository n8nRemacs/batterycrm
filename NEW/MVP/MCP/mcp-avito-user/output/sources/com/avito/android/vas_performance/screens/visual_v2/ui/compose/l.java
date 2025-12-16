package com.avito.android.vas_performance.screens.visual_v2.ui.compose;

import RL0.b;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.C22501m2;
import com.akita.compose.component.toast_bar.J;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VisualVasV2Screen.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\b²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LRL0/a;", "Lkotlin/G0;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "deepLinkEvent", "", "closeScreenEvent", "_avito_vas-performance_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l {

    /* compiled from: VisualVasV2Screen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.visual_v2.ui.compose.VisualVasV2ScreenKt$VisualVasV2Screen$1", f = "VisualVasV2Screen.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f321341q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f321342r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<RL0.b> f321343s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f321344t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f321345u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f321346v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ J f321347w;

        /* compiled from: VisualVasV2Screen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRL0/b;", "event", "Lkotlin/G0;", "emit", "(LRL0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.vas_performance.screens.visual_v2.ui.compose.l$a$a, reason: collision with other inner class name */
        public static final class C9949a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f321348b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f321349c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f321350d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f321351e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ J f321352f;

            public C9949a(T t12, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, com.akita.compose.component.toast_bar.u uVar, J j12) {
                this.f321348b = t12;
                this.f321349c = interfaceC22204y1;
                this.f321350d = interfaceC22204y12;
                this.f321351e = uVar;
                this.f321352f = j12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                RL0.b bVar = (RL0.b) obj;
                if (bVar instanceof b.a) {
                    ((Y41.l) this.f321349c.getF42167b()).invoke(Boxing.boxBoolean(((b.a) bVar).f14349a));
                } else if (bVar instanceof b.C0956b) {
                    ((Y41.l) this.f321350d.getF42167b()).invoke(((b.C0956b) bVar).f14350a);
                } else if (bVar instanceof b.c) {
                    C43259k.d(this.f321348b, null, null, new k(this.f321351e, this.f321352f, bVar, null), 3);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation continuation) {
            super(2, continuation);
            this.f321343s = interfaceC43160i;
            this.f321344t = interfaceC22204y1;
            this.f321345u = interfaceC22204y12;
            this.f321346v = uVar;
            this.f321347w = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f321343s, this.f321344t, this.f321345u, this.f321346v, this.f321347w, continuation);
            aVar.f321342r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f321341q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C9949a c9949a = new C9949a((T) this.f321342r, this.f321344t, this.f321345u, this.f321346v, this.f321347w);
                this.f321341q = 1;
                if (this.f321343s.collect(c9949a, this) == coroutine_suspended) {
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

    /* compiled from: VisualVasV2Screen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f321353l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ RL0.c f321354m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f321355n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.akita.compose.component.toast_bar.u uVar, RL0.c cVar, InterfaceC22204y1 interfaceC22204y1) {
            super(2);
            this.f321353l = uVar;
            this.f321354m = cVar;
            this.f321355n = interfaceC22204y1;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.ui.v.f42878y1, "VisualVasV2RootTestTag");
                InterfaceC22204y1 interfaceC22204y1 = this.f321355n;
                RL0.c cVar = this.f321354m;
                com.akita.compose.component.scaffold.g.a(vVarA, androidx.compose.runtime.internal.r.c(1430934123, new r(cVar, interfaceC22204y1), a13), androidx.compose.runtime.internal.r.c(1600185708, new w(cVar, interfaceC22204y1), a13), this.f321353l, null, null, null, androidx.compose.runtime.internal.r.c(-39370188, new z(cVar, interfaceC22204y1), a13), a13, 12583350, 112);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VisualVasV2Screen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RL0.c f321356l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<RL0.b> f321357m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<RL0.a, G0> f321358n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f321359o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Object f321360p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f321361q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(RL0.c cVar, InterfaceC43160i<? extends RL0.b> interfaceC43160i, Y41.l<? super RL0.a, G0> lVar, Y41.l<? super DeepLink, G0> lVar2, Y41.l<? super Boolean, G0> lVar3, int i12) {
            super(2);
            this.f321356l = cVar;
            this.f321357m = interfaceC43160i;
            this.f321358n = lVar;
            this.f321359o = lVar2;
            this.f321360p = lVar3;
            this.f321361q = i12;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, java.lang.Object] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f321361q | 1);
            ?? r42 = this.f321360p;
            InterfaceC43160i<RL0.b> interfaceC43160i = this.f321357m;
            Y41.l<RL0.a, G0> lVar = this.f321358n;
            l.a(this.f321356l, interfaceC43160i, lVar, this.f321359o, r42, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k RL0.c cVar, @Y61.k InterfaceC43160i<? extends RL0.b> interfaceC43160i, @Y61.k Y41.l<? super RL0.a, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2, @Y61.k Y41.l<? super Boolean, G0> lVar3, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-725815988);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(lVar3, bE2);
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        C22187u0.d(new a(interfaceC43160i, interfaceC22204y1M3, interfaceC22204y1M2, uVarA, jP2, null), bE2, G0.f406611a);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(227092903, new b(uVarA, cVar, interfaceC22204y1M), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(cVar, interfaceC43160i, lVar, lVar2, lVar3, i12);
        }
    }
}
