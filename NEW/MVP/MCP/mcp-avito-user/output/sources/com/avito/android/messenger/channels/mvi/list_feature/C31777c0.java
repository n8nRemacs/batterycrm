package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43188o0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$observeChannelsFilterStateChanges$$inlined$transform$1", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.c0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31777c0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.a>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187998q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f187999r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43188o0 f188000s;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.c0$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<HY.a> f188001b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$observeChannelsFilterStateChanges$$inlined$transform$1$1", f = "ChannelsListActorSubscriptions.kt", i = {0, 0, 1}, l = {219, 220, 222}, m = "emit", n = {"filter", "$this$observeChannelsFilterStateChanges_u24lambda_u2449", "$this$observeChannelsFilterStateChanges_u24lambda_u2449"}, s = {"L$0", "L$1", "L$0"})
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.c0$a$a, reason: collision with other inner class name */
        public static final class C5531a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f188002q;

            /* renamed from: r, reason: collision with root package name */
            public int f188003r;

            /* renamed from: t, reason: collision with root package name */
            public Object f188005t;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f188006u;

            public C5531a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f188002q = obj;
                this.f188003r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f188001b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.avito.android.messenger.channels.mvi.list_feature.C31777c0.a.C5531a
                if (r0 == 0) goto L13
                r0 = r9
                com.avito.android.messenger.channels.mvi.list_feature.c0$a$a r0 = (com.avito.android.messenger.channels.mvi.list_feature.C31777c0.a.C5531a) r0
                int r1 = r0.f188003r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f188003r = r1
                goto L18
            L13:
                com.avito.android.messenger.channels.mvi.list_feature.c0$a$a r0 = new com.avito.android.messenger.channels.mvi.list_feature.c0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f188002q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f188003r
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L4a
                if (r2 == r6) goto L40
                if (r2 == r5) goto L38
                if (r2 != r4) goto L30
                kotlin.C42729a0.b(r9)
                goto L83
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f188005t
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                kotlin.C42729a0.b(r9)
                goto L76
            L40:
                kotlinx.coroutines.flow.j r8 = r0.f188006u
                java.lang.Object r2 = r0.f188005t
                com.avito.android.messenger.channels.filter.i r2 = (com.avito.android.messenger.channels.filter.i) r2
                kotlin.C42729a0.b(r9)
                goto L62
            L4a:
                kotlin.C42729a0.b(r9)
                r2 = r8
                com.avito.android.messenger.channels.filter.i r2 = (com.avito.android.messenger.channels.filter.i) r2
                HY.g$b$e r8 = HY.g.b.e.f7205a
                r0.f188005t = r2
                kotlinx.coroutines.flow.j<HY.a> r9 = r7.f188001b
                r0.f188006u = r9
                r0.f188003r = r6
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L61
                return r1
            L61:
                r8 = r9
            L62:
                HY.d$m r9 = new HY.d$m
                boolean r2 = r2.f187159a
                r9.<init>(r2)
                r0.f188005t = r8
                r0.f188006u = r3
                r0.f188003r = r5
                java.lang.Object r9 = r8.emit(r9, r0)
                if (r9 != r1) goto L76
                return r1
            L76:
                HY.g$a$a r9 = HY.g.a.C0418a.f7198a
                r0.f188005t = r3
                r0.f188003r = r4
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L83
                return r1
            L83:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31777c0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31777c0(C43188o0 c43188o0, Continuation continuation) {
        super(2, continuation);
        this.f188000s = c43188o0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31777c0 c31777c0 = new C31777c0(this.f188000s, continuation);
        c31777c0.f187999r = obj;
        return c31777c0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.a> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31777c0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187998q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f187999r);
            this.f187998q = 1;
            if (this.f188000s.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
