package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PeriodItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "a", "b", "c", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f221033b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f221034c;

    /* renamed from: d, reason: collision with root package name */
    public final int f221035d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.l<String, G0> f221036e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f221037f;

    /* compiled from: PeriodItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6678a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f221038a;

        public C6678a(@k ArrayList arrayList) {
            this.f221038a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6678a) && this.f221038a.equals(((C6678a) obj).f221038a);
        }

        public final int hashCode() {
            return this.f221038a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Payload(changes="), this.f221038a, ')');
        }
    }

    /* compiled from: PeriodItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b;", "", "a", "b", "c", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b$c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PeriodItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C6679a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C6679a f221039a = new C6679a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C6679a);
            }

            public final int hashCode() {
                return 2112752805;
            }

            @k
            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: PeriodItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6680b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C6680b f221040a = new C6680b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C6680b);
            }

            public final int hashCode() {
                return 1591621295;
            }

            @k
            public final String toString() {
                return "Periods";
            }
        }

        /* compiled from: PeriodItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b$c;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f221041a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1933637796;
            }

            @k
            public final String toString() {
                return "PickedPeriod";
            }
        }
    }

    /* compiled from: PeriodItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a$c;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f221042a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f221043b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f221044c;

        public c(@k String str, boolean z12, @k String str2) {
            this.f221042a = str;
            this.f221043b = z12;
            this.f221044c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f221042a, cVar.f221042a) && this.f221043b == cVar.f221043b && L.f(this.f221044c, cVar.f221044c);
        }

        public final int hashCode() {
            return this.f221044c.hashCode() + r.i(this.f221042a.hashCode() * 31, 31, this.f221043b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Period(id=");
            sb2.append(this.f221042a);
            sb2.append(", isEnabled=");
            sb2.append(this.f221043b);
            sb2.append(", periodName=");
            return C22026a.c(sb2, this.f221044c, ')');
        }
    }

    public a(@k String str, @k ArrayList arrayList, int i12, @l Y41.l lVar) {
        this.f221033b = str;
        this.f221034c = arrayList;
        this.f221035d = i12;
        this.f221036e = lVar;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            arrayList2.add(new SegmentedControl.c(cVar.f221043b, cVar.f221044c));
        }
        this.f221037f = arrayList2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f221033b, aVar.f221033b) && this.f221034c.equals(aVar.f221034c) && this.f221035d == aVar.f221035d && this.f221036e.equals(aVar.f221036e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75092b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79045b() {
        return this.f221033b;
    }

    public final int hashCode() {
        return this.f221036e.hashCode() + r.e(this.f221035d, androidx.compose.ui.graphics.colorspace.e.g(this.f221034c, this.f221033b.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodItem(stringId=");
        sb2.append(this.f221033b);
        sb2.append(", periods=");
        sb2.append(this.f221034c);
        sb2.append(", pickedPeriodPosition=");
        sb2.append(this.f221035d);
        sb2.append(", onPeriodClicked=");
        return H.l(sb2, this.f221036e, ')');
    }
}
