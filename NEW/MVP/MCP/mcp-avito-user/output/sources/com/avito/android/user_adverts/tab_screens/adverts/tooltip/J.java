package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class J implements InterfaceC43160i<InterfaceC35694d> {

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f315585q;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f315585q = obj;
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
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsQueue$playTooltip$$inlined$map$1$2", f = "UserAdvertsTooltipsQueue.kt", i = {}, l = {220, 219}, m = "emit", n = {}, s = {})
        public static final class a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315586q;

            /* renamed from: r, reason: collision with root package name */
            public int f315587r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315586q = obj;
                this.f315587r |= BeduinInputModel.MIN_TEXT_VERSION;
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
                boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.J.b.a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.J$b$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.J.b.a) r0
                int r1 = r0.f315587r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315587r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.J$b$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.tooltip.J$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f315586q
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r0.f315587r
                r2 = 0
                if (r1 == 0) goto L3c
                r5 = 2
                r3 = 1
                if (r1 == r3) goto L36
                if (r1 != r5) goto L2e
                kotlin.C42729a0.b(r6)
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L2e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L36:
                kotlin.C42729a0.b(r6)
                r0.f315587r = r5
                throw r2
            L3c:
                kotlin.C42729a0.b(r6)
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.c r5 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c) r5
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.J.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC35694d> interfaceC43172j, @Y61.k Continuation continuation) {
        throw null;
    }
}
