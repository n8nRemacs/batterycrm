package com.avito.android.str_seller_orders_calendar.strorderscalendar;

import android.view.View;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import java.io.Serializable;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarFragment f290813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f290814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l f290815d;

    public f(StrOrdersCalendarFragment strOrdersCalendarFragment, String str, Y41.l lVar) {
        this.f290813b = strOrdersCalendarFragment;
        this.f290814c = str;
        this.f290815d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f290813b.getView();
        if (view != null) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view, com.avito.android.printable_text.b.c(R.string.str_orders_calendar_bookings_loading_error_message, new Serializable[0]), null, Collections.singletonList(new c.a.C3719a(this.f290814c, false, null, new h(this.f290815d), 6, null)), null, f.a.f125253a, -1, null, null, true, false, null, null, 3786);
        }
    }
}
