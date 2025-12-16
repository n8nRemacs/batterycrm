package com.avito.android.vas_planning_checkout;

import com.avito.android.util.P2;
import com.avito.android.vas_planning_checkout.model.VasPlanCheckoutContent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VasPlanCheckoutViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LbM0/e;", "it", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class F<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f322797b;

    public F(E e12) {
        this.f322797b = e12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        P2 p22 = (P2) obj;
        if (p22 instanceof P2.a) {
            return new VasPlanCheckoutContent.a(((P2.a) p22).f318719a);
        }
        if (p22 instanceof P2.b) {
            return this.f322797b.f322770L.a((bM0.e) ((P2.b) p22).f318720a);
        }
        if (p22 instanceof P2.c) {
            return VasPlanCheckoutContent.b.f323015b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
