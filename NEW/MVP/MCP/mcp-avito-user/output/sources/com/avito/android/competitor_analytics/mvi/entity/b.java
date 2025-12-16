package com.avito.android.competitor_analytics.mvi.entity;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.competitor_analytics.domain.model.ActionButton;
import com.avito.android.competitor_analytics.domain.model.ChartColor;
import com.avito.android.competitor_analytics.domain.model.ChartType;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.domain.model.SuggestsStatus;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: CompetitorAnalyticsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b extends q {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final C3712b f124469q = new C3712b(null);

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final b f124470r = new b(null, null, null, null, null, null, null, null, null, null, null, true, false, false, true);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f124471b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final d f124472c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final h.a f124473d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f124474e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final h f124475f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final i f124476g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final j f124477h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final e f124478i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final g f124479j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Throwable f124480k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Throwable f124481l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f124482m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f124483n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f124484o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f124485p;

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$a;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f124486a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f124487b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f124488c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f124489d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ActionButton f124490e;

        public a(long j12, boolean z12, @Y61.k String str, @Y61.k String str2, @Y61.k ActionButton actionButton) {
            this.f124486a = j12;
            this.f124487b = z12;
            this.f124488c = str;
            this.f124489d = str2;
            this.f124490e = actionButton;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f124486a == aVar.f124486a && this.f124487b == aVar.f124487b && L.f(this.f124488c, aVar.f124488c) && L.f(this.f124489d, aVar.f124489d) && L.f(this.f124490e, aVar.f124490e);
        }

        public final int hashCode() {
            return this.f124490e.hashCode() + H.d(H.d(r.i(Long.hashCode(this.f124486a) * 31, 31, this.f124487b), 31, this.f124488c), 31, this.f124489d);
        }

        @Y61.k
        public final String toString() {
            return "Banner(bannerId=" + this.f124486a + ", closable=" + this.f124487b + ", title=" + this.f124488c + ", description=" + this.f124489d + ", action=" + this.f124490e + ')';
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$b;", "", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.mvi.entity.b$b, reason: collision with other inner class name */
    public static final class C3712b {
        public /* synthetic */ C3712b(C42822w c42822w) {
            this();
        }

        public C3712b() {
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$c;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f124491a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f124492b;

        public c(@Y61.k String str, @Y61.k AttributedText attributedText) {
            this.f124491a = str;
            this.f124492b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f124491a, cVar.f124491a) && L.f(this.f124492b, cVar.f124492b);
        }

        public final int hashCode() {
            return this.f124492b.hashCode() + (this.f124491a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DetailsInfo(title=");
            sb2.append(this.f124491a);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f124492b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$d;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f124493a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f124494b;

        public d(@l String str, @Y61.k DeepLink deepLink) {
            this.f124493a = str;
            this.f124494b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f124493a, dVar.f124493a) && L.f(this.f124494b, dVar.f124494b);
        }

        public final int hashCode() {
            String str = this.f124493a;
            return this.f124494b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FaqHint(iconName=");
            sb2.append(this.f124493a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f124494b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$e;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Image f124495a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f124496b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f124497c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f124498d;

        public e(@Y61.k String str, @l Image image, @Y61.k ArrayList arrayList, @Y61.k String str2) {
            this.f124495a = image;
            this.f124496b = str;
            this.f124497c = str2;
            this.f124498d = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f124495a, eVar.f124495a) && L.f(this.f124496b, eVar.f124496b) && L.f(this.f124497c, eVar.f124497c) && this.f124498d.equals(eVar.f124498d);
        }

        public final int hashCode() {
            Image image = this.f124495a;
            return this.f124498d.hashCode() + H.d(H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f124496b), 31, this.f124497c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Footer(image=");
            sb2.append(this.f124495a);
            sb2.append(", price=");
            sb2.append(this.f124496b);
            sb2.append(", title=");
            sb2.append(this.f124497c);
            sb2.append(", actions=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f124498d, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$f;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f124499a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f124500b;

        public f(@Y61.k String str, @Y61.k ArrayList arrayList) {
            this.f124499a = str;
            this.f124500b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f124499a, fVar.f124499a) && this.f124500b.equals(fVar.f124500b);
        }

        public final int hashCode() {
            return this.f124500b.hashCode() + (this.f124499a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Metrics(title=");
            sb2.append(this.f124499a);
            sb2.append(", items=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f124500b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$g;", "", "a", "b", "c", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f124501a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final c f124502b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final a f124503c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final a f124504d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AttributedText f124505e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final ActionButton f124506f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final C3713b f124507g;

        /* compiled from: CompetitorAnalyticsState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$g$a;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f124508a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f124509b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final AttributedText f124510c;

            public a(@Y61.k String str, @Y61.k String str2, @l AttributedText attributedText) {
                this.f124508a = str;
                this.f124509b = str2;
                this.f124510c = attributedText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f124508a, aVar.f124508a) && L.f(this.f124509b, aVar.f124509b) && L.f(this.f124510c, aVar.f124510c);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f124508a.hashCode() * 31, 31, this.f124509b);
                AttributedText attributedText = this.f124510c;
                return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AnalyticalItem(title=");
                sb2.append(this.f124508a);
                sb2.append(", total=");
                sb2.append(this.f124509b);
                sb2.append(", diff=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f124510c, ')');
            }
        }

        /* compiled from: CompetitorAnalyticsState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$g$b;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.competitor_analytics.mvi.entity.b$g$b, reason: collision with other inner class name */
        public static final /* data */ class C3713b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ChartColor f124511a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ChartColor f124512b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f124513c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final Object f124514d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final String f124515e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final ChartType f124516f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final ArrayList f124517g;

            /* renamed from: h, reason: collision with root package name */
            @Y61.k
            public final ArrayList f124518h;

            /* renamed from: i, reason: collision with root package name */
            @Y61.k
            public final ArrayList f124519i;

            /* renamed from: j, reason: collision with root package name */
            public final float f124520j;

            public C3713b(@Y61.k ChartColor chartColor, @Y61.k ChartColor chartColor2, @Y61.k String str, @Y61.k Map map, @Y61.k String str2, @Y61.k ChartType chartType, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2, @Y61.k ArrayList arrayList3, float f12) {
                this.f124511a = chartColor;
                this.f124512b = chartColor2;
                this.f124513c = str;
                this.f124514d = map;
                this.f124515e = str2;
                this.f124516f = chartType;
                this.f124517g = arrayList;
                this.f124518h = arrayList2;
                this.f124519i = arrayList3;
                this.f124520j = f12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3713b)) {
                    return false;
                }
                C3713b c3713b = (C3713b) obj;
                return this.f124511a == c3713b.f124511a && this.f124512b == c3713b.f124512b && L.f(this.f124513c, c3713b.f124513c) && this.f124514d.equals(c3713b.f124514d) && L.f(this.f124515e, c3713b.f124515e) && this.f124516f == c3713b.f124516f && this.f124517g.equals(c3713b.f124517g) && this.f124518h.equals(c3713b.f124518h) && this.f124519i.equals(c3713b.f124519i) && Float.compare(this.f124520j, c3713b.f124520j) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f124520j) + androidx.compose.ui.graphics.colorspace.e.g(this.f124519i, androidx.compose.ui.graphics.colorspace.e.g(this.f124518h, androidx.compose.ui.graphics.colorspace.e.g(this.f124517g, (this.f124516f.hashCode() + H.d(C23088b.a(H.d((this.f124512b.hashCode() + (this.f124511a.hashCode() * 31)) * 31, 31, this.f124513c), 31, this.f124514d), 31, this.f124515e)) * 31, 31), 31), 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ChartData(currentColor=");
                sb2.append(this.f124511a);
                sb2.append(", micromarketColor=");
                sb2.append(this.f124512b);
                sb2.append(", metricSlug=");
                sb2.append(this.f124513c);
                sb2.append(", shortNumbersMap=");
                sb2.append(this.f124514d);
                sb2.append(", symbol=");
                sb2.append(this.f124515e);
                sb2.append(", type=");
                sb2.append(this.f124516f);
                sb2.append(", dateValues=");
                sb2.append(this.f124517g);
                sb2.append(", currentValues=");
                sb2.append(this.f124518h);
                sb2.append(", micromarketValues=");
                sb2.append(this.f124519i);
                sb2.append(", maxYValue=");
                return r.k(')', this.f124520j, sb2);
            }
        }

        /* compiled from: CompetitorAnalyticsState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$g$c;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f124521a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f124522b;

            public c(@Y61.k String str, @Y61.k DeepLink deepLink) {
                this.f124521a = str;
                this.f124522b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f124521a, cVar.f124521a) && L.f(this.f124522b, cVar.f124522b);
            }

            public final int hashCode() {
                return this.f124522b.hashCode() + (this.f124521a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Hint(iconName=");
                sb2.append(this.f124521a);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f124522b, ')');
            }
        }

        public g(@Y61.k String str, @l c cVar, @Y61.k a aVar, @Y61.k a aVar2, @l AttributedText attributedText, @l ActionButton actionButton, @l C3713b c3713b) {
            this.f124501a = str;
            this.f124502b = cVar;
            this.f124503c = aVar;
            this.f124504d = aVar2;
            this.f124505e = attributedText;
            this.f124506f = actionButton;
            this.f124507g = c3713b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f124501a, gVar.f124501a) && L.f(this.f124502b, gVar.f124502b) && L.f(this.f124503c, gVar.f124503c) && L.f(this.f124504d, gVar.f124504d) && L.f(this.f124505e, gVar.f124505e) && L.f(this.f124506f, gVar.f124506f) && L.f(this.f124507g, gVar.f124507g);
        }

        public final int hashCode() {
            int iHashCode = this.f124501a.hashCode() * 31;
            c cVar = this.f124502b;
            int iHashCode2 = (this.f124504d.hashCode() + ((this.f124503c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31)) * 31;
            AttributedText attributedText = this.f124505e;
            int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            ActionButton actionButton = this.f124506f;
            int iHashCode4 = (iHashCode3 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            C3713b c3713b = this.f124507g;
            return iHashCode4 + (c3713b != null ? c3713b.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "MetricsItem(title=" + this.f124501a + ", hint=" + this.f124502b + ", current=" + this.f124503c + ", micromarket=" + this.f124504d + ", description=" + this.f124505e + ", action=" + this.f124506f + ", chart=" + this.f124507g + ')';
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$h;", "", "a", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f124523a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<a> f124524b;

        /* renamed from: c, reason: collision with root package name */
        public final int f124525c;

        /* compiled from: CompetitorAnalyticsState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$h$a;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final StateType f124526a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f124527b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f124528c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final c f124529d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final AttributedText f124530e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final k f124531f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final f f124532g;

            /* renamed from: h, reason: collision with root package name */
            @Y61.k
            public final List<g> f124533h;

            public a(@Y61.k StateType stateType, @l String str, @l String str2, @l c cVar, @l AttributedText attributedText, @l k kVar, @l f fVar, @Y61.k List<g> list) {
                this.f124526a = stateType;
                this.f124527b = str;
                this.f124528c = str2;
                this.f124529d = cVar;
                this.f124530e = attributedText;
                this.f124531f = kVar;
                this.f124532g = fVar;
                this.f124533h = list;
            }

            public static a a(a aVar, String str, c cVar, AttributedText attributedText, k kVar, f fVar, List list, int i12) {
                return new a(aVar.f124526a, aVar.f124527b, str, (i12 & 8) != 0 ? aVar.f124529d : cVar, (i12 & 16) != 0 ? aVar.f124530e : attributedText, (i12 & 32) != 0 ? aVar.f124531f : kVar, (i12 & 64) != 0 ? aVar.f124532g : fVar, (i12 & 128) != 0 ? aVar.f124533h : list);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f124526a == aVar.f124526a && L.f(this.f124527b, aVar.f124527b) && L.f(this.f124528c, aVar.f124528c) && L.f(this.f124529d, aVar.f124529d) && L.f(this.f124530e, aVar.f124530e) && L.f(this.f124531f, aVar.f124531f) && L.f(this.f124532g, aVar.f124532g) && L.f(this.f124533h, aVar.f124533h);
            }

            public final int hashCode() {
                int iHashCode = this.f124526a.hashCode() * 31;
                String str = this.f124527b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f124528c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                c cVar = this.f124529d;
                int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
                AttributedText attributedText = this.f124530e;
                int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                k kVar = this.f124531f;
                int iHashCode6 = (iHashCode5 + (kVar == null ? 0 : kVar.hashCode())) * 31;
                f fVar = this.f124532g;
                return this.f124533h.hashCode() + ((iHashCode6 + (fVar != null ? fVar.hashCode() : 0)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Period(stateType=");
                sb2.append(this.f124526a);
                sb2.append(", unavailableHint=");
                sb2.append(this.f124527b);
                sb2.append(", subTitle=");
                sb2.append(this.f124528c);
                sb2.append(", detailsInfo=");
                sb2.append(this.f124529d);
                sb2.append(", detailsInfoV2=");
                sb2.append(this.f124530e);
                sb2.append(", suggestsV2=");
                sb2.append(this.f124531f);
                sb2.append(", metrics=");
                sb2.append(this.f124532g);
                sb2.append(", metricsV2=");
                return H.p(sb2, this.f124533h, ')');
            }
        }

        public h(@Y61.k ArrayList arrayList, @Y61.k List list, int i12) {
            this.f124523a = arrayList;
            this.f124524b = list;
            this.f124525c = i12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static h a(h hVar, ArrayList arrayList, int i12, int i13) {
            ArrayList arrayList2 = hVar.f124523a;
            List list = arrayList;
            if ((i13 & 2) != 0) {
                list = hVar.f124524b;
            }
            if ((i13 & 4) != 0) {
                i12 = hVar.f124525c;
            }
            hVar.getClass();
            return new h(arrayList2, list, i12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f124523a.equals(hVar.f124523a) && L.f(this.f124524b, hVar.f124524b) && this.f124525c == hVar.f124525c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f124525c) + H.e(this.f124523a.hashCode() * 31, 31, this.f124524b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PeriodsBlock(segments=");
            sb2.append(this.f124523a);
            sb2.append(", periods=");
            sb2.append(this.f124524b);
            sb2.append(", initSelectedPos=");
            return r.t(sb2, this.f124525c, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$i;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f124534a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f124535b;

        public i(@Y61.k String str, @Y61.k String str2) {
            this.f124534a = str;
            this.f124535b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f124534a, iVar.f124534a) && L.f(this.f124535b, iVar.f124535b);
        }

        public final int hashCode() {
            return this.f124535b.hashCode() + (this.f124534a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Recommendation(title=");
            sb2.append(this.f124534a);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f124535b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$j;", "", "a", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f124536a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f124537b;

        /* compiled from: CompetitorAnalyticsState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$j$a;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f124538a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f124539b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final UniversalImage f124540c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final ActionButton f124541d;

            public a(@Y61.k String str, @Y61.k String str2, @l UniversalImage universalImage, @Y61.k ActionButton actionButton) {
                this.f124538a = str;
                this.f124539b = str2;
                this.f124540c = universalImage;
                this.f124541d = actionButton;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f124538a, aVar.f124538a) && L.f(this.f124539b, aVar.f124539b) && L.f(this.f124540c, aVar.f124540c) && L.f(this.f124541d, aVar.f124541d);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f124538a.hashCode() * 31, 31, this.f124539b);
                UniversalImage universalImage = this.f124540c;
                return this.f124541d.hashCode() + ((iD2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Tip(title=" + this.f124538a + ", description=" + this.f124539b + ", background=" + this.f124540c + ", action=" + this.f124541d + ')';
            }
        }

        public j(@Y61.k String str, @Y61.k ArrayList arrayList) {
            this.f124536a = str;
            this.f124537b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f124536a, jVar.f124536a) && this.f124537b.equals(jVar.f124537b);
        }

        public final int hashCode() {
            return this.f124537b.hashCode() + (this.f124536a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Suggests(title=");
            sb2.append(this.f124536a);
            sb2.append(", tips=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f124537b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$k;", "", "a", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f124542a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SuggestsStatus f124543b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f124544c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f124545d;

        /* compiled from: CompetitorAnalyticsState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/b$k$a;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f124546a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f124547b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f124548c;

            public a(@Y61.k String str, @Y61.k String str2, @l DeepLink deepLink) {
                this.f124546a = str;
                this.f124547b = str2;
                this.f124548c = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f124546a, aVar.f124546a) && L.f(this.f124547b, aVar.f124547b) && L.f(this.f124548c, aVar.f124548c);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f124546a.hashCode() * 31, 31, this.f124547b);
                DeepLink deepLink = this.f124548c;
                return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Item(title=");
                sb2.append(this.f124546a);
                sb2.append(", description=");
                sb2.append(this.f124547b);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f124548c, ')');
            }
        }

        public k(@Y61.k String str, @Y61.k SuggestsStatus suggestsStatus, @Y61.k String str2, @Y61.k ArrayList arrayList) {
            this.f124542a = str;
            this.f124543b = suggestsStatus;
            this.f124544c = str2;
            this.f124545d = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f124542a, kVar.f124542a) && this.f124543b == kVar.f124543b && L.f(this.f124544c, kVar.f124544c) && this.f124545d.equals(kVar.f124545d);
        }

        public final int hashCode() {
            return this.f124545d.hashCode() + H.d((this.f124543b.hashCode() + (this.f124542a.hashCode() * 31)) * 31, 31, this.f124544c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SuggestsV2(title=");
            sb2.append(this.f124542a);
            sb2.append(", status=");
            sb2.append(this.f124543b);
            sb2.append(", statusText=");
            sb2.append(this.f124544c);
            sb2.append(", items=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f124545d, ')');
        }
    }

    public b(@l String str, @l d dVar, @l h.a aVar, @l a aVar2, @l h hVar, @l i iVar, @l j jVar, @l e eVar, @l g gVar, @l Throwable th2, @l Throwable th3, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f124471b = str;
        this.f124472c = dVar;
        this.f124473d = aVar;
        this.f124474e = aVar2;
        this.f124475f = hVar;
        this.f124476g = iVar;
        this.f124477h = jVar;
        this.f124478i = eVar;
        this.f124479j = gVar;
        this.f124480k = th2;
        this.f124481l = th3;
        this.f124482m = z12;
        this.f124483n = z13;
        this.f124484o = z14;
        this.f124485p = z15;
    }

    public static b a(b bVar, String str, d dVar, h.a aVar, a aVar2, h hVar, i iVar, j jVar, e eVar, g gVar, Throwable th2, Throwable th3, boolean z12, boolean z13, boolean z14, boolean z15, int i12) {
        String str2 = (i12 & 1) != 0 ? bVar.f124471b : str;
        d dVar2 = (i12 & 2) != 0 ? bVar.f124472c : dVar;
        h.a aVar3 = (i12 & 4) != 0 ? bVar.f124473d : aVar;
        a aVar4 = (i12 & 8) != 0 ? bVar.f124474e : aVar2;
        h hVar2 = (i12 & 16) != 0 ? bVar.f124475f : hVar;
        i iVar2 = (i12 & 32) != 0 ? bVar.f124476g : iVar;
        j jVar2 = (i12 & 64) != 0 ? bVar.f124477h : jVar;
        e eVar2 = (i12 & 128) != 0 ? bVar.f124478i : eVar;
        g gVar2 = (i12 & 256) != 0 ? bVar.f124479j : gVar;
        Throwable th4 = (i12 & 512) != 0 ? bVar.f124480k : th2;
        Throwable th5 = (i12 & 1024) != 0 ? bVar.f124481l : th3;
        boolean z16 = (i12 & 2048) != 0 ? bVar.f124482m : z12;
        boolean z17 = (i12 & 4096) != 0 ? bVar.f124483n : z13;
        boolean z18 = (i12 & 8192) != 0 ? bVar.f124484o : z14;
        boolean z19 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? bVar.f124485p : z15;
        bVar.getClass();
        return new b(str2, dVar2, aVar3, aVar4, hVar2, iVar2, jVar2, eVar2, gVar2, th4, th5, z16, z17, z18, z19);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f124471b, bVar.f124471b) && L.f(this.f124472c, bVar.f124472c) && L.f(this.f124473d, bVar.f124473d) && L.f(this.f124474e, bVar.f124474e) && L.f(this.f124475f, bVar.f124475f) && L.f(this.f124476g, bVar.f124476g) && L.f(this.f124477h, bVar.f124477h) && L.f(this.f124478i, bVar.f124478i) && L.f(this.f124479j, bVar.f124479j) && L.f(this.f124480k, bVar.f124480k) && L.f(this.f124481l, bVar.f124481l) && this.f124482m == bVar.f124482m && this.f124483n == bVar.f124483n && this.f124484o == bVar.f124484o && this.f124485p == bVar.f124485p;
    }

    public final int hashCode() {
        String str = this.f124471b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d dVar = this.f124472c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        h.a aVar = this.f124473d;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f124474e;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        h hVar = this.f124475f;
        int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.f124476g;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.f124477h;
        int iHashCode7 = (iHashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        e eVar = this.f124478i;
        int iHashCode8 = (iHashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g gVar = this.f124479j;
        int iHashCode9 = (iHashCode8 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Throwable th2 = this.f124480k;
        int iHashCode10 = (iHashCode9 + (th2 == null ? 0 : th2.hashCode())) * 31;
        Throwable th3 = this.f124481l;
        return Boolean.hashCode(this.f124485p) + r.i(r.i(r.i((iHashCode10 + (th3 != null ? th3.hashCode() : 0)) * 31, 31, this.f124482m), 31, this.f124483n), 31, this.f124484o);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompetitorAnalyticsState(title=");
        sb2.append(this.f124471b);
        sb2.append(", faqHint=");
        sb2.append(this.f124472c);
        sb2.append(", currentPeriod=");
        sb2.append(this.f124473d);
        sb2.append(", banner=");
        sb2.append(this.f124474e);
        sb2.append(", periodsBlock=");
        sb2.append(this.f124475f);
        sb2.append(", recommendation=");
        sb2.append(this.f124476g);
        sb2.append(", suggests=");
        sb2.append(this.f124477h);
        sb2.append(", footer=");
        sb2.append(this.f124478i);
        sb2.append(", dynamicsIndicator=");
        sb2.append(this.f124479j);
        sb2.append(", mainError=");
        sb2.append(this.f124480k);
        sb2.append(", periodError=");
        sb2.append(this.f124481l);
        sb2.append(", isMainLoading=");
        sb2.append(this.f124482m);
        sb2.append(", isPeriodLoading=");
        sb2.append(this.f124483n);
        sb2.append(", isNewDesign=");
        sb2.append(this.f124484o);
        sb2.append(", isExpandedSuggests=");
        return r.x(sb2, this.f124485p, ')');
    }
}
