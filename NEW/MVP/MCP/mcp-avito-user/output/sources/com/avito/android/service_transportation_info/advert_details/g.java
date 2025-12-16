package com.avito.android.service_transportation_info.advert_details;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.service_transportation_info.model.TransportInfo;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import k3.C42483a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsServicesTransportInfoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_transportation_info/advert_details/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_transportation_info/advert_details/f;", "a", "_avito_service-transportation-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f279725f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f279726b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ViewGroup f279727c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final androidx.asynclayoutinflater.view.a f279728d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public TransportInfo f279729e;

    /* compiled from: AdvertDetailsServicesTransportInfoItemView.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_transportation_info/advert_details/g$a;", "", "_avito_service-transportation-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TextView f279730a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TextView f279731b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextView f279732c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final TextView f279733d;

        public a(@k View view) {
            this.f279730a = (TextView) view.findViewById(R.id.transport_info_details_title);
            this.f279731b = (TextView) view.findViewById(R.id.transport_info_details_description);
            this.f279732c = (TextView) view.findViewById(R.id.transport_info_details_price);
            this.f279733d = (TextView) view.findViewById(R.id.transport_info_details_price_unit);
        }
    }

    public g(@k View view) {
        super(view);
        this.f279726b = (TextView) view.findViewById(R.id.transport_info_title);
        this.f279727c = (ViewGroup) view.findViewById(R.id.transport_info_container);
        this.f279728d = new androidx.asynclayoutinflater.view.a(view.getContext());
    }

    @Override // com.avito.android.service_transportation_info.advert_details.f
    public final void vz(@k AdvertDetailsServicesTransportInfoItem advertDetailsServicesTransportInfoItem) throws InterruptedException {
        TransportInfo transportInfo = this.f279729e;
        TransportInfo transportInfo2 = advertDetailsServicesTransportInfoItem.f279715b;
        if (new C42483a(transportInfo2, transportInfo).f406029c || transportInfo2 == null) {
            return;
        }
        this.f279729e = transportInfo2;
        String title = transportInfo2.getTitle();
        if (!new C42483a(title, transportInfo != null ? transportInfo.getTitle() : null).f406029c && title != null) {
            I5.a(this.f279726b, title, false);
        }
        List<TransportInfo.TransportInfoDetails> items = transportInfo2.getItems();
        if (new C42483a(items, transportInfo != null ? transportInfo.getItems() : null).f406029c || items == null) {
            return;
        }
        ViewGroup viewGroup = this.f279727c;
        viewGroup.removeAllViews();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            this.f279728d.a(R.layout.service_transportation_info_detail_item, viewGroup, new com.avito.android.offlinization.ui.a((TransportInfo.TransportInfoDetails) it.next(), 25));
        }
    }
}
