package com.avito.android.str_booking.ui.details;

import Y41.l;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.sections.DetailsContent;
import com.avito.android.str_booking.network.models.sections.DetailsContentItem;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingDetailsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/details/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/details/h;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f286004e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f286005b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayoutCompat f286006c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AppCompatTextView f286007d;

    /* compiled from: StrBookingDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f286008l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DetailsContentItem f286009m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super DeepLink, G0> lVar, DetailsContentItem detailsContentItem) {
            super(0);
            this.f286008l = lVar;
            this.f286009m = detailsContentItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((e) this.f286008l).invoke(this.f286009m.getDeeplink());
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        this.f286005b = view;
        View viewFindViewById = view.findViewById(R.id.str_booking_details_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        }
        this.f286006c = (LinearLayoutCompat) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.str_booking_details_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        }
        this.f286007d = (AppCompatTextView) viewFindViewById2;
    }

    @Override // com.avito.android.str_booking.ui.details.h
    public final void D10(@Y61.l DetailsContent detailsContent, @k l<? super DeepLink, G0> lVar) {
        List<DetailsContentItem> items;
        LinearLayoutCompat linearLayoutCompat = this.f286006c;
        linearLayoutCompat.removeAllViews();
        if (detailsContent == null || (items = detailsContent.getItems()) == null) {
            return;
        }
        for (DetailsContentItem detailsContentItem : items) {
            AttributedText attributedTextC = detailsContentItem.getValue();
            a aVar = new a(lVar, detailsContentItem);
            View viewInflate = LayoutInflater.from(this.f286005b.getContext()).inflate(R.layout.str_booking_details_item_text, (ViewGroup) linearLayoutCompat, false);
            TextView textView = viewInflate instanceof TextView ? (TextView) viewInflate : null;
            if (textView != null) {
                j.a(textView, attributedTextC, null);
            }
            if (textView != null) {
                textView.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(27, aVar));
            }
            linearLayoutCompat.addView(textView);
        }
    }

    @Override // com.avito.android.str_booking.ui.details.h
    public final void b(@Y61.l String str) {
        I5.a(this.f286007d, str, false);
    }
}
