package V80;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoBanner;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfo.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LV80/h;", "", "a", "b", "c", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f16956a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16957b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f16958c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final PositionInfoBanner f16959d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f16960e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final O80.a f16961f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final b f16962g;

    /* compiled from: PositionInfo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/h$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Image f16963a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f16964b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f16965c;

        public a(@Y61.l Image image, @Y61.k String str, @Y61.k String str2) {
            this.f16963a = image;
            this.f16964b = str;
            this.f16965c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f16963a, aVar.f16963a) && L.f(this.f16964b, aVar.f16964b) && L.f(this.f16965c, aVar.f16965c);
        }

        public final int hashCode() {
            Image image = this.f16963a;
            return this.f16965c.hashCode() + H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f16964b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Advert(image=");
            sb2.append(this.f16963a);
            sb2.append(", title=");
            sb2.append(this.f16964b);
            sb2.append(", price=");
            return C22026a.c(sb2, this.f16965c, ')');
        }
    }

    /* compiled from: PositionInfo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/h$b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a f16966a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final PositionInfoButton f16967b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final PositionInfoButton f16968c;

        public b(@Y61.k a aVar, @Y61.l PositionInfoButton positionInfoButton, @Y61.l PositionInfoButton positionInfoButton2) {
            this.f16966a = aVar;
            this.f16967b = positionInfoButton;
            this.f16968c = positionInfoButton2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f16966a, bVar.f16966a) && L.f(this.f16967b, bVar.f16967b) && L.f(this.f16968c, bVar.f16968c);
        }

        public final int hashCode() {
            int iHashCode = this.f16966a.hashCode() * 31;
            PositionInfoButton positionInfoButton = this.f16967b;
            int iHashCode2 = (iHashCode + (positionInfoButton == null ? 0 : positionInfoButton.hashCode())) * 31;
            PositionInfoButton positionInfoButton2 = this.f16968c;
            return iHashCode2 + (positionInfoButton2 != null ? positionInfoButton2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "BottomInfo(item=" + this.f16966a + ", leftButton=" + this.f16967b + ", rightButton=" + this.f16968c + ')';
        }
    }

    /* compiled from: PositionInfo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/h$c;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16969a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f16970b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16971c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AttributedText f16972d;

        public c(@Y61.l AttributedText attributedText, @Y61.k String str, @Y61.k String str2, boolean z12) {
            this.f16969a = str;
            this.f16970b = str2;
            this.f16971c = z12;
            this.f16972d = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f16969a, cVar.f16969a) && L.f(this.f16970b, cVar.f16970b) && this.f16971c == cVar.f16971c && L.f(this.f16972d, cVar.f16972d);
        }

        public final int hashCode() {
            int i12 = r.i(H.d(this.f16969a.hashCode() * 31, 31, this.f16970b), 31, this.f16971c);
            AttributedText attributedText = this.f16972d;
            return i12 + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PeriodItem(id=");
            sb2.append(this.f16969a);
            sb2.append(", title=");
            sb2.append(this.f16970b);
            sb2.append(", available=");
            sb2.append(this.f16971c);
            sb2.append(", unavailableHint=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f16972d, ')');
        }
    }

    public h(@Y61.k String str, @Y61.k String str2, @Y61.l DeepLink deepLink, @Y61.l PositionInfoBanner positionInfoBanner, @Y61.k ArrayList arrayList, @Y61.l O80.a aVar, @Y61.l b bVar) {
        this.f16956a = str;
        this.f16957b = str2;
        this.f16958c = deepLink;
        this.f16959d = positionInfoBanner;
        this.f16960e = arrayList;
        this.f16961f = aVar;
        this.f16962g = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f16956a, hVar.f16956a) && L.f(this.f16957b, hVar.f16957b) && L.f(this.f16958c, hVar.f16958c) && L.f(this.f16959d, hVar.f16959d) && this.f16960e.equals(hVar.f16960e) && L.f(this.f16961f, hVar.f16961f) && L.f(this.f16962g, hVar.f16962g);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f16956a.hashCode() * 31, 31, this.f16957b);
        DeepLink deepLink = this.f16958c;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        PositionInfoBanner positionInfoBanner = this.f16959d;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f16960e, (iHashCode + (positionInfoBanner == null ? 0 : positionInfoBanner.hashCode())) * 31, 31);
        O80.a aVar = this.f16961f;
        int iHashCode2 = (iG2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f16962g;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "PositionInfo(screenName=" + this.f16956a + ", screenPeriod=" + this.f16957b + ", screenEventDeeplink=" + this.f16958c + ", banner=" + this.f16959d + ", periods=" + this.f16960e + ", competitorsInfo=" + this.f16961f + ", bottomInfo=" + this.f16962g + ')';
    }
}
