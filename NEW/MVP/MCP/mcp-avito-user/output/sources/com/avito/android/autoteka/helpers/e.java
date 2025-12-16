package com.avito.android.autoteka.helpers;

import Y41.p;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.coroutines.Delays;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.helpers.DelayKt$withMinDelay$2", f = "Delay.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super TypedResult<Object>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f96649q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f96650r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f96651s;

    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.helpers.DelayKt$withMinDelay$2$delayDeferred$1", f = "Delay.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f96652q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation) {
            super(2, continuation);
            Delays[] delaysArr = Delays.f318856b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            Delays[] delaysArr = Delays.f318856b;
            return new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f96652q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Delays[] delaysArr = Delays.f318856b;
                this.f96652q = 1;
                if (C43131e0.b(1000L, this) == coroutine_suspended) {
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

    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.helpers.DelayKt$withMinDelay$2$requestDeferred$1", f = "Delay.kt", i = {1}, l = {18, 20}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult.Error f96653q;

        /* renamed from: r, reason: collision with root package name */
        public int f96654r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f96655s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43076a0<G0> f96656t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super Continuation<? super TypedResult<Object>>, ? extends Object> lVar, InterfaceC43076a0<G0> interfaceC43076a0, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f96655s = (SuspendLambda) lVar;
            this.f96656t = interfaceC43076a0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f96655s, this.f96656t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            TypedResult typedResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f96654r;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f96654r = 1;
                obj = this.f96655s.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    typedResult = this.f96653q;
                    C42729a0.b(obj);
                    return typedResult;
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult2 = (TypedResult) obj;
            boolean z12 = typedResult2 instanceof TypedResult.Error;
            InterfaceC43076a0<G0> interfaceC43076a0 = this.f96656t;
            if (!z12) {
                if (!(typedResult2 instanceof TypedResult.Success)) {
                    return typedResult2;
                }
                ((V0) interfaceC43076a0).c(null);
                return typedResult2;
            }
            this.f96653q = (TypedResult.Error) typedResult2;
            this.f96654r = 2;
            if (interfaceC43076a0.F(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            typedResult = typedResult2;
            return typedResult;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Y41.l lVar, Continuation continuation) {
        super(2, continuation);
        Delays[] delaysArr = Delays.f318856b;
        this.f96651s = (SuspendLambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Delays[] delaysArr = Delays.f318856b;
        e eVar = new e(this.f96651s, continuation);
        eVar.f96650r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f96649q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f96650r;
            Delays[] delaysArr = Delays.f318856b;
            InterfaceC43076a0 interfaceC43076a0B = C43259k.b(t12, null, new b(this.f96651s, C43259k.b(t12, null, new a(null), 3), null), 3);
            this.f96649q = 1;
            obj = interfaceC43076a0B.F(this);
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
