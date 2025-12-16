package JI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRoomsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LJI/b;", "", "a", "b", "c", "d", "LJI/b$a;", "LJI/b$b;", "LJI/b$c;", "LJI/b$d;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: HotelAvailableRoomsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJI/b$a;", "LJI/b;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f8861a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 480325637;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: HotelAvailableRoomsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJI/b$b;", "LJI/b;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: JI.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0521b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f8862a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f8863b;

        public C0521b(@k DeepLink deepLink, @k String str) {
            this.f8862a = deepLink;
            this.f8863b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0521b)) {
                return false;
            }
            C0521b c0521b = (C0521b) obj;
            return L.f(this.f8862a, c0521b.f8862a) && L.f(this.f8863b, c0521b.f8863b);
        }

        public final int hashCode() {
            return this.f8863b.hashCode() + (this.f8862a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f8862a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f8863b, ')');
        }
    }

    /* compiled from: HotelAvailableRoomsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJI/b$c;", "LJI/b;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f8864a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -84548466;
        }

        @k
        public final String toString() {
            return "ScrollRoomsToTop";
        }
    }

    /* compiled from: HotelAvailableRoomsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJI/b$d;", "LJI/b;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Image> f8865a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8866b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f8867c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f8868d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final TreeClickStreamParent f8869e;

        public d(@k List<Image> list, int i12, @l String str, @l String str2, @l TreeClickStreamParent treeClickStreamParent) {
            this.f8865a = list;
            this.f8866b = i12;
            this.f8867c = str;
            this.f8868d = str2;
            this.f8869e = treeClickStreamParent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f8865a, dVar.f8865a) && this.f8866b == dVar.f8866b && L.f(this.f8867c, dVar.f8867c) && L.f(this.f8868d, dVar.f8868d) && L.f(this.f8869e, dVar.f8869e);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f8866b, this.f8865a.hashCode() * 31, 31);
            String str = this.f8867c;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8868d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TreeClickStreamParent treeClickStreamParent = this.f8869e;
            return iHashCode2 + (treeClickStreamParent != null ? treeClickStreamParent.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowFullscreenGallery(images=" + this.f8865a + ", position=" + this.f8866b + ", categoryId=" + this.f8867c + ", itemId=" + this.f8868d + ", treeParent=" + this.f8869e + ')';
        }
    }
}
