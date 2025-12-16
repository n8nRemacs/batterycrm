package com.avito.android.tariff.cpa.info.mvi;

import Y41.p;
import bB0.C25490c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpa.info.mvi.CpaInfoActor$getDeeplinkTerminalResultFlow$$inlined$transform$1", f = "CpaInfoActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class b extends SuspendLambda implements p<InterfaceC43172j<? super CpaInfoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f294715q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f294716r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.tariff.cpa.info.mvi.a f294717s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a f294718t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f294719u;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<CpaInfoInternalAction> f294720b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a f294721c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f294722d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.tariff.cpa.info.mvi.CpaInfoActor$getDeeplinkTerminalResultFlow$$inlined$transform$1$1", f = "CpaInfoActor.kt", i = {0, 0, 0}, l = {221, 224}, m = "emit", n = {"this", "$this$getDeeplinkTerminalResultFlow_u24lambda_u244", VoiceInfo.STATE}, s = {"L$0", "L$1", "L$2"})
        /* renamed from: com.avito.android.tariff.cpa.info.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C8958a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f294723q;

            /* renamed from: r, reason: collision with root package name */
            public int f294724r;

            /* renamed from: t, reason: collision with root package name */
            public a f294726t;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f294727u;

            /* renamed from: v, reason: collision with root package name */
            public C25490c f294728v;

            public C8958a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f294723q = obj;
                this.f294724r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Y41.a aVar, c cVar) {
            this.f294721c = aVar;
            this.f294722d = cVar;
            this.f294720b = interfaceC43172j;
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
                boolean r0 = r8 instanceof com.avito.android.tariff.cpa.info.mvi.b.a.C8958a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.tariff.cpa.info.mvi.b$a$a r0 = (com.avito.android.tariff.cpa.info.mvi.b.a.C8958a) r0
                int r1 = r0.f294724r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f294724r = r1
                goto L18
            L13:
                com.avito.android.tariff.cpa.info.mvi.b$a$a r0 = new com.avito.android.tariff.cpa.info.mvi.b$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f294723q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f294724r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r8)
                goto L82
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                bB0.c r7 = r0.f294728v
                kotlinx.coroutines.flow.j r2 = r0.f294727u
                com.avito.android.tariff.cpa.info.mvi.b$a r4 = r0.f294726t
                kotlin.C42729a0.b(r8)
                goto L66
            L3e:
                kotlin.C42729a0.b(r8)
                kv.a r7 = (kv.C43501a) r7
                Y41.a r7 = r6.f294721c
                java.lang.Object r7 = r7.invoke()
                bB0.c r7 = (bB0.C25490c) r7
                java.lang.String r8 = r7.f57000d
                kotlinx.coroutines.flow.j<com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction> r2 = r6.f294720b
                if (r8 == 0) goto L65
                com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$ShowPaymentMsg r5 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$ShowPaymentMsg
                r5.<init>(r8)
                r0.f294726t = r6
                r0.f294727u = r2
                r0.f294728v = r7
                r0.f294724r = r4
                java.lang.Object r8 = r2.emit(r5, r0)
                if (r8 != r1) goto L65
                return r1
            L65:
                r4 = r6
            L66:
                boolean r7 = r7.f57003g
                if (r7 != 0) goto L82
                com.avito.android.tariff.cpa.info.mvi.c r7 = r4.f294722d
                com.avito.android.tariff.cpa.info.domain.a r7 = r7.f294729a
                kotlinx.coroutines.flow.i r7 = r7.c()
                r8 = 0
                r0.f294726t = r8
                r0.f294727u = r8
                r0.f294728v = r8
                r0.f294724r = r3
                java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.u(r0, r7, r2)
                if (r7 != r1) goto L82
                return r1
            L82:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpa.info.mvi.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.tariff.cpa.info.mvi.a aVar, Continuation continuation, Y41.a aVar2, c cVar) {
        super(2, continuation);
        this.f294717s = aVar;
        this.f294718t = aVar2;
        this.f294719u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f294717s, continuation, this.f294718t, this.f294719u);
        bVar.f294716r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpaInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f294715q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f294716r, this.f294718t, this.f294719u);
            this.f294715q = 1;
            if (this.f294717s.collect(aVar, this) == coroutine_suspended) {
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
