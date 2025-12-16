package com.avito.android.service.short_task;

import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.Q;

/* compiled from: SuspendedShortTask.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service/short_task/n;", "Lcom/avito/android/service/short_task/ShortTask;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroid/os/Bundle;", "bundle", "Lcom/avito/android/service/short_task/ShortTask$Status;", "suspendedStart", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/I;", "start", "(Landroid/os/Bundle;)Lio/reactivex/rxjava3/core/I;", "Lkotlin/coroutines/CoroutineContext;", "_common_job-scheduler_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class n implements ShortTask {

    @Y61.k
    private final CoroutineContext coroutineContext;

    /* compiled from: SuspendedShortTask.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/service/short_task/ShortTask$Status;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/service/short_task/ShortTask$Status;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service.short_task.SuspendedShortTask$start$1", f = "SuspendedShortTask.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super ShortTask.Status>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f274104q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Bundle f274106s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bundle bundle, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f274106s = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return n.this.new a(this.f274106s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super ShortTask.Status> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f274104q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f274104q = 1;
                obj = n.this.suspendedStart(this.f274106s, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @Y61.k
    public final I<ShortTask.Status> start(@Y61.k Bundle bundle) {
        return Q.a(this.coroutineContext, new a(bundle, null));
    }

    @Y61.l
    public abstract Object suspendedStart(@Y61.k Bundle bundle, @Y61.k Continuation<? super ShortTask.Status> continuation);

    public n(@Y61.k CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    public /* synthetic */ n(CoroutineContext coroutineContext, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext);
    }
}
