package com.avito.android.profile_settings_basic;

import Qb0.InterfaceC14878a;
import Qb0.InterfaceC14880c;
import androidx.compose.runtime.internal.P;
import androidx.view.N0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.i2;

/* compiled from: BasicProfileSettingsMviViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_basic/w;", "Lcom/avito/android/arch/mvi/android/j;", "LQb0/a;", "LQb0/d;", "LQb0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w extends com.avito.android.arch.mvi.android.j<InterfaceC14878a, Qb0.d, InterfaceC14880c> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_management_core.images.a f228937N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f228938O;

    /* compiled from: BasicProfileSettingsMviViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQb0/a;", "it", "Lkotlin/G0;", "<anonymous>", "(LQb0/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.BasicProfileSettingsMviViewModel$1", f = "BasicProfileSettingsMviViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC14878a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f228939q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = w.this.new a(continuation);
            aVar.f228939q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC14878a interfaceC14878a, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC14878a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            w.this.accept((InterfaceC14878a) this.f228939q);
            return G0.f406611a;
        }
    }

    /* compiled from: BasicProfileSettingsMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.BasicProfileSettingsMviViewModel$onCleared$1", f = "BasicProfileSettingsMviViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228941q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return w.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f228941q;
            if (i12 == 0) {
                C42729a0.b(obj);
                w wVar = w.this;
                this.f228941q = 1;
                if (wVar.f228937N.a(this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public w(@Y61.k com.avito.android.profile_settings_basic.mvi.p pVar, @Y61.k com.avito.android.profile_management_core.images.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        super(pVar, i2.a.f411433c);
        i2.f411430a.getClass();
        this.f228937N = aVar;
        this.f228938O = aVar2;
        C43175k.K(new C43197r1(new a(null), new y(new x(kotlinx.coroutines.rx3.y.a(aVar2.d9())))), N0.a(this));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        C43259k.d(U.a(Q0.a()), null, null, new b(null), 3);
    }
}
