package androidx.view;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.view.C23055p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Landroidx/lifecycle/t;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/lifecycle/t;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23053o extends SuspendLambda implements p<T, Continuation<? super C23063t>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C23051n f46835q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC22991Y<Object> f46836r;

    /* compiled from: CoroutineLiveData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.o$a */
    public static final class a extends N implements l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23051n f46837l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C23051n c23051n) {
            super(1);
            this.f46837l = c23051n;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            this.f46837l.setValue(obj);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23053o(C23051n c23051n, AbstractC22991Y abstractC22991Y, Continuation continuation) {
        super(2, continuation);
        this.f46835q = c23051n;
        this.f46836r = abstractC22991Y;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new C23053o(this.f46835q, this.f46836r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super C23063t> continuation) {
        return ((C23053o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C23051n c23051n = this.f46835q;
        C23055p.a aVar = new C23055p.a(new a(c23051n));
        AbstractC22991Y<Object> abstractC22991Y = this.f46836r;
        c23051n.a(abstractC22991Y, aVar);
        return new C23063t(abstractC22991Y, c23051n);
    }
}
