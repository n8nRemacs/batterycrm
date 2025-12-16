package com.avito.android.services_transportation_widget.select_sheet;

import Y61.k;
import Y61.l;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ServiceTransportationSelectSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/select_sheet/d;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final List<ServiceTransportationWidget.SelectField.SelectValue> f280687E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public RecyclerView f280688F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final a f280689G;

    public d(@k Activity activity, @k String str, @k List list, @k Y41.l lVar) {
        super(activity, 0, 2, null);
        this.f280687E = list;
        this.f280689G = new a(new c(lVar, this));
        C(R.layout.service_transportation_widget_select_sheet, new b(1, this, d.class, "onInflated", "onInflated(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(this, str, true, false, 10);
        t();
    }
}
