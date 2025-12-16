package com.avito.android.short_term_rent.bookingform.items.button;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/button/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/button/f;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f281480c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f281481b;

    public g(@k View view) {
        super(view);
        this.f281481b = (Button) view;
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.button.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f281481b.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(17, aVar));
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.button.f
    public final void v0(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f281481b, str, false);
    }
}
