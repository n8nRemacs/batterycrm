package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.toast_bar.I;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import tp0.InterfaceC48700a;
import tp0.InterfaceC48701b;

/* compiled from: BbipPrivateV2Screen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.ui.compose.BbipPrivateV2ScreenKt$BbipPrivateV2Screen$1$1$1", f = "BbipPrivateV2Screen.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.screens.bbip_private_v2.ui.compose.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34531m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f261318q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC48701b f261319r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f261320s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f261321t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f261322u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f261323v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261324w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34531m(InterfaceC48701b interfaceC48701b, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.u uVar2, com.akita.compose.component.toast_bar.J j12, String str, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f261319r = interfaceC48701b;
        this.f261320s = uVar;
        this.f261321t = uVar2;
        this.f261322u = j12;
        this.f261323v = str;
        this.f261324w = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f261324w;
        return new C34531m(this.f261319r, this.f261320s, this.f261321t, this.f261322u, this.f261323v, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C34531m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC48700a interfaceC48700a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f261318q;
        InterfaceC48701b interfaceC48701b = this.f261319r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC48701b.d dVar = (InterfaceC48701b.d) interfaceC48701b;
            com.akita.compose.component.toast_bar.u uVar = dVar.f439462c ? this.f261320s : this.f261321t;
            String strL = com.avito.android.error.z.l(dVar.f439460a);
            String str = dVar.f439461b != null ? this.f261323v : null;
            ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
            this.f261318q = 1;
            obj = uVar.a(this.f261322u, strL, G0.f406611a, (60 & 8) != 0 ? null : str, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        if (kotlin.jvm.internal.L.f((com.akita.compose.component.toast_bar.I) obj, I.d.f63214a) && (interfaceC48700a = ((InterfaceC48701b.d) interfaceC48701b).f439461b) != null) {
            ((Y41.l) this.f261324w.getF42167b()).invoke(interfaceC48700a);
        }
        return G0.f406611a;
    }
}
