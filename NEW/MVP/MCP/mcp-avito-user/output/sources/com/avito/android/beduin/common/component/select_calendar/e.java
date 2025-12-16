package com.avito.android.beduin.common.component.select_calendar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.calendar_select.CalendarSelectionType;
import i.AbstractC41201a;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarActivityContract.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/e;", "Li/a;", "Lcom/avito/android/beduin/common/component/select_calendar/e$a;", "Lcom/avito/android/beduin/common/component/select_calendar/e$b;", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends AbstractC41201a<a, b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.calendar_select.b f102448b;

    /* compiled from: CalendarActivityContract.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/e$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f102449a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f102450b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<String> f102451c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f102452d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<String> f102453e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f102454f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f102455g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final CalendarSelectionType f102456h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f102457i;

        public a(@l String str, @l String str2, @k List list, @l String str3, @k List list2, @l String str4, @l String str5, @k CalendarSelectionType calendarSelectionType, boolean z12) {
            this.f102449a = str;
            this.f102450b = str2;
            this.f102451c = list;
            this.f102452d = str3;
            this.f102453e = list2;
            this.f102454f = str4;
            this.f102455g = str5;
            this.f102456h = calendarSelectionType;
            this.f102457i = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f102449a, aVar.f102449a) && L.f(this.f102450b, aVar.f102450b) && L.f(this.f102451c, aVar.f102451c) && L.f(this.f102452d, aVar.f102452d) && L.f(this.f102453e, aVar.f102453e) && L.f(this.f102454f, aVar.f102454f) && L.f(this.f102455g, aVar.f102455g) && this.f102456h == aVar.f102456h && this.f102457i == aVar.f102457i && L.f(null, null);
        }

        public final int hashCode() {
            String str = this.f102449a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f102450b;
            int iE2 = H.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f102451c);
            String str3 = this.f102452d;
            int iE3 = H.e((iE2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f102453e);
            String str4 = this.f102454f;
            int iHashCode2 = (iE3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f102455g;
            return r.i((this.f102456h.hashCode() + ((iHashCode2 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31, 31, this.f102457i);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Params(dateFrom=");
            sb2.append(this.f102449a);
            sb2.append(", dateTo=");
            sb2.append(this.f102450b);
            sb2.append(", selectedDates=");
            sb2.append(this.f102451c);
            sb2.append(", title=");
            sb2.append(this.f102452d);
            sb2.append(", blockedDates=");
            sb2.append(this.f102453e);
            sb2.append(", buttonTitle=");
            sb2.append(this.f102454f);
            sb2.append(", settingsPath=");
            sb2.append(this.f102455g);
            sb2.append(", selectionType=");
            sb2.append(this.f102456h);
            sb2.append(", isPastDayAllowed=");
            return r.s(", dateScrollTo=null)", sb2, this.f102457i);
        }
    }

    /* compiled from: CalendarActivityContract.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/e$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/beduin/common/component/select_calendar/e$b$a;", "Lcom/avito/android/beduin/common/component/select_calendar/e$b$b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CalendarActivityContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/e$b$a;", "Lcom/avito/android/beduin/common/component/select_calendar/e$b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f102458a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: CalendarActivityContract.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/e$b$b;", "Lcom/avito/android/beduin/common/component/select_calendar/e$b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.component.select_calendar.e$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3069b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<LocalDate> f102459a;

            public C3069b(@k List<LocalDate> list) {
                super(null);
                this.f102459a = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3069b) && L.f(this.f102459a, ((C3069b) obj).f102459a);
            }

            public final int hashCode() {
                return this.f102459a.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Success(data="), this.f102459a, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Inject
    public e(@k com.avito.android.calendar_select.b bVar) {
        this.f102448b = bVar;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, a aVar) {
        a aVar2 = aVar;
        return this.f102448b.a(context, aVar2.f102449a, aVar2.f102450b, aVar2.f102451c, aVar2.f102452d, aVar2.f102453e, aVar2.f102454f, aVar2.f102455g, aVar2.f102456h, aVar2.f102457i);
    }

    @Override // i.AbstractC41201a
    public final b parseResult(int i12, Intent intent) {
        List listG0;
        if (i12 != -1) {
            return b.a.f102458a;
        }
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("selectedDates") : null;
        LocalDate[] localDateArr = serializableExtra instanceof LocalDate[] ? (LocalDate[]) serializableExtra : null;
        if (localDateArr == null || (listG0 = C42756l.g0(localDateArr)) == null) {
            listG0 = C42784z0.f406748b;
        }
        return new b.C3069b(listG0);
    }
}
