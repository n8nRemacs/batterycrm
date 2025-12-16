package com.avito.android.cart_sheet_after_adding.ui.components;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.G1;
import androidx.compose.animation.core.Q;
import androidx.compose.runtime.snapshots.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.K0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: DiscountOnDelivery.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.ui.components.DiscountOnDeliveryKt$DiscountProgress$1", f = "DiscountOnDelivery.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class v extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public D f115590q;

    /* renamed from: r, reason: collision with root package name */
    public List f115591r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f115592s;

    /* renamed from: t, reason: collision with root package name */
    public int f115593t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D<C20268c<Float, C20318t>> f115594u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List<B> f115595v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(D<C20268c<Float, C20318t>> d12, List<B> list, Continuation<? super v> continuation) {
        super(2, continuation);
        this.f115594u = d12;
        this.f115595v = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new v(this.f115594u, this.f115595v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((v) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<B> list;
        D<C20268c<Float, C20318t>> d12;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f115593t;
        if (i12 == 0) {
            C42729a0.b(obj);
            D<C20268c<Float, C20318t>> d13 = this.f115594u;
            ArrayList arrayList = new ArrayList(C42745f0.q(d13, 10));
            ListIterator<C20268c<Float, C20318t>> listIterator = d13.listIterator();
            while (listIterator.hasNext()) {
                arrayList.add(Boxing.boxFloat(listIterator.next().f().floatValue()));
            }
            List<B> list2 = this.f115595v;
            List<B> list3 = list2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Boxing.boxFloat(((B) it2.next()).f115523a));
            }
            kotlin.reflect.n<Object>[] nVarArr = t.f115584a;
            list = list2;
            d12 = d13;
            it = (C42745f0.C0(arrayList2) > C42745f0.C0(arrayList) ? C42745f0.I(arrayList2) : kotlin.ranges.s.o(C42745f0.I(arrayList2))).iterator();
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f115592s;
            list = this.f115591r;
            d12 = this.f115590q;
            C42729a0.b(obj);
        }
        while (it.hasNext()) {
            int iA2 = ((K0) it).a();
            if (d12.get(iA2).f().floatValue() != list.get(iA2).f115523a) {
                int size = 300 / d12.size();
                C20268c<Float, C20318t> c20268c = d12.get(iA2);
                Float fBoxFloat = Boxing.boxFloat(list.get(iA2).f115523a);
                G1 g1E = C20310q.e(size, 0, Q.f26124d, 2);
                this.f115590q = d12;
                this.f115591r = list;
                this.f115592s = it;
                this.f115593t = 1;
                if (C20268c.c(c20268c, fBoxFloat, g1E, null, null, this, 12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return G0.f406611a;
    }
}
