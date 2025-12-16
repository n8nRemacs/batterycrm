package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import Y41.p;
import com.avito.android.R;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.events.BookingTurnedOnOffEvent;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.d;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsToastInternalAction;
import com.avito.android.service_booking_utils.events.ActionStatusEvent;
import com.avito.android.util.R0;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PostBookingToggleUseCase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/h;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/e;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements e<ServiceBookingAdditionalSettingsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f274901a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f274902b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a f274903c;

    /* compiled from: PostBookingToggleUseCase.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/d;", "loadingState", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "<anonymous>", "(Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.PostBookingToggleUseCaseMviImpl$invoke$1", f = "PostBookingToggleUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<d, Continuation<? super InterfaceC43160i<? extends ServiceBookingAdditionalSettingsInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f274904q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f274905r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ h f274906s;

        /* compiled from: PostBookingToggleUseCase.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.PostBookingToggleUseCaseMviImpl$invoke$1$1", f = "PostBookingToggleUseCase.kt", i = {0}, l = {46, 55}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        /* renamed from: com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.h$a$a, reason: collision with other inner class name */
        public static final class C8154a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingAdditionalSettingsInternalAction>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f274907q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f274908r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ d f274909s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ h f274910t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8154a(d dVar, h hVar, Continuation<? super C8154a> continuation) {
                super(2, continuation);
                this.f274909s = dVar;
                this.f274910t = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C8154a c8154a = new C8154a(this.f274909s, this.f274910t, continuation);
                c8154a.f274908r = obj;
                return c8154a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super ServiceBookingAdditionalSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((C8154a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                InterfaceC43172j interfaceC43172j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f274907q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    interfaceC43172j = (InterfaceC43172j) this.f274908r;
                    ServiceBookingAdditionalSettingsToastInternalAction.ShowSuccessToast showSuccessToast = new ServiceBookingAdditionalSettingsToastInternalAction.ShowSuccessToast(((d.b) this.f274909s).f274887a, new ActionStatusEvent(ActionStatusEvent.Action.f278313e, ActionStatusEvent.Status.f278326c, null, null, 12, null));
                    this.f274908r = interfaceC43172j;
                    this.f274907q = 1;
                    if (interfaceC43172j.emit(showSuccessToast, this) == coroutine_suspended) {
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
                    interfaceC43172j = (InterfaceC43172j) this.f274908r;
                    C42729a0.b(obj);
                }
                InterfaceC43160i<ServiceBookingAdditionalSettingsInternalAction> interfaceC43160iInvoke = this.f274910t.f274903c.invoke();
                this.f274908r = null;
                this.f274907q = 2;
                if (C43175k.u(this, interfaceC43160iInvoke, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, h hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f274905r = z12;
            this.f274906s = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f274905r, this.f274906s, continuation);
            aVar.f274904q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(d dVar, Continuation<? super InterfaceC43160i<? extends ServiceBookingAdditionalSettingsInternalAction>> continuation) {
            return ((a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            d dVar = (d) this.f274904q;
            if (dVar instanceof d.c) {
                return new C43210w(new ServiceBookingAdditionalSettingsInternalAction.OnSendDataShowLoader(new BookingTurnedOnOffEvent(this.f274905r)));
            }
            if (dVar instanceof d.b) {
                return C43175k.G(new C8154a(dVar, this.f274906s, null));
            }
            if (dVar instanceof d.a) {
                return new C43210w(new ServiceBookingAdditionalSettingsToastInternalAction.ShowErrorToast(com.avito.android.printable_text.b.c(R.string.sb_additional_settings_toast_error_text, new Serializable[0]), new ActionStatusEvent(ActionStatusEvent.Action.f278313e, ActionStatusEvent.Status.f278327d, null, null, 12, null)));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public h(@Y61.k R0 r02, @Y61.k f fVar, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a aVar) {
        this.f274901a = r02;
        this.f274902b = fVar;
        this.f274903c = aVar;
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.e
    @Y61.k
    public final InterfaceC43160i<ServiceBookingAdditionalSettingsInternalAction> a(boolean z12) {
        return C43175k.I(this.f274901a.a(), C43175k.B(new a(z12, this, null), this.f274902b.a(z12)));
    }
}
