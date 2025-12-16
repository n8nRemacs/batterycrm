package com.avito.android.str_calendar.common.domain;

import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.short_term_rent.StrBookingIntentFactory;
import ev.AbstractC40161a;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: CalendarLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/common/domain/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/CalendarLink;", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40161a<CalendarLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final StrBookingIntentFactory f286624f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f286625g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f286626h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f286627i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CalendarLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/common/domain/a$a;", "", "<init>", "()V", "", "KEY_BOOKING_RANGE_FROM", "Ljava/lang/String;", "KEY_BOOKING_RANGE_TO", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_calendar.common.domain.a$a, reason: collision with other inner class name */
    public static final class C8586a {
        public /* synthetic */ C8586a(C42822w c42822w) {
            this();
        }

        public C8586a() {
        }
    }

    /* compiled from: CalendarLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: CalendarLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Date date;
            Object serializableExtra;
            Object serializableExtra2;
            Intent intent = ((C47918a) obj).f437157c;
            Date date2 = null;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra2 = intent.getSerializableExtra("check_in_date", Date.class);
                } else {
                    Object serializableExtra3 = intent.getSerializableExtra("check_in_date");
                    if (!(serializableExtra3 instanceof Date)) {
                        serializableExtra3 = null;
                    }
                    serializableExtra2 = (Date) serializableExtra3;
                }
                date = (Date) serializableExtra2;
            } else {
                date = null;
            }
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = intent.getSerializableExtra("check_out_date", Date.class);
                } else {
                    Object serializableExtra4 = intent.getSerializableExtra("check_out_date");
                    serializableExtra = (Date) (serializableExtra4 instanceof Date ? serializableExtra4 : null);
                }
                date2 = (Date) serializableExtra;
            }
            a.this.j((date == null || date2 == null) ? date != null ? new CalendarLink.b.a(date) : date2 != null ? new CalendarLink.b.a(date2) : CalendarLink.b.c.f133082b : new CalendarLink.b.C3988b(date, date2));
        }
    }

    static {
        new C8586a(null);
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k StrBookingIntentFactory strBookingIntentFactory) {
        this.f286624f = strBookingIntentFactory;
        this.f286625g = bVar;
        this.f286626h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CalendarLink.CalendarData calendarData = ((CalendarLink) deepLink).f133077b;
        String itemId = calendarData.getItemId();
        Date from = calendarData.getFrom();
        Date to2 = calendarData.getTo();
        String title = calendarData.getTitle();
        StrBookingIntentFactory strBookingIntentFactory = this.f286624f;
        this.f286626h.J(itemId != null ? strBookingIntentFactory.d(from, to2, itemId, title) : strBookingIntentFactory.b(title, from, to2), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f286627i.b(this.f286625g.Q().N(new b()).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f286627i.e();
    }
}
