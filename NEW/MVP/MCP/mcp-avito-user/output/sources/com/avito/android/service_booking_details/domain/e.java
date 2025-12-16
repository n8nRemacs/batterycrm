package com.avito.android.service_booking_details.domain;

import Pu0.InterfaceC14839a;
import Qu0.C14936a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_details.mvi.entity.ServiceBookingItemDetailsInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: ServiceBookingGetPhoneNumberUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/domain/e;", "Lcom/avito/android/service_booking_details/domain/d;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14839a f277331a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f277332b;

    /* compiled from: ServiceBookingGetPhoneNumberUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.domain.ServiceBookingGetPhoneNumberUseCaseImpl$invoke$1", f = "ServiceBookingGetPhoneNumberUseCase.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 36, 48}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277333q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277334r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f277336t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f277337u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f277336t = str;
            this.f277337u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = e.this.new a(this.f277336t, this.f277337u, continuation);
            aVar.f277334r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277333q;
            String str = this.f277336t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f277334r;
                InterfaceC14839a interfaceC14839a = e.this.f277331a;
                this.f277334r = interfaceC43172j;
                this.f277333q = 1;
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
                interfaceC43172j = (InterfaceC43172j) this.f277334r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            String str2 = this.f277337u;
            if (z12) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                Qu0.b content = ((C14936a) success.getResult()).getContent();
                String phone = content != null ? content.getPhone() : null;
                if (phone == null || phone.length() == 0) {
                    ServiceBookingItemDetailsInternalAction.PhoneNumberErrorToast phoneNumberErrorToast = new ServiceBookingItemDetailsInternalAction.PhoneNumberErrorToast(com.avito.android.printable_text.b.c(R.string.sb_details_cannot_get_phone, new Serializable[0]), null, str2, str);
                    this.f277334r = null;
                    this.f277333q = 3;
                    if (interfaceC43172j.emit(phoneNumberErrorToast, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Qu0.b content2 = ((C14936a) success.getResult()).getContent();
                    String phone2 = content2 != null ? content2.getPhone() : null;
                    Qu0.b content3 = ((C14936a) success.getResult()).getContent();
                    ServiceBookingItemDetailsInternalAction.PhoneNumberSuccess phoneNumberSuccess = new ServiceBookingItemDetailsInternalAction.PhoneNumberSuccess(phone2, str2, content3 != null ? content3.getOrderId() : null);
                    this.f277334r = null;
                    this.f277333q = 2;
                    if (interfaceC43172j.emit(phoneNumberSuccess, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (typedResult instanceof TypedResult.Error) {
                ServiceBookingItemDetailsInternalAction.PhoneNumberErrorToast phoneNumberErrorToast2 = new ServiceBookingItemDetailsInternalAction.PhoneNumberErrorToast(com.avito.android.printable_text.b.c(R.string.sb_details_cannot_get_phone, new Serializable[0]), ((TypedResult.Error) typedResult).getCause(), str2, str);
                this.f277334r = null;
                this.f277333q = 4;
                if (interfaceC43172j.emit(phoneNumberErrorToast2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingGetPhoneNumberUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.domain.ServiceBookingGetPhoneNumberUseCaseImpl$invoke$2", f = "ServiceBookingGetPhoneNumberUseCase.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277338q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277339r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f277340s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f277341t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f277340s = str;
            this.f277341t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f277340s, this.f277341t, continuation);
            bVar.f277339r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277338q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277339r;
                ServiceBookingItemDetailsInternalAction.OnShowPhone onShowPhone = new ServiceBookingItemDetailsInternalAction.OnShowPhone(this.f277340s, this.f277341t);
                this.f277338q = 1;
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

    @Inject
    public e(@k InterfaceC14839a interfaceC14839a, @k R0 r02) {
        this.f277331a = interfaceC14839a;
        this.f277332b = r02;
    }

    @Override // com.avito.android.service_booking_details.domain.d
    @k
    public final InterfaceC43160i<ServiceBookingItemDetailsInternalAction> a(@k String str, @k String str2) {
        return C43175k.I(this.f277332b.a(), new C43137a0(new b(str, str2, null), C43175k.G(new a(str, str2, null))));
    }
}
