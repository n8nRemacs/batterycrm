package com.avito.android.services_transportation_widget.item;

import Fv0.C13839a;
import Fv0.C13842d;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.y6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceTransportationWidgetItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/k;", "Lcom/avito/android/services_transportation_widget/item/j;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f280653l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f280654b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f280655c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Banner f280656d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f280657e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f280658f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final GridLayoutManager f280659g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super j, G0> f280660h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public ServiceTransportationWidgetItem f280661i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f280662j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super ServiceTransportationWidgetItem, G0> f280663k;

    /* compiled from: ServiceTransportationWidgetItemView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/k$a;", "", "<init>", "()V", "", "WIDGET_COLUMNS_COUNT", "I", "", "WIDGET_GRAY_STYLE", "Ljava/lang/String;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public k(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        super(view);
        this.f280654b = view;
        this.f280655c = aVar;
        this.f280656d = (Banner) view.findViewById(R.id.serviceTransportationWidget);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.transportationWidgetItemsContainer);
        this.f280657e = (Button) view.findViewById(R.id.transportationWidgetButton);
        this.f280658f = (TextView) view.findViewById(R.id.transportationWidgetDescription);
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        this.f280659g = gridLayoutManager;
        C35976x4.a(recyclerView);
        recyclerView.l(new C13842d(), -1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(jVar);
    }

    public final void B80(boolean z12) {
        ServiceTransportationWidgetItem serviceTransportationWidgetItem = this.f280661i;
        if (serviceTransportationWidgetItem == null) {
            return;
        }
        Button button = this.f280657e;
        button.setLoading(z12);
        button.setClickable(!z12);
        List<ServicesTransportationWidgetBlueprintItem> list = serviceTransportationWidgetItem.f280533g;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ServicesTransportationWidgetBlueprintItem) it.next()).D1(z12));
        }
        C80(arrayList);
    }

    public final void C80(List<? extends ServicesTransportationWidgetBlueprintItem> list) {
        this.f280659g.f53667M = new C13839a(list == null ? C42784z0.f406748b : list);
        if (list == null) {
            list = C42784z0.f406748b;
        }
        this.f280655c.c(new UV0.c(list));
    }

    @Override // com.avito.android.services_transportation_widget.item.j
    public final void YL(@Y61.k Y41.l<? super j, G0> lVar) {
        this.f280660h = lVar;
    }

    @Override // com.avito.android.services_transportation_widget.item.j
    public final void ah(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f280662j = lVar;
    }

    @Override // com.avito.android.services_transportation_widget.item.j
    public final void ip(@Y61.k ServiceTransportationWidgetItem serviceTransportationWidgetItem, boolean z12, boolean z13) {
        ServiceTransportationWidgetItem serviceTransportationWidgetItem2 = this.f280661i;
        if (!new com.avito.android.lib.util.c(serviceTransportationWidgetItem, serviceTransportationWidgetItem2).f181333c) {
            String str = serviceTransportationWidgetItem2 != null ? serviceTransportationWidgetItem2.f280532f : null;
            String str2 = serviceTransportationWidgetItem.f280532f;
            boolean z14 = new com.avito.android.lib.util.c(str2, str).f181333c;
            Banner banner = this.f280656d;
            if (!z14 && str2 != null) {
                a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
                View view = this.f280654b;
                Context context = view.getContext();
                c5258a.getClass();
                com.avito.android.lib.design.banner.a aVarA = com.avito.android.lib.design.banner.a.a(a.C5258a.b(C35835l0.j(com.avito.android.lib.util.f.b(str2), context), context), null, null, null, 0, 0, 0, 0, false, 0.0f, !serviceTransportationWidgetItem.getShowInHeaderToolbar(), !serviceTransportationWidgetItem.getShowInHeaderToolbar(), 8191999);
                if (str2.equals("gray")) {
                    aVarA = com.avito.android.lib.design.banner.a.a(aVarA, null, new C35763c0(C35835l0.d(R.attr.gray8, view.getContext()), null, null, null, 14, null), null, 0, 0, 0, 0, false, 0.0f, false, false, 7340029);
                }
                banner.setStyle(aVarA);
            }
            String str3 = serviceTransportationWidgetItem2 != null ? serviceTransportationWidgetItem2.f280530d : null;
            String str4 = serviceTransportationWidgetItem.f280530d;
            if (!new com.avito.android.lib.util.c(str4, str3).f181333c && str4 != null) {
                banner.setState(new TU.a(serviceTransportationWidgetItem.f280530d, null, R.layout.service_transportation_widget_content, 2, null));
                TextView textView = (TextView) banner.findViewById(R.id.title);
                if (textView != null) {
                    textView.setPadding(y6.b(4), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
                }
            }
            List<ServicesTransportationWidgetBlueprintItem> list = serviceTransportationWidgetItem2 != null ? serviceTransportationWidgetItem2.f280533g : null;
            List<? extends ServicesTransportationWidgetBlueprintItem> list2 = serviceTransportationWidgetItem.f280533g;
            if (!new com.avito.android.lib.util.c(list2, list).f181333c && list2 != null) {
                C80(list2);
            }
            AttributedText attributedText = serviceTransportationWidgetItem2 != null ? serviceTransportationWidgetItem2.f280531e : null;
            AttributedText attributedText2 = serviceTransportationWidgetItem.f280531e;
            if (!new com.avito.android.lib.util.c(attributedText2, attributedText).f181333c && attributedText2 != null) {
                attributedText2.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 23));
                com.avito.android.util.text.j.a(this.f280658f, attributedText2, null);
            }
            ServiceTransportationWidget.Action action = serviceTransportationWidgetItem2 != null ? serviceTransportationWidgetItem2.f280534h : null;
            ServiceTransportationWidget.Action action2 = serviceTransportationWidgetItem.f280534h;
            if (!new com.avito.android.lib.util.c(action2, action).f181333c && action2 != null) {
                String title = action2.getTitle();
                Button button = this.f280657e;
                com.avito.android.lib.design.button.b.a(button, title, false);
                button.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(10, action2, this));
            }
        }
        this.f280661i = serviceTransportationWidgetItem;
        B80(z12);
        ServiceTransportationWidgetItem serviceTransportationWidgetItem3 = this.f280661i;
        if (serviceTransportationWidgetItem3 == null) {
            return;
        }
        List<ServicesTransportationWidgetBlueprintItem> list3 = serviceTransportationWidgetItem3.f280533g;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((ServicesTransportationWidgetBlueprintItem) it.next()).L4(z13));
        }
        C80(arrayList);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.l<? super j, G0> lVar = this.f280660h;
        if (lVar != null) {
            lVar.invoke(this);
        }
        this.f280662j = null;
    }

    @Override // com.avito.android.services_transportation_widget.item.j
    public final void kp(@Y61.k Y41.l<? super ServiceTransportationWidgetItem, G0> lVar) {
        this.f280663k = lVar;
    }

    @Override // com.avito.android.services_transportation_widget.item.j
    public final void y3() {
        IV.a.d(this.f280654b, new ToastBarState(com.avito.android.printable_text.b.c(R.string.something_went_wrong, new Serializable[0]), null, null, null, null, null, null, 0, false, false, null, null, 4094, null), new HV.a(0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 4194303, null));
        B80(false);
    }
}
