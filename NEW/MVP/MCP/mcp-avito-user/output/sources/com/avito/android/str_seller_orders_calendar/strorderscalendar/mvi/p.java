package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.C35130a;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
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

/* compiled from: StrOrdersCalendarActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a$a$a;", "Lkotlinx/coroutines/flow/i;", "LUz0/b;", "<name for destructuring parameter 0>", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$process$2", f = "StrOrdersCalendarActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class p extends SuspendLambda implements Y41.p<Q<? extends C35130a.C8803a.InterfaceC8804a, ? extends InterfaceC43160i<? extends Uz0.b>>, Continuation<? super InterfaceC43160i<? extends StrOrdersCalendarInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f291125q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35130a f291126r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<StrOrdersCalendarState> f291127s;

    /* compiled from: StrOrdersCalendarActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUz0/b;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<anonymous>", "(LUz0/b;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$process$2$1", f = "StrOrdersCalendarActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Uz0.b, Continuation<? super InterfaceC43160i<? extends StrOrdersCalendarInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f291128q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C35130a f291129r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<StrOrdersCalendarState> f291130s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C35130a c35130a, Y41.a<StrOrdersCalendarState> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f291129r = c35130a;
            this.f291130s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f291129r, this.f291130s, continuation);
            aVar.f291128q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Uz0.b bVar, Continuation<? super InterfaceC43160i<? extends StrOrdersCalendarInternalAction>> continuation) {
            return ((a) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f291129r.b((Uz0.b) this.f291128q, this.f291130s.invoke());
        }
    }

    /* compiled from: StrOrdersCalendarActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUz0/b;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<anonymous>", "(LUz0/b;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarActor$process$2$2", f = "StrOrdersCalendarActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<Uz0.b, Continuation<? super InterfaceC43160i<? extends StrOrdersCalendarInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f291131q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C35130a f291132r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<StrOrdersCalendarState> f291133s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C35130a c35130a, Y41.a<StrOrdersCalendarState> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f291132r = c35130a;
            this.f291133s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f291132r, this.f291133s, continuation);
            bVar.f291131q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(Uz0.b bVar, Continuation<? super InterfaceC43160i<? extends StrOrdersCalendarInternalAction>> continuation) {
            return ((b) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f291132r.b((Uz0.b) this.f291131q, this.f291133s.invoke());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C35130a c35130a, Y41.a<StrOrdersCalendarState> aVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f291126r = c35130a;
        this.f291127s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f291126r, this.f291127s, continuation);
        pVar.f291125q = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends C35130a.C8803a.InterfaceC8804a, ? extends InterfaceC43160i<? extends Uz0.b>> q12, Continuation<? super InterfaceC43160i<? extends StrOrdersCalendarInternalAction>> continuation) {
        return ((p) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f291125q;
        C35130a.C8803a.InterfaceC8804a interfaceC8804a = (C35130a.C8803a.InterfaceC8804a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = interfaceC8804a instanceof C35130a.C8803a.InterfaceC8804a.C8805a;
        Y41.a<StrOrdersCalendarState> aVar = this.f291127s;
        C35130a c35130a = this.f291126r;
        if (z12) {
            return C43175k.C(new a(c35130a, aVar, null), interfaceC43160i);
        }
        if (interfaceC8804a instanceof C35130a.C8803a.InterfaceC8804a.b) {
            return C43175k.B(new b(c35130a, aVar, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
