package com.avito.android.beduin.common.component.bar_chart.column;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.bar_chart.BarChartTextSettings;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BarChartColumnItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/column/e;", "LTV0/f;", "Lcom/avito/android/beduin/common/component/bar_chart/column/f;", "Lcom/avito/android/beduin/common/component/bar_chart/column/BarChartColumnItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.f<f, BarChartColumnItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<com.avito.android.beduin.common.component.bar_chart.a> f100721b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<BarChartColumnItem, G0> f100722c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k Y41.a<com.avito.android.beduin.common.component.bar_chart.a> aVar, @k l<? super BarChartColumnItem, G0> lVar) {
        this.f100721b = aVar;
        this.f100722c = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((f) eVar, (BarChartColumnItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        BarChartColumnItem barChartColumnItem = (BarChartColumnItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                obj = obj2;
            }
        }
        if (!(obj instanceof c)) {
            obj = null;
        }
        if (((c) obj) == null) {
            k(fVar, barChartColumnItem);
            return;
        }
        UniversalColor selectedBackgroundColor = barChartColumnItem.isSelected() ? barChartColumnItem.getSelectedBackgroundColor() : null;
        if (selectedBackgroundColor == null) {
            selectedBackgroundColor = barChartColumnItem.getBackgroundColor();
        }
        fVar.v(selectedBackgroundColor);
    }

    public final void k(@k f fVar, @k BarChartColumnItem barChartColumnItem) {
        com.avito.android.beduin.common.component.bar_chart.a aVarInvoke = this.f100721b.invoke();
        if (aVarInvoke == null) {
            return;
        }
        fVar.s(barChartColumnItem.getF289965c());
        int iB2 = y6.b(barChartColumnItem.getWidth());
        int i12 = aVarInvoke.f100702a + aVarInvoke.f100703b;
        int i13 = aVarInvoke.f100706e;
        fVar.AT(iB2, i12 + i13);
        int iB3 = y6.b(barChartColumnItem.getWidth());
        double value = barChartColumnItem.getValue();
        double d12 = aVarInvoke.f100705d;
        int i14 = (int) (aVarInvoke.f100702a * ((value - d12) / (aVarInvoke.f100704c - d12)));
        int iB4 = y6.b(1);
        if (i14 < iB4) {
            i14 = iB4;
        }
        fVar.Lf(iB3, i14 + i13);
        fVar.Ra(barChartColumnItem.getCorners());
        String title = barChartColumnItem.getTitle();
        BarChartTextSettings barChartTextSettings = aVarInvoke.f100707f;
        fVar.CK(title, barChartTextSettings);
        fVar.ft(barChartColumnItem.getFooter(), barChartTextSettings);
        UniversalColor selectedBackgroundColor = barChartColumnItem.getSelectedBackgroundColor();
        if (!barChartColumnItem.isSelected()) {
            selectedBackgroundColor = null;
        }
        if (selectedBackgroundColor == null) {
            selectedBackgroundColor = barChartColumnItem.getBackgroundColor();
        }
        fVar.v(selectedBackgroundColor);
        fVar.a(new d(this, barChartColumnItem));
    }
}
