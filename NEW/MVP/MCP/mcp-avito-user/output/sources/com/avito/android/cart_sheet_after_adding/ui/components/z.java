package com.avito.android.cart_sheet_after_adding.ui.components;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.snapshots.D;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: DiscountOnDelivery.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.ui.components.DiscountOnDeliveryKt$rememberAnimatables$1", f = "DiscountOnDelivery.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class z extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f115600q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D<C20268c<Float, C20318t>> f115601r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List<B> f115602s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i12, D<C20268c<Float, C20318t>> d12, List<B> list, Continuation<? super z> continuation) {
        super(2, continuation);
        this.f115600q = i12;
        this.f115601r = d12;
        this.f115602s = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new z(this.f115600q, this.f115601r, this.f115602s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((z) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        D<C20268c<Float, C20318t>> d12 = this.f115601r;
        List<B> list = this.f115602s;
        int i12 = this.f115600q;
        if (i12 > 0) {
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(C20274e.a(list.get(d12.size() + i13).f115523a));
            }
            C42745f0.h(arrayList, d12);
        } else if (i12 < 0) {
            d12.l(list.size(), d12.size());
        }
        return G0.f406611a;
    }
}
