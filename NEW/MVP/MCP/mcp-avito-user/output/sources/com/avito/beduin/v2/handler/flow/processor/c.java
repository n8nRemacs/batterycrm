package com.avito.beduin.v2.handler.flow.processor;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.beduin.v2.logger.LogLevel;
import eU0.C40052a;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: InteractionsProcessor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/i;", "LdU0/f;", MessageBody.SystemMessageBody.Platform.FLOW, "<anonymous>", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$flattenConcat$1", f = "InteractionsProcessor.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<InterfaceC43160i<? extends dU0.f>, Continuation<? super InterfaceC43160i<? extends dU0.f>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337201q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337202r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.handler.flow.processor.b f337203s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40052a f337204t;

    /* compiled from: InteractionsProcessor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LdU0/f;", "it", "Lkotlin/G0;", "<anonymous>", "(LdU0/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$flattenConcat$1$1", f = "InteractionsProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<dU0.f, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f337205q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C40052a f337206r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C40052a c40052a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f337206r = c40052a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f337206r, continuation);
            aVar.f337205q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(dU0.f fVar, Continuation<? super G0> continuation) {
            return ((a) create(fVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            dU0.f fVar = (dU0.f) this.f337205q;
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":InteractionsProcessor"), "~ onEach concat " + this.f337206r + ": " + fVar);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InteractionsProcessor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$flattenConcat$1$2", f = "InteractionsProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C40052a f337207q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C40052a c40052a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f337207q = c40052a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f337207q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":InteractionsProcessor"), "~ onStart concat " + this.f337207q);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InteractionsProcessor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$flattenConcat$1$3", f = "InteractionsProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.beduin.v2.handler.flow.processor.c$c, reason: collision with other inner class name */
    public static final class C10448c extends SuspendLambda implements q<InterfaceC43172j<? super dU0.f>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f337208q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C40052a f337209r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10448c(C40052a c40052a, Continuation<? super C10448c> continuation) {
            super(3, continuation);
            this.f337209r = c40052a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C10448c c10448c = new C10448c(this.f337209r, continuation);
            c10448c.f337208q = th2;
            return c10448c.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f337208q;
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.c cVar = RU0.b.f14468b;
                String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":InteractionsProcessor");
                StringBuilder sb2 = new StringBuilder("~~ onCompletion concat ");
                sb2.append(this.f337209r);
                sb2.append(" (");
                sb2.append(th2 != null ? th2.getMessage() : null);
                sb2.append(')');
                cVar.d(strS, sb2.toString());
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.avito.beduin.v2.handler.flow.processor.b bVar, C40052a c40052a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f337203s = bVar;
        this.f337204t = c40052a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f337203s, this.f337204t, continuation);
        cVar.f337202r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43160i<? extends dU0.f> interfaceC43160i, Continuation<? super InterfaceC43160i<? extends dU0.f>> continuation) {
        return ((c) create(interfaceC43160i, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object objA;
        InterfaceC43160i interfaceC43160i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337201q;
        C40052a c40052a = this.f337204t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i interfaceC43160i2 = (InterfaceC43160i) this.f337202r;
            dU0.d dVar = c40052a.f395222b;
            this.f337202r = interfaceC43160i2;
            this.f337201q = 1;
            LinkedHashMap linkedHashMap = this.f337203s.f337178j;
            Object obj2 = linkedHashMap.get(dVar);
            if (obj2 == null) {
                RU0.b bVar = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar.getClass();
                if (1 >= RU0.b.f14469c) {
                    RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":InteractionsProcessor"), "* create coroutine scope for: " + dVar);
                }
                objA = U.a(getF411447c());
                linkedHashMap.put(dVar, objA);
            } else {
                objA = obj2;
            }
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43160i = interfaceC43160i2;
            obj = objA;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC43160i interfaceC43160i3 = (InterfaceC43160i) this.f337202r;
            C42729a0.b(obj);
            interfaceC43160i = interfaceC43160i3;
        }
        T t12 = (T) obj;
        AbstractC43168f kVar = interfaceC43160i instanceof AbstractC43168f ? (AbstractC43168f) interfaceC43160i : null;
        if (kVar == null) {
            kVar = new kotlinx.coroutines.flow.internal.k(interfaceC43160i, null, 0, null, 14, null);
        }
        return new X(new C43137a0(new b(c40052a, null), new C43197r1(new a(c40052a, null), C43175k.m(kVar.e(t12)))), new C10448c(c40052a, null));
    }
}
