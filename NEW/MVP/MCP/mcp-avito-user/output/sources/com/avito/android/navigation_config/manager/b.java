package com.avito.android.navigation_config.manager;

import Y41.p;
import Y61.l;
import a30.InterfaceC19674b;
import com.avito.android.account.E;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.M;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import tK0.C48567a;

/* compiled from: NavigationConfigManagerImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/navigation_config/manager/b;", "Lcom/avito/android/navigation_config/manager/a;", "a", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.navigation_config.manager.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f207211h = {m0.f406844a.e(new Y(b.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0))};

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final U20.a f207212i;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation_config.service.b f207213a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19674b f207214b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f207215c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final M f207216d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43238h f207217e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C48567a f207218f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public volatile U20.a f207219g;

    /* compiled from: NavigationConfigManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/navigation_config/manager/b$a;", "", "<init>", "()V", "LU20/a;", "defaultNavigationConfig", "LU20/a;", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NavigationConfigManagerImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.navigation_config.manager.NavigationConfigManagerImpl$load$1", f = "NavigationConfigManagerImpl.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.avito.android.navigation_config.manager.b$b, reason: collision with other inner class name */
    public static final class C6178b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207220q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f207221r;

        public C6178b(Continuation<? super C6178b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            C6178b c6178b = b.this.new C6178b(continuation);
            c6178b.f207221r = obj;
            return c6178b;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C6178b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            T t12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207220q;
            b bVar = b.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t13 = (T) this.f207221r;
                if (!bVar.f207215c.b()) {
                    return G0.f406611a;
                }
                this.f207221r = t13;
                this.f207220q = 1;
                Object objA = bVar.f207213a.a(this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t12 = t13;
                obj = objA;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t12 = (T) this.f207221r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            TypedResult.Success success = typedResult instanceof TypedResult.Success ? (TypedResult.Success) typedResult : null;
            U20.a aVar = success != null ? (U20.a) success.getResult() : null;
            if (aVar != null) {
                U20.a aVar2 = aVar.f16133a != null ? aVar : null;
                if (aVar2 != null) {
                    U.d(t12);
                    bVar.f207214b.b(aVar2);
                    return G0.f406611a;
                }
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f207212i = new U20.a(null);
    }

    @Inject
    public b(@Y61.k com.avito.android.navigation_config.service.b bVar, @Y61.k InterfaceC19674b interfaceC19674b, @Y61.k E e12, @Y61.k R0 r02) {
        this.f207213a = bVar;
        this.f207214b = interfaceC19674b;
        this.f207215c = e12;
        kotlinx.coroutines.scheduling.b bVarA = r02.a();
        this.f207216d = bVarA;
        this.f207217e = U.a(bVarA);
        this.f207218f = new C48567a();
        this.f207219g = interfaceC19674b.c();
    }

    @Override // U20.e
    public final void a(@Y61.k BottomNavigationSpace bottomNavigationSpace) {
        if (this.f207215c.b()) {
            this.f207214b.b(new U20.a(bottomNavigationSpace));
        }
    }

    @Override // com.avito.android.navigation_config.manager.a
    public final void b() {
        N0 n02 = (N0) this.f207218f.getValue(this, f207211h[0]);
        if (n02 != null) {
            n02.c(null);
        }
        this.f207214b.a();
        this.f207219g = f207212i;
    }

    @Override // U20.e
    @l
    public final Object c(@Y61.k BottomNavigationSpace bottomNavigationSpace, boolean z12, @Y61.k SuspendLambda suspendLambda) {
        return U.c(new c(this, bottomNavigationSpace, z12, null), suspendLambda);
    }

    @Override // com.avito.android.navigation_config.manager.a
    public final void d() {
        this.f207219g = this.f207214b.c();
    }

    @Override // U20.c
    @Y61.k
    public final U20.g e() {
        if (!this.f207215c.b()) {
            return new U20.g(BottomNavigationSpace.f107065b);
        }
        BottomNavigationSpace bottomNavigationSpace = this.f207219g.f16133a;
        if (bottomNavigationSpace == null) {
            bottomNavigationSpace = BottomNavigationSpace.f107065b;
        }
        return new U20.g(bottomNavigationSpace);
    }

    @Override // U20.b
    public final void load() {
        AbstractC43075a abstractC43075a = (AbstractC43075a) C43259k.d(this.f207217e, null, null, new C6178b(null), 3);
        this.f207218f.setValue(this, f207211h[0], abstractC43075a);
    }
}
