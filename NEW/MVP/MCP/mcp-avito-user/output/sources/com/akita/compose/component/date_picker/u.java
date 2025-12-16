package com.akita.compose.component.date_picker;

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

/* compiled from: DatePickerBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.component.date_picker.DatePickerBottomSheetKt$DatePickerBottomSheetContent$showToast$1$1", f = "DatePickerBottomSheet.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class u extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f61282q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f61283r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f61284s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f61285t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(F f12, com.akita.compose.component.toast_bar.u uVar, String str, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f61283r = f12;
        this.f61284s = uVar;
        this.f61285t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new u(this.f61283r, this.f61284s, this.f61285t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((u) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f61282q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.akita.compose.component.toast_bar.J j12 = this.f61283r.f61144r;
            ToastBarPosition toastBarPosition = ToastBarPosition.f63236c;
            this.f61282q = 1;
            if (this.f61284s.a(j12, this.f61285t, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : true, this) == coroutine_suspended) {
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
