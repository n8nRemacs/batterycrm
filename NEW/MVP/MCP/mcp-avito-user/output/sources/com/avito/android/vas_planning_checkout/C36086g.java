package com.avito.android.vas_planning_checkout;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.vas_planning_checkout.item.checkout.PlanCheckoutItem;
import com.avito.android.vas_planning_checkout.item.header.VasPlanningHeaderItem;
import com.avito.android.vas_planning_checkout.item.price.PriceItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasCheckoutItemsDiffUtil.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/g;", "Landroidx/recyclerview/widget/o$b;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_planning_checkout.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36086g extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f322905a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f322906b;

    public C36086g(@Y61.k ArrayList arrayList, @Y61.k List list) {
        this.f322905a = list;
        this.f322906b = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        TV0.a aVar = (TV0.a) this.f322905a.get(i12);
        TV0.a aVar2 = (TV0.a) this.f322906b.get(i13);
        if ((aVar instanceof VasPlanningHeaderItem) && (aVar2 instanceof VasPlanningHeaderItem)) {
            return L.f(((VasPlanningHeaderItem) aVar).f322966c, ((VasPlanningHeaderItem) aVar2).f322966c);
        }
        if ((aVar instanceof PlanCheckoutItem) && (aVar2 instanceof PlanCheckoutItem)) {
            PlanCheckoutItem planCheckoutItem = (PlanCheckoutItem) aVar;
            PlanCheckoutItem planCheckoutItem2 = (PlanCheckoutItem) aVar2;
            if (L.f(planCheckoutItem.f322912c, planCheckoutItem2.f322912c) && planCheckoutItem.f322918i == planCheckoutItem2.f322918i) {
                return true;
            }
        } else if ((aVar instanceof PriceItem) && (aVar2 instanceof PriceItem)) {
            return L.f(((PriceItem) aVar).f322974c, ((PriceItem) aVar2).f322974c);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return ((TV0.a) this.f322905a.get(i12)).getF85138b() == ((TV0.a) this.f322906b.get(i13)).getF85138b();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f322906b.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f322905a.size();
    }
}
