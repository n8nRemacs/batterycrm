package com.avito.android.mortgage_invite.client_form;

import U10.b;
import android.content.Context;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ApplicationClientFormScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.ApplicationClientFormScreenKt$ApplicationClientFormScreen$1$1$1", f = "ApplicationClientFormScreen.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class E extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205039q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U10.b f205040r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f205041s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f205042t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f205043u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f205044v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(U10.b bVar, com.akita.compose.component.toast_bar.J j12, com.akita.compose.component.toast_bar.J j13, Context context, com.akita.compose.component.toast_bar.u uVar, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f205040r = bVar;
        this.f205041s = j12;
        this.f205042t = j13;
        this.f205043u = context;
        this.f205044v = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new E(this.f205040r, this.f205041s, this.f205042t, this.f205043u, this.f205044v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((E) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205039q;
        if (i12 == 0) {
            C42729a0.b(obj);
            b.f fVar = (b.f) this.f205040r;
            fVar.getClass();
            fVar.getClass();
            ToastBarPosition toastBarPosition = ToastBarPosition.f63235b;
            String strK0 = fVar.f16106a.k0(this.f205043u);
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            this.f205039q = 1;
            if (this.f205044v.a(this.f205041s, strK0, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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
