package com.avito.android.service_booking_calendar.flexible.header.toolbar;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: CalendarHeaderActionViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/toolbar/h;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f276089d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f276090b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f276091c;

    public h(@k View view) {
        super(view);
        this.f276090b = view.getContext();
        this.f276091c = (ImageView) view.findViewById(R.id.flexible_calendar_toolbar_action_icon);
    }
}
