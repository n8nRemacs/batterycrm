package com.avito.beduin.v2.handler.flow.processor;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.M0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;

/* compiled from: InteractionsProcessor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"K", "V", "Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "Lkotlinx/coroutines/flow/i;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$groupByKeyValue$1", f = "InteractionsProcessor.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements p<InterfaceC43172j<? super Q<Object, ? extends InterfaceC43160i<Object>>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337212q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337213r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e2 f337214s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f337215t;

    /* compiled from: InteractionsProcessor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Lkotlin/Q;", "value", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Q<Object, ? extends InterfaceC43160i<Object>>> f337216b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f337217c;

        /* compiled from: InteractionsProcessor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$groupByKeyValue$1$1", f = "InteractionsProcessor.kt", i = {1, 1, 1}, l = {333, 341, 350}, m = "emit", n = {"groupKey", "groupValue", "$this$getOrPut$iv"}, s = {"L$0", "L$1", "L$2"})
        /* renamed from: com.avito.beduin.v2.handler.flow.processor.f$a$a, reason: collision with other inner class name */
        public static final class C10449a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f337218q;

            /* renamed from: r, reason: collision with root package name */
            public Object f337219r;

            /* renamed from: s, reason: collision with root package name */
            public LinkedHashMap f337220s;

            /* renamed from: t, reason: collision with root package name */
            public C43108m f337221t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f337222u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ a<T> f337223v;

            /* renamed from: w, reason: collision with root package name */
            public int f337224w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10449a(a<? super T> aVar, Continuation<? super C10449a> continuation) {
                super(continuation);
                this.f337223v = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f337222u = obj;
                this.f337224w |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f337223v.emit(null, this);
            }
        }

        /* compiled from: InteractionsProcessor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$groupByKeyValue$1$1$groupChannel$1$2$1", f = "InteractionsProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<Object, Continuation<? super Boolean>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ C43108m f337225q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C43108m c43108m, Continuation continuation) {
                super(2, continuation);
                this.f337225q = c43108m;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new b(this.f337225q, continuation);
            }

            @Override // Y41.p
            public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
                return ((b) create(obj, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return Boxing.boxBoolean(!this.f337225q.l());
            }
        }

        /* compiled from: InteractionsProcessor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"K", "V", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$groupByKeyValue$1$1$groupChannel$1$2$2", f = "InteractionsProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements q<InterfaceC43172j<Object>, Throwable, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Throwable f337226q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Object f337227r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Object obj, Continuation<? super c> continuation) {
                super(3, continuation);
                this.f337227r = obj;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
                c cVar = new c(this.f337227r, continuation);
                cVar.f337226q = th2;
                return cVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                Throwable th2 = this.f337226q;
                RU0.b bVar = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar.getClass();
                if (1 >= RU0.b.f14469c) {
                    RU0.c cVar = RU0.b.f14468b;
                    String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":InteractionsProcessor");
                    StringBuilder sb2 = new StringBuilder("** chanel ");
                    sb2.append(this.f337227r);
                    sb2.append(" is completed: ");
                    sb2.append(th2 != null ? th2.getMessage() : null);
                    cVar.d(strS, sb2.toString());
                }
                return G0.f406611a;
            }
        }

        public a(InterfaceC43172j interfaceC43172j, LinkedHashMap linkedHashMap) {
            this.f337216b = interfaceC43172j;
            this.f337217c = linkedHashMap;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@Y61.k kotlin.Q<java.lang.Object, java.lang.Object> r12, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r13) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.handler.flow.processor.f.a.emit(kotlin.Q, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e2 e2Var, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f337214s = e2Var;
        this.f337215t = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        f fVar = new f(this.f337214s, this.f337215t, continuation);
        fVar.f337213r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Q<Object, ? extends InterfaceC43160i<Object>>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337212q;
        LinkedHashMap linkedHashMap = this.f337215t;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f337213r;
                e2 e2Var = this.f337214s;
                a aVar = new a(interfaceC43172j, linkedHashMap);
                this.f337212q = 1;
                if (e2.g(e2Var, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            while (it.hasNext()) {
                ((M0) it.next()).h(null);
            }
            return G0.f406611a;
        } finally {
            it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((M0) it.next()).h(null);
            }
        }
    }
}
