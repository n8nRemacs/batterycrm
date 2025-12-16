package com.avito.android.favorites.compose.only_active_switch;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.MutatePriority;
import com.akita.compose.component.tooltip.t;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ShowOnlyActiveFavoritesSwitch.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorites.compose.only_active_switch.ShowOnlyActiveFavoritesSwitchKt$ShowOnlyActiveFavoritesSwitch$1$1$1$1", f = "ShowOnlyActiveFavoritesSwitch.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f156853q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f156854r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t tVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f156854r = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f156854r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f156853q;
        if (i12 == 0) {
            C42729a0.b(obj);
            MutatePriority mutatePriority = MutatePriority.f26799d;
            this.f156853q = 1;
            if (this.f156854r.f63548a.a(mutatePriority, this) == coroutine_suspended) {
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
