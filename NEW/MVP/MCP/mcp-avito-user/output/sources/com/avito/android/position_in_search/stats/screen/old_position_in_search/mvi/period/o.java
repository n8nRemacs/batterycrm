package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import X80.b;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements InterfaceC43160i<PeriodInfoInternalAction.PeriodSelected> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f220669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.i f220670c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f220671b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b.i f220672c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.PeriodInfoActor$processPeriodSelected$$inlined$map$1$2", f = "PeriodInfoActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.o$a$a, reason: collision with other inner class name */
        public static final class C6645a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f220673q;

            /* renamed from: r, reason: collision with root package name */
            public int f220674r;

            public C6645a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f220673q = obj;
                this.f220674r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, b.i iVar) {
            this.f220671b = interfaceC43172j;
            this.f220672c = iVar;
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
                boolean r0 = r6 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.o.a.C6645a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.o$a$a r0 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.o.a.C6645a) r0
                int r1 = r0.f220674r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f220674r = r1
                goto L18
            L13:
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.o$a$a r0 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.o$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f220673q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f220674r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L68
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$LoadingAction r5 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.LoadingAction) r5
                X80.b$i r6 = r4.f220672c
                java.lang.String r6 = r6.f18662a
                boolean r2 = r5 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.LoadingError
                if (r2 == 0) goto L46
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$PeriodSelected$LoadingError r2 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$PeriodSelected$LoadingError
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$LoadingError r5 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.LoadingError) r5
                r2.<init>(r5, r6)
                goto L5d
            L46:
                boolean r2 = r5 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.LoadingResult
                if (r2 == 0) goto L52
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$PeriodSelected$LoadingResult r2 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$PeriodSelected$LoadingResult
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$LoadingResult r5 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.LoadingResult) r5
                r2.<init>(r5, r6)
                goto L5d
            L52:
                boolean r2 = r5 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.LoadingStart
                if (r2 == 0) goto L6b
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$PeriodSelected$LoadingStart r2 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$PeriodSelected$LoadingStart
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$LoadingStart r5 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.LoadingStart) r5
                r2.<init>(r5, r6)
            L5d:
                r0.f220674r = r3
                kotlinx.coroutines.flow.j r5 = r4.f220671b
                java.lang.Object r5 = r5.emit(r2, r0)
                if (r5 != r1) goto L68
                return r1
            L68:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L6b:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.o.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public o(InterfaceC43160i interfaceC43160i, b.i iVar) {
        this.f220669b = interfaceC43160i;
        this.f220670c = iVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super PeriodInfoInternalAction.PeriodSelected> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f220669b.collect(new a(interfaceC43172j, this.f220670c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
