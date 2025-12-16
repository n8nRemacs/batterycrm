package com.avito.android.widget_filters.mvi.entity;

import NP0.g;
import NP0.i;
import NP0.j;
import NP0.m;
import NP0.s;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.common.C23088b;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/d;", "", "a", "b", "c", "d", "Lcom/avito/android/widget_filters/mvi/entity/d$a;", "Lcom/avito/android/widget_filters/mvi/entity/d$b;", "Lcom/avito/android/widget_filters/mvi/entity/d$c;", "Lcom/avito/android/widget_filters/mvi/entity/d$d;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final com.avito.android.widget_filters.ui.items.c f330111a;

    /* renamed from: b, reason: collision with root package name */
    public final int f330112b;

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/d$a;", "Lcom/avito/android/widget_filters/mvi/entity/d;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f330113c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f330114d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final com.avito.android.widget_filters.ui.items.category.a f330115e;

        /* renamed from: f, reason: collision with root package name */
        public final int f330116f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f330117g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f330118h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final NP0.d f330119i;

        public a(@l String str, @l String str2, @l com.avito.android.widget_filters.ui.items.category.a aVar, int i12, boolean z12, boolean z13, @l NP0.d dVar) {
            super(str, str2, aVar, i12, z12, z13, null);
            this.f330113c = str;
            this.f330114d = str2;
            this.f330115e = aVar;
            this.f330116f = i12;
            this.f330117g = z12;
            this.f330118h = z13;
            this.f330119i = dVar;
        }

        public static a b(a aVar, com.avito.android.widget_filters.ui.items.category.a aVar2, boolean z12, NP0.d dVar, int i12) {
            String str = aVar.f330113c;
            String str2 = aVar.f330114d;
            if ((i12 & 4) != 0) {
                aVar2 = aVar.f330115e;
            }
            com.avito.android.widget_filters.ui.items.category.a aVar3 = aVar2;
            int i13 = aVar.f330116f;
            if ((i12 & 16) != 0) {
                z12 = aVar.f330117g;
            }
            boolean z13 = z12;
            boolean z14 = aVar.f330118h;
            if ((i12 & 64) != 0) {
                dVar = aVar.f330119i;
            }
            aVar.getClass();
            return new a(str, str2, aVar3, i13, z13, z14, dVar);
        }

        @Override // com.avito.android.widget_filters.mvi.entity.d
        /* renamed from: a, reason: from getter */
        public final int getF330112b() {
            return this.f330116f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f330113c, aVar.f330113c) && L.f(this.f330114d, aVar.f330114d) && L.f(this.f330115e, aVar.f330115e) && this.f330116f == aVar.f330116f && this.f330117g == aVar.f330117g && this.f330118h == aVar.f330118h && L.f(this.f330119i, aVar.f330119i);
        }

        public final int hashCode() {
            String str = this.f330113c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f330114d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            com.avito.android.widget_filters.ui.items.category.a aVar = this.f330115e;
            int i12 = r.i(r.i(r.e(this.f330116f, (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.f330117g), 31, this.f330118h);
            NP0.d dVar = this.f330119i;
            return i12 + (dVar != null ? dVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "CategoryWidgetState(widgetId=" + this.f330113c + ", title=" + this.f330114d + ", placeholder=" + this.f330115e + ", position=" + this.f330116f + ", isExpanded=" + this.f330117g + ", isNew=" + this.f330118h + ", categoryParameter=" + this.f330119i + ')';
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/d$b;", "Lcom/avito/android/widget_filters/mvi/entity/d;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f330120c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f330121d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final com.avito.android.widget_filters.ui.items.dates.a f330122e;

        /* renamed from: f, reason: collision with root package name */
        public final int f330123f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f330124g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f330125h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Date f330126i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final g f330127j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final i f330128k;

        public b(@l String str, @l String str2, @l com.avito.android.widget_filters.ui.items.dates.a aVar, int i12, boolean z12, boolean z13, @l Date date, @l g gVar, @l i iVar) {
            super(str, str2, aVar, i12, z12, z13, null);
            this.f330120c = str;
            this.f330121d = str2;
            this.f330122e = aVar;
            this.f330123f = i12;
            this.f330124g = z12;
            this.f330125h = z13;
            this.f330126i = date;
            this.f330127j = gVar;
            this.f330128k = iVar;
        }

        public static b b(b bVar, com.avito.android.widget_filters.ui.items.dates.a aVar, boolean z12, g gVar, i iVar, int i12) {
            String str = bVar.f330120c;
            String str2 = bVar.f330121d;
            if ((i12 & 4) != 0) {
                aVar = bVar.f330122e;
            }
            com.avito.android.widget_filters.ui.items.dates.a aVar2 = aVar;
            int i13 = bVar.f330123f;
            if ((i12 & 16) != 0) {
                z12 = bVar.f330124g;
            }
            boolean z13 = z12;
            boolean z14 = bVar.f330125h;
            Date date = bVar.f330126i;
            if ((i12 & 128) != 0) {
                gVar = bVar.f330127j;
            }
            g gVar2 = gVar;
            if ((i12 & 256) != 0) {
                iVar = bVar.f330128k;
            }
            bVar.getClass();
            return new b(str, str2, aVar2, i13, z13, z14, date, gVar2, iVar);
        }

        @Override // com.avito.android.widget_filters.mvi.entity.d
        /* renamed from: a, reason: from getter */
        public final int getF330112b() {
            return this.f330123f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f330120c, bVar.f330120c) && L.f(this.f330121d, bVar.f330121d) && L.f(this.f330122e, bVar.f330122e) && this.f330123f == bVar.f330123f && this.f330124g == bVar.f330124g && this.f330125h == bVar.f330125h && L.f(this.f330126i, bVar.f330126i) && L.f(this.f330127j, bVar.f330127j) && L.f(this.f330128k, bVar.f330128k);
        }

        public final int hashCode() {
            String str = this.f330120c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f330121d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            com.avito.android.widget_filters.ui.items.dates.a aVar = this.f330122e;
            int i12 = r.i(r.i(r.e(this.f330123f, (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.f330124g), 31, this.f330125h);
            Date date = this.f330126i;
            int iHashCode3 = (i12 + (date == null ? 0 : date.hashCode())) * 31;
            g gVar = this.f330127j;
            int iHashCode4 = (iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            i iVar = this.f330128k;
            return iHashCode4 + (iVar != null ? iVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "DatesWidgetState(widgetId=" + this.f330120c + ", title=" + this.f330121d + ", placeholder=" + this.f330122e + ", position=" + this.f330123f + ", isExpanded=" + this.f330124g + ", isNew=" + this.f330125h + ", todayDate=" + this.f330126i + ", datesRangeParameter=" + this.f330127j + ", flexSearchParameter=" + this.f330128k + ')';
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/d$c;", "Lcom/avito/android/widget_filters/mvi/entity/d;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f330129c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f330130d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final com.avito.android.widget_filters.ui.items.guests.a f330131e;

        /* renamed from: f, reason: collision with root package name */
        public final int f330132f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f330133g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f330134h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final j f330135i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final NP0.b f330136j;

        public c(@l String str, @l String str2, @l com.avito.android.widget_filters.ui.items.guests.a aVar, int i12, boolean z12, boolean z13, @l j jVar, @l NP0.b bVar) {
            super(str, str2, aVar, i12, z12, z13, null);
            this.f330129c = str;
            this.f330130d = str2;
            this.f330131e = aVar;
            this.f330132f = i12;
            this.f330133g = z12;
            this.f330134h = z13;
            this.f330135i = jVar;
            this.f330136j = bVar;
        }

        public static c b(c cVar, com.avito.android.widget_filters.ui.items.guests.a aVar, boolean z12, j jVar, NP0.b bVar, int i12) {
            String str = cVar.f330129c;
            String str2 = cVar.f330130d;
            if ((i12 & 4) != 0) {
                aVar = cVar.f330131e;
            }
            com.avito.android.widget_filters.ui.items.guests.a aVar2 = aVar;
            int i13 = cVar.f330132f;
            if ((i12 & 16) != 0) {
                z12 = cVar.f330133g;
            }
            boolean z13 = z12;
            boolean z14 = cVar.f330134h;
            if ((i12 & 64) != 0) {
                jVar = cVar.f330135i;
            }
            j jVar2 = jVar;
            if ((i12 & 128) != 0) {
                bVar = cVar.f330136j;
            }
            cVar.getClass();
            return new c(str, str2, aVar2, i13, z13, z14, jVar2, bVar);
        }

        @Override // com.avito.android.widget_filters.mvi.entity.d
        /* renamed from: a, reason: from getter */
        public final int getF330112b() {
            return this.f330132f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f330129c, cVar.f330129c) && L.f(this.f330130d, cVar.f330130d) && L.f(this.f330131e, cVar.f330131e) && this.f330132f == cVar.f330132f && this.f330133g == cVar.f330133g && this.f330134h == cVar.f330134h && L.f(this.f330135i, cVar.f330135i) && L.f(this.f330136j, cVar.f330136j);
        }

        public final int hashCode() {
            String str = this.f330129c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f330130d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            com.avito.android.widget_filters.ui.items.guests.a aVar = this.f330131e;
            int i12 = r.i(r.i(r.e(this.f330132f, (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.f330133g), 31, this.f330134h);
            j jVar = this.f330135i;
            int iHashCode3 = (i12 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            NP0.b bVar = this.f330136j;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "GuestsWidgetState(widgetId=" + this.f330129c + ", title=" + this.f330130d + ", placeholder=" + this.f330131e + ", position=" + this.f330132f + ", isExpanded=" + this.f330133g + ", isNew=" + this.f330134h + ", guestsParameter=" + this.f330135i + ", animalsParameter=" + this.f330136j + ')';
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/d$d;", "Lcom/avito/android/widget_filters/mvi/entity/d;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.widget_filters.mvi.entity.d$d, reason: collision with other inner class name */
    public static final /* data */ class C10254d extends d {

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f330137c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f330138d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final com.avito.android.widget_filters.ui.items.location.a f330139e;

        /* renamed from: f, reason: collision with root package name */
        public final int f330140f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f330141g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f330142h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final Object f330143i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f330144j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final s f330145k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final m f330146l;

        public C10254d(@l String str, @l String str2, @l com.avito.android.widget_filters.ui.items.location.a aVar, int i12, boolean z12, boolean z13, @k List list, boolean z14, @l s sVar, @l m mVar) {
            super(str, str2, aVar, i12, z12, z13, null);
            this.f330137c = str;
            this.f330138d = str2;
            this.f330139e = aVar;
            this.f330140f = i12;
            this.f330141g = z12;
            this.f330142h = z13;
            this.f330143i = list;
            this.f330144j = z14;
            this.f330145k = sVar;
            this.f330146l = mVar;
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
        public static C10254d b(C10254d c10254d, com.avito.android.widget_filters.ui.items.location.a aVar, boolean z12, m mVar, int i12) {
            String str = c10254d.f330137c;
            String str2 = c10254d.f330138d;
            if ((i12 & 4) != 0) {
                aVar = c10254d.f330139e;
            }
            com.avito.android.widget_filters.ui.items.location.a aVar2 = aVar;
            int i13 = c10254d.f330140f;
            if ((i12 & 16) != 0) {
                z12 = c10254d.f330141g;
            }
            boolean z13 = z12;
            boolean z14 = c10254d.f330142h;
            ?? r72 = c10254d.f330143i;
            boolean z15 = c10254d.f330144j;
            s sVar = c10254d.f330145k;
            if ((i12 & 512) != 0) {
                mVar = c10254d.f330146l;
            }
            c10254d.getClass();
            return new C10254d(str, str2, aVar2, i13, z13, z14, r72, z15, sVar, mVar);
        }

        @Override // com.avito.android.widget_filters.mvi.entity.d
        /* renamed from: a, reason: from getter */
        public final int getF330112b() {
            return this.f330140f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10254d)) {
                return false;
            }
            C10254d c10254d = (C10254d) obj;
            return L.f(this.f330137c, c10254d.f330137c) && L.f(this.f330138d, c10254d.f330138d) && L.f(this.f330139e, c10254d.f330139e) && this.f330140f == c10254d.f330140f && this.f330141g == c10254d.f330141g && this.f330142h == c10254d.f330142h && L.f(this.f330143i, c10254d.f330143i) && this.f330144j == c10254d.f330144j && L.f(this.f330145k, c10254d.f330145k) && L.f(this.f330146l, c10254d.f330146l);
        }

        public final int hashCode() {
            String str = this.f330137c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f330138d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            com.avito.android.widget_filters.ui.items.location.a aVar = this.f330139e;
            int i12 = r.i(C23088b.a(r.i(r.i(r.e(this.f330140f, (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.f330141g), 31, this.f330142h), 31, this.f330143i), 31, this.f330144j);
            s sVar = this.f330145k;
            int iHashCode3 = (i12 + (sVar == null ? 0 : sVar.hashCode())) * 31;
            m mVar = this.f330146l;
            return iHashCode3 + (mVar != null ? mVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "LocationWidgetState(widgetId=" + this.f330137c + ", title=" + this.f330138d + ", placeholder=" + this.f330139e + ", position=" + this.f330140f + ", isExpanded=" + this.f330141g + ", isNew=" + this.f330142h + ", recentSearches=" + this.f330143i + ", showFastRecentSearches=" + this.f330144j + ", fastRecentSearchesOnboarding=" + this.f330145k + ", locationParameter=" + this.f330146l + ')';
        }
    }

    public d(String str, String str2, com.avito.android.widget_filters.ui.items.c cVar, int i12, boolean z12, boolean z13, C42822w c42822w) {
        this.f330111a = cVar;
        this.f330112b = i12;
    }

    /* renamed from: a, reason: from getter */
    public int getF330112b() {
        return this.f330112b;
    }
}
