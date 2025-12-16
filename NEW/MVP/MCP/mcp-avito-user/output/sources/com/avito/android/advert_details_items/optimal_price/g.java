package com.avito.android.advert_details_items.optimal_price;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_collection.adapter.order.h;
import com.avito.android.advert_details_items.optimal_price.AdvertDetailsOptimalPriceItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsOptimalPriceView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/optimal_price/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/optimal_price/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f84990j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84991b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f84992c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f84993d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f84994e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f84995f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f84996g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinearLayout f84997h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f84998i;

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsOptimalPriceItem.Scale.Line.Marker f84999b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f85000c;

        public a(FrameLayout frameLayout, AdvertDetailsOptimalPriceItem.Scale.Line.Marker marker) {
            this.f84999b = marker;
            this.f85000c = frameLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            AdvertDetailsOptimalPriceItem.Scale.Line.Marker marker = this.f84999b;
            marker.getClass();
            view.setX((this.f85000c.getWidth() * marker.f84981c) - (view.getWidth() / 2.0f));
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f85001b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsOptimalPriceItem.Scale.Line.Marker f85002c;

        public b(FrameLayout frameLayout, AdvertDetailsOptimalPriceItem.Scale.Line.Marker marker) {
            this.f85001b = frameLayout;
            this.f85002c = marker;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            view.setX((this.f85001b.getWidth() * this.f85002c.f84981c) - (view.getWidth() / 2.0f));
        }
    }

    public g(@k View view) {
        super(view);
        this.f84991b = view;
        this.f84992c = LayoutInflater.from(view.getContext());
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84993d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84994e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.scale);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84995f = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.scaleMarkers);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84996g = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.scaleLines);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84997h = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f84998i = (Button) viewFindViewById6;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    @Override // com.avito.android.advert_details_items.optimal_price.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GQ(@Y61.l com.avito.android.advert_details_items.optimal_price.AdvertDetailsOptimalPriceItem.Scale r25) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_details_items.optimal_price.g.GQ(com.avito.android.advert_details_items.optimal_price.AdvertDetailsOptimalPriceItem$Scale):void");
    }

    @Override // com.avito.android.advert_details_items.optimal_price.f
    public final void Xm(@k Y41.a<G0> aVar) {
        this.f84998i.setOnClickListener(new h(19, aVar));
    }

    @Override // com.avito.android.advert_details_items.optimal_price.f
    public final void e(@l AttributedText attributedText) {
        j.a(this.f84993d, attributedText, null);
    }

    @Override // com.avito.android.advert_details_items.optimal_price.f
    public final void g(@l AttributedText attributedText) {
        j.a(this.f84994e, attributedText, null);
    }

    @Override // com.avito.android.advert_details_items.optimal_price.f
    public final void qo(@l AdvertDetailsOptimalPriceItem.Button button) {
        Button button2 = this.f84998i;
        if (button == null) {
            com.akita.view.foundation.util.e.c(button2);
        } else {
            com.akita.view.foundation.util.e.d(button2);
            button2.setText(button.f84973b);
        }
    }
}
