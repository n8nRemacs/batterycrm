package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoPeriod.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod;", "", "AdditionalToast", "a", "b", "c", "d", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PositionInfoPeriod {

    /* compiled from: PositionInfoPeriod.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$AdditionalToast;", "", "Type", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdditionalToast {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f220431a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220432b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f220433c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Type f220434d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PositionInfoPeriod.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$AdditionalToast$Type;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f220435b;

            /* renamed from: c, reason: collision with root package name */
            public static final Type f220436c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Type[] f220437d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f220438e;

            static {
                Type type = new Type("DEFAULT", 0);
                f220435b = type;
                Type type2 = new Type("ERROR", 1);
                f220436c = type2;
                Type[] typeArr = {type, type2};
                f220437d = typeArr;
                f220438e = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f220437d.clone();
            }
        }

        public AdditionalToast(boolean z12, @k String str, boolean z13, @k Type type) {
            this.f220431a = z12;
            this.f220432b = str;
            this.f220433c = z13;
            this.f220434d = type;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdditionalToast)) {
                return false;
            }
            AdditionalToast additionalToast = (AdditionalToast) obj;
            return this.f220431a == additionalToast.f220431a && L.f(this.f220432b, additionalToast.f220432b) && this.f220433c == additionalToast.f220433c && this.f220434d == additionalToast.f220434d;
        }

        public final int hashCode() {
            return this.f220434d.hashCode() + r.i(H.d(Boolean.hashCode(this.f220431a) * 31, 31, this.f220432b), 31, this.f220433c);
        }

        @k
        public final String toString() {
            return "AdditionalToast(closable=" + this.f220431a + ", message=" + this.f220432b + ", showRefreshButton=" + this.f220433c + ", type=" + this.f220434d + ')';
        }
    }

    /* compiled from: PositionInfoPeriod.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements PositionInfoPeriod {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final d f220439a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AdditionalToast f220440b;

        public a(@l d dVar, @l AdditionalToast additionalToast) {
            this.f220439a = dVar;
            this.f220440b = additionalToast;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f220439a, aVar.f220439a) && L.f(this.f220440b, aVar.f220440b);
        }

        public final int hashCode() {
            d dVar = this.f220439a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            AdditionalToast additionalToast = this.f220440b;
            return iHashCode + (additionalToast != null ? additionalToast.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "PortionData(searchQueriesData=" + this.f220439a + ", additionalToast=" + this.f220440b + ')';
        }
    }

    /* compiled from: PositionInfoPeriod.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AttributedText f220441a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f220442b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f220443c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f220444d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f220445e;

        public b(@l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @k String str, @l String str2) {
            this.f220441a = attributedText;
            this.f220442b = attributedText2;
            this.f220443c = attributedText3;
            this.f220444d = str;
            this.f220445e = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f220441a, bVar.f220441a) && L.f(this.f220442b, bVar.f220442b) && L.f(this.f220443c, bVar.f220443c) && L.f(this.f220444d, bVar.f220444d) && L.f(this.f220445e, bVar.f220445e);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f220441a;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            AttributedText attributedText2 = this.f220442b;
            int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            AttributedText attributedText3 = this.f220443c;
            int iD2 = H.d((iHashCode2 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31, 31, this.f220444d);
            String str = this.f220445e;
            return iD2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PositionData(delta=");
            sb2.append(this.f220441a);
            sb2.append(", description=");
            sb2.append(this.f220442b);
            sb2.append(", position=");
            sb2.append(this.f220443c);
            sb2.append(", title=");
            sb2.append(this.f220444d);
            sb2.append(", tooltipText=");
            return C22026a.c(sb2, this.f220445e, ')');
        }
    }

    /* compiled from: PositionInfoPeriod.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$c;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements PositionInfoPeriod {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f220446a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f220447b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final d f220448c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final PositionInfoBanner f220449d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AdditionalToast f220450e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final V80.d f220451f;

        public c(@k String str, @k b bVar, @l d dVar, @l PositionInfoBanner positionInfoBanner, @l AdditionalToast additionalToast, @l V80.d dVar2) {
            this.f220446a = str;
            this.f220447b = bVar;
            this.f220448c = dVar;
            this.f220449d = positionInfoBanner;
            this.f220450e = additionalToast;
            this.f220451f = dVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f220446a, cVar.f220446a) && L.f(this.f220447b, cVar.f220447b) && L.f(this.f220448c, cVar.f220448c) && L.f(this.f220449d, cVar.f220449d) && L.f(this.f220450e, cVar.f220450e) && L.f(this.f220451f, cVar.f220451f);
        }

        public final int hashCode() {
            int iHashCode = (this.f220447b.hashCode() + (this.f220446a.hashCode() * 31)) * 31;
            d dVar = this.f220448c;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PositionInfoBanner positionInfoBanner = this.f220449d;
            int iHashCode3 = (iHashCode2 + (positionInfoBanner == null ? 0 : positionInfoBanner.hashCode())) * 31;
            AdditionalToast additionalToast = this.f220450e;
            int iHashCode4 = (iHashCode3 + (additionalToast == null ? 0 : additionalToast.hashCode())) * 31;
            V80.d dVar2 = this.f220451f;
            return iHashCode4 + (dVar2 != null ? dVar2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ScreenData(periodTitle=" + this.f220446a + ", positionData=" + this.f220447b + ", searchQueriesData=" + this.f220448c + ", adviceBanner=" + this.f220449d + ", additionalToast=" + this.f220450e + ", chartData=" + this.f220451f + ')';
        }
    }

    /* compiled from: PositionInfoPeriod.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$d;", "", "a", "b", "c", "d", "e", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final a f220452a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C6629d f220453b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f220454c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final b f220455d;

        /* compiled from: PositionInfoPeriod.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$d$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f220456a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f220457b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f220458c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f220459d;

            public a(@l String str, @l String str2, @l String str3, @k String str4) {
                this.f220456a = str;
                this.f220457b = str2;
                this.f220458c = str3;
                this.f220459d = str4;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f220456a, aVar.f220456a) && L.f(this.f220457b, aVar.f220457b) && L.f(this.f220458c, aVar.f220458c) && L.f(this.f220459d, aVar.f220459d);
            }

            public final int hashCode() {
                String str = this.f220456a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f220457b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f220458c;
                return this.f220459d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Header(description=");
                sb2.append(this.f220456a);
                sb2.append(", leftColumnTitle=");
                sb2.append(this.f220457b);
                sb2.append(", rightColumnTitle=");
                sb2.append(this.f220458c);
                sb2.append(", title=");
                return C22026a.c(sb2, this.f220459d, ')');
            }
        }

        /* compiled from: PositionInfoPeriod.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$d$b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            public final long f220460a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f220461b;

            public b(long j12, @k String str) {
                this.f220460a = j12;
                this.f220461b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f220460a == bVar.f220460a && L.f(this.f220461b, bVar.f220461b);
            }

            public final int hashCode() {
                return this.f220461b.hashCode() + (Long.hashCode(this.f220460a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NextPage(nextPageOffset=");
                sb2.append(this.f220460a);
                sb2.append(", title=");
                return C22026a.c(sb2, this.f220461b, ')');
            }
        }

        /* compiled from: PositionInfoPeriod.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$d$c;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final AttributedText f220462a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f220463b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final AttributedText f220464c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f220465d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final AttributedText f220466e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final ArrayList f220467f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final String f220468g;

            /* renamed from: h, reason: collision with root package name */
            @l
            public final String f220469h;

            /* renamed from: i, reason: collision with root package name */
            @l
            public final DeepLink f220470i;

            public c(@l AttributedText attributedText, @k String str, @l AttributedText attributedText2, @k String str2, @l AttributedText attributedText3, @k ArrayList arrayList, @k String str3, @l String str4, @l DeepLink deepLink) {
                this.f220462a = attributedText;
                this.f220463b = str;
                this.f220464c = attributedText2;
                this.f220465d = str2;
                this.f220466e = attributedText3;
                this.f220467f = arrayList;
                this.f220468g = str3;
                this.f220469h = str4;
                this.f220470i = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f220462a, cVar.f220462a) && L.f(this.f220463b, cVar.f220463b) && L.f(this.f220464c, cVar.f220464c) && L.f(this.f220465d, cVar.f220465d) && L.f(this.f220466e, cVar.f220466e) && this.f220467f.equals(cVar.f220467f) && L.f(this.f220468g, cVar.f220468g) && L.f(this.f220469h, cVar.f220469h) && L.f(this.f220470i, cVar.f220470i);
            }

            public final int hashCode() {
                AttributedText attributedText = this.f220462a;
                int iD2 = H.d((attributedText == null ? 0 : attributedText.hashCode()) * 31, 31, this.f220463b);
                AttributedText attributedText2 = this.f220464c;
                int iD3 = H.d((iD2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.f220465d);
                AttributedText attributedText3 = this.f220466e;
                int iD4 = H.d(androidx.compose.ui.graphics.colorspace.e.g(this.f220467f, (iD3 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31, 31), 31, this.f220468g);
                String str = this.f220469h;
                int iHashCode = (iD4 + (str == null ? 0 : str.hashCode())) * 31;
                DeepLink deepLink = this.f220470i;
                return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("QueryItem(delta=");
                sb2.append(this.f220462a);
                sb2.append(", id=");
                sb2.append(this.f220463b);
                sb2.append(", link=");
                sb2.append(this.f220464c);
                sb2.append(", linkId=");
                sb2.append(this.f220465d);
                sb2.append(", position=");
                sb2.append(this.f220466e);
                sb2.append(", statistics=");
                sb2.append(this.f220467f);
                sb2.append(", title=");
                sb2.append(this.f220468g);
                sb2.append(", tooltipText=");
                sb2.append(this.f220469h);
                sb2.append(", eventDeepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f220470i, ')');
            }
        }

        /* compiled from: PositionInfoPeriod.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$d$d;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod$d$d, reason: collision with other inner class name */
        public static final /* data */ class C6629d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f220471a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f220472b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final PeriodSortDirection f220473c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final DeepLink f220474d;

            public C6629d(@k String str, @k String str2, @k PeriodSortDirection periodSortDirection, @k DeepLink deepLink) {
                this.f220471a = str;
                this.f220472b = str2;
                this.f220473c = periodSortDirection;
                this.f220474d = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6629d)) {
                    return false;
                }
                C6629d c6629d = (C6629d) obj;
                return L.f(this.f220471a, c6629d.f220471a) && L.f(this.f220472b, c6629d.f220472b) && this.f220473c == c6629d.f220473c && L.f(this.f220474d, c6629d.f220474d);
            }

            public final int hashCode() {
                return this.f220474d.hashCode() + ((this.f220473c.hashCode() + H.d(this.f220471a.hashCode() * 31, 31, this.f220472b)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SortingControl(title=");
                sb2.append(this.f220471a);
                sb2.append(", slug=");
                sb2.append(this.f220472b);
                sb2.append(", sortDirection=");
                sb2.append(this.f220473c);
                sb2.append(", deepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f220474d, ')');
            }
        }

        /* compiled from: PositionInfoPeriod.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriod$d$e;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f220475a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f220476b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f220477c;

            public e(@k String str, @k String str2, @k String str3) {
                this.f220475a = str;
                this.f220476b = str2;
                this.f220477c = str3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return L.f(this.f220475a, eVar.f220475a) && L.f(this.f220476b, eVar.f220476b) && L.f(this.f220477c, eVar.f220477c);
            }

            public final int hashCode() {
                return this.f220477c.hashCode() + H.d(this.f220475a.hashCode() * 31, 31, this.f220476b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("StatItem(id=");
                sb2.append(this.f220475a);
                sb2.append(", title=");
                sb2.append(this.f220476b);
                sb2.append(", value=");
                return C22026a.c(sb2, this.f220477c, ')');
            }
        }

        public d(@k a aVar, @l C6629d c6629d, @k ArrayList arrayList, @l b bVar) {
            this.f220452a = aVar;
            this.f220453b = c6629d;
            this.f220454c = arrayList;
            this.f220455d = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f220452a.equals(dVar.f220452a) && L.f(this.f220453b, dVar.f220453b) && this.f220454c.equals(dVar.f220454c) && L.f(this.f220455d, dVar.f220455d);
        }

        public final int hashCode() {
            int iHashCode = this.f220452a.hashCode() * 31;
            C6629d c6629d = this.f220453b;
            int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f220454c, (iHashCode + (c6629d == null ? 0 : c6629d.hashCode())) * 31, 31);
            b bVar = this.f220455d;
            return iG2 + (bVar != null ? bVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "SearchQueriesData(header=" + this.f220452a + ", sortingControl=" + this.f220453b + ", items=" + this.f220454c + ", nextPageButton=" + this.f220455d + ')';
        }
    }
}
