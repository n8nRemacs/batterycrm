package com.avito.android.beduin.common.component.product_comparison;

import Y61.l;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout;
import com.avito.android.beduin.common.utils.y;
import com.avito.android.beduin_models.BeduinAction;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinProductComparisonComponent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/b;", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements BeduinBaseHorizontalSliderLayout.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f102131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeduinProductComparisonModel f102132b;

    public b(a aVar, BeduinProductComparisonModel beduinProductComparisonModel) {
        this.f102131a = aVar;
        this.f102132b = beduinProductComparisonModel;
    }

    @Override // com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout.a
    public final void b(@l LinearLayoutManager.SavedState savedState, boolean z12) {
        List<BeduinAction> onPageSwipedActions;
        a aVar = this.f102131a;
        HashMap<y, Parcelable> map = aVar.f102122g.f15825a;
        y.f103550a.getClass();
        BeduinProductComparisonModel beduinProductComparisonModel = this.f102132b;
        map.put(y.c.a(beduinProductComparisonModel), savedState);
        if (z12 || (onPageSwipedActions = beduinProductComparisonModel.getOnPageSwipedActions()) == null) {
            return;
        }
        Iterator<T> it = onPageSwipedActions.iterator();
        while (it.hasNext()) {
            aVar.f102120e.o((BeduinAction) it.next());
        }
    }

    @Override // com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout.a
    public final void a(int i12) {
    }
}
