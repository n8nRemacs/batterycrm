package Q7;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_collection_list.adapter.advert_collection.AdvertCollectionItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: AdvertCollectionListAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LQ7/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LQ7/a$a;", "LQ7/a$b;", "LQ7/a$c;", "LQ7/a$d;", "LQ7/a$e;", "LQ7/a$f;", "LQ7/a$g;", "LQ7/a$h;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AdvertCollectionListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/a$a;", "LQ7/a;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q7.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0888a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13507a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f13508b;

        public C0888a(@k String str, @k String str2) {
            this.f13507a = str;
            this.f13508b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0888a)) {
                return false;
            }
            C0888a c0888a = (C0888a) obj;
            return L.f(this.f13507a, c0888a.f13507a) && L.f(this.f13508b, c0888a.f13508b);
        }

        public final int hashCode() {
            return this.f13508b.hashCode() + (this.f13507a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CollectionActionSelected(action=");
            sb2.append(this.f13507a);
            sb2.append(", collectionId=");
            return C22026a.c(sb2, this.f13508b, ')');
        }
    }

    /* compiled from: AdvertCollectionListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ7/a$b;", "LQ7/a;", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13509a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 695561396;
        }

        @k
        public final String toString() {
            return "CreateCollection";
        }
    }

    /* compiled from: AdvertCollectionListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/a$c;", "LQ7/a;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13510a;

        public c(@k String str) {
            this.f13510a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13510a, ((c) obj).f13510a);
        }

        public final int hashCode() {
            return this.f13510a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeleteCollection(collectionId="), this.f13510a, ')');
        }
    }

    /* compiled from: AdvertCollectionListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/a$d;", "LQ7/a;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C43501a f13511a;

        public d(@k C43501a c43501a) {
            this.f13511a = c43501a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13511a, ((d) obj).f13511a);
        }

        public final int hashCode() {
            return this.f13511a.hashCode();
        }

        @k
        public final String toString() {
            return "OnDeepLinkResult(resultEvent=" + this.f13511a + ')';
        }
    }

    /* compiled from: AdvertCollectionListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/a$e;", "LQ7/a;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13512a;

        public e(@k DeepLink deepLink) {
            this.f13512a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13512a, ((e) obj).f13512a);
        }

        public final int hashCode() {
            return this.f13512a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenCollection(deepLink="), this.f13512a, ')');
        }
    }

    /* compiled from: AdvertCollectionListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ7/a$f;", "LQ7/a;", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f13513a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1048042544;
        }

        @k
        public final String toString() {
            return "RefreshPage";
        }
    }

    /* compiled from: AdvertCollectionListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ7/a$g;", "LQ7/a;", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f13514a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1531937513;
        }

        @k
        public final String toString() {
            return "SendCollectionListViewEvent";
        }
    }

    /* compiled from: AdvertCollectionListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ7/a$h;", "LQ7/a;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertCollectionItem f13515a;

        public h(@k AdvertCollectionItem advertCollectionItem) {
            this.f13515a = advertCollectionItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f13515a, ((h) obj).f13515a);
        }

        public final int hashCode() {
            return this.f13515a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowCollectionActions(item=" + this.f13515a + ')';
        }
    }
}
