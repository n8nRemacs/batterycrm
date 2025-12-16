package com.avito.android.str_calendar.seller.calendar.konveyor.items.day;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.str_calendar.common.models.Position;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42165v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerCalendarDayItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/day/i;", "Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/day/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final View f287644b;

    /* renamed from: c, reason: collision with root package name */
    public final View f287645c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f287646d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f287647e;

    /* renamed from: f, reason: collision with root package name */
    public final View f287648f;

    /* renamed from: g, reason: collision with root package name */
    public final View f287649g;

    public i(@k View view) {
        super(view);
        this.f287644b = view.findViewById(R.id.background_view);
        this.f287645c = view.findViewById(R.id.secondary_background_view);
        this.f287646d = (TextView) view.findViewById(R.id.day);
        this.f287647e = (TextView) view.findViewById(R.id.price);
        this.f287648f = view.findViewById(R.id.dot);
        this.f287649g = view.findViewById(R.id.fire);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void Cl(@InterfaceC42165v @l Integer num, boolean z12) {
        View view = this.f287649g;
        view.setVisibility(z12 ? 0 : 8);
        com.avito.android.str_calendar.seller.calendar.konveyor.b.a(view, num);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void FZ(@InterfaceC42165v @l Integer num) {
        com.avito.android.str_calendar.seller.calendar.konveyor.b.a(this.f287644b, num);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void Fs(@l Integer num) {
        int iIntValue = num.intValue();
        TextView textView = this.f287647e;
        textView.setTextColor(C35835l0.d(iIntValue, textView.getContext()));
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void Ft(@InterfaceC42165v @l Integer num, boolean z12) {
        View view = this.f287648f;
        view.setVisibility(z12 ? 0 : 8);
        com.avito.android.str_calendar.seller.calendar.konveyor.b.a(view, num);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void Ki(@k String str) {
        I5.a(this.f287647e, str, false);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void UY(int i12) {
        TextView textView = this.f287646d;
        textView.setTextColor(C35835l0.d(i12, textView.getContext()));
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void Vm(@k Position position) {
        this.f287644b.setTag(position);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void X(@l Y41.a<G0> aVar) {
        D6.a(aVar, this.f287645c);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void nF(@k String str) {
        I5.a(this.f287646d, str, false);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void nQ(@k Position position) {
        this.f287645c.setTag(position);
    }

    @Override // com.avito.android.str_calendar.seller.calendar.konveyor.items.day.h
    public final void zz(@InterfaceC42165v @l Integer num) {
        com.avito.android.str_calendar.seller.calendar.konveyor.b.a(this.f287645c, num);
    }
}
