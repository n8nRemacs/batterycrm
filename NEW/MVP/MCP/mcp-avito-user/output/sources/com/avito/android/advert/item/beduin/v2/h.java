package com.avito.android.advert.item.beduin.v2;

import android.view.View;
import android.view.ViewGroup;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemCardNativeCellWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/h;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f73354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f73355c;

    public h(ViewGroup viewGroup, Y41.l lVar) {
        this.f73354b = lVar;
        this.f73355c = viewGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(@Y61.l View view, @Y61.l View view2) {
        this.f73354b.invoke(Integer.valueOf(this.f73355c.getChildCount()));
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(@Y61.l View view, @Y61.l View view2) {
        this.f73354b.invoke(Integer.valueOf(this.f73355c.getChildCount()));
    }
}
