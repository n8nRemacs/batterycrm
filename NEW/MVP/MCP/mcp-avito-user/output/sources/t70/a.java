package T70;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LT70/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a extends q {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f15382b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f15383c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final InterfaceC1048a f15384d;

    /* compiled from: GridGalleryState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LT70/a$a;", "", "a", "b", "LT70/a$a$a;", "LT70/a$a$b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: T70.a$a, reason: collision with other inner class name */
    public interface InterfaceC1048a {

        /* compiled from: GridGalleryState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/a$a$a;", "LT70/a$a;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: T70.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1049a implements InterfaceC1048a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final b f15385a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final b f15386b;

            public C1049a(@k b bVar, @k b bVar2) {
                this.f15385a = bVar;
                this.f15386b = bVar2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1049a)) {
                    return false;
                }
                C1049a c1049a = (C1049a) obj;
                return L.f(this.f15385a, c1049a.f15385a) && L.f(this.f15386b, c1049a.f15386b);
            }

            public final int hashCode() {
                return this.f15386b.hashCode() + (this.f15385a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "DoubleButton(left=" + this.f15385a + ", right=" + this.f15386b + ')';
            }
        }

        /* compiled from: GridGalleryState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/a$a$b;", "LT70/a$a;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: T70.a$a$b */
        public static final /* data */ class b implements InterfaceC1048a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final b f15387a;

            public b(@k b bVar) {
                this.f15387a = bVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f15387a, ((b) obj).f15387a);
            }

            public final int hashCode() {
                return this.f15387a.hashCode();
            }

            @k
            public final String toString() {
                return "SingleButton(button=" + this.f15387a + ')';
            }
        }
    }

    /* compiled from: GridGalleryState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/a$b;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f15388a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f15389b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f15390c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f15391d;

        public b(@k String str, @l String str2, @l String str3, @k DeepLink deepLink) {
            this.f15388a = str;
            this.f15389b = str2;
            this.f15390c = str3;
            this.f15391d = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f15388a, bVar.f15388a) && L.f(this.f15389b, bVar.f15389b) && L.f(this.f15390c, bVar.f15390c) && L.f(this.f15391d, bVar.f15391d);
        }

        public final int hashCode() {
            int iHashCode = this.f15388a.hashCode() * 31;
            String str = this.f15389b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f15390c;
            return this.f15391d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomBarButton(title=");
            sb2.append(this.f15388a);
            sb2.append(", subtitle=");
            sb2.append(this.f15389b);
            sb2.append(", style=");
            sb2.append(this.f15390c);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f15391d, ')');
        }
    }

    public a(@l String str, @k List<? extends com.avito.conveyor_item.a> list, @l InterfaceC1048a interfaceC1048a) {
        this.f15382b = str;
        this.f15383c = list;
        this.f15384d = interfaceC1048a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f15382b, aVar.f15382b) && L.f(this.f15383c, aVar.f15383c) && L.f(this.f15384d, aVar.f15384d);
    }

    public final int hashCode() {
        String str = this.f15382b;
        int iA2 = C23088b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f15383c);
        InterfaceC1048a interfaceC1048a = this.f15384d;
        return iA2 + (interfaceC1048a != null ? interfaceC1048a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ContentViewState(toolbarTitle=" + this.f15382b + ", contentItems=" + this.f15383c + ", bottomBar=" + this.f15384d + ')';
    }
}
