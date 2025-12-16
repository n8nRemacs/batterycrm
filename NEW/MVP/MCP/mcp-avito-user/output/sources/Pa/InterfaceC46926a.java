package pA;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.S;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileAdvertsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LpA/a;", "", "a", "b", "c", "d", "e", "f", "LpA/a$a;", "LpA/a$b;", "LpA/a$c;", "LpA/a$d;", "LpA/a$e;", "LpA/a$f;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pA.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC46926a {

    /* compiled from: ProfileAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpA/a$a;", "LpA/a;", "<init>", "()V", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pA.a$a, reason: collision with other inner class name */
    public static final class C12255a implements InterfaceC46926a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12255a f428226a = new C12255a();
    }

    /* compiled from: ProfileAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpA/a$b;", "LpA/a;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pA.a$b */
    public static final /* data */ class b implements InterfaceC46926a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertItem f428227a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Image f428228b;

        public b(@k AdvertItem advertItem, @l Image image) {
            this.f428227a = advertItem;
            this.f428228b = image;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f428227a, bVar.f428227a) && L.f(this.f428228b, bVar.f428228b);
        }

        public final int hashCode() {
            int iHashCode = this.f428227a.hashCode() * 31;
            Image image = this.f428228b;
            return iHashCode + (image == null ? 0 : image.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnAdvertClicked(advert=");
            sb2.append(this.f428227a);
            sb2.append(", image=");
            return AK.c.o(sb2, this.f428228b, ')');
        }

        public /* synthetic */ b(AdvertItem advertItem, Image image, int i12, C42822w c42822w) {
            this(advertItem, (i12 & 2) != 0 ? null : image);
        }
    }

    /* compiled from: ProfileAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpA/a$c;", "LpA/a;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pA.a$c */
    public static final /* data */ class c implements InterfaceC46926a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f428229a;

        public c(@k DeepLink deepLink) {
            this.f428229a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f428229a, ((c) obj).f428229a);
        }

        public final int hashCode() {
            return this.f428229a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnClickBuyWithDelivery(deeplink="), this.f428229a, ')');
        }
    }

    /* compiled from: ProfileAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpA/a$d;", "LpA/a;", "<init>", "()V", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pA.a$d */
    public static final class d implements InterfaceC46926a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f428230a = new d();
    }

    /* compiled from: ProfileAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpA/a$e;", "LpA/a;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pA.a$e */
    public static final /* data */ class e implements InterfaceC46926a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final S f428231a;

        public e(@k S s5) {
            this.f428231a = s5;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f428231a, ((e) obj).f428231a);
        }

        public final int hashCode() {
            return this.f428231a.hashCode();
        }

        @k
        public final String toString() {
            return "ToggleFavoriteStatus(favorableItem=" + this.f428231a + ')';
        }
    }

    /* compiled from: ProfileAdvertsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpA/a$f;", "LpA/a;", "<init>", "()V", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pA.a$f */
    public static final class f implements InterfaceC46926a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f428232a = new f();
    }
}
