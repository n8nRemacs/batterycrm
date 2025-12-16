package com.avito.avcalls.android.utils.coroutines;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.avcalls.android.rtc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.utils.coroutines.FlowExtKt$chunkedByTime$1", f = "FlowExt.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements p<I0<? super List<Object>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332444q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f332445r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f332446s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f332447t;

    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.utils.coroutines.FlowExtKt$chunkedByTime$1$1", f = "FlowExt.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f332448q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f332449r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ o f332450s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l0.h<List<Object>> f332451t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f332452u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ I0<List<Object>> f332453v;

        /* compiled from: FlowExt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.avcalls.android.utils.coroutines.f$a$a, reason: collision with other inner class name */
        public static final class C10326a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0.h<List<T>> f332454b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l0.h<N0> f332455c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ T f332456d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f332457e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ I0<List<? extends T>> f332458f;

            /* compiled from: FlowExt.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.avcalls.android.utils.coroutines.FlowExtKt$chunkedByTime$1$1$1$1", f = "FlowExt.kt", i = {}, l = {40, 41}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.avcalls.android.utils.coroutines.f$a$a$a, reason: collision with other inner class name */
            public static final class C10327a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f332459q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ long f332460r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ I0<List<? extends T>> f332461s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ l0.h<List<T>> f332462t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C10327a(long j12, I0<? super List<? extends T>> i02, l0.h<List<T>> hVar, Continuation<? super C10327a> continuation) {
                    super(2, continuation);
                    this.f332460r = j12;
                    this.f332461s = i02;
                    this.f332462t = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C10327a(this.f332460r, this.f332461s, this.f332462t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C10327a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f332459q;
                    l0.h<List<T>> hVar = this.f332462t;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f332459q = 1;
                        if (C43131e0.b(this.f332460r, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C42729a0.b(obj);
                            hVar.f406842b = (T) new ArrayList();
                            return G0.f406611a;
                        }
                        C42729a0.b(obj);
                    }
                    List<T> list = hVar.f406842b;
                    this.f332459q = 2;
                    if (this.f332461s.send(list, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    hVar.f406842b = (T) new ArrayList();
                    return G0.f406611a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C10326a(l0.h<List<T>> hVar, l0.h<N0> hVar2, T t12, long j12, I0<? super List<? extends T>> i02) {
                this.f332454b = hVar;
                this.f332455c = hVar2;
                this.f332456d = t12;
                this.f332457e = j12;
                this.f332458f = i02;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @l
            public final Object emit(T t12, @k Continuation<? super G0> continuation) {
                l0.h<List<T>> hVar = this.f332454b;
                hVar.f406842b.add(t12);
                l0.h<N0> hVar2 = this.f332455c;
                N0 n02 = hVar2.f406842b;
                if (n02 == null || !n02.isActive()) {
                    hVar2.f406842b = (T) C43259k.d(this.f332456d, null, null, new C10327a(this.f332457e, this.f332458f, hVar, null), 3);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, l0.h hVar, long j12, I0 i02, Continuation continuation) {
            super(2, continuation);
            this.f332450s = oVar;
            this.f332451t = hVar;
            this.f332452u = j12;
            this.f332453v = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f332450s, this.f332451t, this.f332452u, this.f332453v, continuation);
            aVar.f332449r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f332448q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f332449r;
                C10326a c10326a = new C10326a(this.f332451t, new l0.h(), t12, this.f332452u, this.f332453v);
                this.f332448q = 1;
                if (this.f332450s.collect(c10326a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j12, o oVar, Continuation continuation) {
        super(2, continuation);
        this.f332446s = j12;
        this.f332447t = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        f fVar = new f(this.f332446s, this.f332447t, continuation);
        fVar.f332445r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super List<Object>> i02, Continuation<? super G0> continuation) {
        return ((f) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [T, java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332444q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f332445r;
            if (this.f332446s < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            l0.h hVar = new l0.h();
            hVar.f406842b = new ArrayList();
            a aVar = new a(this.f332447t, hVar, this.f332446s, i02, null);
            this.f332444q = 1;
            if (U.c(aVar, this) == coroutine_suspended) {
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
