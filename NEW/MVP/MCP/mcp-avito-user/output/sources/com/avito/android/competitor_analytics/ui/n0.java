package com.avito.android.competitor_analytics.ui;

import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.toast_bar.I;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.competitor_analytics.mvi.entity.a;
import er.InterfaceC40148a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CompetitorAnalyticsScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.competitor_analytics.ui.CompetitorAnalyticsScreenKt$HandleEvents$1$1$2", f = "CompetitorAnalyticsScreen.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class n0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f124818q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f124819r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f124820s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40148a f124821t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f124822u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, InterfaceC40148a interfaceC40148a, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f124819r = uVar;
        this.f124820s = j12;
        this.f124821t = interfaceC40148a;
        this.f124822u = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new n0(this.f124819r, this.f124820s, this.f124821t, this.f124822u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((n0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f124818q;
        InterfaceC40148a interfaceC40148a = this.f124821t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC40148a.d dVar = (InterfaceC40148a.d) interfaceC40148a;
            String str = dVar.f395398a;
            String str2 = dVar.f395400c;
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            this.f124818q = 1;
            obj = this.f124819r.a(this.f124820s, str, kotlin.G0.f406611a, (60 & 8) != 0 ? null : str2, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        if (kotlin.jvm.internal.L.f((com.akita.compose.component.toast_bar.I) obj, I.d.f63214a)) {
            ((Y41.l) this.f124822u.getF42167b()).invoke(new a.l(((InterfaceC40148a.d) interfaceC40148a).f395399b));
        }
        return kotlin.G0.f406611a;
    }
}
