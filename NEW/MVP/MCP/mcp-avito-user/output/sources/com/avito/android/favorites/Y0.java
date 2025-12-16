package com.avito.android.favorites;

import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.util.D6;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorites.FavoritesListPresenterImpl$updateShowOnlyActiveFavoritesSwitchValue$1", f = "FavoritesListPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class Y0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156338q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(C30684r0 c30684r0, Continuation<? super Y0> continuation) {
        super(2, continuation);
        this.f156338q = c30684r0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Y0(this.f156338q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((Y0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C30684r0 c30684r0 = this.f156338q;
        boolean z12 = c30684r0.f157464e0 != null;
        x1 x1Var = c30684r0.f157454Y;
        if (x1Var != null) {
            D6.G(x1Var.f157615s, z12);
        }
        if (z12) {
            c30684r0.f157488q0.setValue(Boxing.boxBoolean(c30684r0.f157477l.b("active_only_tooltip_onboarding", OnboardingType.f209409b)));
        }
        return kotlin.G0.f406611a;
    }
}
