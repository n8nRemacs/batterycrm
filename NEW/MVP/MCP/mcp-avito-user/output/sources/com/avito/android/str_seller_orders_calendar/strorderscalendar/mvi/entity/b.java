package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.analytics.screens.mvi.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f291075e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final b f291076f = new b(null, null, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ArrayList f291077b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f291078c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f291079d;

    /* compiled from: StrOrdersCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/b$a;", "", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@l ArrayList arrayList, @l ArrayList arrayList2, @l ArrayList arrayList3) {
        this.f291077b = arrayList;
        this.f291078c = arrayList2;
        this.f291079d = arrayList3;
        setPerfTrackerParams(new r("calendar_recyclers", J.b.f90385a));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f291077b, bVar.f291077b) && L.f(this.f291078c, bVar.f291078c) && L.f(this.f291079d, bVar.f291079d);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f291077b;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList arrayList2 = this.f291078c;
        int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList arrayList3 = this.f291079d;
        return iHashCode2 + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecyclersViewState(mainItems=");
        sb2.append(this.f291077b);
        sb2.append(", flatInfoItems=");
        sb2.append(this.f291078c);
        sb2.append(", datesItems=");
        return e.p(sb2, this.f291079d, ')');
    }
}
