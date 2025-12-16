package com.avito.android.service_booking_common.blueprints.date.date_list;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.K;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qt0.C47440d;

/* compiled from: SbDateListItemViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/date_list/j;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f276345f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f276346b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f276347c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f276348d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f276349e;

    public j(@k View view, @k com.avito.android.server_time.j jVar) {
        super(view);
        this.f276346b = view.getContext();
        this.f276347c = (TextView) view.findViewById(R.id.sb_day_of_week_label);
        this.f276348d = (TextView) view.findViewById(R.id.sb_day_of_month_label);
        Calendar calendarA = com.avito.android.service_booking_common.b.a();
        calendarA.setTime(new Date(jVar.f274001a.now()));
        K.a(calendarA);
        this.f276349e = calendarA.getTime();
    }

    public final void B80(@k C47440d.a aVar) {
        int i12;
        Context context = this.f276346b;
        boolean z12 = aVar.f429418e;
        int iD2 = C35835l0.d(z12 ? R.attr.white : aVar.f429419f ? R.attr.black : R.attr.gray36, context);
        TextView textView = this.f276348d;
        textView.setTextColor(iD2);
        if (z12) {
            i12 = R.drawable.day_slot_focused_bg;
        } else {
            i12 = L.f(aVar.f429417d, this.f276349e) ? R.drawable.day_slot_border_re23 : 0;
        }
        textView.setBackgroundResource(i12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(null);
    }
}
