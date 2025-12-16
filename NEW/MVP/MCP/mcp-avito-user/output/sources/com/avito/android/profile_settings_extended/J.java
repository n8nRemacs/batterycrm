package com.avito.android.profile_settings_extended;

import androidx.view.M0;
import androidx.view.N0;
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
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;

/* compiled from: ExtendedProfileSettingsMviViewModel.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/J;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "", "Lyc0/l;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class J extends M0 implements com.avito.android.arch.mvi.android.k<Object, yc0.l, Object> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_management_core.images.a f229048E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f229049J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f229050K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f229051L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f229052M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f229053N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f229054O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m f229055P;

    /* compiled from: ExtendedProfileSettingsMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsMviViewModel$accept$1", f = "ExtendedProfileSettingsMviViewModel.kt", i = {}, l = {54, 55}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f229056q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f229057r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ J f229058s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, J j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f229057r = obj;
            this.f229058s = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f229057r, this.f229058s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f229056q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f229057r;
                boolean z12 = obj2 instanceof yc0.k;
                J j12 = this.f229058s;
                if (z12) {
                    com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) j12.f229052M.getValue();
                    this.f229056q = 1;
                    if (cVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (obj2 instanceof InterfaceC40047a) {
                    com.avito.android.lib.beduin_v2.feature.mvi.x xVar = (com.avito.android.lib.beduin_v2.feature.mvi.x) j12.f229053N.getValue();
                    this.f229056q = 2;
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

    /* compiled from: ExtendedProfileSettingsMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsMviViewModel$onCleared$1", f = "ExtendedProfileSettingsMviViewModel.kt", i = {}, l = {71, 72}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f229059q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return J.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f229059q;
            com.avito.android.profile_management_core.images.a aVar = J.this.f229048E;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f229059q = 1;
                if (aVar.a(this) == coroutine_suspended) {
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
            this.f229059q = 2;
            if (aVar.c(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public J(@Y61.k com.avito.android.profile_management_core.images.a aVar, @Y61.k com.avito.beduin.v2.engine.component.B b12, @Y61.k aU0.b bVar, @Y61.k com.avito.android.profile_settings_extended.mvi.z zVar, @Y61.k h31.e eVar) {
        this.f229048E = aVar;
        this.f229049J = b12;
        this.f229050K = bVar;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new L(zVar, this));
        this.f229052M = interfaceC42726CC;
        InterfaceC42726C interfaceC42726CC2 = C42727D.c(new K(eVar, this));
        this.f229053N = interfaceC42726CC2;
        this.f229054O = C42727D.c(new N(this));
        this.f229055P = C43175k.N(((com.avito.android.arch.mvi.c) interfaceC42726CC.getValue()).f91928q, ((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC2.getValue()).getEvents());
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        C43259k.d(N0.a(this), null, null, new a(obj, this, null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Object> getEvents() {
        return this.f229055P;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<yc0.l> getState() {
        return (n2) this.f229054O.getValue();
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        C43259k.d(kotlinx.coroutines.U.a(Q0.a()), null, null, new b(null), 3);
    }
}
