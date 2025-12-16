package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

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
/* loaded from: classes5.dex */
public final class D implements InterfaceC43160i<InterfaceC35693c> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f315556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f315557c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f315558b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ P f315559c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsQueue$computeTooltips$$inlined$filter$1$2", f = "UserAdvertsTooltipsQueue.kt", i = {0, 0}, l = {220, 219}, m = "emit", n = {"value", "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.D$a$a, reason: collision with other inner class name */
        public static final class C9776a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315560q;

            /* renamed from: r, reason: collision with root package name */
            public int f315561r;

            /* renamed from: s, reason: collision with root package name */
            public Object f315562s;

            /* renamed from: t, reason: collision with root package name */
            public InterfaceC43172j f315563t;

            public C9776a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315560q = obj;
                this.f315561r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(P p12, InterfaceC43172j interfaceC43172j) {
            this.f315558b = interfaceC43172j;
            this.f315559c = p12;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                boolean r0 = r8 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.D.a.C9776a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.D$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.D.a.C9776a) r0
                int r1 = r0.f315561r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315561r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.D$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.tooltip.D$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f315560q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315561r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r8)
                goto L6c
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                kotlinx.coroutines.flow.j r7 = r0.f315563t
                java.lang.Object r2 = r0.f315562s
                kotlin.C42729a0.b(r8)
                goto L56
            L3c:
                kotlin.C42729a0.b(r8)
                r8 = r7
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.c r8 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c) r8
                r0.f315562s = r7
                kotlinx.coroutines.flow.j r2 = r6.f315558b
                r0.f315563t = r2
                r0.f315561r = r4
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.P r4 = r6.f315559c
                java.lang.Object r8 = com.avito.android.user_adverts.tab_screens.adverts.tooltip.P.a(r4, r8, r0)
                if (r8 != r1) goto L53
                return r1
            L53:
                r5 = r2
                r2 = r7
                r7 = r5
            L56:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L6c
                r8 = 0
                r0.f315562s = r8
                r0.f315563t = r8
                r0.f315561r = r3
                java.lang.Object r7 = r7.emit(r2, r0)
                if (r7 != r1) goto L6c
                return r1
            L6c:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.D.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public D(InterfaceC43160i interfaceC43160i, P p12) {
        this.f315556b = interfaceC43160i;
        this.f315557c = p12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC35693c> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f315556b.collect(new a(this.f315557c, interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
