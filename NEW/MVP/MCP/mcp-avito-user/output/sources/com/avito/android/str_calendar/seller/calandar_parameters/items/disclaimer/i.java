package com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DisclaimerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/disclaimer/i;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/disclaimer/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f287135b;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.disclaimer_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287135b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.h
    public final void a6(@k AttributedText attributedText) {
        TextView textView = this.f287135b;
        j.a(textView, attributedText, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
