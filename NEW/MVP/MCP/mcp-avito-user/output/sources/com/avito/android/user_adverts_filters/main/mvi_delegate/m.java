package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import lj.InterfaceC43779a;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements InterfaceC43160i<Map<String, ? extends Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f316152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35708a f316153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43779a f316154d;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f316155b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C35708a f316156c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43779a f316157d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor$formParamsFlow$$inlined$map$1$2", f = "FiltersDelegateActor.kt", i = {}, l = {220, 219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts_filters.main.mvi_delegate.m$a$a, reason: collision with other inner class name */
        public static final class C9807a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f316158q;

            /* renamed from: r, reason: collision with root package name */
            public int f316159r;

            /* renamed from: s, reason: collision with root package name */
            public InterfaceC43172j f316160s;

            public C9807a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f316158q = obj;
                this.f316159r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C35708a c35708a, InterfaceC43779a interfaceC43779a) {
            this.f316155b = interfaceC43172j;
            this.f316156c = c35708a;
            this.f316157d = interfaceC43779a;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.user_adverts_filters.main.mvi_delegate.m.a.C9807a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.user_adverts_filters.main.mvi_delegate.m$a$a r0 = (com.avito.android.user_adverts_filters.main.mvi_delegate.m.a.C9807a) r0
                int r1 = r0.f316159r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f316159r = r1
                goto L18
            L13:
                com.avito.android.user_adverts_filters.main.mvi_delegate.m$a$a r0 = new com.avito.android.user_adverts_filters.main.mvi_delegate.m$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f316158q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f316159r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r7)
                goto L5c
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlinx.coroutines.flow.j r6 = r0.f316160s
                kotlin.C42729a0.b(r7)
                goto L50
            L3a:
                kotlin.C42729a0.b(r7)
                java.util.List r6 = (java.util.List) r6
                kotlinx.coroutines.flow.j r6 = r5.f316155b
                r0.f316160s = r6
                r0.f316159r = r4
                com.avito.android.user_adverts_filters.main.mvi_delegate.a r7 = r5.f316156c
                lj.a r2 = r5.f316157d
                java.lang.Object r7 = com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a.f(r7, r2, r0)
                if (r7 != r1) goto L50
                return r1
            L50:
                r2 = 0
                r0.f316160s = r2
                r0.f316159r = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L5c
                return r1
            L5c:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts_filters.main.mvi_delegate.m.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public m(InterfaceC43160i interfaceC43160i, C35708a c35708a, InterfaceC43779a interfaceC43779a) {
        this.f316152b = interfaceC43160i;
        this.f316153c = c35708a;
        this.f316154d = interfaceC43779a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Map<String, ? extends Object>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f316152b).collect(new a(interfaceC43172j, this.f316153c, this.f316154d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
