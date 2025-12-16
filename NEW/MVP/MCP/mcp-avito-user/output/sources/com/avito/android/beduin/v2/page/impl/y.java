package com.avito.android.beduin.v2.page.impl;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.C29270c0;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: BeduinV2PageViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/y;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class y extends M0 implements com.avito.android.arch.mvi.android.k<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f105152E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f105153J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f105154K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final R0 f105155L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final String f105156M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ZS.b f105157N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C29270c0 f105158O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f105159P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f105160Q = C42727D.c(new d());

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f105161R = C42727D.c(new c());

    /* compiled from: BeduinV2PageViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.BeduinV2PageViewModel$accept$1", f = "BeduinV2PageViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f105162q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40047a f105164s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40047a interfaceC40047a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f105164s = interfaceC40047a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return y.this.new a(this.f105164s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f105162q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.lib.beduin_v2.feature.mvi.x xVar = (com.avito.android.lib.beduin_v2.feature.mvi.x) y.this.f105159P.getValue();
                this.f105162q = 1;
                if (xVar.ya(this.f105164s, this) == coroutine_suspended) {
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

    /* compiled from: BeduinV2PageViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f105165l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ y f105166m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, y yVar) {
            super(0);
            this.f105165l = aVar;
            this.f105166m = yVar;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f105165l.a(N0.a(this.f105166m));
        }
    }

    /* compiled from: BeduinV2PageViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<InterfaceC43160i<? extends BeduinOneTimeEvent>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC43160i<? extends BeduinOneTimeEvent> invoke() {
            return ((com.avito.android.lib.beduin_v2.feature.mvi.x) y.this.f105159P.getValue()).getEvents();
        }
    }

    /* compiled from: BeduinV2PageViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "LeT/c;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<n2<? extends AbstractC40048c>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final n2<? extends AbstractC40048c> invoke() {
            i2 i2Var;
            y yVar = y.this;
            C43137a0 c43137a0 = new C43137a0(new z(yVar, null), (com.avito.android.lib.beduin_v2.feature.mvi.x) yVar.f105159P.getValue());
            A1.a aVarA = N0.a(yVar);
            C29270c0 c29270c0 = yVar.f105158O;
            c29270c0.getClass();
            kotlin.reflect.n<Object> nVar = C29270c0.f113263t[17];
            if (((Boolean) c29270c0.f113281s.a().invoke()).booleanValue()) {
                i2.f411430a.getClass();
                i2Var = i2.a.f411432b;
            } else {
                i2.f411430a.getClass();
                i2Var = i2.a.f411433c;
            }
            return C43175k.U(c43137a0, aVarA, i2Var, AbstractC40048c.C11084c.f395217b);
        }
    }

    @Inject
    public y(@Y61.k ZS.b bVar, @Y61.k aU0.b bVar2, @Y61.k C29270c0 c29270c0, @Y61.k n.a aVar, @Y61.k R0 r02, @Y61.k com.avito.beduin.v2.engine.component.B b12, @Y61.k String str, @Y61.k Set set) {
        this.f105152E = b12;
        this.f105153J = set;
        this.f105154K = bVar2;
        this.f105155L = r02;
        this.f105156M = str;
        this.f105157N = bVar;
        this.f105158O = c29270c0;
        this.f105159P = C42727D.c(new b(aVar, this));
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<BeduinOneTimeEvent> getEvents() {
        return (InterfaceC43160i) this.f105161R.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<AbstractC40048c> getState() {
        return (n2) this.f105160Q.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k InterfaceC40047a interfaceC40047a) {
        C43259k.d(N0.a(this), this.f105155L.b(), null, new a(interfaceC40047a, null), 2);
    }
}
