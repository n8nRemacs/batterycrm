package com.avito.android.str_calendar.seller.last_minute_offer;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.last_minute_offer.LastMinuteOfferInteractorImpl$updateLastMinuteOfferParameter$$inlined$transform$1", f = "LastMinuteOfferInteractor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements p<InterfaceC43172j<? super LastMinuteOfferInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287886q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f287887r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f287888s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f287889t;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<LastMinuteOfferInternalAction> f287890b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f287891c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.str_calendar.seller.last_minute_offer.LastMinuteOfferInteractorImpl$updateLastMinuteOfferParameter$$inlined$transform$1$1", f = "LastMinuteOfferInteractor.kt", i = {}, l = {220, 221}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.str_calendar.seller.last_minute_offer.f$a$a, reason: collision with other inner class name */
        public static final class C8651a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f287892q;

            /* renamed from: r, reason: collision with root package name */
            public int f287893r;

            public C8651a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f287892q = obj;
                this.f287893r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, c cVar) {
            this.f287891c = cVar;
            this.f287890b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.str_calendar.seller.last_minute_offer.f.a.C8651a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.str_calendar.seller.last_minute_offer.f$a$a r0 = (com.avito.android.str_calendar.seller.last_minute_offer.f.a.C8651a) r0
                int r1 = r0.f287893r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f287893r = r1
                goto L18
            L13:
                com.avito.android.str_calendar.seller.last_minute_offer.f$a$a r0 = new com.avito.android.str_calendar.seller.last_minute_offer.f$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f287892q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f287893r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L35
                if (r2 == r4) goto L31
                if (r2 != r3) goto L29
                goto L31
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.C42729a0.b(r8)
                goto L5e
            L35:
                kotlin.C42729a0.b(r8)
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                com.avito.android.str_calendar.seller.last_minute_offer.c r2 = r6.f287891c
                kotlinx.coroutines.flow.j<com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction> r5 = r6.f287890b
                if (r8 == 0) goto L51
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                r0.f287893r = r4
                java.lang.Object r7 = com.avito.android.str_calendar.seller.last_minute_offer.c.c(r2, r5, r7, r0)
                if (r7 != r1) goto L5e
                return r1
            L51:
                boolean r7 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r7 == 0) goto L5e
                r0.f287893r = r3
                java.lang.Object r7 = com.avito.android.str_calendar.seller.last_minute_offer.c.d(r2, r5, r0)
                if (r7 != r1) goto L5e
                return r1
            L5e:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.last_minute_offer.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC43160i interfaceC43160i, Continuation continuation, c cVar) {
        super(2, continuation);
        this.f287888s = interfaceC43160i;
        this.f287889t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f287888s, continuation, this.f287889t);
        fVar.f287887r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LastMinuteOfferInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287886q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f287887r, this.f287889t);
            this.f287886q = 1;
            if (this.f287888s.collect(aVar, this) == coroutine_suspended) {
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
