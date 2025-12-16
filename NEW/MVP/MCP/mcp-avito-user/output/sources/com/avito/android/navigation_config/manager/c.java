package com.avito.android.navigation_config.manager;

import Y41.p;
import Y61.l;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: NavigationConfigManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.navigation_config.manager.NavigationConfigManagerImpl$updateStartSpace$2", f = "NavigationConfigManagerImpl.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super TypedResult<G0>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f207223q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f207224r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f207225s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ BottomNavigationSpace f207226t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f207227u;

    /* compiled from: NavigationConfigManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.navigation_config.manager.NavigationConfigManagerImpl$updateStartSpace$2$deferred$1", f = "NavigationConfigManagerImpl.kt", i = {0}, l = {77}, m = "invokeSuspend", n = {"$this$async"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<G0>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207228q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f207229r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f207230s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ BottomNavigationSpace f207231t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f207232u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, BottomNavigationSpace bottomNavigationSpace, boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f207230s = bVar;
            this.f207231t = bottomNavigationSpace;
            this.f207232u = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f207230s, this.f207231t, this.f207232u, continuation);
            aVar.f207229r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<G0>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            T t12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207228q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t13 = (T) this.f207229r;
                if (!this.f207230s.f207215c.b()) {
                    return new TypedResult.Error(com.avito.android.remote.error.j.c(), null, 2, null);
                }
                com.avito.android.navigation_config.service.b bVar = this.f207230s.f207213a;
                BottomNavigationSpace bottomNavigationSpace = this.f207231t;
                this.f207229r = t13;
                this.f207228q = 1;
                Object objB = bVar.b(bottomNavigationSpace, this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t12 = t13;
                obj = objB;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t12 = (T) this.f207229r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            U.d(t12);
            if (typedResult instanceof TypedResult.Success) {
                U20.a aVar = new U20.a(this.f207231t);
                this.f207230s.f207214b.b(aVar);
                if (this.f207232u) {
                    this.f207230s.f207219g = aVar;
                }
            }
            return typedResult;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, BottomNavigationSpace bottomNavigationSpace, boolean z12, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f207225s = bVar;
        this.f207226t = bottomNavigationSpace;
        this.f207227u = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f207225s, this.f207226t, this.f207227u, continuation);
        cVar.f207224r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<G0>> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f207223q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f207224r;
            b bVar = this.f207225s;
            InterfaceC43076a0 interfaceC43076a0B = C43259k.b(t12, bVar.f207216d, new a(bVar, this.f207226t, this.f207227u, null), 2);
            n<Object> nVar = b.f207211h[0];
            bVar.f207218f.setValue(bVar, nVar, (AbstractC43075a) interfaceC43076a0B);
            this.f207223q = 1;
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
