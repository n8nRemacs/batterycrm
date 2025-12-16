package com.avito.android.master_plan;

import com.avito.android.master_plan.adapter.info.InfoItem;
import com.avito.android.master_plan.adapter.title.TitleItem;
import com.avito.android.remote.model.ButtonAction;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import kotlin.Metadata;
import rY.C47616c;
import rY.C47617d;

/* compiled from: MasterPlanItemsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/k;", "", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface k {
    @Y61.k
    List<ParcelableItem> a(@Y61.l String str, @Y61.l List<C47616c> list);

    @Y61.k
    InfoItem b(@Y61.k ButtonAction buttonAction);

    @Y61.k
    TitleItem c(@Y61.k String str, @Y61.l C47617d c47617d);
}
