package com.avito.android.services_portfolio.project.buyer.ui;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
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
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.Image;
import com.avito.android.services_portfolio.project.buyer.mvi.entity.ActionType;
import iv0.AbstractC42117c;
import iv0.C42119e;
import iv0.InterfaceC42115a;
import iv0.InterfaceC42116b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PortfolioProjectBuyerScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0006²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "Liv0/a;", "Lkotlin/G0;", "action", "", "isRefreshing", "_avito_services-portfolio_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    /* compiled from: PortfolioProjectBuyerScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_portfolio.project.buyer.ui.PortfolioProjectBuyerScreenKt$PortfolioProjectBuyerScreen$1$1", f = "PortfolioProjectBuyerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f280116q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f280116q = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f280116q, continuation);
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
            ((Y41.l) this.f280116q.getF42167b()).invoke(InterfaceC42115a.h.f405366a);
            return G0.f406611a;
        }
    }

    /* compiled from: PortfolioProjectBuyerScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_portfolio.project.buyer.ui.PortfolioProjectBuyerScreenKt$PortfolioProjectBuyerScreen$2", f = "PortfolioProjectBuyerScreen.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280117q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC42116b> f280118r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f280119s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f280120t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ J f280121u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.r<List<Image>, Integer, AdvertAction.Phone, AdvertAction.Messenger, G0> f280122v;

        /* compiled from: PortfolioProjectBuyerScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liv0/b;", "event", "Lkotlin/G0;", "emit", "(Liv0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.app.m f280123b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f280124c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ J f280125d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Y41.r<List<Image>, Integer, AdvertAction.Phone, AdvertAction.Messenger, G0> f280126e;

            /* JADX WARN: Multi-variable type inference failed */
            public a(androidx.appcompat.app.m mVar, com.akita.compose.component.toast_bar.u uVar, J j12, Y41.r<? super List<Image>, ? super Integer, ? super AdvertAction.Phone, ? super AdvertAction.Messenger, G0> rVar) {
                this.f280123b = mVar;
                this.f280124c = uVar;
                this.f280125d = j12;
                this.f280126e = rVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC42116b interfaceC42116b = (InterfaceC42116b) obj;
                if (interfaceC42116b instanceof InterfaceC42116b.a) {
                    androidx.appcompat.app.m mVar = this.f280123b;
                    if (mVar != null) {
                        mVar.onBackPressed();
                    }
                } else {
                    if (interfaceC42116b instanceof InterfaceC42116b.c) {
                        Object objA = this.f280124c.a(this.f280125d, ((InterfaceC42116b.c) interfaceC42116b).f405372a, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : ToastBarDuration.f63231c, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, continuation);
                        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
                    }
                    if (interfaceC42116b instanceof InterfaceC42116b.C11541b) {
                        InterfaceC42116b.C11541b c11541b = (InterfaceC42116b.C11541b) interfaceC42116b;
                        ((com.avito.android.services_portfolio.project.buyer.ui.b) this.f280126e).invoke(c11541b.f405368a, c11541b.f405369b, c11541b.f405370c, c11541b.f405371d);
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43160i<? extends InterfaceC42116b> interfaceC43160i, androidx.appcompat.app.m mVar, com.akita.compose.component.toast_bar.u uVar, J j12, Y41.r<? super List<Image>, ? super Integer, ? super AdvertAction.Phone, ? super AdvertAction.Messenger, G0> rVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f280118r = interfaceC43160i;
            this.f280119s = mVar;
            this.f280120t = uVar;
            this.f280121u = j12;
            this.f280122v = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f280118r, this.f280119s, this.f280120t, this.f280121u, this.f280122v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f280117q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(this.f280119s, this.f280120t, this.f280121u, this.f280122v);
                this.f280117q = 1;
                if (this.f280118r.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: PortfolioProjectBuyerScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f280127l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC22204y1 interfaceC22204y1) {
            super(2);
            this.f280127l = interfaceC22204y1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r9, java.lang.Integer r10) {
            /*
                r8 = this;
                r5 = r9
                androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
                java.lang.Number r10 = (java.lang.Number) r10
                int r9 = r10.intValue()
                r9 = r9 & 11
                r10 = 2
                if (r9 != r10) goto L19
                boolean r9 = r5.c()
                if (r9 != 0) goto L15
                goto L19
            L15:
                r5.f()
                goto L4d
            L19:
                androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
                r9 = -121393173(0xfffffffff8c3afeb, float:-3.175206E34)
                r5.C(r9)
                androidx.compose.runtime.y1 r9 = r8.f280127l
                boolean r10 = r5.B(r9)
                java.lang.Object r1 = r5.t()
                if (r10 != 0) goto L36
                androidx.compose.runtime.A$a r10 = androidx.compose.runtime.A.f37866a
                r10.getClass()
                androidx.compose.runtime.A$a$a r10 = androidx.compose.runtime.A.a.f37868b
                if (r1 != r10) goto L3e
            L36:
                com.avito.android.services_portfolio.project.buyer.ui.t r1 = new com.avito.android.services_portfolio.project.buyer.ui.t
                r1.<init>(r9)
                r5.H(r1)
            L3e:
                r3 = r1
                Y41.a r3 = (Y41.a) r3
                r5.h()
                r6 = 6
                r7 = 22
                r1 = 0
                r2 = 0
                r4 = 0
                com.akita.compose.component.navbar.t.b(r0, r1, r2, r3, r4, r5, r6, r7)
            L4d:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_portfolio.project.buyer.ui.s.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PortfolioProjectBuyerScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC42117c f280128l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280129m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC42117c abstractC42117c, com.avito.android.deeplink_handler.handler.composite.a aVar) {
            super(2);
            this.f280128l = abstractC42117c;
            this.f280129m = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            C42119e c42119e;
            Object next;
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                AbstractC42117c abstractC42117c = this.f280128l;
                if (abstractC42117c instanceof AbstractC42117c.b) {
                    AbstractC42117c.b bVar = (AbstractC42117c.b) abstractC42117c;
                    ArrayList arrayList = bVar.f405375d.f405385f;
                    C42119e c42119e2 = null;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((C42119e) next).f405386a == ActionType.f280035b) {
                                break;
                            }
                        }
                        c42119e = (C42119e) next;
                    } else {
                        c42119e = null;
                    }
                    ArrayList arrayList2 = bVar.f405375d.f405385f;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            if (((C42119e) next2).f405386a == ActionType.f280036c) {
                                c42119e2 = next2;
                                break;
                            }
                        }
                        c42119e2 = c42119e2;
                    }
                    com.avito.android.deeplink_handler.handler.composite.a aVar = this.f280129m;
                    if (c42119e != null && c42119e2 != null) {
                        a13.C(532198303);
                        s.c(c42119e, c42119e2, aVar, a13, 584);
                        a13.h();
                    } else if (c42119e != null) {
                        a13.C(532447760);
                        s.d(c42119e, aVar, a13, 72);
                        a13.h();
                    } else if (c42119e2 != null) {
                        a13.C(532652174);
                        s.d(c42119e2, aVar, a13, 72);
                        a13.h();
                    } else {
                        a13.C(532826115);
                        a13.h();
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PortfolioProjectBuyerScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.q<T1, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC42117c f280130l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC42115a, G0> f280131m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(AbstractC42117c abstractC42117c, Y41.l<? super InterfaceC42115a, G0> lVar) {
            super(3);
            this.f280130l = abstractC42117c;
            this.f280131m = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.q
        public final G0 invoke(T1 t12, A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                AbstractC42117c abstractC42117c = this.f280130l;
                boolean z12 = abstractC42117c instanceof AbstractC42117c.b;
                Y41.l<InterfaceC42115a, G0> lVar = this.f280131m;
                A.a aVar = A.f37866a;
                if (z12) {
                    a13.C(532966514);
                    a13.C(-121354335);
                    Object objT = a13.t();
                    aVar.getClass();
                    A.a.C1651a c1651a = A.a.f37868b;
                    if (objT == c1651a) {
                        objT = C22126m3.g(Boolean.FALSE);
                        a13.H(objT);
                    }
                    InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
                    a13.h();
                    com.akita.compose.component.pull_to_refresh.j jVarA = com.akita.compose.component.pull_to_refresh.k.a(a13);
                    Object objT2 = a13.t();
                    if (objT2 == c1651a) {
                        objT2 = C22187u0.h(EmptyCoroutineContext.INSTANCE, a13);
                        a13.H(objT2);
                    }
                    s.b(jVarA, ((Boolean) interfaceC22204y1.getF42167b()).booleanValue(), new v((T) objT2, interfaceC22204y1, lVar), (AbstractC42117c.b) abstractC42117c, this.f280131m, a13, 4104);
                    a13.h();
                } else if (abstractC42117c instanceof AbstractC42117c.d) {
                    a13.C(533834111);
                    v.a aVar2 = androidx.compose.ui.v.f42878y1;
                    FillElement fillElement = C20588k2.f28682c;
                    aVar2.getClass();
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a);
                    InterfaceC22215f.f39074a.getClass();
                    InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                    int f37888q = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarB);
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
                    com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(a13).getF66694c(), C20644z.f28804a.d(aVar2, InterfaceC22215f.a.f39080f), a13, 0, 0);
                    a13.z();
                    a13.h();
                } else if (abstractC42117c instanceof AbstractC42117c.C11542c) {
                    a13.C(534332188);
                    a13.C(-121310335);
                    Object objT3 = a13.t();
                    aVar.getClass();
                    A.a.C1651a c1651a2 = A.a.f37868b;
                    if (objT3 == c1651a2) {
                        objT3 = C22126m3.g(Boolean.FALSE);
                        a13.H(objT3);
                    }
                    InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objT3;
                    a13.h();
                    com.akita.compose.component.pull_to_refresh.j jVarA2 = com.akita.compose.component.pull_to_refresh.k.a(a13);
                    Object objT4 = a13.t();
                    if (objT4 == c1651a2) {
                        objT4 = C22187u0.h(EmptyCoroutineContext.INSTANCE, a13);
                        a13.H(objT4);
                    }
                    com.avito.android.services_portfolio.project.components.a.a(jVarA2, ((Boolean) interfaceC22204y12.getF42167b()).booleanValue(), new x((T) objT4, interfaceC22204y12, lVar), ((AbstractC42117c.C11542c) abstractC42117c).f405378d instanceof ApiError.NetworkIOError, a13, 8);
                    a13.h();
                } else {
                    a13.C(535213859);
                    a13.h();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PortfolioProjectBuyerScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC42117c f280132l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC42115a, G0> f280133m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC42116b> f280134n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.r<List<Image>, Integer, AdvertAction.Phone, AdvertAction.Messenger, G0> f280135o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280136p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(AbstractC42117c abstractC42117c, Y41.l<? super InterfaceC42115a, G0> lVar, InterfaceC43160i<? extends InterfaceC42116b> interfaceC43160i, Y41.r<? super List<Image>, ? super Integer, ? super AdvertAction.Phone, ? super AdvertAction.Messenger, G0> rVar, com.avito.android.deeplink_handler.handler.composite.a aVar, int i12) {
            super(2);
            this.f280132l = abstractC42117c;
            this.f280133m = lVar;
            this.f280134n = interfaceC43160i;
            this.f280135o = rVar;
            this.f280136p = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(33281);
            Y41.r<List<Image>, Integer, AdvertAction.Phone, AdvertAction.Messenger, G0> rVar = this.f280135o;
            Y41.l<InterfaceC42115a, G0> lVar = this.f280133m;
            InterfaceC43160i<InterfaceC42116b> interfaceC43160i = this.f280134n;
            s.a(this.f280132l, lVar, interfaceC43160i, rVar, this.f280136p, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0049  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k iv0.AbstractC42117c r16, @Y61.k Y41.l<? super iv0.InterfaceC42115a, kotlin.G0> r17, @Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends iv0.InterfaceC42116b> r18, @Y61.k Y41.r<? super java.util.List<com.avito.android.remote.model.Image>, ? super java.lang.Integer, ? super com.avito.android.remote.model.AdvertAction.Phone, ? super com.avito.android.remote.model.AdvertAction.Messenger, kotlin.G0> r19, @Y61.k com.avito.android.deeplink_handler.handler.composite.a r20, @Y61.l androidx.compose.runtime.A r21, int r22) {
        /*
            r1 = r16
            r2 = r17
            r0 = 1844950213(0x6df7b4c5, float:9.582667E27)
            r3 = r21
            androidx.compose.runtime.B r0 = r3.E(r0)
            androidx.compose.runtime.y1 r3 = androidx.compose.runtime.C22126m3.m(r2, r0)
            androidx.compose.runtime.J3 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f41069b
            java.lang.Object r4 = r0.o(r4)
            android.content.Context r4 = (android.content.Context) r4
            androidx.appcompat.app.m r7 = com.avito.android.util.C35835l0.c(r4)
            com.akita.compose.component.toast_bar.u r8 = com.akita.compose.component.toast_bar.w.a(r0)
            com.akita.compose.theme.re23.b r4 = com.akita.compose.theme.re23.b.f63983a
            r4.getClass()
            com.akita.compose.theme.re23.style.b4 r4 = com.akita.compose.theme.re23.b.u(r0)
            com.akita.compose.component.toast_bar.J r9 = r4.getF66804a()
            kotlin.G0 r4 = kotlin.G0.f406611a
            r5 = -230610018(0xfffffffff2412b9e, float:-3.8261336E30)
            r0.C(r5)
            boolean r5 = r0.B(r3)
            java.lang.Object r6 = r0.t()
            if (r5 != 0) goto L49
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            r5.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r5) goto L52
        L49:
            com.avito.android.services_portfolio.project.buyer.ui.s$a r6 = new com.avito.android.services_portfolio.project.buyer.ui.s$a
            r5 = 0
            r6.<init>(r3, r5)
            r0.H(r6)
        L52:
            Y41.p r6 = (Y41.p) r6
            r5 = 0
            r0.X(r5)
            androidx.compose.runtime.C22187u0.d(r6, r0, r4)
            com.avito.android.services_portfolio.project.buyer.ui.s$b r4 = new com.avito.android.services_portfolio.project.buyer.ui.s$b
            r11 = 0
            r5 = r4
            r6 = r18
            r10 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r14 = r18
            androidx.compose.runtime.C22187u0.d(r4, r0, r14)
            androidx.compose.ui.v$a r4 = androidx.compose.ui.v.f42878y1
            androidx.compose.foundation.layout.FillElement r5 = androidx.compose.foundation.layout.C20588k2.f28682c
            r4.getClass()
            com.avito.android.services_portfolio.project.buyer.ui.s$c r4 = new com.avito.android.services_portfolio.project.buyer.ui.s$c
            r4.<init>(r3)
            r3 = 824984201(0x312c4289, float:2.5067115E-9)
            androidx.compose.runtime.internal.n r4 = androidx.compose.runtime.internal.r.c(r3, r4, r0)
            com.avito.android.services_portfolio.project.buyer.ui.s$d r3 = new com.avito.android.services_portfolio.project.buyer.ui.s$d
            r15 = r20
            r3.<init>(r1, r15)
            r6 = -1997704502(0xffffffff88ed72ca, float:-1.4290905E-33)
            androidx.compose.runtime.internal.n r6 = androidx.compose.runtime.internal.r.c(r6, r3, r0)
            com.avito.android.services_portfolio.project.buyer.ui.s$e r3 = new com.avito.android.services_portfolio.project.buyer.ui.s$e
            r3.<init>(r1, r2)
            r7 = -1638684270(0xffffffff9e53a992, float:-1.1205313E-20)
            androidx.compose.runtime.internal.n r10 = androidx.compose.runtime.internal.r.c(r7, r3, r0)
            r8 = 0
            r9 = 0
            r7 = 0
            r11 = 0
            r12 = 12583350(0xc001b6, float:1.7633029E-38)
            r13 = 120(0x78, float:1.68E-43)
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r11 = r0
            com.akita.compose.component.scaffold.g.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.runtime.c2 r7 = r0.Z()
            if (r7 == 0) goto Lc3
            com.avito.android.services_portfolio.project.buyer.ui.s$f r8 = new com.avito.android.services_portfolio.project.buyer.ui.s$f
            r0 = r8
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f38184d = r8
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_portfolio.project.buyer.ui.s.a(iv0.c, Y41.l, kotlinx.coroutines.flow.i, Y41.r, com.avito.android.deeplink_handler.handler.composite.a, androidx.compose.runtime.A, int):void");
    }

    public static final void b(com.akita.compose.component.pull_to_refresh.j jVar, boolean z12, Y41.a aVar, AbstractC42117c.b bVar, Y41.l lVar, A a12, int i12) {
        B bE2 = a12.E(-1357778751);
        com.akita.compose.component.pull_to_refresh.i.b(jVar, z12, aVar, androidx.compose.ui.v.f42878y1, null, null, androidx.compose.runtime.internal.r.c(-497166357, new n(bVar, lVar), bE2), bE2, (i12 & 14) | 1575944 | (i12 & 112) | (i12 & 896), 48);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o(jVar, z12, aVar, bVar, lVar, i12);
        }
    }

    public static final void c(C42119e c42119e, C42119e c42119e2, com.avito.android.deeplink_handler.handler.composite.a aVar, A a12, int i12) {
        C20576h2 c20576h2;
        v.a aVar2;
        boolean z12;
        boolean z13;
        B bE2 = a12.E(-2109585453);
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarI = R1.i(com.avito.android.services_portfolio.project.components.f.a(aVar3), 6);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarI, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), androidx.compose.foundation.shape.o.a(24));
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h22 = C20576h2.f28641a;
        bE2.C(-811070369);
        String str = c42119e.f405387b;
        if (str == null) {
            c20576h2 = c20576h22;
            aVar2 = aVar3;
            z12 = false;
        } else {
            float f12 = 10;
            c20576h2 = c20576h22;
            aVar2 = aVar3;
            com.akita.compose.component.button.m.c(str, new p(c42119e, aVar), com.akita.compose.theme.re23.b.c(bE2).q(), R1.k(0.0f, f12, 1, R1.m(c20576h22.a(aVar3, 1.0f, true), f12, 0.0f, 8, 0.0f, 10)), null, null, null, false, false, null, bE2, 512, 1008);
            z12 = false;
        }
        bE2.X(z12);
        bE2.C(-811055663);
        String str2 = c42119e2.f405387b;
        if (str2 == null) {
            z13 = z12;
        } else {
            float f13 = 10;
            com.akita.compose.component.button.m.c(str2, new q(c42119e2, aVar), com.akita.compose.theme.re23.b.c(bE2).K1(), R1.k(0.0f, f13, 1, R1.m(c20576h2.a(aVar2, 1.0f, true), 0.0f, 0.0f, f13, 0.0f, 11)), null, null, null, false, false, null, bE2, 512, 1008);
            z13 = false;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z13, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new r(c42119e, c42119e2, aVar, i12);
        }
    }

    public static final void d(C42119e c42119e, com.avito.android.deeplink_handler.handler.composite.a aVar, A a12, int i12) {
        boolean z12;
        B bE2 = a12.E(2115954699);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarI = R1.i(com.avito.android.services_portfolio.project.components.f.a(aVar2), 6);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarI, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), androidx.compose.foundation.shape.o.a(24));
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar4);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        bE2.C(-1345420535);
        String str = c42119e.f405387b;
        if (str == null) {
            z12 = false;
        } else {
            z12 = false;
            com.akita.compose.component.button.m.c(str, new y(c42119e, aVar), com.akita.compose.theme.re23.b.c(bE2).f2(), R1.i(C20588k2.d(aVar2, 1.0f), 10), null, null, null, false, false, null, bE2, 3584, 1008);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z12, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new z(c42119e, aVar, i12);
        }
    }
}
