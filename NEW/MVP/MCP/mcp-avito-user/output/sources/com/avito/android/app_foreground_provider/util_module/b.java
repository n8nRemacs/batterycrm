package com.avito.android.app_foreground_provider.util_module;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.L;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.K;

/* compiled from: AppForegroundStatusProvider.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/app_foreground_provider/util_module/b;", "Lcom/avito/android/app_foreground_provider/util_module/a;", "<init>", "()V", "_avito_app-foreground-status-provider_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.app_foreground_provider.util_module.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AtomicBoolean f91765a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AtomicBoolean f91766b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f91767c = C42727D.c(new c());

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f91768d = C42727D.c(new C2698b());

    /* compiled from: AppForegroundStatusProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.app_foreground_provider.util_module.AppForegroundStatusProviderImpl$initializeIfNeeded$1", f = "AppForegroundStatusProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* compiled from: AppForegroundStatusProvider.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/app_foreground_provider/util_module/b$a$a", "Landroidx/lifecycle/L;", "_avito_app-foreground-status-provider_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.app_foreground_provider.util_module.b$a$a, reason: collision with other inner class name */
        public static final class C2697a implements InterfaceC22979L {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f91770b;

            public C2697a(b bVar) {
                this.f91770b = bVar;
            }

            @Override // androidx.view.InterfaceC22979L
            public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
                boolean zA2 = event.a().a(Lifecycle.State.f46682e);
                b bVar = this.f91770b;
                AtomicBoolean atomicBoolean = bVar.f91765a;
                if (zA2) {
                    atomicBoolean.set(true);
                }
                AppForegroundStatus appForegroundStatus = new AppForegroundStatus(zA2, atomicBoolean.get());
                ((Z1) bVar.f91768d.getValue()).setValue(appForegroundStatus);
                ((com.jakewharton.rxrelay3.d) bVar.f91767c.getValue()).accept(appForegroundStatus);
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C23050m0.f46822j.getClass();
            C23050m0.f46823k.f46829g.a(new C2697a(b.this));
            return G0.f406611a;
        }
    }

    /* compiled from: AppForegroundStatusProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.app_foreground_provider.util_module.b$b, reason: collision with other inner class name */
    public static final class C2698b extends N implements Y41.a<Z1<AppForegroundStatus>> {
        public C2698b() {
            super(0);
        }

        @Override // Y41.a
        public final Z1<AppForegroundStatus> invoke() {
            return p2.a(b.this.getStatus());
        }
    }

    /* compiled from: AppForegroundStatusProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/jakewharton/rxrelay3/d;", "Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;", "invoke", "()Lcom/jakewharton/rxrelay3/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.jakewharton.rxrelay3.d<AppForegroundStatus>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.jakewharton.rxrelay3.d<AppForegroundStatus> invoke() {
            return com.jakewharton.rxrelay3.b.N0(b.this.getStatus()).M0();
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.app_foreground_provider.util_module.a
    @k
    public final Z1 a() {
        c();
        return (Z1) this.f91768d.getValue();
    }

    @Override // com.avito.android.app_foreground_provider.util_module.a
    @k
    public final L b() {
        c();
        com.jakewharton.rxrelay3.d dVar = (com.jakewharton.rxrelay3.d) this.f91767c.getValue();
        dVar.getClass();
        return dVar.D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // com.avito.android.app_foreground_provider.util_module.a
    public final void c() {
        if (this.f91766b.getAndSet(true)) {
            return;
        }
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        C43259k.d(U.a(K.f411877a), null, null, new a(null), 3);
    }

    @Override // com.avito.android.app_foreground_provider.util_module.a
    @k
    public final AppForegroundStatus getStatus() {
        C23050m0.f46822j.getClass();
        boolean zA2 = C23050m0.f46823k.f46829g.f46705d.a(Lifecycle.State.f46682e);
        AtomicBoolean atomicBoolean = this.f91765a;
        if (zA2) {
            atomicBoolean.set(true);
        }
        return new AppForegroundStatus(zA2, atomicBoolean.get());
    }
}
