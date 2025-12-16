package com.avito.android.iac_calls_history.impl_module.interactor;

import XJ.a;
import Y41.p;
import androidx.compose.runtime.internal.P;
import cK.InterfaceC27058a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CallsHistoryUnreadCounterInteractorImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/i;", "LcK/a;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes13.dex */
public final class i implements InterfaceC27058a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_calls_history.impl_module.api.a f164739a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f164740b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f164742d;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<Integer> f164741c = p2.a(0);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AW.e f164743e = new AW.e("CallsHistoryUnreadCounterInteractor", AW.f.f434a);

    /* compiled from: CallsHistoryUnreadCounterInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.interactor.CallsHistoryUnreadCounterInteractorImpl$markAllAsRead$1", f = "CallsHistoryUnreadCounterInteractorImpl.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164744q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return i.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164744q;
            i iVar = i.this;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.iac_calls_history.impl_module.api.a aVar = iVar.f164739a;
                    this.f164744q = 1;
                    if (aVar.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
            } catch (Exception e12) {
                AW.e eVar = iVar.f164743e;
                eVar.f433b.a(eVar.f432a, "Error in markAllAsRead", e12);
                iVar.b();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CallsHistoryUnreadCounterInteractorImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.interactor.CallsHistoryUnreadCounterInteractorImpl$refreshCounter$1", f = "CallsHistoryUnreadCounterInteractorImpl.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164746q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return i.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws ApiException {
            TypedResult typedResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164746q;
            i iVar = i.this;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.iac_calls_history.impl_module.api.a aVar = iVar.f164739a;
                    this.f164746q = 1;
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
                typedResult = (TypedResult) obj;
            } catch (Exception e12) {
                AW.e eVar = iVar.f164743e;
                eVar.f433b.a(eVar.f432a, "Error in refreshCounter", e12);
            }
            if (typedResult instanceof TypedResult.Success) {
                iVar.f164741c.setValue(Boxing.boxInt(((a.C1328a) ((TypedResult.Success) typedResult).getResult()).getCounter()));
                return G0.f406611a;
            }
            if (typedResult instanceof TypedResult.Error) {
                throw C35936s.a(((TypedResult.Error) typedResult).getError(), ((TypedResult.Error) typedResult).getCause());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public i(@Y61.k com.avito.android.iac_calls_history.impl_module.api.a aVar, @Y61.k R0 r02) {
        this.f164739a = aVar;
        this.f164740b = r02;
        this.f164742d = U.a(r02.a());
    }

    @Override // cK.InterfaceC27058a
    public final n2 a() {
        return this.f164741c;
    }

    @Override // cK.InterfaceC27058a
    public final void b() {
        C43259k.d(this.f164742d, null, null, new b(null), 3);
    }

    @Override // cK.InterfaceC27058a
    public final void c() {
        this.f164741c.setValue(0);
    }

    @Override // cK.InterfaceC27058a
    public final void d() {
        this.f164741c.setValue(0);
        C43259k.d(this.f164742d, null, null, new a(null), 3);
    }
}
