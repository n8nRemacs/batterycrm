package com.avito.android.gig_timer_widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigSlotTimerWidget.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/gig_timer_widget/GigSlotTimerWidget;", "Lcom/avito/android/gig_timer_widget/a;", "", "colorAttrRes", "Lkotlin/G0;", "setColor", "(I)V", "Lkotlin/Function1;", "", "listener", "setOnMinutesLeftListener", "(LY41/l;)V", "", "date", "setDate", "(Ljava/lang/String;)V", "_avito_gig_timer-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSlotTimerWidget extends a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f161082f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f161083g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f161084h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f161085i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f161086j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f161087k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f161088l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public Y41.l<? super Long, G0> f161089m;

    @j
    public GigSlotTimerWidget(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.avito.android.gig_timer_widget.a
    public final void b(long j12, long j13, long j14, long j15, boolean z12) throws Resources.NotFoundException {
        Y41.l<? super Long, G0> lVar;
        TextView textView = this.f161083g;
        TextView textView2 = this.f161082f;
        TextView textView3 = this.f161087k;
        TextView textView4 = this.f161086j;
        TextView textView5 = this.f161085i;
        TextView textView6 = this.f161084h;
        if (j12 > 0) {
            int i12 = (int) j12;
            CharSequence quantityText = getResources().getQuantityText(R.plurals.job_gig_timer_widget_public_slot_timer_days_plurals, i12);
            I5.a(textView2, String.valueOf(i12), false);
            I5.a(textView, quantityText, false);
            D6.w(textView6);
            D6.w(textView5);
            D6.w(textView4);
            D6.w(textView3);
            return;
        }
        D6.w(textView2);
        D6.w(textView);
        if (j13 >= 1) {
            String string = getResources().getString(R.string.job_gig_timer_widget_public_slot_timer_hours);
            String string2 = getResources().getString(R.string.job_gig_timer_widget_public_slot_timer_minutes);
            I5.a(textView6, String.valueOf((int) j13), false);
            I5.a(textView5, string, false);
            I5.a(textView4, String.valueOf((int) j14), false);
            I5.a(textView3, string2, false);
            return;
        }
        D6.w(textView6);
        D6.w(textView5);
        CharSequence quantityText2 = getResources().getQuantityText(R.plurals.job_gig_timer_widget_public_slot_timer_minutes_plurals, (int) j12);
        I5.a(textView4, String.valueOf((int) j14), false);
        I5.a(textView3, quantityText2, false);
        if (!z12 || (lVar = this.f161089m) == null) {
            return;
        }
        lVar.invoke(Long.valueOf(j14));
    }

    public final void setColor(@InterfaceC42150f int colorAttrRes) {
        this.f161082f.setTextColor(C35835l0.d(colorAttrRes, getContext()));
        this.f161083g.setTextColor(C35835l0.d(colorAttrRes, getContext()));
        this.f161084h.setTextColor(C35835l0.d(colorAttrRes, getContext()));
        this.f161085i.setTextColor(C35835l0.d(colorAttrRes, getContext()));
        this.f161086j.setTextColor(C35835l0.d(colorAttrRes, getContext()));
        this.f161087k.setTextColor(C35835l0.d(colorAttrRes, getContext()));
    }

    public final void setDate(@l String date) {
        I5.a(this.f161088l, date, false);
    }

    public final void setOnMinutesLeftListener(@k Y41.l<? super Long, G0> listener) {
        this.f161089m = listener;
    }

    public GigSlotTimerWidget(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.gig_slot_timer_widget, this);
        this.f161082f = (TextView) findViewById(R.id.gig_slot_days);
        this.f161083g = (TextView) findViewById(R.id.gig_slot_days_title);
        this.f161084h = (TextView) findViewById(R.id.gig_slot_hours);
        this.f161085i = (TextView) findViewById(R.id.gig_slot_hours_title);
        this.f161086j = (TextView) findViewById(R.id.gig_slot_minutes);
        this.f161087k = (TextView) findViewById(R.id.gig_slot_minutes_title);
        this.f161088l = (TextView) findViewById(R.id.gig_slot_start_date);
    }
}
