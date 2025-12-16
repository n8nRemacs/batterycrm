package com.avito.android.str_calendar.seller.calandar_parameters.items.duration_discount;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.str_calendar.booking_calendar.items.day.h;
import com.avito.android.str_calendar.seller.calandar_parameters.items.input.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DurationDiscountSelectItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/duration_discount/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/duration_discount/f;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f287165e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final View f287166b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j f287167c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j f287168d;

    public g(@k View view) {
        super(view);
        this.f287166b = view.findViewById(R.id.delete_icon_container);
        this.f287167c = new j(view, R.id.days_input_container, R.id.days_input);
        this.f287168d = new j(view, R.id.percent_input_container, R.id.percent_input);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.duration_discount.f
    public final void L5(@k Y41.a<G0> aVar) {
        this.f287166b.setOnClickListener(new h(9, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.duration_discount.f
    @k
    /* renamed from: oc, reason: from getter */
    public final j getF287167c() {
        return this.f287167c;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.duration_discount.f
    @k
    /* renamed from: r7, reason: from getter */
    public final j getF287168d() {
        return this.f287168d;
    }
}
