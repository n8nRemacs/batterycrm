package com.avito.android.iac_dialer.impl_module.timer_interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
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
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import pK.InterfaceC46970a;

/* compiled from: IacTimerInteractor.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/timer_interactor/a;", "Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class a implements IacTimerInteractor {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC46970a f166498a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f166499b = f2.b(0, 4, null, 5);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f166500c;

    /* compiled from: IacTimerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/timer_interactor/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.timer_interactor.a$a, reason: collision with other inner class name */
    public static final class C4943a {
        public /* synthetic */ C4943a(C42822w c42822w) {
            this();
        }

        public C4943a() {
        }
    }

    /* compiled from: IacTimerInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractorImpl$startTimer$1", f = "IacTimerInteractor.kt", i = {}, l = {43, 44}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f166501q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ IacTimerInteractor.Timer f166502r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f166503s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IacTimerInteractor.Timer timer, a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f166502r = timer;
            this.f166503s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f166502r, this.f166503s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f166501q;
            IacTimerInteractor.Timer timer = this.f166502r;
            if (i12 == 0) {
                C42729a0.b(obj);
                long millis = timer.getMillis();
                this.f166501q = 1;
                if (C43131e0.b(millis, this) == coroutine_suspended) {
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
            e2 e2Var = this.f166503s.f166499b;
            this.f166501q = 2;
            if (e2Var.emit(timer, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new C4943a(null);
    }

    @Inject
    public a(@k R0 r02, @k InterfaceC46970a interfaceC46970a) {
        this.f166498a = interfaceC46970a;
        this.f166500c = U.a(r02.a());
    }

    @Override // com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor
    /* renamed from: a, reason: from getter */
    public final e2 getF166499b() {
        return this.f166499b;
    }

    @Override // com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor
    public final void b(@k IacTimerInteractor.Timer timer) {
        C43259k.d(this.f166500c, null, null, new b(timer, this, null), 3);
    }
}
