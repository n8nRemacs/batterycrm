package Cr0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.resizable_service_widget.ResizableServiceWidget;
import com.avito.android.remote.model.resizable_service_widget.ResizableServiceWidgetItem;
import com.avito.android.remote.model.resizable_service_widget.ResizableServiceWidgetItemBackground;
import com.avito.android.remote.model.resizable_service_widget.ResizableServiceWidgetRow;
import com.avito.android.serp.adapter.resizable_service_widget.block.item.ResizableServiceWidgetBlockItem;
import com.avito.android.serp.adapter.resizable_service_widget.row.item.ResizableServiceWidgetRowItem;
import com.avito.android.serp.adapter.resizable_service_widget.row.item.ResizableServiceWidgetRowListItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ResizableServiceWidgetBlockItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCr0/a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cr0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13347a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.resizable_service_widget.row.a f2720a;

    @Inject
    public C13347a(@k com.avito.android.serp.adapter.resizable_service_widget.row.a aVar) {
        this.f2720a = aVar;
    }

    @k
    public final ResizableServiceWidgetBlockItem a(@k ResizableServiceWidget resizableServiceWidget) {
        List<ResizableServiceWidgetRow> rows = resizableServiceWidget.getRows();
        ArrayList arrayList = new ArrayList(C42745f0.q(rows, 10));
        for (ResizableServiceWidgetRow resizableServiceWidgetRow : rows) {
            com.avito.android.serp.adapter.resizable_service_widget.row.a aVar = this.f2720a;
            aVar.getClass();
            List<ResizableServiceWidgetItem> items = resizableServiceWidgetRow.getItems();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(items, 10));
            for (ResizableServiceWidgetItem resizableServiceWidgetItem : items) {
                aVar.f270725a.getClass();
                UniversalImage iconUrls = resizableServiceWidgetItem.getIconUrls();
                float sizeWeight = resizableServiceWidgetItem.getSizeWeight();
                String title = resizableServiceWidgetItem.getTitle();
                String subTitle1 = resizableServiceWidgetItem.getSubTitle1();
                String subTitle2 = resizableServiceWidgetItem.getSubTitle2();
                ResizableServiceWidgetItemBackground background = resizableServiceWidgetItem.getBackground();
                String colorKey = background != null ? background.getColorKey() : null;
                ResizableServiceWidgetItemBackground background2 = resizableServiceWidgetItem.getBackground();
                arrayList2.add(new ResizableServiceWidgetRowListItem(iconUrls, sizeWeight, title, subTitle1, subTitle2, colorKey, background2 != null ? background2.getPressedColorKey() : null, resizableServiceWidgetItem.getAction().getUri()));
            }
            arrayList.add(new ResizableServiceWidgetRowItem(null, false, arrayList2, 3, null));
        }
        return new ResizableServiceWidgetBlockItem(null, false, arrayList, resizableServiceWidget.getAnalytics(), resizableServiceWidget.getSettings(), 3, null);
    }
}
