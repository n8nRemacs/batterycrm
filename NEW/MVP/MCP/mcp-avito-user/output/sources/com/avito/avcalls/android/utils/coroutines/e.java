package com.avito.avcalls.android.utils.coroutines;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CoroutineTimer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/utils/coroutines/e;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43238h f332439a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public N0 f332440b;

    /* compiled from: CoroutineTimer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.utils.coroutines.CoroutineTimer$start$1", f = "CoroutineTimer.kt", i = {}, l = {18, 19}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f332441q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ long f332442r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f332443s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j12, Y41.l<? super Continuation<? super G0>, ? extends Object> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f332442r = j12;
            this.f332443s = (SuspendLambda) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f332442r, this.f332443s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r6v2, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f332441q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f332441q = 1;
                if (C43131e0.b(this.f332442r, this) == coroutine_suspended) {
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
                C42729a0.b(obj);
            }
            this.f332441q = 2;
            if (this.f332443s.invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    public e(@k C43238h c43238h) {
        this.f332439a = c43238h;
    }

    public final void a(long j12, @k Y41.l<? super Continuation<? super G0>, ? extends Object> lVar) {
        b();
        this.f332440b = C43259k.d(this.f332439a, null, null, new a(j12, lVar, null), 3);
    }

    public final void b() {
        N0 n02 = this.f332440b;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f332440b = null;
    }
}
