package com.avito.android.publish.free_delivery.ui;

import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.akita.compose.component.toast_bar.u;
import he0.InterfaceC40925b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: FreeDeliveryBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.free_delivery.ui.FreeDeliveryBottomSheetKt$HandleEvents$1$1$2", f = "FreeDeliveryBottomSheet.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f235916q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f235917r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f235918s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40925b f235919t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u uVar, J j12, InterfaceC40925b interfaceC40925b, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f235917r = uVar;
        this.f235918s = j12;
        this.f235919t = interfaceC40925b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f235917r, this.f235918s, this.f235919t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f235916q;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str = ((InterfaceC40925b.e) this.f235919t).f397327a;
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            ToastBarPosition toastBarPosition = ToastBarPosition.f63236c;
            this.f235916q = 1;
            if (this.f235917r.a(this.f235918s, str, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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
