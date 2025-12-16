package com.avito.android.beduin.common.component.bar_chart;

import com.avito.android.beduin.common.component.bar_chart.column.BarChartColumnItem;
import com.avito.android.util.y6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BarChartColumnDataProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f100702a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100703b;

    /* renamed from: c, reason: collision with root package name */
    public final double f100704c;

    /* renamed from: d, reason: collision with root package name */
    public final double f100705d;

    /* renamed from: e, reason: collision with root package name */
    public final int f100706e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final BarChartTextSettings f100707f;

    public a(@Y61.k BeduinBarChartModel beduinBarChartModel, int i12) {
        boolean z12;
        BarChartVerticalAxis verticalAxis = beduinBarChartModel.getVerticalAxis();
        List<BarChartColumnItem> columns = beduinBarChartModel.getColumns();
        boolean z13 = true;
        int iG2 = 0;
        if ((columns instanceof Collection) && columns.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it = columns.iterator();
            while (it.hasNext()) {
                String title = ((BarChartColumnItem) it.next()).getTitle();
                if (!(title == null || C43066x.K(title))) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        List<BarChartColumnItem> columns2 = beduinBarChartModel.getColumns();
        if ((columns2 instanceof Collection) && columns2.isEmpty()) {
            z13 = false;
        } else {
            Iterator<T> it2 = columns2.iterator();
            while (it2.hasNext()) {
                String footer = ((BarChartColumnItem) it2.next()).getFooter();
                if (!(footer == null || C43066x.K(footer))) {
                    break;
                }
            }
            z13 = false;
        }
        Integer numValueOf = z12 ? Integer.valueOf(y6.b(10)) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Integer numValueOf2 = z12 ? Integer.valueOf(i12) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        Integer numValueOf3 = z13 ? Integer.valueOf(y6.b(4) + i12) : null;
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
        int iB2 = y6.b(beduinBarChartModel.getHeight()) - ((iIntValue + iIntValue2) + iIntValue3);
        this.f100707f = beduinBarChartModel.getColumnTitleSettings();
        this.f100704c = verticalAxis.getMaxValue();
        this.f100705d = verticalAxis.getMinValue();
        int iG3 = y6.g((iB2 / (verticalAxis.getItems() != null ? r5.size() : 5)) * 1.0f);
        this.f100703b = iG3;
        int iB3 = y6.b(beduinBarChartModel.getHeight()) - (((iIntValue2 + iG3) + iIntValue) + iIntValue3);
        this.f100702a = iB3;
        if (verticalAxis.getDrawFromZero()) {
            iG2 = y6.g(iB3 / ((verticalAxis.getItems() != null ? r0.size() : 5) - 1.0f));
        }
        this.f100706e = iG2;
        this.f100702a = iB3 - iG2;
    }
}
