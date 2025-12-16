package com.avito.android.comfortable_deal.end_deal;

import Hp.b;
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

/* compiled from: EndDealScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.EndDealScreenKt$EndDealScreen$1$1$2", f = "EndDealScreen.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class K extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122071q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Hp.b f122072r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f122073s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f122074t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f122075u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Hp.b bVar, Context context, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Continuation<? super K> continuation) {
        super(2, continuation);
        this.f122072r = bVar;
        this.f122073s = context;
        this.f122074t = uVar;
        this.f122075u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new K(this.f122072r, this.f122073s, this.f122074t, this.f122075u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((K) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f122071q;
        if (i12 == 0) {
            C42729a0.b(obj);
            String strK0 = ((b.e) this.f122072r).f7729a.k0(this.f122073s);
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            ToastBarPosition toastBarPosition = ToastBarPosition.f63236c;
            this.f122071q = 1;
            if (this.f122074t.a(this.f122075u, strK0, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : true, this) == coroutine_suspended) {
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
