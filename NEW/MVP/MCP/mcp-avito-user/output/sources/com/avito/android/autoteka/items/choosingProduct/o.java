package com.avito.android.autoteka.items.choosingProduct;

import Tf.d;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import bV.C25568a;
import com.avito.android.R;
import com.avito.android.autoteka.domain.model.choosingPurchase.ProductItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.autoteka.model.AutotekaDiscount;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FullscreenChoosingProductView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/choosingProduct/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/choosingProduct/n;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f96731b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f96732c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f96733d;

    public o(@Y61.k View view) {
        super(view);
        this.f96731b = view;
        this.f96732c = (LinearLayout) view.findViewById(R.id.autoteka_products_container);
        this.f96733d = view.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.autoteka.items.choosingProduct.n
    public final void r30(@Y61.k Y41.l lVar, @Y61.l String str, @Y61.k List list) {
        List<DockingBadgeItem> listSingletonList;
        Q q12;
        LinearLayout linearLayout = this.f96732c;
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductItem productItem = (ProductItem) it.next();
            Tf.d dVar = new Tf.d(this.f96733d);
            dVar.f15802c.setText(productItem.f96631d);
            ArrayList<AutotekaDiscount> arrayList = productItem.f96630c;
            if (arrayList.isEmpty()) {
                String string = dVar.getContext().getString(R.string.autoteka_without_discount);
                DockingBadgeType.Predefined predefined = DockingBadgeType.Predefined.Gray;
                DockingBadgeEdgeType dockingBadgeEdgeType = DockingBadgeEdgeType.Flag;
                DockingBadgeEdgeType dockingBadgeEdgeType2 = DockingBadgeEdgeType.Pipka;
                C25568a.C2002a c2002a = C25568a.f57090g;
                Context context = dVar.getContext();
                int iJ2 = C35835l0.j(R.attr.dockingBadgeGraySmall, dVar.getContext());
                c2002a.getClass();
                listSingletonList = Collections.singletonList(new DockingBadgeItem(string, predefined, dockingBadgeEdgeType, dockingBadgeEdgeType2, C25568a.C2002a.b(iJ2, context)));
            } else {
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                for (AutotekaDiscount autotekaDiscount : arrayList) {
                    int i12 = d.b.f15810a[autotekaDiscount.getDiscountType().ordinal()];
                    if (i12 == 1) {
                        q12 = new Q(DockingBadgeType.Predefined.Violet, Integer.valueOf(R.attr.dockingBadgeVioletSmall));
                    } else {
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        q12 = new Q(DockingBadgeType.Predefined.Green, Integer.valueOf(R.attr.dockingBadgeGreenSmall));
                    }
                    DockingBadgeType.Predefined predefined2 = (DockingBadgeType.Predefined) q12.f406619b;
                    int iIntValue = ((Number) q12.f406620c).intValue();
                    String value = autotekaDiscount.getValue();
                    DockingBadgeEdgeType dockingBadgeEdgeType3 = DockingBadgeEdgeType.Flag;
                    DockingBadgeEdgeType dockingBadgeEdgeType4 = DockingBadgeEdgeType.Pipka;
                    C25568a.C2002a c2002a2 = C25568a.f57090g;
                    Context context2 = dVar.getContext();
                    int iJ3 = C35835l0.j(iIntValue, dVar.getContext());
                    c2002a2.getClass();
                    arrayList2.add(new DockingBadgeItem(value, predefined2, dockingBadgeEdgeType3, dockingBadgeEdgeType4, C25568a.C2002a.b(iJ3, context2)));
                }
                listSingletonList = arrayList2;
            }
            dVar.f15801b.setBadgeItems(listSingletonList);
            dVar.f15809j = productItem.f96636i;
            dVar.a();
            dVar.f15804e.setText(productItem.f96633f);
            I5.a(dVar.f15805f, productItem.f96634g, false);
            I5.a(dVar.f15806g, productItem.f96635h, false);
            I5.a(dVar.f15803d, productItem.f96632e, false);
            String str2 = productItem.f96629b;
            dVar.setSelectedState(L.f(str2, str));
            dVar.f15807h.setOnClickListener(new Tf.b(1, lVar, str2));
            linearLayout.addView(dVar);
        }
    }
}
