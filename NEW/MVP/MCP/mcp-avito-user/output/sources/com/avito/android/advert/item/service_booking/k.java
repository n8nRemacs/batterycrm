package com.avito.android.advert.item.service_booking;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.service_booking.ServiceBookingItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/service_booking/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/service_booking/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f79847g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f79848b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f79849c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f79850d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f79851e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.lib.design.tooltip.f f79852f;

    /* compiled from: ServiceBookingItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/k;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.lib.design.tooltip.k, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ServiceBookingItem.TooltipInfo f79853l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f79854m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ k f79855n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f79856o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ServiceBookingItem.TooltipInfo tooltipInfo, boolean z12, k kVar, Y41.a<G0> aVar) {
            super(1);
            this.f79853l = tooltipInfo;
            this.f79854m = z12;
            this.f79855n = kVar;
            this.f79856o = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.k kVar) {
            com.avito.android.lib.design.tooltip.k kVar2 = kVar;
            int i12 = 1;
            r.d dVar = new r.d(null, i12, 0 == true ? 1 : 0);
            dVar.f181263d = new r.a(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
            kVar2.f181224j = dVar;
            p.a(kVar2, new j(this.f79853l, this.f79854m, kVar2, this.f79855n, this.f79856o));
            int iB2 = y6.b(300);
            int i13 = kVar2.f181229o;
            kVar2.f181228n = iB2;
            kVar2.f181229o = i13;
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            k kVar = k.this;
            return Integer.valueOf(kVar.f79849c.getTop() + kVar.f79851e.getTop());
        }
    }

    /* compiled from: ServiceBookingItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            k kVar = k.this;
            return Integer.valueOf(kVar.f79851e.getBottom() - (kVar.f79851e.getHeight() - kVar.f79849c.getBottom()));
        }
    }

    public k(@Y61.k View view, @Y61.k ViewGroup viewGroup) {
        super(view);
        this.f79848b = viewGroup;
        View viewFindViewById = view.findViewById(R.id.service_booking_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        this.f79849c = button;
        View viewFindViewById2 = view.findViewById(R.id.service_booking_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79850d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.service_booking_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f79851e = viewFindViewById3;
        RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
        this.f79852f = recyclerView != null ? new com.avito.android.lib.design.tooltip.f(recyclerView, button, 2, 1, new b(), new c()) : null;
    }

    @Override // com.avito.android.advert.item.service_booking.h
    public final void IB(@Y61.k ServiceBookingItem serviceBookingItem) {
        this.f79849c.setText(serviceBookingItem.f79811b);
        I5.a(this.f79850d, serviceBookingItem.f79812c, false);
    }

    @Override // com.avito.android.advert.item.service_booking.h
    public final void IF(@Y61.k ServiceBookingItem.TooltipInfo tooltipInfo, boolean z12, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.lib.design.tooltip.f fVar = this.f79852f;
        if (fVar != null) {
            fVar.c(new a(tooltipInfo, z12, this, aVar), z12);
        }
    }

    @Override // com.avito.android.advert.item.service_booking.h
    public final int N8() {
        int[] iArr = new int[2];
        Button button = this.f79849c;
        button.getLocationOnScreen(iArr);
        return button.getHeight() + iArr[1];
    }

    @Override // com.avito.android.advert.item.service_booking.h
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f79849c.setOnClickListener(new com.avito.android.advert.item.parking.h(15, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f79849c.setOnClickListener(null);
        com.avito.android.lib.design.tooltip.f fVar = this.f79852f;
        if (fVar != null) {
            fVar.b();
        }
    }
}
