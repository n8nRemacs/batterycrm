package O80;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CompetitorsInfo.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LO80/a;", "", "a", "b", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f12013a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f12014b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f12015c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f12016d;

    /* compiled from: CompetitorsInfo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO80/a$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: O80.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0777a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Image f12017a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f12018b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f12019c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f12020d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final b f12021e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final DeepLink f12022f;

        public C0777a(@l Image image, @k String str, @k String str2, @k String str3, @l b bVar, @k DeepLink deepLink) {
            this.f12017a = image;
            this.f12018b = str;
            this.f12019c = str2;
            this.f12020d = str3;
            this.f12021e = bVar;
            this.f12022f = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0777a)) {
                return false;
            }
            C0777a c0777a = (C0777a) obj;
            return L.f(this.f12017a, c0777a.f12017a) && L.f(this.f12018b, c0777a.f12018b) && L.f(this.f12019c, c0777a.f12019c) && L.f(this.f12020d, c0777a.f12020d) && L.f(this.f12021e, c0777a.f12021e) && L.f(this.f12022f, c0777a.f12022f);
        }

        public final int hashCode() {
            Image image = this.f12017a;
            int iD2 = H.d(H.d(H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f12018b), 31, this.f12019c), 31, this.f12020d);
            b bVar = this.f12021e;
            return this.f12022f.hashCode() + ((iD2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Item(image=");
            sb2.append(this.f12017a);
            sb2.append(", price=");
            sb2.append(this.f12018b);
            sb2.append(", title=");
            sb2.append(this.f12019c);
            sb2.append(", location=");
            sb2.append(this.f12020d);
            sb2.append(", views=");
            sb2.append(this.f12021e);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f12022f, ')');
        }
    }

    /* compiled from: CompetitorsInfo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO80/a$b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f12023a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f12024b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f12025c;

        public b(@k String str, @k String str2, @l String str3) {
            this.f12023a = str;
            this.f12024b = str2;
            this.f12025c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f12023a, bVar.f12023a) && L.f(this.f12024b, bVar.f12024b) && L.f(this.f12025c, bVar.f12025c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f12023a.hashCode() * 31, 31, this.f12024b);
            String str = this.f12025c;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Views(iconName=");
            sb2.append(this.f12023a);
            sb2.append(", currentCount=");
            sb2.append(this.f12024b);
            sb2.append(", deltaCount=");
            return C22026a.c(sb2, this.f12025c, ')');
        }
    }

    public a(@k AttributedText attributedText, @k String str, @l String str2, @k ArrayList arrayList) {
        this.f12013a = str;
        this.f12014b = str2;
        this.f12015c = attributedText;
        this.f12016d = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f12013a, aVar.f12013a) && L.f(this.f12014b, aVar.f12014b) && L.f(this.f12015c, aVar.f12015c) && this.f12016d.equals(aVar.f12016d);
    }

    public final int hashCode() {
        int iHashCode = this.f12013a.hashCode() * 31;
        String str = this.f12014b;
        return this.f12016d.hashCode() + com.avito.android.actions_sheet.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12015c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompetitorsInfo(title=");
        sb2.append(this.f12013a);
        sb2.append(", titleBadge=");
        sb2.append(this.f12014b);
        sb2.append(", description=");
        sb2.append(this.f12015c);
        sb2.append(", items=");
        return e.p(sb2, this.f12016d, ')');
    }
}
