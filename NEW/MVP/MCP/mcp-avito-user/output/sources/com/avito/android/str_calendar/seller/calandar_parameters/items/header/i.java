package com.avito.android.str_calendar.seller.calandar_parameters.items.header;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: HeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/header/i;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f287192b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f287193c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f287194d;

    public i(@k View view) {
        super(view);
        this.f287192b = (TextView) view.findViewById(R.id.text_view);
        this.f287193c = (TextView) view.findViewById(R.id.description_view);
        this.f287194d = view.findViewById(R.id.is_new_badge);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.header.h
    public final void Vi() {
        D6.H(this.f287194d);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.header.h
    public final void g(@l AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f287193c;
        textView.setMovementMethod(linkMovementMethod);
        j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.header.h
    public final void g20() {
        D6.w(this.f287194d);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.header.h
    public final void setText(@k String str) {
        I5.a(this.f287192b, str, false);
    }
}
