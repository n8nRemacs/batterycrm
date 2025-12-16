package I7;

import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.select.Arguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LI7/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LI7/b$a;", "LI7/b$b;", "LI7/b$c;", "LI7/b$d;", "LI7/b$e;", "LI7/b$f;", "LI7/b$g;", "LI7/b$h;", "LI7/b$i;", "LI7/b$j;", "LI7/b$k;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b {

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/b$a;", "LI7/b;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f7976a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2031382364;
        }

        @Y61.k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/b$b;", "LI7/b;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: I7.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0449b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f7977a;

        public C0449b(@Y61.k String str) {
            this.f7977a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0449b) && L.f(this.f7977a, ((C0449b) obj).f7977a);
        }

        public final int hashCode() {
            return this.f7977a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CollectionDeleted(text="), this.f7977a, ')');
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/b$c;", "LI7/b;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f7978a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f7979b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f7980c;

        public c(@l Bundle bundle, @Y61.k DeepLink deepLink, @l String str) {
            this.f7978a = deepLink;
            this.f7979b = bundle;
            this.f7980c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f7978a, cVar.f7978a) && L.f(this.f7979b, cVar.f7979b) && L.f(this.f7980c, cVar.f7980c);
        }

        public final int hashCode() {
            int iHashCode = this.f7978a.hashCode() * 31;
            Bundle bundle = this.f7979b;
            int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            String str = this.f7980c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deepLink=");
            sb2.append(this.f7978a);
            sb2.append(", args=");
            sb2.append(this.f7979b);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f7980c, ')');
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/b$d;", "LI7/b;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f7981a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 83399267;
        }

        @Y61.k
        public final String toString() {
            return "OpenDeleteCollectionDialog";
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/b$e;", "LI7/b;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f7982a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2108201628;
        }

        @Y61.k
        public final String toString() {
            return "OpenPublishOnboardingBottomSheet";
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/b$f;", "LI7/b;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Arguments f7983a;

        public f(@Y61.k Arguments arguments) {
            this.f7983a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f7983a, ((f) obj).f7983a);
        }

        public final int hashCode() {
            return this.f7983a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.p(new StringBuilder("OpenSelectBottomSheet(arg="), this.f7983a, ')');
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/b$g;", "LI7/b;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f7984a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f7985b;

        public g(@Y61.k String str, @Y61.k String str2) {
            this.f7984a = str;
            this.f7985b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f7984a, gVar.f7984a) && L.f(this.f7985b, gVar.f7985b);
        }

        public final int hashCode() {
            return this.f7985b.hashCode() + (this.f7984a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenShareDialog(link=");
            sb2.append(this.f7984a);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f7985b, ')');
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/b$h;", "LI7/b;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f7986a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -152434116;
        }

        @Y61.k
        public final String toString() {
            return "RequestLocation";
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/b$i;", "LI7/b;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f7987a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f7988b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7989c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f7990d;

        public i(@l String str, @Y61.k String str2, boolean z12, @Y61.k String str3) {
            this.f7987a = str;
            this.f7988b = str2;
            this.f7989c = z12;
            this.f7990d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f7987a, iVar.f7987a) && L.f(this.f7988b, iVar.f7988b) && this.f7989c == iVar.f7989c && L.f(this.f7990d, iVar.f7990d);
        }

        public final int hashCode() {
            String str = this.f7987a;
            return this.f7990d.hashCode() + r.i(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f7988b), 31, this.f7989c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SaveAnalyticsInfo(userId=");
            sb2.append(this.f7987a);
            sb2.append(", deviceId=");
            sb2.append(this.f7988b);
            sb2.append(", isAuthor=");
            sb2.append(this.f7989c);
            sb2.append(", collectionId=");
            return C22026a.c(sb2, this.f7990d, ')');
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/b$j;", "LI7/b;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f7991a;

        public j(@Y61.k String str) {
            this.f7991a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f7991a, ((j) obj).f7991a);
        }

        public final int hashCode() {
            return this.f7991a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSimilarAdverts(itemId="), this.f7991a, ')');
        }
    }

    /* compiled from: AdvertCollectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/b$k;", "LI7/b;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f7992a;

        public k(@Y61.k String str) {
            this.f7992a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                return L.f(this.f7992a, ((k) obj).f7992a);
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (this.f7992a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return AK.c.s(new StringBuilder("ShowToastBar(text="), this.f7992a, ", isError=true)");
        }
    }
}
