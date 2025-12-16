package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$$inlined$transform$1", f = "ChannelsListActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31821z extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.a>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188271q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f188272r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.internal.m f188273s;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.z$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<HY.a> f188274b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$$inlined$transform$1$1", f = "ChannelsListActor.kt", i = {0}, l = {223, 224, 230}, m = "emit", n = {"$this$process_u24lambda_u241"}, s = {"L$0"})
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.z$a$a, reason: collision with other inner class name */
        public static final class C5549a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f188275q;

            /* renamed from: r, reason: collision with root package name */
            public int f188276r;

            /* renamed from: t, reason: collision with root package name */
            public InterfaceC43172j f188278t;

            public C5549a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f188275q = obj;
                this.f188276r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f188274b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[RETURN] */
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
                boolean r0 = r8 instanceof com.avito.android.messenger.channels.mvi.list_feature.C31821z.a.C5549a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.messenger.channels.mvi.list_feature.z$a$a r0 = (com.avito.android.messenger.channels.mvi.list_feature.C31821z.a.C5549a) r0
                int r1 = r0.f188276r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f188276r = r1
                goto L18
            L13:
                com.avito.android.messenger.channels.mvi.list_feature.z$a$a r0 = new com.avito.android.messenger.channels.mvi.list_feature.z$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f188275q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f188276r
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3e
                if (r2 == r5) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                goto L34
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                kotlin.C42729a0.b(r8)
                goto L78
            L38:
                kotlinx.coroutines.flow.j r7 = r0.f188278t
                kotlin.C42729a0.b(r8)
                goto L61
            L3e:
                kotlin.C42729a0.b(r8)
                HY.a r7 = (HY.a) r7
                boolean r8 = r7 instanceof HY.p
                kotlinx.coroutines.flow.j<HY.a> r2 = r6.f188274b
                if (r8 == 0) goto L6f
                HY.p r7 = (HY.p) r7
                HY.c$e$d r8 = HY.c.e.d.f7168a
                boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
                if (r7 == 0) goto L78
                HY.g$b$k r7 = HY.g.b.k.f7212a
                r0.f188278t = r2
                r0.f188276r = r5
                java.lang.Object r7 = r2.emit(r7, r0)
                if (r7 != r1) goto L60
                return r1
            L60:
                r7 = r2
            L61:
                HY.g$a$a r8 = HY.g.a.C0418a.f7198a
                r2 = 0
                r0.f188278t = r2
                r0.f188276r = r4
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L78
                return r1
            L6f:
                r0.f188276r = r3
                java.lang.Object r7 = r2.emit(r7, r0)
                if (r7 != r1) goto L78
                return r1
            L78:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31821z.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31821z(kotlinx.coroutines.flow.internal.m mVar, Continuation continuation) {
        super(2, continuation);
        this.f188273s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31821z c31821z = new C31821z(this.f188273s, continuation);
        c31821z.f188272r = obj;
        return c31821z;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.a> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31821z) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f188271q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f188272r);
            this.f188271q = 1;
            if (this.f188273s.collect(aVar, this) == coroutine_suspended) {
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
