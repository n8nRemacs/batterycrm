package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s implements InterfaceC43160i<P2<Object>> {

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f286599q;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f286599q = obj;
            throw null;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl$getBookingCalendarDates$$inlined$map$1$2", f = "StrBookingCalendarInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        public static final class a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f286600q;

            /* renamed from: r, reason: collision with root package name */
            public int f286601r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f286600q = obj;
                this.f286601r |= BeduinInputModel.MIN_TEXT_VERSION;
                return b.this.emit(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.str_calendar.booking_calendar.mvi.s.b.a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.str_calendar.booking_calendar.mvi.s$b$a r0 = (com.avito.android.str_calendar.booking_calendar.mvi.s.b.a) r0
                int r1 = r0.f286601r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f286601r = r1
                goto L18
            L13:
                com.avito.android.str_calendar.booking_calendar.mvi.s$b$a r0 = new com.avito.android.str_calendar.booking_calendar.mvi.s$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f286600q
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r0.f286601r
                r2 = 1
                if (r1 == 0) goto L32
                if (r1 != r2) goto L2a
                kotlin.C42729a0.b(r6)
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L2a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L32:
                kotlin.C42729a0.b(r6)
                com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
                boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r6 != 0) goto L51
                boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r6 == 0) goto L4b
                com.avito.android.util.P2$a r6 = new com.avito.android.util.P2$a
                com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
                com.avito.android.remote.error.ApiError r5 = r5.getError()
                r6.<init>(r5)
                goto L5c
            L4b:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L51:
                com.avito.android.util.P2$b r6 = new com.avito.android.util.P2$b
                com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
                java.lang.Object r5 = r5.getResult()
                r6.<init>(r5)
            L5c:
                r0.f286601r = r2
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.s.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super P2<Object>> interfaceC43172j, @Y61.k Continuation continuation) {
        L.l();
        throw null;
    }
}
