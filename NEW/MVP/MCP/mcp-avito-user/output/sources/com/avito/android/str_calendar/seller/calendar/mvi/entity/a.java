package com.avito.android.str_calendar.seller.calendar.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a;", "", "a", "b", "c", "d", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a$b;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a$c;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a$d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C8640a f287731b = new C8640a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final d f287732c = new d(com.avito.android.printable_text.b.a());

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f287733a;

    /* compiled from: StrSellerCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a$a;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_calendar.seller.calendar.mvi.entity.a$a, reason: collision with other inner class name */
    public static final class C8640a {
        public /* synthetic */ C8640a(C42822w c42822w) {
            this();
        }

        public C8640a() {
        }
    }

    /* compiled from: StrSellerCalendarState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a$b;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f287734d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<TV0.a> f287735e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final PrintableText f287736f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f287737g;

        public b(@k PrintableText printableText, @k PrintableText printableText2, @k List list, boolean z12) {
            super(printableText, null);
            this.f287734d = printableText;
            this.f287735e = list;
            this.f287736f = printableText2;
            this.f287737g = z12;
        }

        @Override // com.avito.android.str_calendar.seller.calendar.mvi.entity.a
        @k
        /* renamed from: a, reason: from getter */
        public final PrintableText getF287733a() {
            return this.f287734d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f287734d, bVar.f287734d) && L.f(this.f287735e, bVar.f287735e) && L.f(this.f287736f, bVar.f287736f) && this.f287737g == bVar.f287737g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f287737g) + com.avito.android.actions_sheet.a.f(this.f287736f, H.e(this.f287734d.hashCode() * 31, 31, this.f287735e), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f287734d);
            sb2.append(", items=");
            sb2.append(this.f287735e);
            sb2.append(", editParamsButtonText=");
            sb2.append(this.f287736f);
            sb2.append(", isClearButtonVisible=");
            return r.x(sb2, this.f287737g, ')');
        }
    }

    /* compiled from: StrSellerCalendarState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a$c;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f287738d;

        public c(@k PrintableText printableText) {
            super(printableText, null);
            this.f287738d = printableText;
        }

        @Override // com.avito.android.str_calendar.seller.calendar.mvi.entity.a
        @k
        /* renamed from: a, reason: from getter */
        public final PrintableText getF287733a() {
            return this.f287738d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f287738d, ((c) obj).f287738d);
        }

        public final int hashCode() {
            return this.f287738d.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Error(title="), this.f287738d, ')');
        }
    }

    /* compiled from: StrSellerCalendarState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a$d;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f287739d;

        public d(@k PrintableText printableText) {
            super(printableText, null);
            this.f287739d = printableText;
        }

        @Override // com.avito.android.str_calendar.seller.calendar.mvi.entity.a
        @k
        /* renamed from: a, reason: from getter */
        public final PrintableText getF287733a() {
            return this.f287739d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f287739d, ((d) obj).f287739d);
        }

        public final int hashCode() {
            return this.f287739d.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Loading(title="), this.f287739d, ')');
        }
    }

    public a(PrintableText printableText, C42822w c42822w) {
        this.f287733a = printableText;
    }

    @k
    /* renamed from: a, reason: from getter */
    public PrintableText getF287733a() {
        return this.f287733a;
    }
}
