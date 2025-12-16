package com.avito.android.extended_profile;

import androidx.view.M0;
import androidx.view.N0;
import cU0.InterfaceC27108f;
import com.avito.android.extended_profile.mvi.C30474y;
import eA.InterfaceC39978a;
import fA.C40269b;
import fA.InterfaceC40265a;
import iT.C41343c;
import iT.InterfaceC41341a;
import javax.inject.Inject;
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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;

/* compiled from: ExtendedProfileMviViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile/X;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "", "LfA/b;", "LiT/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class X extends M0 implements com.avito.android.arch.mvi.android.k<Object, C40269b, Object>, InterfaceC41341a {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final eA.g f149370E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39978a f149371J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final eA.m f149372K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ux_feedback.b f149373L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C41343c f149374M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f149375N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f149376O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f149377P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m f149378Q;

    /* compiled from: ExtendedProfileMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileMviViewModel$accept$1", f = "ExtendedProfileMviViewModel.kt", i = {}, l = {56, 57}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f149379q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f149380r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ X f149381s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, X x12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f149380r = obj;
            this.f149381s = x12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f149380r, this.f149381s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f149379q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f149380r;
                boolean z12 = obj2 instanceof InterfaceC40265a;
                X x12 = this.f149381s;
                if (z12) {
                    com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) x12.f149375N.getValue();
                    this.f149379q = 1;
                    if (cVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (obj2 instanceof InterfaceC40047a) {
                    com.avito.android.lib.beduin_v2.feature.mvi.x xVar = (com.avito.android.lib.beduin_v2.feature.mvi.x) x12.f149376O.getValue();
                    this.f149379q = 2;
                    if (xVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public X(@Y61.k eA.g gVar, @Y61.k InterfaceC39978a interfaceC39978a, @Y61.k eA.m mVar, @Y61.k com.avito.android.extended_profile_ux_feedback.b bVar, @Y61.k C41343c c41343c, @Y61.k C30474y c30474y, @Y61.k h31.e eVar) {
        this.f149370E = gVar;
        this.f149371J = interfaceC39978a;
        this.f149372K = mVar;
        this.f149373L = bVar;
        this.f149374M = c41343c;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new Z(c30474y, this));
        this.f149375N = interfaceC42726CC;
        InterfaceC42726C interfaceC42726CC2 = C42727D.c(new Y(eVar, this));
        this.f149376O = interfaceC42726CC2;
        this.f149377P = C42727D.c(new b0(this));
        this.f149378Q = C43175k.N(((com.avito.android.arch.mvi.c) interfaceC42726CC.getValue()).f91928q, ((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC2.getValue()).getEvents());
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final InterfaceC27108f Ed() {
        return this.f149374M.f398527c;
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final com.avito.beduin.v2.engine.component.z H4() {
        return this.f149374M.f398526b;
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        C43259k.d(N0.a(this), null, null, new a(obj, this, null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Object> getEvents() {
        return this.f149378Q;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<C40269b> getState() {
        return (n2) this.f149377P.getValue();
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f149370E.a();
        this.f149372K.a();
        this.f149371J.a();
        this.f149373L.clear();
    }
}
