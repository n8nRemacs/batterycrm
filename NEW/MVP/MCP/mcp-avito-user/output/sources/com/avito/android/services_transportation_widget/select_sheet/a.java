package com.avito.android.services_transportation_widget.select_sheet;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.service_booking_calendar.flexible.header.toolbar.g;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ServiceTransportationSelectItemsAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/select_sheet/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/services_transportation_widget/select_sheet/a$a;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<C8356a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<ServiceTransportationWidget.SelectField.SelectValue, G0> f280681c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public List<ServiceTransportationWidget.SelectField.SelectValue> f280682d = C42784z0.f406748b;

    /* compiled from: ServiceTransportationSelectItemsAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/select_sheet/a$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.services_transportation_widget.select_sheet.a$a, reason: collision with other inner class name */
    public static final class C8356a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TextView f280683b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextView f280684c;

        public C8356a(@k View view) {
            super(view);
            this.f280683b = (TextView) view.findViewById(R.id.selectText);
            this.f280684c = (TextView) view.findViewById(R.id.selectDescription);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k l<? super ServiceTransportationWidget.SelectField.SelectValue, G0> lVar) {
        this.f280681c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f280682d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return this.f280682d.get(i12).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        C8356a c8356a = (C8356a) c12;
        ServiceTransportationWidget.SelectField.SelectValue selectValue = this.f280682d.get(i12);
        I5.a(c8356a.f280683b, selectValue.getTitle(), false);
        I5.a(c8356a.f280684c, selectValue.getDescription(), false);
        c8356a.itemView.setOnClickListener(new g(12, this, selectValue));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new C8356a(C0.b(viewGroup, R.layout.service_transportation_widget_select_sheet_item, viewGroup, false));
    }
}
