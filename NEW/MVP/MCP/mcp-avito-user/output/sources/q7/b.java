package Q7;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionListOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LQ7/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LQ7/b$a;", "LQ7/b$b;", "LQ7/b$c;", "LQ7/b$d;", "LQ7/b$e;", "LQ7/b$f;", "LQ7/b$g;", "LQ7/b$h;", "LQ7/b$i;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b {

    /* compiled from: AdvertCollectionListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/b$a;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13516a;

        public a(@k DeepLink deepLink) {
            this.f13516a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f13516a, ((a) obj).f13516a);
        }

        public final int hashCode() {
            return this.f13516a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("CollectionCreated(deepLink="), this.f13516a, ')');
        }
    }

    /* compiled from: AdvertCollectionListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/b$b;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q7.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0889b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13517a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f13518b;

        public C0889b(@k DeepLink deepLink, @l String str) {
            this.f13517a = deepLink;
            this.f13518b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0889b)) {
                return false;
            }
            C0889b c0889b = (C0889b) obj;
            return L.f(this.f13517a, c0889b.f13517a) && L.f(this.f13518b, c0889b.f13518b);
        }

        public final int hashCode() {
            int iHashCode = this.f13517a.hashCode() * 31;
            String str = this.f13518b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deepLink=");
            sb2.append(this.f13517a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f13518b, ')');
        }

        public /* synthetic */ C0889b(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: AdvertCollectionListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/b$c;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13519a;

        public c(@k String str) {
            this.f13519a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13519a, ((c) obj).f13519a);
        }

        public final int hashCode() {
            return this.f13519a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenDeleteCollectionDialog(collectionId="), this.f13519a, ')');
        }
    }

    /* compiled from: AdvertCollectionListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/b$d;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13520a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final kotlin.collections.builders.b f13521b;

        public d(@k String str, @k kotlin.collections.builders.b bVar) {
            this.f13520a = str;
            this.f13521b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f13520a, dVar.f13520a) && L.f(this.f13521b, dVar.f13521b);
        }

        public final int hashCode() {
            return this.f13521b.hashCode() + (this.f13520a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenSelectBottomSheet(collectionId=" + this.f13520a + ", actions=" + this.f13521b + ')';
        }
    }

    /* compiled from: AdvertCollectionListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/b$e;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13522a;

        public e(@k String str) {
            this.f13522a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13522a, ((e) obj).f13522a);
        }

        public final int hashCode() {
            return this.f13522a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenShareDialog(link="), this.f13522a, ')');
        }
    }

    /* compiled from: AdvertCollectionListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/b$f;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13523a;

        public f(@k String str) {
            this.f13523a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f13523a, ((f) obj).f13523a);
        }

        public final int hashCode() {
            return this.f13523a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveCollectionIdToAnalytics(collectionId="), this.f13523a, ')');
        }
    }

    /* compiled from: AdvertCollectionListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/b$g;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        @k
        public final String toString() {
            return "ScrollToPosition(index=0)";
        }
    }

    /* compiled from: AdvertCollectionListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/b$h;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f13524a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f13525b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13526c;

        public h(@l String str, @k String str2, int i12) {
            this.f13524a = str;
            this.f13525b = str2;
            this.f13526c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f13524a, hVar.f13524a) && L.f(this.f13525b, hVar.f13525b) && this.f13526c == hVar.f13526c;
        }

        public final int hashCode() {
            String str = this.f13524a;
            return Integer.hashCode(this.f13526c) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f13525b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendCollectionListViewEvent(userId=");
            sb2.append(this.f13524a);
            sb2.append(", deviceId=");
            sb2.append(this.f13525b);
            sb2.append(", collectionCount=");
            return r.t(sb2, this.f13526c, ')');
        }
    }

    /* compiled from: AdvertCollectionListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/b$i;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13527a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13528b;

        public i(@k String str, boolean z12) {
            this.f13527a = str;
            this.f13528b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f13527a, iVar.f13527a) && this.f13528b == iVar.f13528b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13528b) + (this.f13527a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToastBar(text=");
            sb2.append(this.f13527a);
            sb2.append(", isError=");
            return r.x(sb2, this.f13528b, ')');
        }
    }
}
