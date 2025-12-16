package com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.str_calendar.booking_calendar.items.day.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VariableParameterHeaderView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/variable_length/header/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/variable_length/header/a;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f287294e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f287295b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f287296c;

    /* renamed from: d, reason: collision with root package name */
    public final View f287297d;

    public b(@k View view) {
        super(view);
        this.f287295b = (TextView) view.findViewById(R.id.title_tv);
        this.f287296c = (ImageView) view.findViewById(R.id.tooltip_iv);
        this.f287297d = view.findViewById(R.id.is_new_badge);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header.a
    public final void J7(@k Y41.a<G0> aVar) {
        this.f287296c.setOnClickListener(new h(12, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header.a
    public final void Yy(boolean z12) {
        this.f287297d.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header.a
    public final void e40(boolean z12) {
        this.f287296c.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header.a
    public final void setTitle(@k String str) {
        this.f287295b.setText(str);
    }
}
