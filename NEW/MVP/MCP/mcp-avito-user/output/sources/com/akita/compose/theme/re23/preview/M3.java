package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ToastBarPreview.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.theme.re23.preview.ToastBarPreviewKt$ToastBarPreviewImpl$1$1", f = "ToastBarPreview.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class M3 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f65429q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f65430r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.toast_bar.J> f65431s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ToastBarDuration f65432t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ToastBarPosition f65433u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f65434v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(com.akita.compose.component.toast_bar.u uVar, kotlin.Q<String, com.akita.compose.component.toast_bar.J> q12, ToastBarDuration toastBarDuration, ToastBarPosition toastBarPosition, InterfaceC22204y1<Boolean> interfaceC22204y1, Continuation<? super M3> continuation) {
        super(2, continuation);
        this.f65430r = uVar;
        this.f65431s = q12;
        this.f65432t = toastBarDuration;
        this.f65433u = toastBarPosition;
        this.f65434v = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new M3(this.f65430r, this.f65431s, this.f65432t, this.f65433u, this.f65434v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((M3) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f65429q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.akita.compose.component.toast_bar.J j12 = this.f65431s.f406620c;
            boolean zBooleanValue = this.f65434v.getF42167b().booleanValue();
            this.f65429q = 1;
            if (this.f65430r.a(j12, "Preview", kotlin.G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : this.f65432t, (60 & 64) != 0 ? ToastBarPosition.f63235b : this.f65433u, (60 & 128) != 0 ? false : zBooleanValue, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
