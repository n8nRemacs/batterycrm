package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChartDynamicItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "a", "b", "c", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f220917b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f220918c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f220919d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f220920e;

    /* compiled from: ChartDynamicItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$a;", "", "a", "b", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$a$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$a$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ChartDynamicItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$a$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C6673a implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final V80.e f220921a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Y41.l<DeepLink, G0> f220922b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Y41.l<DeepLink, G0> f220923c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final Y41.l<DeepLink, G0> f220924d;

            /* JADX WARN: Multi-variable type inference failed */
            public C6673a(@l V80.e eVar, @k Y41.l<? super DeepLink, G0> lVar, @k Y41.l<? super DeepLink, G0> lVar2, @k Y41.l<? super DeepLink, G0> lVar3) {
                this.f220921a = eVar;
                this.f220922b = lVar;
                this.f220923c = lVar2;
                this.f220924d = lVar3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6673a)) {
                    return false;
                }
                C6673a c6673a = (C6673a) obj;
                return L.f(this.f220921a, c6673a.f220921a) && L.f(this.f220922b, c6673a.f220922b) && L.f(this.f220923c, c6673a.f220923c) && L.f(this.f220924d, c6673a.f220924d);
            }

            public final int hashCode() {
                V80.e eVar = this.f220921a;
                return this.f220924d.hashCode() + ((this.f220923c.hashCode() + ((this.f220922b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31)) * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(chart=");
                sb2.append(this.f220921a);
                sb2.append(", onLineHintClick=");
                sb2.append(this.f220922b);
                sb2.append(", onPromoClick=");
                sb2.append(this.f220923c);
                sb2.append(", onChartScroll=");
                return H.l(sb2, this.f220924d, ')');
            }
        }

        /* compiled from: ChartDynamicItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$a$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f220925a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -891125509;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: ChartDynamicItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f220926a;

        public b(@k ArrayList arrayList) {
            this.f220926a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f220926a.equals(((b) obj).f220926a);
        }

        public final int hashCode() {
            return this.f220926a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Payload(changes="), this.f220926a, ')');
        }
    }

    /* compiled from: ChartDynamicItem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$c;", "", "a", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$c$a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.c$c, reason: collision with other inner class name */
    public interface InterfaceC6674c {

        /* compiled from: ChartDynamicItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$c$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c$c;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.c$c$a */
        public static final /* data */ class a implements InterfaceC6674c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f220927a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 240738978;
            }

            @k
            public final String toString() {
                return "Data";
            }
        }
    }

    public c(@k String str, @l String str2, @l AttributedText attributedText, @k a aVar) {
        this.f220917b = str;
        this.f220918c = str2;
        this.f220919d = attributedText;
        this.f220920e = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f220917b, cVar.f220917b) && L.f(this.f220918c, cVar.f220918c) && L.f(this.f220919d, cVar.f220919d) && L.f(this.f220920e, cVar.f220920e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF128558g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF156404b() {
        return this.f220917b;
    }

    public final int hashCode() {
        int iHashCode = this.f220917b.hashCode() * 31;
        String str = this.f220918c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f220919d;
        return this.f220920e.hashCode() + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ChartDynamicItem(stringId=" + this.f220917b + ", title=" + this.f220918c + ", description=" + this.f220919d + ", data=" + this.f220920e + ')';
    }
}
