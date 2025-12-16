package com.avito.android.serp.adapter.slider.sales_slider;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.s;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import vY0.C49285a;

/* compiled from: SalesSlider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.serp.adapter.slider.sales_slider.SalesSlider$startVibration$1", f = "SalesSlider.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f272309q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SalesSlider f272310r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SalesSlider salesSlider, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f272310r = salesSlider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f272310r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objB;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f272309q;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        do {
            this.f272309q = 1;
            int i13 = SalesSlider.f272283r;
            SalesSlider salesSlider = this.f272310r;
            float f12 = s.f(salesSlider.f272290h.getWidth() / salesSlider.getWidth(), 0.0f, 1.0f);
            long jB2 = (long) C49285a.b(300.0f, 60.0f, f12);
            float fB2 = C49285a.b(0.3f, 1.0f, f12);
            int i14 = (0.71f > fB2 || fB2 > 1.0f) ? 0 : 1;
            int i15 = Build.VERSION.SDK_INT;
            Vibrator vibrator = salesSlider.f272297o;
            if (i15 < 30) {
                int iG2 = s.g((int) (fB2 * 255.0f), 0, 255);
                if (vibrator != null) {
                    vibrator.vibrate(VibrationEffect.createOneShot(40L, iG2));
                }
            } else if (vibrator != null) {
                vibrator.vibrate(VibrationEffect.createPredefined(i14));
            }
            objB = C43131e0.b(jB2, this);
            if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objB = G0.f406611a;
            }
        } while (objB != coroutine_suspended);
        return coroutine_suspended;
    }
}
