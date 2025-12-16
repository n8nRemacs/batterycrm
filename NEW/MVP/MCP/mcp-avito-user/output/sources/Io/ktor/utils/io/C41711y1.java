package io.ktor.utils.io;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43262l0;

/* compiled from: Coroutines.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "S", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.utils.io.CoroutinesKt$launchChannel$job$1", f = "Coroutines.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: io.ktor.utils.io.y1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41711y1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f401366q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401367r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f401368s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f401369t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f401370u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.M f401371v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41711y1(boolean z12, C41619a c41619a, Y41.p pVar, kotlinx.coroutines.M m12, Continuation continuation) {
        super(2, continuation);
        this.f401368s = z12;
        this.f401369t = c41619a;
        this.f401370u = (SuspendLambda) pVar;
        this.f401371v = m12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        ?? r32 = this.f401370u;
        C41711y1 c41711y1 = new C41711y1(this.f401368s, this.f401369t, r32, this.f401371v, continuation);
        c41711y1.f401367r = obj;
        return c41711y1;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C41711y1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f401366q;
        C41619a c41619a = this.f401369t;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f401367r;
                if (this.f401368s) {
                    c41619a.P((kotlinx.coroutines.N0) t12.getF399611e().get(kotlinx.coroutines.N0.f410716u2));
                }
                C41693s1 c41693s1 = new C41693s1(t12, c41619a);
                ?? r62 = this.f401370u;
                this.f401366q = 1;
                if (r62.invoke(c41693s1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
        } catch (Throwable th2) {
            kotlinx.coroutines.E1 e12 = C43262l0.f411946b;
            kotlinx.coroutines.M m12 = this.f401371v;
            if (!kotlin.jvm.internal.L.f(m12, e12) && m12 != null) {
                throw th2;
            }
            c41619a.h(th2);
        }
        return kotlin.G0.f406611a;
    }
}
