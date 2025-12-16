package com.avito.android.service_booking.mvi.domain.interactors;

import Gt0.InterfaceC13916a;
import Ks0.InterfaceC14347a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.B2;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.mvi.domain.converters.h;
import com.avito.android.service_booking.mvi.step.di.q;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking_common.n;
import com.avito.android.util.R0;
import java.util.List;
import java.util.Map;
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
import qt0.C47440d;
import rt0.InterfaceC47722d;

/* compiled from: ServiceBookingCoroutinesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/domain/interactors/b;", "Lcom/avito/android/service_booking/mvi/domain/interactors/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking.mvi.domain.interactors.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC14347a> f274358a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC13916a> f274359b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f274360c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC47722d f274361d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h f274362e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking.mvi.domain.converters.e f274363f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking.mvi.domain.converters.k f274364g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final n f274365h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Map<String, List<String>> f274366i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking.mvi.domain.converters.a f274367j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final B2 f274368k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final BookingFlow f274369l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final BookingFlowSource f274370m;

    /* compiled from: ServiceBookingCoroutinesInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f274371a;

        static {
            int[] iArr = new int[BookingFlow.values().length];
            try {
                BookingFlow bookingFlow = BookingFlow.f274120b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f274371a = iArr;
        }
    }

    /* compiled from: ServiceBookingCoroutinesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking.mvi.domain.interactors.ServiceBookingCoroutinesInteractorImpl$loadForm$1", f = "ServiceBookingCoroutinesInteractor.kt", i = {0, 0, 1, 1}, l = {89, 91, 100, 112}, m = "invokeSuspend", n = {"$this$flow", "isFullScreenError", "$this$flow", "isFullScreenError"}, s = {"L$0", "Z$0", "L$0", "Z$0"})
    /* renamed from: com.avito.android.service_booking.mvi.domain.interactors.b$b, reason: collision with other inner class name */
    public static final class C8149b extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingMviStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public boolean f274372q;

        /* renamed from: r, reason: collision with root package name */
        public int f274373r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f274374s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f274376u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f274377v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f274378w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f274379x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8149b(String str, String str2, String str3, boolean z12, Continuation<? super C8149b> continuation) {
            super(2, continuation);
            this.f274376u = str;
            this.f274377v = str2;
            this.f274378w = str3;
            this.f274379x = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8149b c8149b = b.this.new C8149b(this.f274376u, this.f274377v, this.f274378w, this.f274379x, continuation);
            c8149b.f274374s = obj;
            return c8149b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingMviStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8149b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking.mvi.domain.interactors.b.C8149b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k h31.e<InterfaceC14347a> eVar, @k h31.e<InterfaceC13916a> eVar2, @k R0 r02, @k InterfaceC47722d interfaceC47722d, @k h hVar, @k com.avito.android.service_booking.mvi.domain.converters.e eVar3, @k com.avito.android.service_booking.mvi.domain.converters.k kVar, @k n nVar, @q @k Map<String, List<String>> map, @k com.avito.android.service_booking.mvi.domain.converters.a aVar, @k B2 b22, @com.avito.android.service_booking.mvi.di.d @k BookingFlow bookingFlow, @k @com.avito.android.service_booking.mvi.di.e BookingFlowSource bookingFlowSource) {
        this.f274358a = eVar;
        this.f274359b = eVar2;
        this.f274360c = r02;
        this.f274361d = interfaceC47722d;
        this.f274362e = hVar;
        this.f274363f = eVar3;
        this.f274364g = kVar;
        this.f274365h = nVar;
        this.f274366i = map;
        this.f274367j = aVar;
        this.f274368k = b22;
        this.f274369l = bookingFlow;
        this.f274370m = bookingFlowSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e A[LOOP:1: B:48:0x0158->B:50:0x015e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e2  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.service_booking.mvi.domain.interactors.b r31, kotlinx.coroutines.flow.InterfaceC43172j r32, com.avito.android.remote.model.TypedResult.Success r33, java.lang.String r34, boolean r35, boolean r36, kotlin.coroutines.jvm.internal.ContinuationImpl r37) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking.mvi.domain.interactors.b.c(com.avito.android.service_booking.mvi.domain.interactors.b, kotlinx.coroutines.flow.j, com.avito.android.remote.model.TypedResult$Success, java.lang.String, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.service_booking.mvi.domain.interactors.a
    @k
    public final InterfaceC43160i a(@l String str, @k C47440d.a aVar, @k Map map) {
        return C43175k.G(new d(this, str, aVar, map, null));
    }

    @Override // com.avito.android.service_booking.mvi.domain.interactors.a
    @k
    public final InterfaceC43160i<ServiceBookingMviStepInternalAction> b(@l String str, @k String str2, @l String str3, boolean z12) {
        return C43175k.I(this.f274360c.a(), C43175k.G(new C8149b(str2, str, str3, z12, null)));
    }
}
