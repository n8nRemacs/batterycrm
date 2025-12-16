package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.short_term_rent.bookingform.mvi.C34968a;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import cw0.C39425b;
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

/* compiled from: BookingFormActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/short_term_rent/bookingform/mvi/a$a$a;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$process$2", f = "BookingFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class r extends SuspendLambda implements Y41.p<Q<? extends C34968a.C8398a.InterfaceC8399a, ? extends InterfaceC43160i<? extends com.avito.android.short_term_rent.bookingform.mvi.entity.a>>, Continuation<? super InterfaceC43160i<? extends BookingFormInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f281995q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34968a f281996r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C39425b> f281997s;

    /* compiled from: BookingFormActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "<anonymous>", "(Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$process$2$1", f = "BookingFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<com.avito.android.short_term_rent.bookingform.mvi.entity.a, Continuation<? super InterfaceC43160i<? extends BookingFormInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f281998q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C34968a f281999r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C39425b> f282000s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34968a c34968a, Y41.a<C39425b> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f281999r = c34968a;
            this.f282000s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f281999r, this.f282000s, continuation);
            aVar.f281998q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.short_term_rent.bookingform.mvi.entity.a aVar, Continuation<? super InterfaceC43160i<? extends BookingFormInternalAction>> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f281999r.b((com.avito.android.short_term_rent.bookingform.mvi.entity.a) this.f281998q, this.f282000s.invoke());
        }
    }

    /* compiled from: BookingFormActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "<anonymous>", "(Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$process$2$2", f = "BookingFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<com.avito.android.short_term_rent.bookingform.mvi.entity.a, Continuation<? super InterfaceC43160i<? extends BookingFormInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f282001q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C34968a f282002r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C39425b> f282003s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C34968a c34968a, Y41.a<C39425b> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f282002r = c34968a;
            this.f282003s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f282002r, this.f282003s, continuation);
            bVar.f282001q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.short_term_rent.bookingform.mvi.entity.a aVar, Continuation<? super InterfaceC43160i<? extends BookingFormInternalAction>> continuation) {
            return ((b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f282002r.b((com.avito.android.short_term_rent.bookingform.mvi.entity.a) this.f282001q, this.f282003s.invoke());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C34968a c34968a, Y41.a<C39425b> aVar, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f281996r = c34968a;
        this.f281997s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f281996r, this.f281997s, continuation);
        rVar.f281995q = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends C34968a.C8398a.InterfaceC8399a, ? extends InterfaceC43160i<? extends com.avito.android.short_term_rent.bookingform.mvi.entity.a>> q12, Continuation<? super InterfaceC43160i<? extends BookingFormInternalAction>> continuation) {
        return ((r) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f281995q;
        C34968a.C8398a.InterfaceC8399a interfaceC8399a = (C34968a.C8398a.InterfaceC8399a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = interfaceC8399a instanceof C34968a.C8398a.InterfaceC8399a.b;
        Y41.a<C39425b> aVar = this.f281997s;
        C34968a c34968a = this.f281996r;
        if (z12) {
            return C43175k.C(new a(c34968a, aVar, null), C43175k.n(interfaceC43160i, 300L));
        }
        if (interfaceC8399a instanceof C34968a.C8398a.InterfaceC8399a.C8400a) {
            return C43175k.C(new b(c34968a, aVar, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
