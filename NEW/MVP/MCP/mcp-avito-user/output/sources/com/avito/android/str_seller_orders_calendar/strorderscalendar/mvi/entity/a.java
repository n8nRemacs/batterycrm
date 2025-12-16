package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.q;
import j.InterfaceC42150f;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/a$b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/a$c;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C8806a f291065b = new C8806a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f291066c = new b(null, null, false, false, null);

    /* compiled from: StrOrdersCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/a$a;", "", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a$a, reason: collision with other inner class name */
    public static final class C8806a {
        public /* synthetic */ C8806a(C42822w c42822w) {
            this();
        }

        public C8806a() {
        }
    }

    /* compiled from: StrOrdersCalendarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/a$b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/a;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f291067d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f291068e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f291069f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f291070g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final BF0.a f291071h;

        public b(@l String str, @l String str2, boolean z12, boolean z13, @l BF0.a aVar) {
            super(null);
            this.f291067d = str;
            this.f291068e = str2;
            this.f291069f = z12;
            this.f291070g = z13;
            this.f291071h = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f291067d, bVar.f291067d) && L.f(this.f291068e, bVar.f291068e) && this.f291069f == bVar.f291069f && this.f291070g == bVar.f291070g && L.f(this.f291071h, bVar.f291071h);
        }

        public final int hashCode() {
            String str = this.f291067d;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f291068e;
            int i12 = r.i(r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f291069f), 31, this.f291070g);
            BF0.a aVar = this.f291071h;
            return i12 + (aVar != null ? aVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Content(currentFrameDateText=" + this.f291067d + ", shortCurrentFrameDateText=" + this.f291068e + ", shouldShowTodayButton=" + this.f291069f + ", isFlatInfoCollapsed=" + this.f291070g + ", banner=" + this.f291071h + ')';
        }
    }

    /* compiled from: StrOrdersCalendarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/a$c;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/a;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: d, reason: collision with root package name */
        public final int f291072d;

        /* renamed from: e, reason: collision with root package name */
        public final int f291073e;

        /* renamed from: f, reason: collision with root package name */
        public final int f291074f;

        public c(@InterfaceC42150f int i12, @e0 int i13, @e0 int i14) {
            super(null);
            this.f291072d = i12;
            this.f291073e = i13;
            this.f291074f = i14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f291072d == cVar.f291072d && this.f291073e == cVar.f291073e && this.f291074f == cVar.f291074f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f291074f) + r.e(this.f291073e, Integer.hashCode(this.f291072d) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(image=");
            sb2.append(this.f291072d);
            sb2.append(", title=");
            sb2.append(this.f291073e);
            sb2.append(", subtitle=");
            return r.t(sb2, this.f291074f, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
        setPerfTrackerParams(new com.avito.android.analytics.screens.mvi.r("calendar_core", J.b.f90385a));
    }
}
