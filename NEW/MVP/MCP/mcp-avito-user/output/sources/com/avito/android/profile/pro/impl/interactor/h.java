package com.avito.android.profile.pro.impl.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.interactor.f;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ProfileProInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/profile/pro/impl/interactor/f$b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.interactor.ProfileProInteractorImpl$getProfile$2", f = "ProfileProInteractor.kt", i = {0, 0, 1}, l = {62, 65, 66}, m = "invokeSuspend", n = {"ordersInfo", "employeeInfo", "employeeInfo"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super TypedResult<f.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f222711q;

    /* renamed from: r, reason: collision with root package name */
    public B90.a f222712r;

    /* renamed from: s, reason: collision with root package name */
    public int f222713s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f222714t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f222715u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ProfileTabUserType f222716v;

    /* compiled from: ProfileProInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LB90/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.interactor.ProfileProInteractorImpl$getProfile$2$contentInfo$1", f = "ProfileProInteractor.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<B90.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f222717q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f f222718r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ProfileTabUserType f222719s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, ProfileTabUserType profileTabUserType, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f222718r = fVar;
            this.f222719s = profileTabUserType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f222718r, this.f222719s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<B90.a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f222717q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f222717q = 1;
                f fVar = this.f222718r;
                obj = C43259k.g(fVar.f222696g.a(), new i(fVar, this.f222719s, null), this);
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

    /* compiled from: ProfileProInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/profile/pro/impl/interactor/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/profile/pro/impl/interactor/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.interactor.ProfileProInteractorImpl$getProfile$2$employeeInfo$1", f = "ProfileProInteractor.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super com.avito.android.profile.pro.impl.interactor.a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f222720q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f f222721r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f222721r = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f222721r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super com.avito.android.profile.pro.impl.interactor.a> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f222720q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.profile.pro.impl.interactor.b bVar = this.f222721r.f222693d;
                this.f222720q = 1;
                obj = bVar.a(this);
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

    /* compiled from: ProfileProInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/activeOrders/OrdersNeedActionResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.interactor.ProfileProInteractorImpl$getProfile$2$ordersInfo$1", f = "ProfileProInteractor.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super TypedResult<OrdersNeedActionResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f222722q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f f222723r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f222723r = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new c(this.f222723r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<OrdersNeedActionResponse>> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f222722q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.activeOrders.a aVar = this.f222723r.f222691b;
                this.f222722q = 1;
                obj = aVar.a(this);
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
    public h(f fVar, ProfileTabUserType profileTabUserType, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f222715u = fVar;
        this.f222716v = profileTabUserType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        h hVar = new h(this.f222715u, this.f222716v, continuation);
        hVar.f222714t = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<f.b>> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.interactor.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
