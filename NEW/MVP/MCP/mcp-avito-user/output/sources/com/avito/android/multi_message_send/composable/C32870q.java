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
@DebugMetadata(c = "com.avito.android.multi_message_send.composable.MultiMessageSendScreenKt$MultiMessageSendScreen$1$1$4", f = "MultiMessageSendScreen.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.multi_message_send.composable.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32870q extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206543q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f206544r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f206545s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f206546t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32870q(com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, String str, Continuation<? super C32870q> continuation) {
        super(2, continuation);
        this.f206544r = uVar;
        this.f206545s = j12;
        this.f206546t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32870q(this.f206544r, this.f206545s, this.f206546t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C32870q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206543q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            ToastBarPosition toastBarPosition = ToastBarPosition.f63236c;
            this.f206543q = 1;
            if (this.f206544r.a(this.f206545s, this.f206546t, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : true, this) == coroutine_suspended) {
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
