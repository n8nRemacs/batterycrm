package com.avito.android.profile.pro.impl.screen;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pg.InterfaceC47076b;

/* compiled from: ProfileProFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectEvents$2", f = "ProfileProFragment.kt", i = {}, l = {648}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f223615q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment f223616r;

    /* compiled from: ProfileProFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements InterfaceC43172j, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ProfileProFragment f223617b;

        public a(ProfileProFragment profileProFragment) {
            this.f223617b = profileProFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC47076b interfaceC47076b = (InterfaceC47076b) obj;
            int i12 = ProfileProFragment.f222861X0;
            ProfileProFragment profileProFragment = this.f223617b;
            profileProFragment.getClass();
            if (interfaceC47076b instanceof InterfaceC47076b.a) {
                profileProFragment.F5(((InterfaceC47076b.a) interfaceC47076b).f428720a);
            }
            G0 g02 = G0.f406611a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g02;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(2, this.f223617b, ProfileProFragment.class, "handleAvitoFinanceEvents", "handleAvitoFinanceEvents(Lcom/avito/android/avito_finance_user_profile/view/mvi/entity/AvitoFinanceBlockEvent;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ProfileProFragment profileProFragment, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f223616r = profileProFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f223616r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f223615q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = ProfileProFragment.f222861X0;
            ProfileProFragment profileProFragment = this.f223616r;
            com.avito.android.avito_finance_user_profile.view.mvi.p pVarD5 = profileProFragment.D5();
            a aVar = new a(profileProFragment);
            this.f223615q = 1;
            if (pVarD5.ke(aVar, this) == coroutine_suspended) {
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
