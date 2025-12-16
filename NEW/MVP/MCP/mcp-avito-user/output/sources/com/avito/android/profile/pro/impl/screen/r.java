package com.avito.android.profile.pro.impl.screen;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.screen.y;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import eu0.InterfaceC40158a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ProfileProFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectServiceBookingItemActions$1", f = "ProfileProFragment.kt", i = {}, l = {854}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class r extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f223740q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment f223741r;

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ProfileProFragment f223742l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProfileProFragment profileProFragment) {
            super(1);
            this.f223742l = profileProFragment;
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            int i12 = ProfileProFragment.f222861X0;
            this.f223742l.E5().accept(new InterfaceC40158a.C11111a(deepLink));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ProfileProFragment profileProFragment, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f223741r = profileProFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f223741r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f223740q;
        ProfileProFragment profileProFragment = this.f223741r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f223740q = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
                rVar.p();
                a aVar = new a(profileProFragment);
                com.avito.android.profile.pro.impl.screen.item.service_booking_block.c cVar = profileProFragment.f222873L0;
                if (cVar == null) {
                    cVar = null;
                }
                cVar.f223486b = new y.c(aVar);
                com.avito.android.profile.pro.impl.screen.item.service_booking_block.m mVar = profileProFragment.f222872K0;
                if (mVar == null) {
                    mVar = null;
                }
                mVar.f223510b = new y.d(aVar);
                Object objO = rVar.o();
                if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            com.avito.android.profile.pro.impl.screen.item.service_booking_block.c cVar2 = profileProFragment.f222873L0;
            if (cVar2 == null) {
                cVar2 = null;
            }
            cVar2.f223486b = null;
            com.avito.android.profile.pro.impl.screen.item.service_booking_block.m mVar2 = profileProFragment.f222872K0;
            if (mVar2 == null) {
                mVar2 = null;
            }
            mVar2.f223510b = null;
            return G0.f406611a;
        } catch (Throwable th2) {
            com.avito.android.profile.pro.impl.screen.item.service_booking_block.c cVar3 = profileProFragment.f222873L0;
            if (cVar3 == null) {
                cVar3 = null;
            }
            cVar3.f223486b = null;
            com.avito.android.profile.pro.impl.screen.item.service_booking_block.m mVar3 = profileProFragment.f222872K0;
            if (mVar3 == null) {
                mVar3 = null;
            }
            mVar3.f223510b = null;
            throw th2;
        }
    }
}
