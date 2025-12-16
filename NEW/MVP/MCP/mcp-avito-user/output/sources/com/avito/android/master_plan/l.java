package com.avito.android.master_plan;

import com.avito.android.master_plan.adapter.empty.EmptyInfoItem;
import com.avito.android.master_plan.adapter.info.InfoItem;
import com.avito.android.master_plan.adapter.title.TitleItem;
import com.avito.android.remote.model.ButtonAction;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import rY.C47616c;
import rY.C47617d;

/* compiled from: MasterPlanItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/master_plan/l;", "Lcom/avito/android/master_plan/k;", "<init>", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements k {
    @Inject
    public l() {
    }

    @Override // com.avito.android.master_plan.k
    @Y61.k
    public final List<ParcelableItem> a(@Y61.l String str, @Y61.l List<C47616c> list) {
        if (str != null && str.length() != 0) {
            if (str == null) {
                str = "";
            }
            return Collections.singletonList(new EmptyInfoItem("empty_info_item", str));
        }
        if (list == null) {
            return C42784z0.f406748b;
        }
        List<C47616c> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (C47616c c47616c : list2) {
            arrayList.add(new InfoItem(c47616c.getRoomsNumberId(), c47616c.getRoomType() + ' ' + c47616c.getPrice(), c47616c.getCount(), c47616c.getDeeplink()));
        }
        return arrayList;
    }

    @Override // com.avito.android.master_plan.k
    public final InfoItem b(ButtonAction buttonAction) {
        return new InfoItem("all_flats_item", buttonAction.getTitle(), null, buttonAction.getDeeplink(), 4, null);
    }

    @Override // com.avito.android.master_plan.k
    public final TitleItem c(String str, C47617d c47617d) {
        String str2;
        if (c47617d != null) {
            str2 = c47617d.getDeadlines() + " · " + c47617d.getFloors();
        } else {
            str2 = null;
        }
        return new TitleItem("title_item", str, str2);
    }
}
