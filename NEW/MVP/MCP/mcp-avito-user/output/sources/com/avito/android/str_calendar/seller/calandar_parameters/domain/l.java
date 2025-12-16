package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import java.util.Date;
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
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$submitParameters$$inlined$transform$1", f = "StrCalendarParametersInteractor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286981q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f286982r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f286983s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f286984t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f286985u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Date f286986v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Date f286987w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f286988x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f286989y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ SK0.f f286990z;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<StrCalendarParametersInternalAction> f286991b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f286992c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f286993d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Date f286994e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Date f286995f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f286996g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f286997h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ SK0.f f286998i;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor$submitParameters$$inlined$transform$1$1", f = "StrCalendarParametersInteractor.kt", i = {}, l = {220, 222, 233}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.domain.l$a$a, reason: collision with other inner class name */
        public static final class C8610a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f286999q;

            /* renamed from: r, reason: collision with root package name */
            public int f287000r;

            public C8610a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f286999q = obj;
                this.f287000r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, b bVar, String str, Date date, Date date2, boolean z12, boolean z13, SK0.f fVar) {
            this.f286992c = bVar;
            this.f286993d = str;
            this.f286994e = date;
            this.f286995f = date2;
            this.f286996g = z12;
            this.f286997h = z13;
            this.f286998i = fVar;
            this.f286991b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r13, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof com.avito.android.str_calendar.seller.calandar_parameters.domain.l.a.C8610a
                if (r0 == 0) goto L14
                r0 = r14
                com.avito.android.str_calendar.seller.calandar_parameters.domain.l$a$a r0 = (com.avito.android.str_calendar.seller.calandar_parameters.domain.l.a.C8610a) r0
                int r1 = r0.f287000r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.f287000r = r1
            L12:
                r11 = r0
                goto L1a
            L14:
                com.avito.android.str_calendar.seller.calandar_parameters.domain.l$a$a r0 = new com.avito.android.str_calendar.seller.calandar_parameters.domain.l$a$a
                r0.<init>(r14)
                goto L12
            L1a:
                java.lang.Object r14 = r11.f286999q
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f287000r
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3a
                if (r1 == r4) goto L36
                if (r1 == r3) goto L36
                if (r1 != r2) goto L2e
                goto L36
            L2e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L36:
                kotlin.C42729a0.b(r14)
                goto L9d
            L3a:
                kotlin.C42729a0.b(r14)
                com.avito.android.util.P2 r13 = (com.avito.android.util.P2) r13
                boolean r14 = r13 instanceof com.avito.android.util.P2.c
                kotlinx.coroutines.flow.j<com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction> r5 = r12.f286991b
                if (r14 == 0) goto L53
                com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction$ContentLoading r13 = new com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction$ContentLoading
                r13.<init>()
                r11.f287000r = r4
                java.lang.Object r13 = r5.emit(r13, r11)
                if (r13 != r0) goto L9d
                return r0
            L53:
                boolean r14 = r13 instanceof com.avito.android.util.P2.b
                if (r14 == 0) goto L8c
                com.avito.android.util.P2$b r13 = (com.avito.android.util.P2.b) r13
                T r14 = r13.f318720a
                com.avito.android.remote.model.StrSellerCalendarParametersUpdateResponse r14 = (com.avito.android.remote.model.StrSellerCalendarParametersUpdateResponse) r14
                com.avito.android.remote.model.StrSellerCalendarParametersWarningDialog r10 = r14.getWarningDialog()
                T r13 = r13.f318720a
                com.avito.android.remote.model.StrSellerCalendarParametersUpdateResponse r13 = (com.avito.android.remote.model.StrSellerCalendarParametersUpdateResponse) r13
                java.lang.Boolean r13 = r13.getShouldShowUxf()
                if (r13 == 0) goto L71
                boolean r13 = r13.booleanValue()
            L6f:
                r8 = r13
                goto L73
            L71:
                r13 = 0
                goto L6f
            L73:
                r11.f287000r = r3
                boolean r7 = r12.f286997h
                SK0.f r9 = r12.f286998i
                com.avito.android.str_calendar.seller.calandar_parameters.domain.b r1 = r12.f286992c
                java.lang.String r3 = r12.f286993d
                java.util.Date r4 = r12.f286994e
                java.util.Date r13 = r12.f286995f
                boolean r6 = r12.f286996g
                r2 = r5
                r5 = r13
                java.lang.Object r13 = com.avito.android.str_calendar.seller.calandar_parameters.domain.b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L9d
                return r0
            L8c:
                boolean r14 = r13 instanceof com.avito.android.util.P2.a
                if (r14 == 0) goto L9d
                com.avito.android.util.P2$a r13 = (com.avito.android.util.P2.a) r13
                r11.f287000r = r2
                com.avito.android.str_calendar.seller.calandar_parameters.domain.b r14 = r12.f286992c
                java.lang.Object r13 = com.avito.android.str_calendar.seller.calandar_parameters.domain.b.a(r14, r5, r13, r11)
                if (r13 != r0) goto L9d
                return r0
            L9d:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.domain.l.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC43160i interfaceC43160i, Continuation continuation, b bVar, String str, Date date, Date date2, boolean z12, boolean z13, SK0.f fVar) {
        super(2, continuation);
        this.f286983s = interfaceC43160i;
        this.f286984t = bVar;
        this.f286985u = str;
        this.f286986v = date;
        this.f286987w = date2;
        this.f286988x = z12;
        this.f286989y = z13;
        this.f286990z = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f286983s, continuation, this.f286984t, this.f286985u, this.f286986v, this.f286987w, this.f286988x, this.f286989y, this.f286990z);
        lVar.f286982r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286981q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f286982r, this.f286984t, this.f286985u, this.f286986v, this.f286987w, this.f286988x, this.f286989y, this.f286990z);
            this.f286981q = 1;
            if (this.f286983s.collect(aVar, this) == coroutine_suspended) {
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
