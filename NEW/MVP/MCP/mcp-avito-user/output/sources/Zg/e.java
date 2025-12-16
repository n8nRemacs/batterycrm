package zg;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.advertising.loaders.BannerInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvlPlayerAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lzg/e;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lzg/e$a;", "Lzg/e$b;", "Lzg/e$c;", "Lzg/e$d;", "Lzg/e$e;", "Lzg/e$f;", "Lzg/e$g;", "Lzg/e$h;", "Lzg/e$i;", "Lzg/e$j;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface e {

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/e$a;", "Lzg/e;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f444133a = new a();
    }

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzg/e$b;", "Lzg/e;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f444134a;

        public b(@k String str) {
            this.f444134a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f444134a, ((b) obj).f444134a);
        }

        public final int hashCode() {
            return this.f444134a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HideItem(id="), this.f444134a, ')');
        }
    }

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzg/e$c;", "Lzg/e;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f444135a;

        public c(@l String str) {
            this.f444135a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f444135a, ((c) obj).f444135a);
        }

        public final int hashCode() {
            String str = this.f444135a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadMoreVideos(key="), this.f444135a, ')');
        }
    }

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzg/e$d;", "Lzg/e;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BannerInfo f444136a;

        /* renamed from: b, reason: collision with root package name */
        public final int f444137b;

        public d(@k BannerInfo bannerInfo, int i12) {
            this.f444136a = bannerInfo;
            this.f444137b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f444136a, dVar.f444136a) && this.f444137b == dVar.f444137b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f444137b) + (this.f444136a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LogCommercialOnScreen(bannerInfo=");
            sb2.append(this.f444136a);
            sb2.append(", position=");
            return r.t(sb2, this.f444137b, ')');
        }
    }

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/e$e;", "Lzg/e;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zg.e$e, reason: collision with other inner class name */
    public static final class C12965e implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12965e f444138a = new C12965e();
    }

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/e$f;", "Lzg/e;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f444139a = new f();
    }

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzg/e$g;", "Lzg/e;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BannerInfo f444140a;

        /* renamed from: b, reason: collision with root package name */
        public final int f444141b;

        public g(@k BannerInfo bannerInfo, int i12) {
            this.f444140a = bannerInfo;
            this.f444141b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f444140a, gVar.f444140a) && this.f444141b == gVar.f444141b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f444141b) + (this.f444140a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenCommercial(bannerInfo=");
            sb2.append(this.f444140a);
            sb2.append(", position=");
            return r.t(sb2, this.f444141b, ')');
        }
    }

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzg/e$h;", "Lzg/e;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f444142a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f444143b;

        public h(@l String str, @l String str2) {
            this.f444142a = str;
            this.f444143b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f444142a, hVar.f444142a) && L.f(this.f444143b, hVar.f444143b);
        }

        public final int hashCode() {
            String str = this.f444142a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f444143b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenFromDeeplink(itemId=");
            sb2.append(this.f444142a);
            sb2.append(", sourceSessionId=");
            return C22026a.c(sb2, this.f444143b, ')');
        }
    }

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/e$i;", "Lzg/e;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f444144a = new i();
    }

    /* compiled from: AvlPlayerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/e$j;", "Lzg/e;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f444145a = new j();
    }
}
