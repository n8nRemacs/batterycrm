package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import com.avito.android.remote.model.Direction;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.DirectionFilterValue;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: LocationGroupFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/Direction;", "directions", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupFilterItem f171840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31013b f171841c;

    public u(C31013b c31013b, GroupFilterItem groupFilterItem) {
        this.f171840b = groupFilterItem;
        this.f171841c = c31013b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // l41.g
    public final void accept(Object obj) {
        Iterable arrayList;
        SearchParams searchParams;
        String str;
        T next;
        List<DirectionFilterValue> selectedItems;
        List list = (List) obj;
        GroupFilterItem groupFilterItem = this.f171840b;
        InlineFilterValue value = groupFilterItem.f171704c.getValue();
        InlineFilterValue.InlineFilterDirectionValue inlineFilterDirectionValue = value instanceof InlineFilterValue.InlineFilterDirectionValue ? (InlineFilterValue.InlineFilterDirectionValue) value : null;
        if (inlineFilterDirectionValue == null || (selectedItems = inlineFilterDirectionValue.getSelectedItems()) == null) {
            arrayList = C42784z0.f406748b;
        } else {
            List<DirectionFilterValue> list2 = selectedItems;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (DirectionFilterValue directionFilterValue : list2) {
                arrayList.add(new Direction(String.valueOf(directionFilterValue.getId()), directionFilterValue.getName()));
            }
        }
        C31013b c31013b = this.f171841c;
        List<Direction> list3 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
        for (Direction direction : list3) {
            String id2 = direction.getId();
            String f119974b = direction.getF119974b();
            String id3 = direction.getId();
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((Direction) next).getId(), direction.getId())) {
                        break;
                    }
                } else {
                    next = (T) null;
                    break;
                }
            }
            arrayList2.add(new com.avito.android.inline_filters.dialog.select.adapter.i(id2, id3, f119974b, next != null, InlineItemType.f172055b, null, false, null, null, null, null, null, null, null, null, null, null, null, 262112, null));
        }
        Filter filter = groupFilterItem.f171704c;
        ItemsSearchLink itemsSearchLink = c31013b.f171781D;
        if (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) {
            searchParams = c31013b.f171779B;
        }
        SearchParams searchParams2 = searchParams;
        s sVar = new s(c31013b);
        t tVar = new t(c31013b);
        ItemsSearchLink itemsSearchLink2 = c31013b.f171781D;
        if (itemsSearchLink2 == null || (str = itemsSearchLink2.f133404c) == null) {
            str = c31013b.f171797m;
        }
        c31013b.f171808x.RA(filter, arrayList2, null, searchParams2, ((-13570176) & 16) != 0 ? null : c31013b.f171791g, ((-13570176) & 32) != 0 ? null : c31013b.f171792h, ((-13570176) & 64) != 0 ? null : c31013b.f171793i, ((-13570176) & 128) != 0 ? null : null, ((-13570176) & 256) != 0 ? null : null, ((-13570176) & 512) != 0 ? null : null, ((-13570176) & 1024) != 0 ? null : null, ((-13570176) & 2048) != 0 ? null : null, sVar, ((-13570176) & 8192) != 0 ? null : null, ((-13570176) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? com.avito.android.inline_filters.dialog.g.f171554l : null, (32768 & (-13570176)) != 0 ? com.avito.android.inline_filters.dialog.h.f171644l : null, tVar, (131072 & (-13570176)) != 0 ? new com.avito.android.inline_filters.dialog.i(tVar) : null, (262144 & (-13570176)) != 0 ? null : null, (524288 & (-13570176)) != 0 ? null : null, (1048576 & (-13570176)) != 0 ? null : null, (4194304 & (-13570176)) != 0 ? null : null, str, (16777216 & (-13570176)) != 0 ? null : null, (33554432 & (-13570176)) != 0 ? null : null, (67108864 & (-13570176)) != 0 ? null : null, (134217728 & (-13570176)) != 0 ? null : null, (268435456 & (-13570176)) != 0 ? null : null, (536870912 & (-13570176)) != 0 ? null : null, (1073741824 & (-13570176)) != 0 ? null : null, ((-13570176) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : null);
    }
}
