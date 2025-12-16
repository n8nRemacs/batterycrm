package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import X80.b;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements InterfaceC43160i<b.g> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.internal.s f220570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f220571c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f220572b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a f220573c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.PeriodInfoActor$filterRedundantLoad$$inlined$filter$1$2", f = "PeriodInfoActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.b$a$a, reason: collision with other inner class name */
        public static final class C6639a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f220574q;

            /* renamed from: r, reason: collision with root package name */
            public int f220575r;

            public C6639a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f220574q = obj;
                this.f220575r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Y41.a aVar) {
            this.f220572b = interfaceC43172j;
            this.f220573c = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.b.a.C6639a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.b$a$a r0 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.b.a.C6639a) r0
                int r1 = r0.f220575r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f220575r = r1
                goto L18
            L13:
                com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.b$a$a r0 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.b$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f220574q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f220575r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r8)
                goto L96
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                kotlin.C42729a0.b(r8)
                r8 = r7
                X80.b$g r8 = (X80.b.g) r8
                Y41.a r2 = r6.f220573c
                java.lang.Object r2 = r2.invoke()
                X80.j r2 = (X80.j) r2
                boolean r4 = r8 instanceof X80.b.f
                if (r4 == 0) goto L49
                X80.c r8 = r2.f18714f
                boolean r8 = r8 instanceof X80.c.d
                goto L89
            L49:
                boolean r4 = r8 instanceof X80.b.h
                r5 = 0
                if (r4 == 0) goto L60
                X80.c r8 = r2.f18714f
                X80.c$a r8 = X80.k.a(r8)
                if (r8 == 0) goto L7b
                X80.e r8 = r8.f18677g
                if (r8 == 0) goto L7b
                boolean r8 = r8.f18696b
                if (r8 != 0) goto L7b
                r5 = r3
                goto L7b
            L60:
                boolean r4 = r8 instanceof X80.b.l
                if (r4 == 0) goto L69
                X80.c r8 = r2.f18714f
                boolean r8 = r8 instanceof X80.c.b
                goto L89
            L69:
                boolean r4 = r8 instanceof X80.b.i
                if (r4 == 0) goto L7d
                java.lang.String r2 = r2.f18711c
                X80.b$i r8 = (X80.b.i) r8
                java.lang.String r8 = r8.f18662a
                boolean r8 = kotlin.jvm.internal.L.f(r2, r8)
                if (r8 != 0) goto L7b
                r8 = r3
                goto L89
            L7b:
                r8 = r5
                goto L89
            L7d:
                boolean r4 = r8 instanceof X80.b.p
                if (r4 == 0) goto L99
                X80.b$p r8 = (X80.b.p) r8
                java.lang.String r8 = r8.f18670a
                boolean r8 = X80.k.b(r2, r8)
            L89:
                if (r8 == 0) goto L96
                r0.f220575r = r3
                kotlinx.coroutines.flow.j r8 = r6.f220572b
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L96
                return r1
            L96:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L99:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public b(kotlinx.coroutines.flow.internal.s sVar, Y41.a aVar) {
        this.f220570b = sVar;
        this.f220571c = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super b.g> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f220570b.collect(new a(interfaceC43172j, this.f220571c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
