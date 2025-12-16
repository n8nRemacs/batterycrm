package com.avito.android.bbl.screens.limit_increase.ui.compose;

import Eh.InterfaceC13486b;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: LimitIncreaseScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bbl.screens.limit_increase.ui.compose.LimitIncreaseScreenKt$LimitIncreaseScreen$1$1$1", f = "LimitIncreaseScreen.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f99837q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f99838r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f99839s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13486b f99840t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.akita.compose.component.toast_bar.u uVar, J j12, InterfaceC13486b interfaceC13486b, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f99838r = uVar;
        this.f99839s = j12;
        this.f99840t = interfaceC13486b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f99838r, this.f99839s, this.f99840t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f99837q;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str = ((InterfaceC13486b.d) this.f99840t).f4173a;
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            this.f99837q = 1;
            if (this.f99838r.a(this.f99839s, str, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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
