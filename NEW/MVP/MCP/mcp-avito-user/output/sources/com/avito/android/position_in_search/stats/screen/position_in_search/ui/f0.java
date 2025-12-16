package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.runtime.C22082i3;
import com.akita.compose.component.toast_bar.InterfaceC27357f;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PositionInSearchScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.ui.PositionInSearchScreenKt$PositionInSearchScreen$1$1$1", f = "PositionInSearchScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class f0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f221650q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.akita.compose.component.toast_bar.u uVar, Continuation<? super f0> continuation) {
        super(2, continuation);
        this.f221650q = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f0(this.f221650q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((f0) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC27357f interfaceC27357f = (InterfaceC27357f) ((C22082i3) this.f221650q.f63285b).getF42167b();
        if (interfaceC27357f != null) {
            interfaceC27357f.dismiss();
        }
        return G0.f406611a;
    }
}
