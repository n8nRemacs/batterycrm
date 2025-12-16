package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import Qs0.InterfaceC14930a;
import Y41.p;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
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

/* compiled from: GetAdditionalSettingsScreenDataUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/b;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC14930a> f274877a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f274878b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.k f274879c;

    /* compiled from: GetAdditionalSettingsScreenDataUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.GetSettingsScreenDataUseCaseImpl$invoke$1", f = "GetAdditionalSettingsScreenDataUseCase.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 35}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f274880q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f274881r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f274881r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f274880q
                com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.b r2 = com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.b.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto Lad
            L24:
                java.lang.Object r1 = r7.f274881r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5f
            L2c:
                java.lang.Object r1 = r7.f274881r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f274881r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction$Loading r1 = new com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction$Loading
                r1.<init>()
                r7.f274881r = r8
                r7.f274880q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                h31.e<Qs0.a> r8 = r2.f274877a
                java.lang.Object r8 = r8.get()
                Qs0.a r8 = (Qs0.InterfaceC14930a) r8
                r7.f274881r = r1
                r7.f274880q = r5
                java.lang.Object r8 = r8.c(r7)
                if (r8 != r0) goto L5f
                return r0
            L5f:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L84
                com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction$SuccessContent r3 = new com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction$SuccessContent
                com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.k r2 = r2.f274879c
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                Rs0.a r8 = (Rs0.C15078a) r8
                com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState$ServiceBookingAdditionalSettingsContent r8 = r2.a(r8)
                r3.<init>(r8)
                r7.f274881r = r6
                r7.f274880q = r4
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto Lad
                return r0
            L84:
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lad
                com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction$ShowError r2 = new com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction$ShowError
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                java.lang.Throwable r4 = r8.getCause()
                if (r4 != 0) goto L9f
                java.lang.Throwable r4 = new java.lang.Throwable
                com.avito.android.remote.error.ApiError r8 = r8.getError()
                java.lang.String r8 = r8.getF244063c()
                r4.<init>(r8)
            L9f:
                r2.<init>(r4)
                r7.f274881r = r6
                r7.f274880q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto Lad
                return r0
            Lad:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@Y61.k h31.e<InterfaceC14930a> eVar, @Y61.k R0 r02, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.k kVar) {
        this.f274877a = eVar;
        this.f274878b = r02;
        this.f274879c = kVar;
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a
    @Y61.k
    public final InterfaceC43160i<ServiceBookingAdditionalSettingsInternalAction> invoke() {
        return C43175k.I(this.f274878b.a(), C43175k.G(new a(null)));
    }
}
