package com.avito.android.preloading.coroutines;

import com.avito.android.preloading.coroutines.G;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/preloading/coroutines/G;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.preloading.coroutines.UtilsKt$materializeCompletion$1", f = "Utils.kt", i = {0}, l = {14, 16}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class E extends SuspendLambda implements Y41.p<InterfaceC43172j<? super G<Object>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f221792q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f221793r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<Object> f221794s;

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<G<? extends T>> f221795b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super G<? extends T>> interfaceC43172j) {
            this.f221795b = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        public final Object emit(T t12, @Y61.k Continuation<? super G0> continuation) {
            Object objEmit = this.f221795b.emit(new G.b(t12), continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(InterfaceC43160i<Object> interfaceC43160i, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f221794s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        E e12 = new E(this.f221794s, continuation);
        e12.f221793r = obj;
        return e12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super G<Object>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((E) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object bVar;
        ?? r12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f221792q;
        try {
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
            r12 = i12;
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            ?? r13 = (InterfaceC43172j) this.f221793r;
            InterfaceC43160i<Object> interfaceC43160i = this.f221794s;
            int i14 = Z.f406624c;
            a aVar = new a(r13);
            this.f221793r = r13;
            this.f221792q = 1;
            i12 = r13;
            if (interfaceC43160i.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            ?? r14 = (InterfaceC43172j) this.f221793r;
            C42729a0.b(obj);
            i12 = r14;
        }
        bVar = G0.f406611a;
        int i15 = Z.f406624c;
        r12 = i12;
        G.a aVar2 = new G.a(Z.b(bVar));
        this.f221793r = null;
        this.f221792q = 2;
        if (r12.emit(aVar2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
