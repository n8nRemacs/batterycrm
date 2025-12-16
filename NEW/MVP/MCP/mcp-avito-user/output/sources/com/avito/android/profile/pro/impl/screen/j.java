package com.avito.android.profile.pro.impl.screen;

import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import eu0.InterfaceC40159b;
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

/* compiled from: ProfileProFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectEvents$1", f = "ProfileProFragment.kt", i = {}, l = {647}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f223612q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment f223613r;

    /* compiled from: ProfileProFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements InterfaceC43172j, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ProfileProFragment f223614b;

        public a(ProfileProFragment profileProFragment) {
            this.f223614b = profileProFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC40159b interfaceC40159b = (InterfaceC40159b) obj;
            int i12 = ProfileProFragment.f222861X0;
            ProfileProFragment profileProFragment = this.f223614b;
            if (interfaceC40159b instanceof InterfaceC40159b.a) {
                profileProFragment.F5(((InterfaceC40159b.a) interfaceC40159b).f395431a);
            } else if (interfaceC40159b instanceof InterfaceC40159b.C11112b) {
                InterfaceC40159b.C11112b c11112b = (InterfaceC40159b.C11112b) interfaceC40159b;
                profileProFragment.G5(c11112b.f395432a, c11112b.f395433b, c11112b.f395434c, c11112b.f395435d, new w(profileProFragment), ToastBarPosition.f181046d);
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
            return new C42801a(2, this.f223614b, ProfileProFragment.class, "handleSbEvents", "handleSbEvents(Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockEvent;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ProfileProFragment profileProFragment, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f223613r = profileProFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f223613r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f223612q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = ProfileProFragment.f222861X0;
            ProfileProFragment profileProFragment = this.f223613r;
            A aE5 = profileProFragment.E5();
            a aVar = new a(profileProFragment);
            this.f223612q = 1;
            if (aE5.ke(aVar, this) == coroutine_suspended) {
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
