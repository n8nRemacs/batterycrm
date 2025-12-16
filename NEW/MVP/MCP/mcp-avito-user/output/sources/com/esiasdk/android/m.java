package com.esiasdk.android;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: EsiaAuthVm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "com.esiasdk.android.EsiaAuthVm$request$3", f = "EsiaAuthVm.kt", i = {0}, l = {97}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class m extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f339714q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f339715r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.scheduling.b f339716s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f339717t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N f339718u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f339719v;

    /* compiled from: EsiaAuthVm.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.esiasdk.android.EsiaAuthVm$request$3$result$1", f = "EsiaAuthVm.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<Object>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f339720q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f339721r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Continuation<Object>, ? extends Object> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f339721r = (SuspendLambda) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f339721r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<Object> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f339720q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f339720q = 1;
                obj = this.f339721r.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(kotlinx.coroutines.scheduling.b bVar, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Continuation continuation) {
        super(2, continuation);
        this.f339716s = bVar;
        this.f339717t = (N) lVar;
        this.f339718u = (N) lVar2;
        this.f339719v = (SuspendLambda) lVar3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        ?? r32 = this.f339718u;
        ?? r42 = this.f339719v;
        m mVar = new m(this.f339716s, this.f339717t, r32, r42, continuation);
        mVar.f339715r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r1v3, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        T t12;
        Exception e12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f339714q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t13 = (T) this.f339715r;
            try {
                kotlinx.coroutines.scheduling.b bVar = this.f339716s;
                a aVar = new a(this.f339719v, null);
                this.f339715r = t13;
                this.f339714q = 1;
                Object objG = C43259k.g(bVar, aVar, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t12 = t13;
                obj = objG;
            } catch (Exception e13) {
                t12 = t13;
                e12 = e13;
                t12.getClass();
                e12.toString();
                this.f339718u.invoke(e12);
                return G0.f406611a;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t12 = (T) this.f339715r;
            try {
                C42729a0.b(obj);
            } catch (Exception e14) {
                e12 = e14;
                t12.getClass();
                e12.toString();
                this.f339718u.invoke(e12);
                return G0.f406611a;
            }
        }
        this.f339717t.invoke(obj);
        return G0.f406611a;
    }
}
