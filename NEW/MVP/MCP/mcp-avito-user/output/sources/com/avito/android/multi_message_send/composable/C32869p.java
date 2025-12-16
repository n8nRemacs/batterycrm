package com.avito.android.multi_message_send.composable;

import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MultiMessageSendScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multi_message_send.composable.MultiMessageSendScreenKt$MultiMessageSendScreen$1$1$3", f = "MultiMessageSendScreen.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.multi_message_send.composable.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32869p extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206539q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f206540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f206541s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f206542t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32869p(com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, String str, Continuation<? super C32869p> continuation) {
        super(2, continuation);
        this.f206540r = uVar;
        this.f206541s = j12;
        this.f206542t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32869p(this.f206540r, this.f206541s, this.f206542t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C32869p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206539q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            ToastBarPosition toastBarPosition = ToastBarPosition.f63235b;
            this.f206539q = 1;
            if (this.f206540r.a(this.f206541s, this.f206542t, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : true, this) == coroutine_suspended) {
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
