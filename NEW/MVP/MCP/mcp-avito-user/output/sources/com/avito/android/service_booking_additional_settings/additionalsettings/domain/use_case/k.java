package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import Ss0.InterfaceC15219a;
import Y41.p;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PostTechBreakSettingUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/k;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/j;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15219a> f274914a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f274915b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a f274916c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f274917d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Ls0.c f274918e;

    /* compiled from: PostTechBreakSettingUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.PostTechBreakSettingUseCaseImpl$invoke$1", f = "PostTechBreakSettingUseCase.kt", i = {0, 2, 2}, l = {39, 41, 53, 60}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingAdditionalSettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult.Success f274919q;

        /* renamed from: r, reason: collision with root package name */
        public int f274920r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f274921s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f274923u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f274923u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = k.this.new a(this.f274923u, continuation);
            aVar.f274921s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingAdditionalSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00e0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PostTechBreakSettingUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.PostTechBreakSettingUseCaseImpl$invoke$2", f = "PostTechBreakSettingUseCase.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingAdditionalSettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f274924q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f274925r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f274925r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingAdditionalSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f274924q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f274925r;
                ServiceBookingAdditionalSettingsInternalAction.OnSendDataShowLoader onSendDataShowLoader = new ServiceBookingAdditionalSettingsInternalAction.OnSendDataShowLoader(null, 1, null);
                this.f274924q = 1;
                if (interfaceC43172j.emit(onSendDataShowLoader, this) == coroutine_suspended) {
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
    public k(@Y61.k h31.e<InterfaceC15219a> eVar, @Y61.k R0 r02, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a aVar, @Y61.k x xVar, @Y61.k Ls0.c cVar) {
        this.f274914a = eVar;
        this.f274915b = r02;
        this.f274916c = aVar;
        this.f274917d = xVar;
        this.f274918e = cVar;
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.j
    @Y61.k
    public final InterfaceC43160i<ServiceBookingAdditionalSettingsInternalAction> a(@Y61.l String str) {
        return C43175k.I(this.f274915b.a(), new C43137a0(new b(2, null), C43175k.G(new a(str, null))));
    }
}
