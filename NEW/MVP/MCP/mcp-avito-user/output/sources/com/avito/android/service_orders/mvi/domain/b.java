package com.avito.android.service_orders.mvi.domain;

import Pu0.InterfaceC14839a;
import Qu0.C14936a;
import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_utils.events.FromPageType;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import hu0.C41169c;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: ServiceOrdersGetPhoneNumberUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/domain/b;", "Lcom/avito/android/service_orders/mvi/domain/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_orders.mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f279460a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14839a f279461b;

    /* compiled from: ServiceOrdersGetPhoneNumberUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.domain.ServiceOrdersGetPhoneNumberUseCaseImpl$invoke$1", f = "ServiceOrdersGetPhoneNumberUseCase.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 31, 39, 53}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279462q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279463r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f279465t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f279466u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f279465t = str;
            this.f279466u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f279465t, this.f279466u, continuation);
            aVar.f279463r = obj;
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279462q;
            String str = this.f279465t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f279463r;
                InterfaceC14839a interfaceC14839a = b.this.f279461b;
                this.f279463r = interfaceC43172j;
                this.f279462q = 1;
                obj = interfaceC14839a.b(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3 && i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f279463r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                Qu0.b content = ((C14936a) success.getResult()).getContent();
                String phone = content != null ? content.getPhone() : null;
                if (phone == null || phone.length() == 0) {
                    ServiceOrdersListInternalAction.ShowErrorToast showErrorToast = new ServiceOrdersListInternalAction.ShowErrorToast(new C41169c(str, FromPageType.f278332c), com.avito.android.printable_text.b.c(R.string.srv_orders_cannot_get_phone, new Serializable[0]), null);
                    this.f279463r = null;
                    this.f279462q = 3;
                    if (interfaceC43172j.emit(showErrorToast, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Qu0.b content2 = ((C14936a) success.getResult()).getContent();
                    String phone2 = content2 != null ? content2.getPhone() : null;
                    Qu0.b content3 = ((C14936a) success.getResult()).getContent();
                    ServiceOrdersListInternalAction.PhoneNumberSuccess phoneNumberSuccess = new ServiceOrdersListInternalAction.PhoneNumberSuccess(phone2, this.f279466u, content3 != null ? content3.getOrderId() : null);
                    this.f279463r = null;
                    this.f279462q = 2;
                    if (interfaceC43172j.emit(phoneNumberSuccess, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (typedResult instanceof TypedResult.Error) {
                ServiceOrdersListInternalAction.ShowErrorToast showErrorToast2 = new ServiceOrdersListInternalAction.ShowErrorToast(new C41169c(str, FromPageType.f278332c), com.avito.android.printable_text.b.c(R.string.srv_orders_cannot_get_phone, new Serializable[0]), ((TypedResult.Error) typedResult).getCause());
                this.f279463r = null;
                this.f279462q = 4;
                if (interfaceC43172j.emit(showErrorToast2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrdersGetPhoneNumberUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.domain.ServiceOrdersGetPhoneNumberUseCaseImpl$invoke$2", f = "ServiceOrdersGetPhoneNumberUseCase.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_orders.mvi.domain.b$b, reason: collision with other inner class name */
    public static final class C8310b extends SuspendLambda implements p<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279467q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279468r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f279469s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f279470t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8310b(String str, String str2, Continuation<? super C8310b> continuation) {
            super(2, continuation);
            this.f279469s = str;
            this.f279470t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8310b c8310b = new C8310b(this.f279469s, this.f279470t, continuation);
            c8310b.f279468r = obj;
            return c8310b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8310b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279467q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f279468r;
                ServiceOrdersListInternalAction.OnShowPhone onShowPhone = new ServiceOrdersListInternalAction.OnShowPhone(this.f279469s, this.f279470t);
                this.f279467q = 1;
                if (interfaceC43172j.emit(onShowPhone, this) == coroutine_suspended) {
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

    /* compiled from: ServiceOrdersGetPhoneNumberUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_orders.mvi.domain.ServiceOrdersGetPhoneNumberUseCaseImpl$invoke$3", f = "ServiceOrdersGetPhoneNumberUseCase.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super ServiceOrdersListInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279471q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f279472r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f279473s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f279474t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Continuation<? super c> continuation) {
            super(3, continuation);
            this.f279473s = str;
            this.f279474t = str2;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ServiceOrdersListInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(this.f279473s, this.f279474t, continuation);
            cVar.f279472r = interfaceC43172j;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279471q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f279472r;
                ServiceOrdersListInternalAction.OnGetPhoneRequestCompleted onGetPhoneRequestCompleted = new ServiceOrdersListInternalAction.OnGetPhoneRequestCompleted(this.f279473s, this.f279474t);
                this.f279471q = 1;
                if (interfaceC43172j.emit(onGetPhoneRequestCompleted, this) == coroutine_suspended) {
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
    public b(@k InterfaceC14839a interfaceC14839a, @k R0 r02) {
        this.f279460a = r02;
        this.f279461b = interfaceC14839a;
    }

    @Override // com.avito.android.service_orders.mvi.domain.a
    @k
    public final InterfaceC43160i<ServiceOrdersListInternalAction> a(@k String str, @l String str2) {
        return C43175k.I(this.f279460a.a(), new X(new C43137a0(new C8310b(str, str2, null), C43175k.G(new a(str, str2, null))), new c(str, str2, null)));
    }
}
