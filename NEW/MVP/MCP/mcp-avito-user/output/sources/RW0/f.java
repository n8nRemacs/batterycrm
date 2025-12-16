package rw0;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AccommodationInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lrw0/f;", "", "a", "b", "c", "Lrw0/f$a;", "Lrw0/f$b;", "Lrw0/f$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class f {

    /* compiled from: AccommodationInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/f$a;", "Lrw0/f;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f437194a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f437195b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f437196c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final PrintableText f437197d;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, String str2, DeepLink deepLink, PrintableText printableText, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            super(str, str2, deepLink, null);
            this.f437194a = str;
            this.f437195b = str2;
            this.f437196c = deepLink;
            this.f437197d = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f437194a, aVar.f437194a) && L.f(this.f437195b, aVar.f437195b) && L.f(this.f437196c, aVar.f437196c) && L.f(this.f437197d, aVar.f437197d);
        }

        public final int hashCode() {
            String str = this.f437194a;
            return this.f437197d.hashCode() + com.avito.android.actions_sheet.a.e(this.f437196c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f437195b), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(title=");
            sb2.append(this.f437194a);
            sb2.append(", hint=");
            sb2.append(this.f437195b);
            sb2.append(", deepLink=");
            sb2.append(this.f437196c);
            sb2.append(", error=");
            return AK.c.m(sb2, this.f437197d, ')');
        }
    }

    /* compiled from: AccommodationInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/f$b;", "Lrw0/f;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f437198a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f437199b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f437200c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final n f437201d;

        public b(@Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.k n nVar) {
            super(str, str2, deepLink, null);
            this.f437198a = str;
            this.f437199b = str2;
            this.f437200c = deepLink;
            this.f437201d = nVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f437198a, bVar.f437198a) && L.f(this.f437199b, bVar.f437199b) && L.f(this.f437200c, bVar.f437200c) && L.f(this.f437201d, bVar.f437201d);
        }

        public final int hashCode() {
            return this.f437201d.hashCode() + com.avito.android.actions_sheet.a.e(this.f437200c, H.d(this.f437198a.hashCode() * 31, 31, this.f437199b), 31);
        }

        @Y61.k
        public final String toString() {
            return "Normal(title=" + this.f437198a + ", hint=" + this.f437199b + ", deepLink=" + this.f437200c + ", rangeState=" + this.f437201d + ')';
        }
    }

    /* compiled from: AccommodationInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/f$c;", "Lrw0/f;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f437202a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f437203b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f437204c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final PrintableText f437205d;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(String str, String str2, DeepLink deepLink, PrintableText printableText, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            super(str, str2, deepLink, null);
            this.f437202a = str;
            this.f437203b = str2;
            this.f437204c = deepLink;
            this.f437205d = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f437202a, cVar.f437202a) && L.f(this.f437203b, cVar.f437203b) && L.f(this.f437204c, cVar.f437204c) && L.f(this.f437205d, cVar.f437205d);
        }

        public final int hashCode() {
            String str = this.f437202a;
            return this.f437205d.hashCode() + com.avito.android.actions_sheet.a.e(this.f437204c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f437203b), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Warning(title=");
            sb2.append(this.f437202a);
            sb2.append(", hint=");
            sb2.append(this.f437203b);
            sb2.append(", deepLink=");
            sb2.append(this.f437204c);
            sb2.append(", warning=");
            return AK.c.m(sb2, this.f437205d, ')');
        }
    }

    public f(String str, String str2, DeepLink deepLink, C42822w c42822w) {
    }
}
