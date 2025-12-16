package com.avito.android.service_order_map.serviceordermap.suggests;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.service_booking_calendar.flexible.header.toolbar.g;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrderMapSuggestionsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/suggests/b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/service_order_map/serviceordermap/suggests/a;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter<com.avito.android.service_order_map.serviceordermap.suggests.a> {

    /* renamed from: c, reason: collision with root package name */
    @l
    public LayoutInflater f278820c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public List<AddressSuggestion> f278821d = C42784z0.f406748b;

    /* renamed from: e, reason: collision with root package name */
    @k
    public N f278822e = a.f278823l;

    /* compiled from: ServiceOrderMapSuggestionsAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<AddressSuggestion, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f278823l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(AddressSuggestion addressSuggestion) {
            return G0.f406611a;
        }
    }

    public b() {
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f278821d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return this.f278821d.get(i12).getTitle().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        com.avito.android.service_order_map.serviceordermap.suggests.a aVar = (com.avito.android.service_order_map.serviceordermap.suggests.a) c12;
        AddressSuggestion addressSuggestion = this.f278821d.get(i12);
        int length = addressSuggestion.getTitle().length();
        TextView textView = aVar.f278818b;
        TextView textView2 = aVar.f278819c;
        if (length == 0 || addressSuggestion.getSubtitle().length() == 0) {
            textView.setText(addressSuggestion.getTitle());
            D6.w(textView2);
        } else {
            textView.setText(addressSuggestion.getTitle());
            textView2.setText(addressSuggestion.getSubtitle());
            D6.H(textView2);
        }
        aVar.itemView.setOnClickListener(new g(6, this, addressSuggestion));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        LayoutInflater layoutInflaterFrom = this.f278820c;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            this.f278820c = layoutInflaterFrom;
        }
        return new com.avito.android.service_order_map.serviceordermap.suggests.a(layoutInflaterFrom.inflate(R.layout.service_order_map_suggestion_item, viewGroup, false));
    }
}
