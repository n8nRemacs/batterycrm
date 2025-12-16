package EN0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LEN0/d;", "", "a", "b", "c", "LEN0/d$a;", "LEN0/d$b;", "LEN0/d$c;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: ClientRoomState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN0/d$a;", "LEN0/d;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<DN0.b> f3983a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DN0.b f3984b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f3985c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f3986d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f3987e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f3988f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final DN0.a f3989g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final ArrayList f3990h;

        /* renamed from: i, reason: collision with root package name */
        public final int f3991i;

        public a(@k List list, @k DN0.b bVar, boolean z12, boolean z13, @k String str, @l String str2, @k DN0.a aVar, @k ArrayList arrayList, int i12) {
            this.f3983a = list;
            this.f3984b = bVar;
            this.f3985c = z12;
            this.f3986d = z13;
            this.f3987e = str;
            this.f3988f = str2;
            this.f3989g = aVar;
            this.f3990h = arrayList;
            this.f3991i = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f3983a, aVar.f3983a) && L.f(this.f3984b, aVar.f3984b) && this.f3985c == aVar.f3985c && this.f3986d == aVar.f3986d && L.f(this.f3987e, aVar.f3987e) && L.f(this.f3988f, aVar.f3988f) && L.f(this.f3989g, aVar.f3989g) && this.f3990h.equals(aVar.f3990h) && this.f3991i == aVar.f3991i;
        }

        public final int hashCode() {
            int iD2 = H.d(r.i(r.i((this.f3984b.hashCode() + (this.f3983a.hashCode() * 31)) * 31, 31, this.f3985c), 31, this.f3986d), 31, this.f3987e);
            String str = this.f3988f;
            return Integer.hashCode(this.f3991i) + e.g(this.f3990h, (this.f3989g.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(availableCategories=");
            sb2.append(this.f3983a);
            sb2.append(", selectedCategory=");
            sb2.append(this.f3984b);
            sb2.append(", isEditable=");
            sb2.append(this.f3985c);
            sb2.append(", isLoading=");
            sb2.append(this.f3986d);
            sb2.append(", clientName=");
            sb2.append(this.f3987e);
            sb2.append(", clientPhone=");
            sb2.append(this.f3988f);
            sb2.append(", clientImage=");
            sb2.append(this.f3989g);
            sb2.append(", tabs=");
            sb2.append(this.f3990h);
            sb2.append(", selectedTab=");
            return r.t(sb2, this.f3991i, ')');
        }
    }

    /* compiled from: ClientRoomState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN0/d$b;", "LEN0/d;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f3992a;

        public b(@k ApiError apiError) {
            this.f3992a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3992a, ((b) obj).f3992a);
        }

        public final int hashCode() {
            return this.f3992a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f3992a, ')');
        }
    }

    /* compiled from: ClientRoomState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEN0/d$c;", "LEN0/d;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f3993a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1923521877;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
