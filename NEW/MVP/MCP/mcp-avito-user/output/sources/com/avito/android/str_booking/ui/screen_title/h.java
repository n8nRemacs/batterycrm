package com.avito.android.str_booking.ui.screen_title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.str_booking.network.models.sections.ScreenTitleContent;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingScreenTitleView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/screen_title/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/screen_title/g;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f286174b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.str_booking_screen_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286174b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.str_booking.ui.screen_title.g
    public final void P10(@k c cVar) {
        ScreenTitleContent screenTitleContent = cVar.f286172b;
        I5.a(this.f286174b, screenTitleContent != null ? screenTitleContent.getText() : null, false);
    }
}
