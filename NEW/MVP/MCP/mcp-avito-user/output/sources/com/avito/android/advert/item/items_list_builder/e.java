package com.avito.android.advert.item.items_list_builder;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemListBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/items_list_builder/e;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f76823e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<PersistableSpannedItem> f76824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f76825b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f76826c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final kotlin.ranges.l f76827d;

    /* compiled from: ItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/items_list_builder/e$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k List list, int i12, @k LinkedHashMap linkedHashMap, @l kotlin.ranges.l lVar) {
        this.f76824a = list;
        this.f76825b = i12;
        this.f76826c = linkedHashMap;
        this.f76827d = lVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f76824a, eVar.f76824a) && this.f76825b == eVar.f76825b && L.f(this.f76826c, eVar.f76826c) && L.f(this.f76827d, eVar.f76827d);
    }

    public final int hashCode() {
        int iHashCode = (this.f76826c.hashCode() + r.e(this.f76825b, this.f76824a.hashCode() * 31, 31)) * 31;
        kotlin.ranges.l lVar = this.f76827d;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    @k
    public final String toString() {
        return "ItemsListResult(list=" + this.f76824a + ", similarItemsPos=" + this.f76825b + ", expandItemsMatchingMap=" + this.f76826c + ", itemReviewsPositions=" + this.f76827d + ')';
    }
}
