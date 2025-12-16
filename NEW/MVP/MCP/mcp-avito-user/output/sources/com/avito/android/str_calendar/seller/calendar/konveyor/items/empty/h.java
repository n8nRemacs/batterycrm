package com.avito.android.str_calendar.seller.calendar.konveyor.items.empty;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.str_calendar.common.models.Position;
import kotlin.Metadata;

/* compiled from: StrSellerCalendarEmptyItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/empty/h;", "Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/empty/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f287658b;

    /* renamed from: c, reason: collision with root package name */
    public final View f287659c;

    public h(@k View view) {
        super(view);
        this.f287658b = view;
        this.f287659c = view.findViewById(R.id.background_view);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.g
    public final void Os(@k Position position) {
        this.f287658b.setTag(position);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.g
    public final void QM() {
        this.f287659c.setBackground(null);
    }
}
