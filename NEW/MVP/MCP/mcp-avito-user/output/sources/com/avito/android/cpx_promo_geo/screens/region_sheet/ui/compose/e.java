package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose;

import Y41.p;
import Y61.k;
import Y61.l;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.akita.compose.component.toast_bar.u;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import vs.InterfaceC49375b;

/* compiled from: RegionSheetScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.RegionSheetScreenKt$RegionSheetScreen$1$1$1", f = "RegionSheetScreen.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f128499q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49375b f128500r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f128501s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J f128502t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC49375b interfaceC49375b, u uVar, J j12, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f128500r = interfaceC49375b;
        this.f128501s = uVar;
        this.f128502t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f128500r, this.f128501s, this.f128502t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f128499q;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str = ((InterfaceC49375b.C12795b) this.f128500r).f441017a;
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            this.f128499q = 1;
            if (this.f128501s.a(this.f128502t, str, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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
