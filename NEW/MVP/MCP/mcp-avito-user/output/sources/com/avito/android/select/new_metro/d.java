package com.avito.android.select.new_metro;

import androidx.compose.runtime.internal.P;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: MetroLinesListPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/d;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ItemsHolder f266143a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public ArrayList f266144b;

    public d(@Y61.k ItemsHolder itemsHolder, @Y61.k List<Integer> list) {
        this.f266143a = itemsHolder;
        this.f266144b = b(list);
    }

    public final ArrayList a(MetroLineItem metroLineItem) {
        ArrayList arrayList = new ArrayList();
        ItemsHolder itemsHolder = this.f266143a;
        MetroFilterItem metroFilterItem = itemsHolder.d6().get(Integer.valueOf(metroLineItem.f266183d));
        if (metroFilterItem != null) {
            arrayList.add(metroFilterItem);
        }
        Iterator<T> it = metroLineItem.f266184e.iterator();
        while (it.hasNext()) {
            MetroStationItem metroStationItem = itemsHolder.c6().get(Integer.valueOf(((Number) it.next()).intValue()));
            if (metroStationItem != null) {
                arrayList.add(metroStationItem);
            }
        }
        return arrayList;
    }

    public final ArrayList b(List list) {
        return C43033p.E(C43033p.o(C43033p.y(new C42770s0(list), new b(this)), new c(this)));
    }
}
