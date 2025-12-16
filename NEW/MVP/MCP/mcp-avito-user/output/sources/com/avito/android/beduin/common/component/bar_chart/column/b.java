package com.avito.android.beduin.common.component.bar_chart.column;

import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BarChartColumnItemDiffUtilCallback.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/column/b;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF85003b() == aVar4.getF85003b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof BarChartColumnItem) || !(aVar4 instanceof BarChartColumnItem)) {
            return null;
        }
        BarChartColumnItem barChartColumnItem = (BarChartColumnItem) aVar4;
        Boolean boolValueOf = Boolean.valueOf(barChartColumnItem.isSelected());
        BarChartColumnItem barChartColumnItem2 = (BarChartColumnItem) aVar3;
        if (barChartColumnItem2.isSelected() == barChartColumnItem.isSelected()) {
            boolValueOf = null;
        }
        if (!L.f(barChartColumnItem2.copy((1023 & 1) != 0 ? barChartColumnItem2.stringId : null, (1023 & 2) != 0 ? barChartColumnItem2.value : 0.0d, (1023 & 4) != 0 ? barChartColumnItem2.width : 0, (1023 & 8) != 0 ? barChartColumnItem2.corners : null, (1023 & 16) != 0 ? barChartColumnItem2.backgroundColor : null, (1023 & 32) != 0 ? barChartColumnItem2.selectedBackgroundColor : null, (1023 & 64) != 0 ? barChartColumnItem2.details : null, (1023 & 128) != 0 ? barChartColumnItem2.title : null, (1023 & 256) != 0 ? barChartColumnItem2.footer : null, (1023 & 512) != 0 ? barChartColumnItem2.actions : null, (1023 & 1024) != 0 ? barChartColumnItem2._isSelected : null), barChartColumnItem.copy((1023 & 1) != 0 ? barChartColumnItem.stringId : null, (1023 & 2) != 0 ? barChartColumnItem.value : 0.0d, (1023 & 4) != 0 ? barChartColumnItem.width : 0, (1023 & 8) != 0 ? barChartColumnItem.corners : null, (1023 & 16) != 0 ? barChartColumnItem.backgroundColor : null, (1023 & 32) != 0 ? barChartColumnItem.selectedBackgroundColor : null, (1023 & 64) != 0 ? barChartColumnItem.details : null, (1023 & 128) != 0 ? barChartColumnItem.title : null, (1023 & 256) != 0 ? barChartColumnItem.footer : null, (1023 & 512) != 0 ? barChartColumnItem.actions : null, (1023 & 1024) != 0 ? barChartColumnItem._isSelected : null)) || boolValueOf == null) {
            return null;
        }
        return new c();
    }
}
