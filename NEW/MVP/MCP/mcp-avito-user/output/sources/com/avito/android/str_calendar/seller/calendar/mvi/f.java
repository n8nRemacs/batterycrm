package com.avito.android.str_calendar.seller.calendar.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarInternalAction;
import java.util.Date;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import uy0.InterfaceC49128a;
import uy0.InterfaceC49130c;
import wy0.C49704a;

/* compiled from: StrSellerCalendarBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<StrSellerCalendarInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calendar.data.a f287740a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calendar.data.m f287741b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f287742c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f287743d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f287744e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f287745f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f287746g;

    /* compiled from: StrSellerCalendarBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.mvi.StrSellerCalendarBootstrap$produce$1", f = "StrSellerCalendarBootstrap.kt", i = {0, 0, 1, 1}, l = {38, 47, 57}, m = "invokeSuspend", n = {"$this$flow", "currentServerDate", "$this$flow", "currentServerDate"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerCalendarInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Date f287747q;

        /* renamed from: r, reason: collision with root package name */
        public int f287748r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f287749s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f287749s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Date time;
            Q q12;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287748r;
            f fVar = f.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f287749s;
                if (!fVar.f287746g) {
                    time = fVar.f287741b.a().getTime();
                    String str = fVar.f287743d;
                    Date dateC = str != null ? wy0.b.c(str) : null;
                    String str2 = fVar.f287744e;
                    Date dateC2 = str2 != null ? wy0.b.c(str2) : null;
                    if (dateC == null && dateC2 == null) {
                        q12 = new Q(null, null);
                    } else if (dateC != null || dateC2 == null) {
                        q12 = (dateC == null || dateC2 != null) ? (dateC == null || dateC2 == null || !C49704a.c(dateC, dateC2)) ? (dateC == null || !C49704a.e(dateC, dateC2)) ? new Q(str, str2) : new Q(str, null) : new Q(str2, str) : new Q(str, null);
                    } else {
                        q12 = new Q(str2, null);
                    }
                    String str3 = (String) q12.f406619b;
                    String str4 = (String) q12.f406620c;
                    boolean z12 = fVar.f287745f;
                    String str5 = fVar.f287742c;
                    if (str3 == null || !C49704a.d(wy0.b.c(str3), time)) {
                        StrSellerCalendarInternalAction.Init init = new StrSellerCalendarInternalAction.Init(str5, str3, str4, z12);
                        this.f287749s = interfaceC43172j2;
                        this.f287747q = time;
                        this.f287748r = 2;
                        if (interfaceC43172j2.emit(init, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        StrSellerCalendarInternalAction.Init init2 = new StrSellerCalendarInternalAction.Init(str5, null, null, z12);
                        this.f287749s = interfaceC43172j2;
                        this.f287747q = time;
                        this.f287748r = 1;
                        if (interfaceC43172j2.emit(init2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    interfaceC43172j = interfaceC43172j2;
                }
                return G0.f406611a;
            }
            if (i12 != 1 && i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                fVar.f287746g = true;
                return G0.f406611a;
            }
            time = this.f287747q;
            interfaceC43172j = (InterfaceC43172j) this.f287749s;
            C42729a0.b(obj);
            InterfaceC43160i<StrSellerCalendarInternalAction> interfaceC43160iA = fVar.f287740a.a(fVar.f287742c, wy0.b.d(time));
            this.f287749s = null;
            this.f287747q = null;
            this.f287748r = 3;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            fVar.f287746g = true;
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k com.avito.android.str_calendar.seller.calendar.data.a aVar, @Y61.k com.avito.android.str_calendar.seller.calendar.data.m mVar, @InterfaceC49128a @Y61.k String str, @uy0.f @Y61.l String str2, @Y61.l @InterfaceC49130c String str3, @uy0.e boolean z12) {
        this.f287740a = aVar;
        this.f287741b = mVar;
        this.f287742c = str;
        this.f287743d = str2;
        this.f287744e = str3;
        this.f287745f = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrSellerCalendarInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
