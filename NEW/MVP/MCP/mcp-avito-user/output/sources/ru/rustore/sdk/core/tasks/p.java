package ru.rustore.sdk.core.tasks;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.rustore.sdk.core.tasks.f;

/* compiled from: TaskHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 0})
@DebugMetadata(c = "ru.rustore.sdk.core.tasks.TaskHelper$wrap$1$1", f = "TaskHelper.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f436801q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f436802r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f<Object>.b f436803s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f436803s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        p pVar = new p(this.f436803s, continuation);
        pVar.f436802r = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f436801q;
        try {
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            obj = new Z.b(th2);
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            int i14 = Z.f406624c;
            this.f436801q = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        int i15 = Z.f406624c;
        boolean z12 = obj instanceof Z.b;
        f<Object>.b bVar = this.f436803s;
        if (!z12) {
            bVar.b(obj);
        }
        Throwable thB = Z.b(obj);
        if (thB != null) {
            bVar.a(thB);
        }
        return G0.f406611a;
    }
}
