package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import Gy0.InterfaceC13931a;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.a;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrCalendarParametersActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/a$a$a;", "Lkotlinx/coroutines/flow/i;", "LGy0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$process$2", f = "StrCalendarParametersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class f extends SuspendLambda implements Y41.p<Q<? extends a.C8627a.InterfaceC8628a, ? extends InterfaceC43160i<? extends InterfaceC13931a>>, Continuation<? super InterfaceC43160i<? extends StrCalendarParametersInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f287392q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_calendar.seller.calandar_parameters.mvi.a f287393r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Gy0.e> f287394s;

    /* compiled from: StrCalendarParametersActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LGy0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "<anonymous>", "(LGy0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$process$2$1", f = "StrCalendarParametersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC13931a, Continuation<? super InterfaceC43160i<? extends StrCalendarParametersInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f287395q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.str_calendar.seller.calandar_parameters.mvi.a f287396r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Gy0.e> f287397s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.str_calendar.seller.calandar_parameters.mvi.a aVar, Y41.a<Gy0.e> aVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f287396r = aVar;
            this.f287397s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f287396r, this.f287397s, continuation);
            aVar.f287395q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC13931a interfaceC13931a, Continuation<? super InterfaceC43160i<? extends StrCalendarParametersInternalAction>> continuation) {
            return ((a) create(interfaceC13931a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f287396r.b((InterfaceC13931a) this.f287395q, this.f287397s.invoke());
        }
    }

    /* compiled from: StrCalendarParametersActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LGy0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "<anonymous>", "(LGy0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$process$2$2", f = "StrCalendarParametersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC13931a, Continuation<? super InterfaceC43160i<? extends StrCalendarParametersInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f287398q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.str_calendar.seller.calandar_parameters.mvi.a f287399r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Gy0.e> f287400s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.str_calendar.seller.calandar_parameters.mvi.a aVar, Y41.a<Gy0.e> aVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f287399r = aVar;
            this.f287400s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f287399r, this.f287400s, continuation);
            bVar.f287398q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC13931a interfaceC13931a, Continuation<? super InterfaceC43160i<? extends StrCalendarParametersInternalAction>> continuation) {
            return ((b) create(interfaceC13931a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f287399r.b((InterfaceC13931a) this.f287398q, this.f287400s.invoke());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.str_calendar.seller.calandar_parameters.mvi.a aVar, Y41.a<Gy0.e> aVar2, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f287393r = aVar;
        this.f287394s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f287393r, this.f287394s, continuation);
        fVar.f287392q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends a.C8627a.InterfaceC8628a, ? extends InterfaceC43160i<? extends InterfaceC13931a>> q12, Continuation<? super InterfaceC43160i<? extends StrCalendarParametersInternalAction>> continuation) {
        return ((f) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f287392q;
        a.C8627a.InterfaceC8628a interfaceC8628a = (a.C8627a.InterfaceC8628a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = interfaceC8628a instanceof a.C8627a.InterfaceC8628a.b;
        Y41.a<Gy0.e> aVar = this.f287394s;
        com.avito.android.str_calendar.seller.calandar_parameters.mvi.a aVar2 = this.f287393r;
        if (z12) {
            return C43175k.C(new a(aVar2, aVar, null), interfaceC43160i);
        }
        if (!(interfaceC8628a instanceof a.C8627a.InterfaceC8628a.C8629a)) {
            throw new NoWhenBranchMatchedException();
        }
        return C43175k.C(new b(aVar2, aVar, null), C43175k.n(interfaceC43160i, 300L));
    }
}
