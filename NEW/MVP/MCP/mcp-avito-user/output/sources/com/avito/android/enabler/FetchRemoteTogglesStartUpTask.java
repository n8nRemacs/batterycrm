package com.avito.android.enabler;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.I1;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.remote_toggles_fetcher.fetcher.a;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.service.short_task.j;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: FetchRemoteTogglesStartUpTask.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/enabler/FetchRemoteTogglesStartUpTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/service/short_task/j;", "shortTaskScheduler", "Lcom/avito/android/I1;", "features", "Lcom/avito/android/remote_toggles_fetcher/fetcher/a;", "fetcher", "Lcom/avito/android/util/R0;", "dispatchers", "<init>", "(Lcom/avito/android/service/short_task/j;Lcom/avito/android/I1;Lcom/avito/android/remote_toggles_fetcher/fetcher/a;Lcom/avito/android/util/R0;)V", "Lkotlin/G0;", "execute", "()V", "Lcom/avito/android/service/short_task/j;", "Lcom/avito/android/I1;", "Lcom/avito/android/remote_toggles_fetcher/fetcher/a;", "Lcom/avito/android/util/R0;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FetchRemoteTogglesStartUpTask implements ApplicationForegroundStartupTask {

    @k
    private final R0 dispatchers;

    @k
    private final I1 features;

    @k
    private final a fetcher;

    @k
    private final j shortTaskScheduler;

    /* compiled from: FetchRemoteTogglesStartUpTask.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.enabler.FetchRemoteTogglesStartUpTask$execute$1", f = "FetchRemoteTogglesStartUpTask.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.enabler.FetchRemoteTogglesStartUpTask$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return FetchRemoteTogglesStartUpTask.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                FetchRemoteTogglesStartUpTask.this.shortTaskScheduler.b(FetchRemoteTogglesTask.class);
                a aVar = FetchRemoteTogglesStartUpTask.this.fetcher;
                this.label = 1;
                if (aVar.a(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            I1 i13 = FetchRemoteTogglesStartUpTask.this.features;
            i13.getClass();
            n<Object> nVar = I1.f67278k0[59];
            if (((Boolean) i13.f67317g0.a().getValue()).booleanValue()) {
                j jVar = FetchRemoteTogglesStartUpTask.this.shortTaskScheduler;
                ShortTask.NetworkState networkState = ShortTask.NetworkState.f274023b;
                TimeUnit timeUnit = TimeUnit.HOURS;
                long millis = timeUnit.toMillis(12L);
                jVar.a(FetchRemoteTogglesTask.class, networkState, false, false, false, false, millis, millis, timeUnit.toMillis(12L), true, null, ShortTask.BackoffPolicy.f274019b, 0L);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass1) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    @Inject
    public FetchRemoteTogglesStartUpTask(@k j jVar, @k I1 i12, @k a aVar, @k R0 r02) {
        this.shortTaskScheduler = jVar;
        this.features = i12;
        this.fetcher = aVar;
        this.dispatchers = r02;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        C43259k.d(U.a(this.dispatchers.a()), null, null, new AnonymousClass1(null), 3);
    }
}
