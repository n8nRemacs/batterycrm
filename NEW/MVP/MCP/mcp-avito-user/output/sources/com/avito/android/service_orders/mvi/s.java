package com.avito.android.service_orders.mvi;

import Mu0.InterfaceC14531a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListState;
import com.avito.android.service_orders.mvi.entity.a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceOrdersListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_orders/mvi/s;", "Lcom/avito/android/arch/mvi/a;", "LMu0/a;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListState;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements com.avito.android.arch.mvi.a<InterfaceC14531a, ServiceOrdersListInternalAction, ServiceOrdersListState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_orders.mvi.domain.d f279628a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_orders.mvi.domain.a f279629b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_utils.ux_feedback.h f279630c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_utils.ux_feedback.e f279631d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f279632e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f279633f = C42727D.c(new j());

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f279634g = C42727D.c(new i());

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$process$10", f = "ServiceOrdersListActor.kt", i = {0, 1, 2}, l = {139, 140, 142, 144}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279635q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279636r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ s f279637s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14531a f279638t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14531a interfaceC14531a, s sVar, Continuation continuation) {
            super(2, continuation);
            this.f279637s = sVar;
            this.f279638t = interfaceC14531a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f279638t, this.f279637s, continuation);
            aVar.f279636r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f279635q
                r2 = 0
                com.avito.android.service_orders.mvi.s r3 = r8.f279637s
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L3c
                if (r1 == r7) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 != r4) goto L1c
                kotlin.C42729a0.b(r9)
                goto L92
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                java.lang.Object r1 = r8.f279636r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L7a
            L2c:
                java.lang.Object r1 = r8.f279636r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L62
            L34:
                java.lang.Object r1 = r8.f279636r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L51
            L3c:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f279636r
                r1 = r9
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$ShowLoading r9 = com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction.ShowLoading.f279566b
                r8.f279636r = r1
                r8.f279635q = r7
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L51
                return r0
            L51:
                com.avito.android.service_orders.mvi.domain.d r9 = r3.f279628a
                kotlinx.coroutines.flow.i r9 = r9.a(r2, r7)
                r8.f279636r = r1
                r8.f279635q = r6
                java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r8, r9, r1)
                if (r9 != r0) goto L62
                return r0
            L62:
                Mu0.a r9 = r8.f279638t
                Mu0.a$s r9 = (Mu0.InterfaceC14531a.s) r9
                java.lang.String r9 = r9.f11071a
                if (r9 == 0) goto L7a
                com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$ShowToast r6 = new com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$ShowToast
                r6.<init>(r9)
                r8.f279636r = r1
                r8.f279635q = r5
                java.lang.Object r9 = r1.emit(r6, r8)
                if (r9 != r0) goto L7a
                return r0
            L7a:
                com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$OpenDeepLink r9 = new com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$OpenDeepLink
                kotlin.C r3 = r3.f279633f
                java.lang.Object r3 = r3.getValue()
                com.avito.android.deep_linking.links.DeepLink r3 = (com.avito.android.deep_linking.links.DeepLink) r3
                r9.<init>(r3)
                r8.f279636r = r2
                r8.f279635q = r4
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L92
                return r0
            L92:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_orders.mvi.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$process$11", f = "ServiceOrdersListActor.kt", i = {}, l = {152, 159}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279639q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279640r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14531a f279641s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ s f279642t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC14531a interfaceC14531a, s sVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f279641s = interfaceC14531a;
            this.f279642t = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f279641s, this.f279642t, continuation);
            bVar.f279640r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279639q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f279640r;
                InterfaceC14531a.p pVar = (InterfaceC14531a.p) this.f279641s;
                ServiceOrdersListSnippetItem.a aVar = pVar.f11068b;
                if (aVar.f279250d != null) {
                    com.avito.android.service_orders.mvi.domain.a aVar2 = this.f279642t.f279629b;
                    String str = pVar.f11067a;
                    if (str == null) {
                        str = "";
                    }
                    InterfaceC43160i<ServiceOrdersListInternalAction> interfaceC43160iA = aVar2.a(str, aVar.f279247a);
                    this.f279639q = 1;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ServiceOrdersListInternalAction.CopyPhoneToClipboard copyPhoneToClipboard = new ServiceOrdersListInternalAction.CopyPhoneToClipboard(pVar.f11067a, aVar);
                    this.f279639q = 2;
                    if (interfaceC43172j.emit(copyPhoneToClipboard, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$process$2", f = "ServiceOrdersListActor.kt", i = {0}, l = {62, 63}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279643q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279644r;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = s.this.new c(continuation);
            cVar.f279644r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279643q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f279644r;
                ServiceOrdersListInternalAction.ShowLoading showLoading = ServiceOrdersListInternalAction.ShowLoading.f279566b;
                this.f279644r = interfaceC43172j;
                this.f279643q = 1;
                if (interfaceC43172j.emit(showLoading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f279644r;
                C42729a0.b(obj);
            }
            InterfaceC43160i interfaceC43160iA = s.this.f279628a.a(null, true);
            this.f279644r = null;
            this.f279643q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$process$3", f = "ServiceOrdersListActor.kt", i = {0}, l = {67, 68}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279646q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279647r;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = s.this.new d(continuation);
            dVar.f279647r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279646q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f279647r;
                ServiceOrdersListInternalAction.ShowSwipeToRefreshOnEmptyScreen showSwipeToRefreshOnEmptyScreen = ServiceOrdersListInternalAction.ShowSwipeToRefreshOnEmptyScreen.f279570b;
                this.f279647r = interfaceC43172j;
                this.f279646q = 1;
                if (interfaceC43172j.emit(showSwipeToRefreshOnEmptyScreen, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f279647r;
                C42729a0.b(obj);
            }
            InterfaceC43160i interfaceC43160iA = s.this.f279628a.a(null, false);
            this.f279647r = null;
            this.f279646q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$process$4", f = "ServiceOrdersListActor.kt", i = {0}, l = {72, 73}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279649q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279650r;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = s.this.new e(continuation);
            eVar.f279650r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279649q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f279650r;
                ServiceOrdersListInternalAction.ShowSwipeToRefreshOnList showSwipeToRefreshOnList = ServiceOrdersListInternalAction.ShowSwipeToRefreshOnList.f279571b;
                this.f279650r = interfaceC43172j;
                this.f279649q = 1;
                if (interfaceC43172j.emit(showSwipeToRefreshOnList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f279650r;
                C42729a0.b(obj);
            }
            InterfaceC43160i interfaceC43160iA = s.this.f279628a.a(null, false);
            this.f279650r = null;
            this.f279649q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$process$7", f = "ServiceOrdersListActor.kt", i = {0, 1}, l = {121, 122, 123}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279652q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279653r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14531a f279654s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ s f279655t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC14531a interfaceC14531a, s sVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f279654s = interfaceC14531a;
            this.f279655t = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f279654s, this.f279655t, continuation);
            fVar.f279653r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f279652q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r7)
                goto L6c
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r1 = r6.f279653r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L58
            L25:
                java.lang.Object r1 = r6.f279653r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4b
            L2d:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f279653r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$OnActionSuccess r1 = new com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$OnActionSuccess
                Mu0.a r5 = r6.f279654s
                Mu0.a$m r5 = (Mu0.InterfaceC14531a.m) r5
                java.lang.String r5 = r5.f11064a
                r1.<init>(r5)
                r6.f279653r = r7
                r6.f279652q = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r7
            L4b:
                com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction$ShowLoading r7 = com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction.ShowLoading.f279566b
                r6.f279653r = r1
                r6.f279652q = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L58
                return r0
            L58:
                com.avito.android.service_orders.mvi.s r7 = r6.f279655t
                com.avito.android.service_orders.mvi.domain.d r7 = r7.f279628a
                r3 = 0
                kotlinx.coroutines.flow.i r7 = r7.a(r3, r4)
                r6.f279653r = r3
                r6.f279652q = r2
                java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.u(r6, r7, r1)
                if (r7 != r0) goto L6c
                return r0
            L6c:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_orders.mvi.s.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$process$8", f = "ServiceOrdersListActor.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279656q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279657r;

        public g() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(2, continuation);
            gVar.f279657r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279656q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f279657r;
                ServiceOrdersListInternalAction.OnResume onResume = ServiceOrdersListInternalAction.OnResume.f279542b;
                this.f279656q = 1;
                if (interfaceC43172j.emit(onResume, this) == coroutine_suspended) {
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

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$process$9", f = "ServiceOrdersListActor.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279658q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279659r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14531a f279660s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ s f279661t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC14531a interfaceC14531a, s sVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f279660s = interfaceC14531a;
            this.f279661t = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = new h(this.f279660s, this.f279661t, continuation);
            hVar.f279659r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279658q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f279659r;
                if (((InterfaceC14531a.o) this.f279660s).f11066a == BookingSettingsStatus.f278278d) {
                    ServiceOrdersListInternalAction.OpenDeepLink openDeepLink = new ServiceOrdersListInternalAction.OpenDeepLink((DeepLink) this.f279661t.f279634g.getValue());
                    this.f279658q = 1;
                    if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeepLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<DeepLink> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final DeepLink invoke() {
            return s.this.f279631d.a();
        }
    }

    /* compiled from: ServiceOrdersListActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeepLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends N implements Y41.a<DeepLink> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final DeepLink invoke() {
            return s.this.f279630c.a();
        }
    }

    @Inject
    public s(@Y61.k com.avito.android.service_orders.mvi.domain.d dVar, @Y61.k com.avito.android.service_orders.mvi.domain.a aVar, @Y61.k com.avito.android.service_booking_utils.ux_feedback.h hVar, @Y61.k com.avito.android.service_booking_utils.ux_feedback.e eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f279628a = dVar;
        this.f279629b = aVar;
        this.f279630c = hVar;
        this.f279631d = eVar;
        this.f279632e = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new t(this, aVar, null), C43175k.N(C43175k.Y(kotlinx.coroutines.rx3.y.a(this.f279632e.d9()), new com.avito.android.service_orders.mvi.j(3, null)), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<ServiceOrdersListInternalAction> b(@Y61.k InterfaceC14531a interfaceC14531a, @Y61.k ServiceOrdersListState serviceOrdersListState) {
        C43210w c43210w;
        if (interfaceC14531a instanceof InterfaceC14531a.k) {
            return C43175k.G(new c(null));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.t) {
            return C43175k.G(new d(null));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.u) {
            return C43175k.G(new e(null));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.C0704a) {
            if (serviceOrdersListState.f279581g) {
                return C43175k.w();
            }
            a.c cVar = serviceOrdersListState.f279578d;
            if (cVar == null) {
                return C43175k.w();
            }
            List<com.avito.conveyor_item.a> list = cVar.f279598a;
            Iterator<com.avito.conveyor_item.a> it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (L.f(it.next().getF200606b(), ((InterfaceC14531a.C0704a) interfaceC14531a).f11050a)) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                return C43175k.w();
            }
            int size = list.size() - 5;
            String str = cVar.f279599b;
            return (str == null || str.length() == 0 || i12 <= size) ? C43175k.w() : this.f279628a.a(str, false);
        }
        if (interfaceC14531a instanceof InterfaceC14531a.e) {
            return new C43210w(new ServiceOrdersListInternalAction.ClickEmptyButton(((InterfaceC14531a.e) interfaceC14531a).f11054a));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.j) {
            InterfaceC14531a.j jVar = (InterfaceC14531a.j) interfaceC14531a;
            jVar.getClass();
            return new C43210w(new ServiceOrdersListInternalAction.ClickSnippetMoreActionsBtn(jVar.f11061a));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.h) {
            InterfaceC14531a.h hVar = (InterfaceC14531a.h) interfaceC14531a;
            return new C43210w(new ServiceOrdersListInternalAction.ClickSnippetActionBtn(hVar.f11057a, hVar.f11058b, hVar.f11059c));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.c) {
            return new C43210w(new ServiceOrdersListInternalAction.ClickCalendarBtn(((InterfaceC14531a.c) interfaceC14531a).f11052a));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.i) {
            DeepLink deepLink = ((InterfaceC14531a.i) interfaceC14531a).f11060a;
            return deepLink != null ? new C43210w(new ServiceOrdersListInternalAction.OpenDeepLink(deepLink)) : C43175k.w();
        }
        if (interfaceC14531a instanceof InterfaceC14531a.g) {
            return new C43210w(new ServiceOrdersListInternalAction.OpenDeepLink(((InterfaceC14531a.g) interfaceC14531a).f11056a));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.d) {
            return new C43210w(new ServiceOrdersListInternalAction.ClickCloseReminderBanner(((InterfaceC14531a.d) interfaceC14531a).f11053a));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.f) {
            DeepLink deepLink2 = ((InterfaceC14531a.f) interfaceC14531a).f11055a;
            return deepLink2 != null ? new C43210w(new ServiceOrdersListInternalAction.OpenDeepLink(deepLink2)) : C43175k.w();
        }
        if (interfaceC14531a instanceof InterfaceC14531a.m) {
            return C43175k.G(new f(interfaceC14531a, this, null));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.l) {
            return new C43210w(new ServiceOrdersListInternalAction.OnActionFailure(((InterfaceC14531a.l) interfaceC14531a).f11063a));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.r) {
            return C43175k.G(new g(2, null));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.o) {
            return C43175k.G(new h(interfaceC14531a, this, null));
        }
        if (interfaceC14531a instanceof InterfaceC14531a.s) {
            return C43175k.G(new a(interfaceC14531a, this, null));
        }
        if (interfaceC14531a.equals(InterfaceC14531a.n.f11065a)) {
            c43210w = new C43210w(ServiceOrdersListInternalAction.ShowUxFeedbackOrderCancellation.f279573b);
        } else {
            if (interfaceC14531a instanceof InterfaceC14531a.q) {
                return new C43210w(new ServiceOrdersListInternalAction.OnDeeplinkClicked(((InterfaceC14531a.q) interfaceC14531a).f11069a));
            }
            if (!(interfaceC14531a instanceof InterfaceC14531a.b)) {
                if (interfaceC14531a instanceof InterfaceC14531a.p) {
                    return C43175k.G(new b(interfaceC14531a, this, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(ServiceOrdersListInternalAction.CancelScreen.f279525b);
        }
        return c43210w;
    }
}
