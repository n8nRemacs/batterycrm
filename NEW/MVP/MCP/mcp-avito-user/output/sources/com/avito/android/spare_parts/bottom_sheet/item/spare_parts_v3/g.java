package com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sx0.InterfaceC48429b;

/* compiled from: SparePartsV3View.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/item/spare_parts_v3/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/spare_parts/bottom_sheet/item/spare_parts_v3/f;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f284787f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f284788b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f284789c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f284790d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f284791e;

    public g(@k View view) {
        super(view);
        this.f284788b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f284789c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f284790d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image_chevron);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f284791e = (ImageView) viewFindViewById3;
    }

    @Override // com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3.f
    public final void Li(@k e eVar, @k InterfaceC48429b interfaceC48429b) {
        this.f284789c.setText(eVar.f284783c);
        I5.a(this.f284790d, eVar.f284784d, false);
        boolean z12 = eVar.f284785e;
        this.f284791e.setVisibility(z12 ? 0 : 8);
        View view = this.f284788b;
        if (z12) {
            view.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(19, eVar, interfaceC48429b));
        } else {
            view.setOnClickListener(null);
        }
    }
}
