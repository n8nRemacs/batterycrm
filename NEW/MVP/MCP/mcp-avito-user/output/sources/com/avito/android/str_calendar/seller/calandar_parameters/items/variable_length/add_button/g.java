package com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.add_button;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.booking_calendar.items.day.h;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AddButtonView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/variable_length/add_button/g;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/variable_length/add_button/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f287292c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f287293b;

    public g(@k View view) {
        super(view);
        this.f287293b = (TextView) view.findViewById(R.id.add_button_tv);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.add_button.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f287293b.setOnClickListener(new h(11, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.add_button.f
    public final void y(@k PrintableText printableText) {
        TextView textView = this.f287293b;
        textView.setText(printableText.k0(textView.getContext()));
    }
}
