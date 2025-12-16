package com.avito.android.service_booking.mvi.step.mvi;

import com.avito.android.service_booking.mvi.di.v;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingMviStepBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements com.avito.android.arch.mvi.b<ServiceBookingMviStepInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking.mvi.domain.interactors.a f274762a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Map<String, Set<Object>>> f274763b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f274764c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f274765d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f274766e;

    /* compiled from: ServiceBookingMviStepBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking.mvi.step.mvi.ServiceBookingMviStepBootstrap$produce$1", f = "ServiceBookingMviStepBootstrap.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingMviStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f274767q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f274768r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = i.this.new a(continuation);
            aVar.f274768r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingMviStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f274767q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f274768r;
                i iVar = i.this;
                Map<String, Map<String, Set<Object>>> map = iVar.f274763b;
                String str = iVar.f274765d;
                if (map.containsKey(str)) {
                    InterfaceC43160i<ServiceBookingMviStepInternalAction> interfaceC43160iB = iVar.f274762a.b(iVar.f274764c, str, iVar.f274766e, false);
                    this.f274767q = 1;
                    if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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

    @Inject
    public i(@Y61.k com.avito.android.service_booking.mvi.domain.interactors.a aVar, @Y61.k Map<String, Map<String, Set<Object>>> map, @Y61.l @com.avito.android.service_booking.mvi.di.a String str, @v @Y61.k String str2, @Y61.l @com.avito.android.service_booking.mvi.di.b String str3) {
        this.f274762a = aVar;
        this.f274763b = map;
        this.f274764c = str;
        this.f274765d = str2;
        this.f274766e = str3;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ServiceBookingMviStepInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
