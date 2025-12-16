package com.avito.android.str_seller_orders_calendar.strorderscalendar;

import android.widget.FrameLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f290968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarView f290969d;

    public /* synthetic */ k(FrameLayout frameLayout, StrOrdersCalendarView strOrdersCalendarView, int i12) {
        this.f290967b = i12;
        this.f290968c = frameLayout;
        this.f290969d = strOrdersCalendarView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StrOrdersCalendarView strOrdersCalendarView = this.f290969d;
        FrameLayout frameLayout = this.f290968c;
        switch (this.f290967b) {
            case 0:
                int i12 = StrOrdersCalendarView.f290540Q;
                frameLayout.requestLayout();
                strOrdersCalendarView.f290568l.requestLayout();
                break;
            default:
                int i13 = StrOrdersCalendarView.f290540Q;
                frameLayout.requestLayout();
                strOrdersCalendarView.f290568l.requestLayout();
                break;
        }
    }
}
