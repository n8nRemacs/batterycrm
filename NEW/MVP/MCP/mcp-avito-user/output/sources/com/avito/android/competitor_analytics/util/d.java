package com.avito.android.competitor_analytics.util;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FullChartData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/competitor_analytics/util/d;", "", "a", "b", "c", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f124911a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f124912b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f124913c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f124914d;

    /* compiled from: FullChartData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/util/d$a;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f124915a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f124916b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f124917c;

        public a(@k String str, @l String str2, @l String str3) {
            this.f124915a = str;
            this.f124916b = str2;
            this.f124917c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f124915a, aVar.f124915a) && L.f(this.f124916b, aVar.f124916b) && L.f(this.f124917c, aVar.f124917c);
        }

        public final int hashCode() {
            int iHashCode = this.f124915a.hashCode() * 31;
            String str = this.f124916b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f124917c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TooltipItem(dateFormat=");
            sb2.append(this.f124915a);
            sb2.append(", currentFormat=");
            sb2.append(this.f124916b);
            sb2.append(", micromarketFormat=");
            return C22026a.c(sb2, this.f124917c, ')');
        }
    }

    /* compiled from: FullChartData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/util/d$b;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f124918a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f124919b;

        public b(@k String str, boolean z12) {
            this.f124918a = str;
            this.f124919b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f124918a, bVar.f124918a) && this.f124919b == bVar.f124919b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f124919b) + (this.f124918a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("XDayItem(dayFormat=");
            sb2.append(this.f124918a);
            sb2.append(", isEnable=");
            return r.x(sb2, this.f124919b, ')');
        }
    }

    /* compiled from: FullChartData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/util/d$c;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final float f124920a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f124921b;

        public c(float f12, @k String str) {
            this.f124920a = f12;
            this.f124921b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f124920a, cVar.f124920a) == 0 && L.f(this.f124921b, cVar.f124921b);
        }

        public final int hashCode() {
            return this.f124921b.hashCode() + (Float.hashCode(this.f124920a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("YValuesItem(value=");
            sb2.append(this.f124920a);
            sb2.append(", valueFormat=");
            return C22026a.c(sb2, this.f124921b, ')');
        }
    }

    public d(float f12, @k ArrayList arrayList, @k ArrayList arrayList2, @k ArrayList arrayList3) {
        this.f124911a = f12;
        this.f124912b = arrayList;
        this.f124913c = arrayList2;
        this.f124914d = arrayList3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f124911a, dVar.f124911a) == 0 && this.f124912b.equals(dVar.f124912b) && this.f124913c.equals(dVar.f124913c) && this.f124914d.equals(dVar.f124914d);
    }

    public final int hashCode() {
        return this.f124914d.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f124913c, androidx.compose.ui.graphics.colorspace.e.g(this.f124912b, Float.hashCode(this.f124911a) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FullChartData(maxYValue=");
        sb2.append(this.f124911a);
        sb2.append(", xDays=");
        sb2.append(this.f124912b);
        sb2.append(", yValues=");
        sb2.append(this.f124913c);
        sb2.append(", tooltipValues=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f124914d, ')');
    }
}
