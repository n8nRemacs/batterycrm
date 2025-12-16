package com.avito.android.short_term_rent.soft_booking.domain;

import Hl0.InterfaceC14002a;
import Il0.C14129b;
import Il0.InterfaceC14128a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.short_term_rent.generated.api.api_2_str_booking_request_pay_post.PaymentType;
import com.avito.android.short_term_rent.common.entity.GuestsDetailedValue;
import com.avito.android.short_term_rent.common.entity.PromoCode;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.GuestCountOption;
import com.avito.android.util.C35936s;
import java.util.Date;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pw0.C47157a;
import pw0.C47158b;
import pw0.C47159c;
import pw0.C47160d;

/* compiled from: StrSoftBookingApplyInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.domain.StrSoftBookingApplyInteractorImpl$invoke$1", f = "StrSoftBookingApplyInteractor.kt", i = {0, 0}, l = {107, 114, 116, 121, 127}, m = "invokeSuspend", n = {"$this$flow", "promoCode"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f282600q;

    /* renamed from: r, reason: collision with root package name */
    public int f282601r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f282602s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282603t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f282604u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.p<String, String, G0> f282605v;

    /* compiled from: StrSoftBookingApplyInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<PaymentType.Type> f282606a = kotlin.enums.c.a(PaymentType.Type.values());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, i iVar, Y41.p<? super String, ? super String, G0> pVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f282603t = aVar;
        this.f282604u = iVar;
        this.f282605v = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f282603t, this.f282604u, this.f282605v, continuation);
        eVar.f282602s = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        int iIntValue;
        String strL;
        pw0.h hVar;
        Object next;
        PaymentType paymentType;
        Object objA;
        InterfaceC43172j interfaceC43172j;
        String str;
        String str2;
        GuestsDetailedValue guestsDetailedValue;
        GuestsDetailedValue guestsDetailedValue2;
        Integer totalCount;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282601r;
        i iVar = this.f282604u;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f282602s;
            com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar = this.f282603t;
            C47157a c47157a = aVar.f282795d;
            String str3 = c47157a.f428849c;
            if (str3 == null) {
                return G0.f406611a;
            }
            C47157a c47157a2 = aVar.f282795d;
            C47160d c47160d = c47157a.f428852f;
            if (c47160d == null || (guestsDetailedValue2 = c47160d.f428865c) == null || (totalCount = guestsDetailedValue2.getTotalCount()) == null) {
                GuestCountOption guestCountOption = c47157a2.f428850d;
                if (guestCountOption == null) {
                    return G0.f406611a;
                }
                iIntValue = guestCountOption.f282832c;
            } else {
                iIntValue = totalCount.intValue();
            }
            Date date = c47157a2.f428847a;
            if (date == null) {
                return G0.f406611a;
            }
            Date date2 = c47157a2.f428848b;
            if (date2 == null) {
                return G0.f406611a;
            }
            PromoCode promoCode = aVar.f282799h.f428880a;
            String str4 = promoCode != null ? promoCode.f282220e : null;
            pw0.g gVar = aVar.f282798g;
            rw0.j jVar = gVar.f428876b;
            if (jVar != null ? L.f(jVar.f437223i, Boxing.boxBoolean(true)) : false) {
                str4 = null;
            }
            C47160d c47160d2 = c47157a2.f428852f;
            if (c47160d2 == null || (guestsDetailedValue = c47160d2.f428865c) == null) {
                strL = null;
            } else {
                strL = (guestsDetailedValue.getVersion() == null || guestsDetailedValue.getTotalCount() == null || guestsDetailedValue.getAdultsCount() == null) ? null : iVar.f282619e.l(guestsDetailedValue);
            }
            Long lZ02 = C43066x.z0(str3);
            if (lZ02 == null) {
                return G0.f406611a;
            }
            long jLongValue = lZ02.longValue();
            Long lBoxLong = gVar.f428876b != null ? Boxing.boxLong(r5.f437217c) : null;
            rw0.j jVar2 = gVar.f428876b;
            String str5 = jVar2 != null ? jVar2.f437216b : null;
            C47159c c47159c = aVar.f282796e;
            C47158b c47158b = c47159c.f428861c;
            String str6 = c47158b != null ? c47158b.f428856b : null;
            C47158b c47158b2 = c47159c.f428859a;
            String str7 = c47158b2 != null ? c47158b2.f428856b : null;
            C47158b c47158b3 = c47159c.f428860b;
            Il0.g gVar2 = new Il0.g(str6, str7, c47158b3 != null ? c47158b3.f428856b : null);
            long j12 = iIntValue;
            Il0.e eVar = new Il0.e(com.avito.android.short_term_rent.utils.j.b(date2), com.avito.android.short_term_rent.utils.j.b(date));
            Il0.c cVar = new Il0.c(null, new Il0.d("none", "booking"), null);
            Iterator it = ((AbstractC42738c) a.f282606a).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                hVar = aVar.f282804m;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((PaymentType.Type) next).f254365b, hVar != null ? hVar.f428877a : null)) {
                    break;
                }
            }
            PaymentType.Type type = (PaymentType.Type) next;
            if (type != null) {
                paymentType = new PaymentType((hVar == null || (str2 = hVar.f428878b) == null) ? null : new Il0.f(str2), type);
            } else {
                paymentType = null;
            }
            C14129b c14129b = new C14129b(lBoxLong, str5, gVar2, Boxing.boxLong(j12), strL, aVar.f282803l, jLongValue, aVar.f282802k, paymentType, str4, eVar, cVar, aVar.f282801j);
            InterfaceC14002a interfaceC14002a = iVar.f282615a;
            this.f282602s = interfaceC43172j2;
            this.f282600q = str4;
            this.f282601r = 1;
            objA = interfaceC14002a.a(c14129b, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
            str = str4;
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            str = this.f282600q;
            interfaceC43172j = (InterfaceC43172j) this.f282602s;
            C42729a0.b(obj);
            objA = obj;
        }
        TypedResult typedResult = (TypedResult) objA;
        if (typedResult instanceof TypedResult.Success) {
            InterfaceC14128a interfaceC14128a = (InterfaceC14128a) ((TypedResult.Success) typedResult).getResult();
            if (interfaceC14128a instanceof InterfaceC14128a.C0486a) {
                InterfaceC14128a.C0486a c0486a = (InterfaceC14128a.C0486a) interfaceC14128a;
                if (c0486a.getPaymentUrl() != null) {
                    this.f282605v.invoke(c0486a.getOrderId(), str);
                    StrSoftBookingInternalAction.PaymentByUrl paymentByUrl = new StrSoftBookingInternalAction.PaymentByUrl(c0486a.getPaymentUrl());
                    this.f282602s = null;
                    this.f282600q = null;
                    this.f282601r = 2;
                    if (interfaceC43172j.emit(paymentByUrl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    StrSoftBookingInternalAction.OpenDeeplink openDeeplink = new StrSoftBookingInternalAction.OpenDeeplink(c0486a.getRedirect(), null);
                    this.f282602s = null;
                    this.f282600q = null;
                    this.f282601r = 3;
                    if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (interfaceC14128a instanceof InterfaceC14128a.b) {
                StrSoftBookingInternalAction.PaymentProcessError paymentProcessError = new StrSoftBookingInternalAction.PaymentProcessError(new ApiError.UnknownError(((InterfaceC14128a.b) interfaceC14128a).getMessage(), null, null, 6, null));
                this.f282602s = null;
                this.f282600q = null;
                this.f282601r = 4;
                if (interfaceC43172j.emit(paymentProcessError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            StrSoftBookingInternalAction.PaymentProcessError paymentProcessError2 = new StrSoftBookingInternalAction.PaymentProcessError(iVar.f282617c.a(C35936s.a(error.getError(), error.getCause())));
            this.f282602s = null;
            this.f282600q = null;
            this.f282601r = 5;
            if (interfaceC43172j.emit(paymentProcessError2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
