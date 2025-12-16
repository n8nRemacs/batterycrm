package com.avito.android.serp.adapter.brandspace_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopment;
import com.avito.android.remote.model.vertical_main.BrandspaceWidget;
import com.avito.android.remote.model.vertical_main.FeaturedAction;
import com.avito.android.serp.adapter.H0;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.brandspace_widget.BrandspaceWidgetItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.constructor.z;
import com.avito.android.serp.adapter.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BrandspaceWidgetItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/brandspace_widget/e;", "Lcom/avito/android/serp/adapter/brandspace_widget/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34904z0 f269041a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H0 f269042b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.f f269043c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n1 f269044d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final T f269045e;

    @Inject
    public e(@Y61.k com.avito.android.constructor_advert.ui.serp.constructor.f fVar, @Y61.k T t12, @Y61.k InterfaceC34904z0 interfaceC34904z0, @Y61.k H0 h02, @Y61.k n1 n1Var) {
        this.f269041a = interfaceC34904z0;
        this.f269042b = h02;
        this.f269043c = fVar;
        this.f269044d = n1Var;
        this.f269045e = t12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.avito.android.serp.adapter.rich_snippets.realty.DevelopmentItem] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.avito.android.serp.adapter.AdvertItem] */
    @Override // com.avito.android.serp.adapter.brandspace_widget.d
    @Y61.l
    public final BrandspaceWidgetItem a(@Y61.k BrandspaceWidget brandspaceWidget) {
        List<SerpElement> items = brandspaceWidget.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator it = items.iterator();
        while (true) {
            serpConstructorAdvertItemA = null;
            SerpConstructorAdvertItem serpConstructorAdvertItemA = null;
            if (!it.hasNext()) {
                break;
            }
            SerpElement serpElement = (SerpElement) it.next();
            if (serpElement instanceof SerpAdvert) {
                serpConstructorAdvertItemA = InterfaceC34904z0.a.a(this.f269041a, (SerpAdvert) serpElement, false, false, SerpDisplayType.Grid, null, 0, null, null, false, 2036);
            } else if (serpElement instanceof SerpDevelopment) {
                serpConstructorAdvertItemA = this.f269042b.a((SerpDevelopment) serpElement, SerpDisplayType.Grid);
            } else if (serpElement instanceof ConstructorAdvertNetworkModel) {
                SerpDisplayType serpDisplayType = SerpDisplayType.Grid;
                ConstructorAdvertItem constructorAdvertItemA = this.f269043c.a((ConstructorAdvertNetworkModel) serpElement, serpDisplayType, false, "", -1, "", null);
                if (constructorAdvertItemA != null) {
                    serpConstructorAdvertItemA = z.a(constructorAdvertItemA, serpDisplayType);
                }
            }
            if (serpConstructorAdvertItemA != null) {
                arrayList.add(serpConstructorAdvertItemA);
            }
        }
        this.f269044d.b(arrayList);
        this.f269045e.b(arrayList);
        String title = brandspaceWidget.getTitle();
        String subtitle = brandspaceWidget.getSubtitle();
        Boolean promoEnabled = brandspaceWidget.getPromoEnabled();
        FeaturedAction action = brandspaceWidget.getAction();
        String title2 = action != null ? action.getTitle() : null;
        FeaturedAction action2 = brandspaceWidget.getAction();
        BrandspaceWidgetItem.Action action3 = new BrandspaceWidgetItem.Action(title2, action2 != null ? action2.getDeeplink() : null);
        FeaturedAction infoAction = brandspaceWidget.getInfoAction();
        String title3 = infoAction != null ? infoAction.getTitle() : null;
        FeaturedAction infoAction2 = brandspaceWidget.getInfoAction();
        return new BrandspaceWidgetItem(null, 6, title, subtitle, promoEnabled, arrayList, action3, new BrandspaceWidgetItem.Action(title3, infoAction2 != null ? infoAction2.getDeeplink() : null), brandspaceWidget.getLogo(), brandspaceWidget.getAnalytics(), brandspaceWidget.getSettings(), 1, null);
    }
}
