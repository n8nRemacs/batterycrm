package com.avito.android.screens.bbip_private_v2.ui.compose.dialog;

import Y41.p;
import androidx.compose.runtime.I3;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;

/* compiled from: WheelPicker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.ui.compose.dialog.WheelPickerKt$WheelPicker$1$1", f = "WheelPicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f261186q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f261187r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I3<String> f261188s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(String str, Y41.l<? super String, G0> lVar, I3<String> i32, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f261186q = str;
        this.f261187r = lVar;
        this.f261188s = i32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f261186q, this.f261187r, this.f261188s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        I3<String> i32 = this.f261188s;
        if (!C43066x.K(i32.getF42167b()) && !L.f(i32.getF42167b(), this.f261186q)) {
            this.f261187r.invoke(i32.getF42167b());
        }
        return G0.f406611a;
    }
}
