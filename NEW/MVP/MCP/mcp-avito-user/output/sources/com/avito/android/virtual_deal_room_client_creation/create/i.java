package com.avito.android.virtual_deal_room_client_creation.create;

import RN0.b;
import android.content.Context;
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

/* compiled from: CreateScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.create.CreateScreenKt$CreateScreen$1$1$1", f = "CreateScreen.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class i extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f326784q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RN0.b f326785r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f326786s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f326787t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f326788u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(RN0.b bVar, Context context, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f326785r = bVar;
        this.f326786s = context;
        this.f326787t = uVar;
        this.f326788u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f326785r, this.f326786s, this.f326787t, this.f326788u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f326784q;
        if (i12 == 0) {
            C42729a0.b(obj);
            String strK0 = ((b.C0963b) this.f326785r).f14424a.k0(this.f326786s);
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            this.f326784q = 1;
            if (this.f326787t.a(this.f326788u, strK0, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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
