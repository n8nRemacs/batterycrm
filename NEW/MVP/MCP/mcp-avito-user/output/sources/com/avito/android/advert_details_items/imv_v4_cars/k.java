package com.avito.android.advert_details_items.imv_v4_cars;

import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ImvCarsV4ItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/imv_v4_cars/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/imv_v4_cars/j;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f84857i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f84858b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f84859c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f84860d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f84861e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f84862f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f84863g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f84864h;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f84865b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a f84866c;

        public a(Y41.a aVar, View view) {
            this.f84865b = view;
            this.f84866c = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f84866c.invoke();
            this.f84865b.removeOnLayoutChangeListener(this);
        }
    }

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84858b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84859c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.disclaimer);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84860d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.disclaimer_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84861e = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.details_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f84862f = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.imv_cars_4v_range_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84863g = (LinearLayout) viewFindViewById6;
        this.f84864h = LayoutInflater.from(this.itemView.getContext());
    }

    @Override // com.avito.android.advert_details_items.imv_v4_cars.j
    public final void Dz() {
        Button button = this.f84862f;
        D6.w(button);
        button.setClickable(false);
        button.setOnClickListener(null);
    }

    @Override // com.avito.android.advert_details_items.imv_v4_cars.j
    public final void VY(@l String str) {
        I5.a(this.f84860d, str, false);
        D6.G(this.f84861e, !(str == null || C43066x.K(str)));
    }

    @Override // com.avito.android.advert_details_items.imv_v4_cars.j
    public final void b(@l String str) {
        I5.a(this.f84858b, str, false);
    }

    @Override // com.avito.android.advert_details_items.imv_v4_cars.j
    public final void iZ() {
        D6.w(this.f84863g);
    }

    @Override // com.avito.android.advert_details_items.imv_v4_cars.j
    public final void j(@l String str) {
        I5.a(this.f84859c, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    @Override // com.avito.android.advert_details_items.imv_v4_cars.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s10(@Y61.k java.util.List<com.avito.android.remote.model.Range> r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_details_items.imv_v4_cars.k.s10(java.util.List):void");
    }

    @Override // com.avito.android.advert_details_items.imv_v4_cars.j
    public final void xn(@l String str, @l Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        Button button = this.f84862f;
        com.avito.android.lib.design.button.b.a(button, str, false);
        if (aVar != null) {
            button.addOnLayoutChangeListener(new a(aVar, button));
        }
        button.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(16, aVar2));
    }
}
