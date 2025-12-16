package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.inline_filters.dialog.location_group.adapter.ItemType;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.WidgetType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: LocationGroupFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_inline-filters_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class C {

    /* compiled from: LocationGroupFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171669a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.Radius.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.Chips.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetType.SuggestLocation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetType.LocalPriority.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f171669a = iArr;
        }
    }

    @Y61.k
    public static final List<GroupFilterItem> a(@Y61.k Filter filter) {
        List<Filter> filters = filter.getFilters();
        if (filters == null) {
            return C42784z0.f406748b;
        }
        List<Filter> list = filters;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Filter filter2 = (Filter) obj;
            String strValueOf = String.valueOf(i12);
            Filter.Widget widget = filter2.getWidget();
            WidgetType type = widget != null ? widget.getType() : null;
            int i14 = type == null ? -1 : a.f171669a[type.ordinal()];
            arrayList.add(new GroupFilterItem(strValueOf, filter2, i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? i14 != 5 ? ItemType.f171707b : ItemType.f171711f : ItemType.f171710e : ItemType.f171709d : ItemType.f171709d : ItemType.f171708c, true));
            i12 = i13;
        }
        return arrayList;
    }
}
