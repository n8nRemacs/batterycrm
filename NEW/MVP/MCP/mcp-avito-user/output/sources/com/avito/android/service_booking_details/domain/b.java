package com.avito.android.service_booking_details.domain;

import Bs0.InterfaceC13182a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_details.mvi.entity.ServiceBookingItemDetailsInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetServiceBookingItemDetailsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/domain/b;", "Lcom/avito/android/service_booking_details/domain/a;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking_details.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC13182a> f277319a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f277320b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f277321c;

    /* compiled from: GetServiceBookingItemDetailsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.domain.GetServiceBookingItemDetailsUseCaseImpl$invoke$1", f = "GetServiceBookingItemDetailsUseCase.kt", i = {0, 1, 3, 3, 4, 4}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 31, AvailableCode.HMS_IS_SPOOF, 36}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult f277322q;

        /* renamed from: r, reason: collision with root package name */
        public InterfaceC43172j f277323r;

        /* renamed from: s, reason: collision with root package name */
        public int f277324s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f277325t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f277327v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f277327v = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f277327v, continuation);
            aVar.f277325t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_details.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k h31.e<InterfaceC13182a> eVar, @k g gVar, @k R0 r02) {
        this.f277319a = eVar;
        this.f277320b = gVar;
        this.f277321c = r02;
    }

    @Override // com.avito.android.service_booking_details.domain.a
    @k
    public final InterfaceC43160i<ServiceBookingItemDetailsInternalAction> a(@k String str) {
        return C43175k.I(this.f277321c.a(), C43175k.G(new a(str, null)));
    }
}
