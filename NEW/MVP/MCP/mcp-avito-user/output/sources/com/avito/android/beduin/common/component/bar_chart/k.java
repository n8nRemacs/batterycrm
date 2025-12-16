package com.avito.android.beduin.common.component.bar_chart;

import com.avito.android.beduin.common.component.bar_chart.column.BarChartColumnItem;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qj.InterfaceC47406a;

/* compiled from: BeduinBarChartPreparer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/k;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/bar_chart/BeduinBarChartModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements InterfaceC47406a<BeduinBarChartModel> {
    @Inject
    public k() {
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinBarChartModel beduinBarChartModel = (BeduinBarChartModel) beduinModel;
        List<BarChartColumnItem> columns = beduinBarChartModel.getColumns();
        ArrayList arrayList = new ArrayList(C42745f0.q(columns, 10));
        for (BarChartColumnItem barChartColumnItem : columns) {
            arrayList.add(barChartColumnItem.copy((1023 & 1) != 0 ? barChartColumnItem.stringId : null, (1023 & 2) != 0 ? barChartColumnItem.value : 0.0d, (1023 & 4) != 0 ? barChartColumnItem.width : 0, (1023 & 8) != 0 ? barChartColumnItem.corners : null, (1023 & 16) != 0 ? barChartColumnItem.backgroundColor : null, (1023 & 32) != 0 ? barChartColumnItem.selectedBackgroundColor : null, (1023 & 64) != 0 ? barChartColumnItem.details : null, (1023 & 128) != 0 ? barChartColumnItem.title : null, (1023 & 256) != 0 ? barChartColumnItem.footer : null, (1023 & 512) != 0 ? barChartColumnItem.actions : null, (1023 & 1024) != 0 ? barChartColumnItem._isSelected : Boolean.valueOf(L.f(barChartColumnItem.getF96777b(), beduinBarChartModel.getSelectedColumnId()))));
        }
        return BeduinBarChartModel.copy$default(beduinBarChartModel, null, null, null, 0, null, null, null, null, 0, null, arrayList, null, null, null, 15359, null);
    }
}
