package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import Qs0.InterfaceC14930a;
import Ss0.InterfaceC15219a;
import Y41.p;
import com.avito.android.B2;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PostBookingToggleUseCase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/f;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/e;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/d;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e<d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC14930a> f274889a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15219a> f274890b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B2 f274891c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f274892d;

    /* compiled from: PostBookingToggleUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/use_case/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.PostBookingToggleUseCaseImpl$invoke$1", f = "PostBookingToggleUseCase.kt", i = {0, 1, 4}, l = {81, 83, 85, 89, 93, 95, 99}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f274893q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f274894r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f274896t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f274896t = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(this.f274896t, continuation);
            aVar.f274894r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k h31.e<InterfaceC14930a> eVar, @Y61.k h31.e<InterfaceC15219a> eVar2, @Y61.k B2 b22, @Y61.k x xVar) {
        this.f274889a = eVar;
        this.f274890b = eVar2;
        this.f274891c = b22;
        this.f274892d = xVar;
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.e
    @Y61.k
    public final InterfaceC43160i<d> a(boolean z12) {
        return C43175k.G(new a(z12, null));
    }
}
