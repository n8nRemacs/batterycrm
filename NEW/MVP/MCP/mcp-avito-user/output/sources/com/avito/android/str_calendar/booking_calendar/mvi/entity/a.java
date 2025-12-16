package com.avito.android.str_calendar.booking_calendar.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalendarState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a$b;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a$c;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a$d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C8580a f286445d = new C8580a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final d f286446e = new d(null, new StrBookingCalendarScreenConfig.Default(false, false, 3, null));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f286447b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final StrBookingCalendarScreenConfig f286448c;

    /* compiled from: StrBookingCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a$a;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.entity.a$a, reason: collision with other inner class name */
    public static final class C8580a {
        public /* synthetic */ C8580a(C42822w c42822w) {
            this();
        }

        public C8580a() {
        }
    }

    /* compiled from: StrBookingCalendarState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a$b;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: f, reason: collision with root package name */
        @l
        public final PrintableText f286449f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final StrBookingCalendarScreenConfig f286450g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final Object f286451h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f286452i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f286453j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final PrintableText f286454k;

        public b(@l PrintableText printableText, @k StrBookingCalendarScreenConfig strBookingCalendarScreenConfig, @k List<? extends TV0.a> list, boolean z12, boolean z13, @k PrintableText printableText2) {
            super(printableText, strBookingCalendarScreenConfig, null);
            this.f286449f = printableText;
            this.f286450g = strBookingCalendarScreenConfig;
            this.f286451h = list;
            this.f286452i = z12;
            this.f286453j = z13;
            this.f286454k = printableText2;
        }

        @Override // com.avito.android.str_calendar.booking_calendar.mvi.entity.a
        @k
        /* renamed from: c, reason: from getter */
        public final StrBookingCalendarScreenConfig getF286448c() {
            return this.f286450g;
        }

        @Override // com.avito.android.str_calendar.booking_calendar.mvi.entity.a
        @l
        /* renamed from: d, reason: from getter */
        public final PrintableText getF286447b() {
            return this.f286449f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f286449f, bVar.f286449f) && L.f(this.f286450g, bVar.f286450g) && L.f(this.f286451h, bVar.f286451h) && this.f286452i == bVar.f286452i && this.f286453j == bVar.f286453j && L.f(this.f286454k, bVar.f286454k);
        }

        public final int hashCode() {
            PrintableText printableText = this.f286449f;
            return this.f286454k.hashCode() + r.i(r.i(C23088b.a((this.f286450g.hashCode() + ((printableText == null ? 0 : printableText.hashCode()) * 31)) * 31, 31, this.f286451h), 31, this.f286452i), 31, this.f286453j);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(toolbarTitle=");
            sb2.append(this.f286449f);
            sb2.append(", screenConfig=");
            sb2.append(this.f286450g);
            sb2.append(", items=");
            sb2.append(this.f286451h);
            sb2.append(", isClearButtonShown=");
            sb2.append(this.f286452i);
            sb2.append(", isSelectButtonAvailable=");
            sb2.append(this.f286453j);
            sb2.append(", selectButtonTitle=");
            return AK.c.m(sb2, this.f286454k, ')');
        }
    }

    /* compiled from: StrBookingCalendarState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a$c;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: f, reason: collision with root package name */
        @l
        public final PrintableText f286455f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final StrBookingCalendarScreenConfig f286456g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final PrintableText f286457h;

        public c(@l PrintableText printableText, @k StrBookingCalendarScreenConfig strBookingCalendarScreenConfig, @k PrintableText printableText2) {
            super(printableText, strBookingCalendarScreenConfig, null);
            this.f286455f = printableText;
            this.f286456g = strBookingCalendarScreenConfig;
            this.f286457h = printableText2;
        }

        @Override // com.avito.android.str_calendar.booking_calendar.mvi.entity.a
        @k
        /* renamed from: c, reason: from getter */
        public final StrBookingCalendarScreenConfig getF286448c() {
            return this.f286456g;
        }

        @Override // com.avito.android.str_calendar.booking_calendar.mvi.entity.a
        @l
        /* renamed from: d, reason: from getter */
        public final PrintableText getF286447b() {
            return this.f286455f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f286455f, cVar.f286455f) && L.f(this.f286456g, cVar.f286456g) && L.f(this.f286457h, cVar.f286457h);
        }

        public final int hashCode() {
            PrintableText printableText = this.f286455f;
            return this.f286457h.hashCode() + ((this.f286456g.hashCode() + ((printableText == null ? 0 : printableText.hashCode()) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(toolbarTitle=");
            sb2.append(this.f286455f);
            sb2.append(", screenConfig=");
            sb2.append(this.f286456g);
            sb2.append(", errorMessage=");
            return AK.c.m(sb2, this.f286457h, ')');
        }
    }

    /* compiled from: StrBookingCalendarState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a$d;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: f, reason: collision with root package name */
        @l
        public final PrintableText f286458f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final StrBookingCalendarScreenConfig f286459g;

        public d(@l PrintableText printableText, @k StrBookingCalendarScreenConfig strBookingCalendarScreenConfig) {
            super(printableText, strBookingCalendarScreenConfig, null);
            this.f286458f = printableText;
            this.f286459g = strBookingCalendarScreenConfig;
        }

        @Override // com.avito.android.str_calendar.booking_calendar.mvi.entity.a
        @k
        /* renamed from: c, reason: from getter */
        public final StrBookingCalendarScreenConfig getF286448c() {
            return this.f286459g;
        }

        @Override // com.avito.android.str_calendar.booking_calendar.mvi.entity.a
        @l
        /* renamed from: d, reason: from getter */
        public final PrintableText getF286447b() {
            return this.f286458f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f286458f, dVar.f286458f) && L.f(this.f286459g, dVar.f286459g);
        }

        public final int hashCode() {
            PrintableText printableText = this.f286458f;
            return this.f286459g.hashCode() + ((printableText == null ? 0 : printableText.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "Loading(toolbarTitle=" + this.f286458f + ", screenConfig=" + this.f286459g + ')';
        }
    }

    public a(PrintableText printableText, StrBookingCalendarScreenConfig strBookingCalendarScreenConfig, C42822w c42822w) {
        this.f286447b = printableText;
        this.f286448c = strBookingCalendarScreenConfig;
    }

    @k
    /* renamed from: c, reason: from getter */
    public StrBookingCalendarScreenConfig getF286448c() {
        return this.f286448c;
    }

    @l
    /* renamed from: d, reason: from getter */
    public PrintableText getF286447b() {
        return this.f286447b;
    }
}
