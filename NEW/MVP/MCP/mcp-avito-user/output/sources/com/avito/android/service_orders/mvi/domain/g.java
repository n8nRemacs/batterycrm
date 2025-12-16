package com.avito.android.service_orders.mvi.domain;

import Ju0.InterfaceC14251a;
import Su0.C15227c;
import Su0.C15228d;
import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.error.z;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.preloading.coroutines.s;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.ServiceBookingAdditionalSettingsLink;
import com.avito.android.service_orders.ServiceOrdersArguments;
import com.avito.android.service_orders.analytics.ServiceOrdersListErrorScreenEvent;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListState;
import com.avito.android.util.R0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: ServiceOrdersListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/domain/g;", "Lcom/avito/android/service_orders/mvi/domain/d;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements com.avito.android.service_orders.mvi.domain.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC33302a<String, TypedResult<C15227c>> f279492a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.service_orders.list.d f279493b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f279494c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ServiceOrdersArguments f279495d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final B2 f279496e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC14251a f279497f;

    /* compiled from: ServiceOrdersListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.domain.ServiceOrdersListInteractorImpl$load$1", f = "ServiceOrdersListInteractor.kt", i = {0, 0}, l = {61, 63, 67}, m = "invokeSuspend", n = {"$this$flow", "isAppendingLoad"}, s = {"L$0", "I$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279498q;

        /* renamed from: r, reason: collision with root package name */
        public int f279499r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f279500s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f279501t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ g f279502u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f279503v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, g gVar, boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f279501t = str;
            this.f279502u = gVar;
            this.f279503v = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f279501t, this.f279502u, this.f279503v, continuation);
            aVar.f279500s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            int i12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i13 = this.f279499r;
            g gVar = this.f279502u;
            if (i13 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f279500s;
                String str = this.f279501t;
                i12 = ((str == null || str.length() == 0) ? 1 : 0) ^ 1;
                AbstractC33302a<String, TypedResult<C15227c>> abstractC33302a = gVar.f279492a;
                if (str == null) {
                    str = "";
                }
                this.f279500s = interfaceC43172j;
                this.f279498q = i12;
                this.f279499r = 1;
                obj = C43175k.J(s.a(abstractC33302a, str), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2 && i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                i12 = this.f279498q;
                interfaceC43172j = (InterfaceC43172j) this.f279500s;
                C42729a0.b(obj);
            }
            InterfaceC43172j interfaceC43172j2 = interfaceC43172j;
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                boolean z12 = i12 != 0;
                this.f279500s = null;
                this.f279499r = 2;
                if (g.b(gVar, interfaceC43172j2, success, z12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Error) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                String strK = z.k(error.getError());
                Throwable cause = error.getCause();
                if (cause == null) {
                    cause = new Throwable(error.getError().getF244063c());
                }
                this.f279500s = null;
                this.f279499r = 3;
                if (g.c(this.f279502u, interfaceC43172j2, this.f279503v, strK, cause, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrdersListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.domain.ServiceOrdersListInteractorImpl$load$2", f = "ServiceOrdersListInteractor.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279504q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279505r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f279505r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279504q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f279505r;
                ServiceOrdersListInternalAction.LoadInProgress loadInProgress = new ServiceOrdersListInternalAction.LoadInProgress();
                this.f279504q = 1;
                if (interfaceC43172j.emit(loadInProgress, this) == coroutine_suspended) {
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

    /* compiled from: ServiceOrdersListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.domain.ServiceOrdersListInteractorImpl$load$3", f = "ServiceOrdersListInteractor.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279506q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f279507r;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f279507r = interfaceC43172j;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279506q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f279507r;
                ServiceOrdersListInternalAction.LoadCompleted loadCompleted = ServiceOrdersListInternalAction.LoadCompleted.f279535b;
                this.f279506q = 1;
                if (interfaceC43172j.emit(loadCompleted, this) == coroutine_suspended) {
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

    /* compiled from: ServiceOrdersListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.domain.ServiceOrdersListInteractorImpl$load$4", f = "ServiceOrdersListInteractor.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279508q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f279509r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f279510s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f279512u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12, Continuation<? super d> continuation) {
            super(3, continuation);
            this.f279512u = z12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = g.this.new d(this.f279512u, continuation);
            dVar.f279509r = interfaceC43172j;
            dVar.f279510s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279508q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f279509r;
                Throwable th2 = this.f279510s;
                String strL = z.l(th2);
                this.f279509r = null;
                this.f279508q = 1;
                if (g.c(g.this, interfaceC43172j, this.f279512u, strL, th2, this) == coroutine_suspended) {
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

    @Inject
    public g(@k AbstractC33302a<String, TypedResult<C15227c>> abstractC33302a, @k com.avito.android.service_orders.list.d dVar, @k R0 r02, @l ServiceOrdersArguments serviceOrdersArguments, @k B2 b22, @k InterfaceC14251a interfaceC14251a) {
        this.f279492a = abstractC33302a;
        this.f279493b = dVar;
        this.f279494c = r02;
        this.f279495d = serviceOrdersArguments;
        this.f279496e = b22;
        this.f279497f = interfaceC14251a;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.service_orders.mvi.domain.g r22, kotlinx.coroutines.flow.InterfaceC43172j r23, com.avito.android.remote.model.TypedResult.Success r24, boolean r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_orders.mvi.domain.g.b(com.avito.android.service_orders.mvi.domain.g, kotlinx.coroutines.flow.j, com.avito.android.remote.model.TypedResult$Success, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object c(g gVar, InterfaceC43172j interfaceC43172j, boolean z12, String str, Throwable th2, SuspendLambda suspendLambda) {
        gVar.getClass();
        if (z12) {
            Object objEmit = interfaceC43172j.emit(new ServiceOrdersListInternalAction.ShowErrorFullScreen(null, str, th2, null, false, 24, null), suspendLambda);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }
        Object objEmit2 = interfaceC43172j.emit(new ServiceOrdersListInternalAction.ShowErrorToast(new ServiceOrdersListErrorScreenEvent(ServiceOrdersListErrorScreenEvent.ActionType.f279065d), com.avito.android.printable_text.b.f(str), th2), suspendLambda);
        return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : G0.f406611a;
    }

    @Override // com.avito.android.service_orders.mvi.domain.d
    @k
    public final InterfaceC43160i a(@l String str, boolean z12) {
        return C43175k.I(this.f279494c.a(), new C43152f0(new X(new C43137a0(new b(2, null), C43175k.G(new a(str, this, z12, null))), new c(3, null)), new d(z12, null)));
    }

    public final ServiceOrdersListState.ServiceOrdersListToolbar d(Su0.s sVar) {
        B2 b22 = this.f279496e;
        b22.getClass();
        n<Object> nVar = B2.f67184X[14];
        if (!((Boolean) b22.f67222p.a().invoke()).booleanValue()) {
            return new ServiceOrdersListState.ServiceOrdersListToolbar(com.avito.android.printable_text.b.c(R.string.srv_orders_list_title, new Serializable[0]), Collections.singletonList(new ServiceOrdersListState.ServiceOrdersListToolbar.ServiceOrdersButtonAction(R.attr.ic_settings24, new ServiceBookingAdditionalSettingsLink(), String.valueOf(R.attr.ic_settings24))));
        }
        ArrayList arrayList = null;
        if (sVar == null) {
            return null;
        }
        PrintableText printableTextF = com.avito.android.printable_text.b.f(sVar.getTitle());
        List<C15228d> listA = sVar.a();
        if (listA != null) {
            List<C15228d> list = listA;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (C15228d c15228d : list) {
                String iconTypeAndroid = c15228d.getIconTypeAndroid();
                String str = "";
                if (iconTypeAndroid == null) {
                    iconTypeAndroid = "";
                }
                Integer numA = com.avito.android.lib.util.q.a(iconTypeAndroid);
                int iIntValue = numA != null ? numA.intValue() : 0;
                DeepLink uri = c15228d.getUri();
                if (uri == null) {
                    uri = new NoMatchLink();
                }
                String iconTypeAndroid2 = c15228d.getIconTypeAndroid();
                if (iconTypeAndroid2 != null) {
                    str = iconTypeAndroid2;
                }
                arrayList.add(new ServiceOrdersListState.ServiceOrdersListToolbar.ServiceOrdersButtonAction(iIntValue, uri, str));
            }
        }
        return new ServiceOrdersListState.ServiceOrdersListToolbar(printableTextF, arrayList);
    }
}
