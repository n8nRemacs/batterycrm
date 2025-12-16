package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import Qs0.InterfaceC14930a;
import Ss0.InterfaceC15219a;
import Y41.p;
import com.avito.android.B2;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PostTimeGapSettingUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/n;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/m;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC14930a> f274931a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15219a> f274932b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f274933c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f274934d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final B2 f274935e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a f274936f;

    /* compiled from: PostTimeGapSettingUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.PostTimeGapSettingUseCaseImpl$invoke$1", f = "PostTimeGapSettingUseCase.kt", i = {0, 1, 2, 5, 6}, l = {37, 44, 46, 56, 60, 72, 74, 84, 88}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingAdditionalSettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f274937q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f274938r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f274940t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f274940t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = n.this.new a(this.f274940t, continuation);
            aVar.f274938r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingAdditionalSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0155 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public n(@Y61.k h31.e<InterfaceC14930a> eVar, @Y61.k h31.e<InterfaceC15219a> eVar2, @Y61.k R0 r02, @Y61.k x xVar, @Y61.k B2 b22, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a aVar) {
        this.f274931a = eVar;
        this.f274932b = eVar2;
        this.f274933c = r02;
        this.f274934d = xVar;
        this.f274935e = b22;
        this.f274936f = aVar;
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.m
    @Y61.k
    public final InterfaceC43160i<ServiceBookingAdditionalSettingsInternalAction> a(@Y61.l String str) {
        return C43175k.I(this.f274933c.a(), C43175k.G(new a(str, null)));
    }
}
