package com.avito.android.early_access;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: EarlyAccessPaymentStatusChangedObserver.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/v;", "Lcom/avito/android/early_access/u;", "Lcom/avito/android/early_access/t;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes13.dex */
public final class v implements u, t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43238h f145577a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f145578b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d2<Long> f145579c;

    /* compiled from: EarlyAccessPaymentStatusChangedObserver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access.EarlyAccessPaymentStatusChangedObserverImpl$emit$1", f = "EarlyAccessPaymentStatusChangedObserver.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145580q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f145582s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f145582s = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return v.this.new a(this.f145582s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f145580q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = v.this.f145578b;
                Long lBoxLong = Boxing.boxLong(this.f145582s);
                this.f145580q = 1;
                if (e2Var.emit(lBoxLong, this) == coroutine_suspended) {
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

    @Inject
    public v(@Y61.k R0 r02) {
        this.f145577a = U.a(r02.a());
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f145578b = e2VarB;
        this.f145579c = C43175k.a(e2VarB);
    }

    @Override // com.avito.android.early_access.u
    @Y61.k
    public final d2<Long> a() {
        return this.f145579c;
    }

    @Override // com.avito.android.early_access.t
    public final void b(long j12) {
        C43259k.d(this.f145577a, null, null, new a(j12, null), 3);
    }
}
