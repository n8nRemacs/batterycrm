package com.avito.android.universal_transaction.transaction;

import androidx.compose.runtime.InterfaceC22204y1;
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

/* compiled from: TransactionDebugMenu.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_transaction.transaction.TransactionDebugMenuKt$TransactionDebugMenu$1", f = "TransactionDebugMenu.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f306611q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f306612r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f306613s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f306614t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f306615u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.akita.compose.component.toast_bar.u uVar, J j12, String str, InterfaceC22204y1<Boolean> interfaceC22204y1, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f306612r = uVar;
        this.f306613s = j12;
        this.f306614t = str;
        this.f306615u = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new n(this.f306612r, this.f306613s, this.f306614t, this.f306615u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f306611q;
        InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f306615u;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (interfaceC22204y1.getF42167b().booleanValue()) {
                ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
                this.f306611q = 1;
                if (this.f306612r.a(this.f306613s, this.f306614t, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        interfaceC22204y1.setValue(Boolean.FALSE);
        return G0.f406611a;
    }
}
