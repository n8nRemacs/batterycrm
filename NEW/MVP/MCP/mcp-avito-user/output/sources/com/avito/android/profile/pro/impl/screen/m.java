package com.avito.android.profile.pro.impl.screen;

import com.avito.android.profile.pro.impl.screen.item.geo_banner.c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ProfileProFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectGeoBannerItemActions$1", f = "ProfileProFragment.kt", i = {}, l = {854}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f223621q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment f223622r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ProfileProFragment profileProFragment, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f223622r = profileProFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new m(this.f223622r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f223621q;
        ProfileProFragment profileProFragment = this.f223622r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f223621q = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
                rVar.p();
                com.avito.android.profile.pro.impl.screen.item.geo_banner.c cVar = profileProFragment.f222874M0;
                if (cVar == null) {
                    cVar = null;
                }
                cVar.f223275b = (c.a) profileProFragment.f222881T0.getValue();
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
            com.avito.android.profile.pro.impl.screen.item.geo_banner.c cVar2 = profileProFragment.f222874M0;
            if (cVar2 == null) {
                cVar2 = null;
            }
            cVar2.f223275b = null;
            return G0.f406611a;
        } catch (Throwable th2) {
            com.avito.android.profile.pro.impl.screen.item.geo_banner.c cVar3 = profileProFragment.f222874M0;
            if (cVar3 == null) {
                cVar3 = null;
            }
            cVar3.f223275b = null;
            throw th2;
        }
    }
}
