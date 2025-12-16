package com.avito.android.beduin.common.component.bar_chart;

import com.avito.android.beduin.common.component.bar_chart.column.BarChartColumnItem;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinBarChartComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/column/BarChartColumnItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/bar_chart/column/BarChartColumnItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<BarChartColumnItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f100736l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(1);
        this.f100736l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(BarChartColumnItem barChartColumnItem) {
        BarChartColumnItem barChartColumnItem2 = barChartColumnItem;
        String f155493b = barChartColumnItem2.getF75565j();
        d dVar = this.f100736l;
        com.avito.android.beduin_shared.model.utils.j.a(dVar.f100734g, dVar.f100732e.getF100853b(), new SelectedIdTransform(f155493b));
        List<BeduinAction> actions = barChartColumnItem2.getActions();
        if (actions != null) {
            Iterator<T> it = actions.iterator();
            while (it.hasNext()) {
                dVar.f100733f.o((BeduinAction) it.next());
            }
        }
        return G0.f406611a;
    }
}
