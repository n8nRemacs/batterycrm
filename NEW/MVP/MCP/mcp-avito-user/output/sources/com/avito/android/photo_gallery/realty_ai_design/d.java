package com.avito.android.photo_gallery.realty_ai_design;

import Y41.p;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.u;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ImageComparisonSlider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.realty_ai_design.ImageComparisonSliderKt$ImageComparisonSlider$3$1", f = "ImageComparisonSlider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<u> f217595q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f217596r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC22204y1 interfaceC22204y1, InterfaceC22196w1 interfaceC22196w1, Continuation continuation) {
        super(2, continuation);
        this.f217595q = interfaceC22204y1;
        this.f217596r = interfaceC22196w1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f217595q, this.f217596r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (((int) (this.f217595q.getF42167b().f42872a >> 32)) > 0) {
            this.f217596r.L3((int) (0.5f * ((int) (r4.getF42167b().f42872a >> 32))));
        }
        return G0.f406611a;
    }
}
